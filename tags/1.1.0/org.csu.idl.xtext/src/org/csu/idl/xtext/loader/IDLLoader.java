/*
 * IDLLoader.java
 * Copyright (C) Cátedra SAES-UMU 2010 <catedra-saes-umu@listas.um.es>
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.csu.idl.xtext.loader;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.csu.idl.idlmm.Include;
import org.csu.idl.idlmm.TranslationUnit;
import org.csu.idl.preprocessor.Preprocessor;
import org.csu.idl.xtext.IDLStandaloneSetup;
import org.csu.idl.xtext.scoping.IDLScopingHelper;
import org.csu.idl.xtext.transformation.ArrayExpander;
import org.csu.idl.xtext.transformation.ExpressionEvaluator;
import org.csu.idl.xtext.transformation.Include2TranslationUnit;
import org.csu.idl.xtext.validation.IDLValidator;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

public class IDLLoader {
	private static Logger logger = Logger.getLogger(IDLLoader.class);

	private XtextResourceSet resourceSet = null;
	private Resource model = null;
	private Preprocessor preprocessor = new Preprocessor();
	private List<ByteArrayOutputStream> resources;
	private Injector injector;

	private int numInclude = 0;
	private Map<Include, Resource> includesMap = new HashMap<Include, Resource>();

	public IDLLoader() {
		// http://wiki.eclipse.org/Xtext/FAQ
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri(".");
		injector = new IDLStandaloneSetup().createInjectorAndDoEMFRegistration();
		resourceSet = injector.getInstance(XtextResourceSet.class);

		// Register metamodel
		// Nota: se hace en IDLJavaValidator
		// Fuente: http://www.eclipse.org/forums/index.php?t=msg&goto=547792
		// resourceSet.getPackageRegistry().put(IdlmmPackage.eINSTANCE.getNsURI(), IdlmmPackage.eINSTANCE);

		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
	}

	public void load(String filePath) throws Exception {
		preprocessor.run(filePath);

		// Each stream in the list will be a resource in the resource set
		// and represents a preprocessed file. Two resources can be the same
		// file but preprocessed at different times.
		resources = preprocessor.getResources();

		IDLScopingHelper.setCurrentLoader(this);

		model = resourceSet.createResource(URI.createURI("dummy:/" + numInclude + "/" + filePath));
		InputStream in = new ByteArrayInputStream(resources.get(numInclude++).toByteArray());

		model.load(in, resourceSet.getLoadOptions());
	
		TranslationUnit trunit = (TranslationUnit) model.getContents().get(0);
				
		BasicDiagnostic bd = new BasicDiagnostic();
		IDLValidator idlValidator = new IDLValidator();
		idlValidator.validate(trunit, bd, new HashMap<Object,Object>());
		new ShowErrors().show(bd);
		
		if (bd.getSeverity() == Diagnostic.ERROR)
			System.exit(-1);
		
		// Transformations
		ExpressionEvaluator.evaluate(trunit);
		ArrayExpander.expand(trunit);
		Include2TranslationUnit.convertInclude2TranslationUnit(trunit);

		logger.debug("Loaded " + filePath + " as resource " + model.getURI());
	}

	public Resource loadInclude(Include include) throws Exception {

		String filePath = include.getImportURI();

		if (includesMap.containsKey(include)) {
			logger.debug("Cache hit for " + filePath + "!");
			return includesMap.get(include);
		}

		// load the resource
		ResourceSet resourceSet = include.eResource().getResourceSet();
		Resource resource = resourceSet.createResource(URI.createURI("dummy:/" + numInclude + "/" + filePath));

		logger.debug("Cache fault! Loading " + filePath + " as " + resource.getURI());

		// cache
		includesMap.put(include, resource);

		InputStream in = new ByteArrayInputStream(resources.get(numInclude++).toByteArray());
		
		resource.load(in, resourceSet.getLoadOptions());

		// Transformations
		TranslationUnit trunit = (TranslationUnit) resource.getContents().get(0);
		ExpressionEvaluator.evaluate(trunit);
		ArrayExpander.expand(trunit);

		logger.debug("Loaded " + filePath + " as resource " + resource.getURI());

		return resource;
	}

	public Preprocessor getPreprocessor() {
		return preprocessor;
	}

	public ResourceSet getResourceSet() {
		return resourceSet;
	}

	/**
	 * 
	 * @return Root model at the resource set
	 */
	public TranslationUnit getModel() {
		return (TranslationUnit) ((LazyLinkingResource) model).getContents().get(0);
	}
	
	public Resource getResource() {
		return model;
	}
}
