/*
 * IDLScopingHelper.java
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

package org.csu.idl.xtext.scoping;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import org.apache.log4j.Logger;
import org.csu.idl.idlmm.AliasDef;
import org.csu.idl.idlmm.ArrayDef;
import org.csu.idl.idlmm.Contained;
import org.csu.idl.idlmm.Container;
import org.csu.idl.idlmm.EnumDef;
import org.csu.idl.idlmm.Field;
import org.csu.idl.idlmm.IdlmmPackage;
import org.csu.idl.idlmm.Include;
import org.csu.idl.idlmm.InterfaceDef;
import org.csu.idl.idlmm.ModuleDef;
import org.csu.idl.idlmm.TranslationUnit;
import org.csu.idl.xtext.loader.IDLLoader;
import org.csu.idl.xtext.util.IDLUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.internal.xtend.util.Pair;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.SimpleScope;

public class IDLScopingHelper {
	// implementar relativeName, OK
	// Obsoleto: public static final SimpleAttributeResolver<EObject, String> resolver = SimpleAttributeResolver.newResolver(String.class, "identifier");

	private static Logger logger = Logger.getLogger(IDLScopingHelper.class);

	private static Map<Pair<EObject, EClass>, IScope> scopecache = new HashMap<Pair<EObject, EClass>, IScope>();

	public static IScope getScope(Container context, EClass type) throws Exception {
		// try to resolve from cache
		Pair<EObject, EClass> clave = new Pair<EObject, EClass>(context, type);
		if (scopecache.containsKey(clave))
			return scopecache.get(clave);

		// Compute the outer scope
		IScope outer = IScope.NULLSCOPE;

		EObject ct = context.eContainer();
		if (ct instanceof Container)
			outer = getScope((Container) ct, type);
		else if (ct instanceof TranslationUnit)
			outer = getFullScope((TranslationUnit) ct, type);

		IScope result = new SimpleScope(outer, getScopedElements(context, type));
		scopecache.put(clave, result);
		return result;
	}

	/**
	 * Incluye también lo ya cargado. Resuelve el problema de los includes
	 * circulares. Evita bucles infinitos.
	 * 
	 * @param trunit
	 * @param type
	 * @return
	 * @throws IOException 
	 */
	public static IScope getFullScope(TranslationUnit trunit, EClass type) throws Exception {

		IScope outer = IScope.NULLSCOPE;

		Collection<TranslationUnit> loaded = new LinkedList<TranslationUnit>();

		// Tambien es visible lo ya cargado
		Resource resource = trunit.eResource();
		ResourceSet resourceSet = resource.getResourceSet();
		EList<Resource> resources = resourceSet.getResources();
		int index = resources.indexOf(resource);

		for (int i = 0; i < index; i++) {
			loaded.add((TranslationUnit) resources.get(i).getContents().get(0));
		}

		if (!loaded.isEmpty())
			outer = depthTraverse(type, loaded.iterator());

		IScope scope = getScope(trunit, type);

		outer = concatenate(outer, scope.getOuterScope());

		return new SimpleScope(outer, scope.getContents());
	}

	/**
	 * Ambito puro de un TranslationUnit
	 * 
	 * @param trunit
	 * @param type
	 * @return
	 * @throws IOException 
	 */
	public static IScope getScope(TranslationUnit trunit, EClass type) throws Exception {
		// try to resolve from cache
		Pair<EObject, EClass> clave = new Pair<EObject, EClass>(trunit, type);
		if (scopecache.containsKey(clave))
			return scopecache.get(clave);

		IScope outer = IScope.NULLSCOPE;

		Collection<TranslationUnit> includes = new LinkedList<TranslationUnit>();

		// y los includes del TranslationUnit actual
		includes.addAll(getIncludes(trunit, false));

		if (!includes.isEmpty())
			outer = depthTraverse(type, includes.iterator());

		IScope result = new SimpleScope(outer, getScopedElements(trunit, type));
		scopecache.put(clave, result);
		return result;
	}

	/**
	 * Method designed to explore in reverse order the list of ExecutionTest, in
	 * order to compute the scopes so that the last import is also the outmost
	 * scope TODO: should check for loops?
	 * 
	 * @param etest
	 * @param type
	 * @param iterator
	 * @return
	 * @throws IOException 
	 */
	private static IScope depthTraverse(EClass type, Iterator<TranslationUnit> iterator) throws Exception {
		IScope outer = IScope.NULLSCOPE;

		if (iterator.hasNext()) {
			TranslationUnit trunit = iterator.next();
			// inner scope calculation
			IScope scope = getScope(trunit, type);
			// outer scope calculation
			outer = depthTraverse(type, iterator);
			// concatenation
			outer = concatenate(outer, scope);
		}
		return outer;
	}

	/**
	 * 
	 * @param elem
	 * @param cont
	 * @return true if elem is directly visible from cont
	 */
	private static boolean isVisible(Contained elem, Container cont) {
		EObject container = elem.eContainer();

		if (container instanceof TranslationUnit)
			return true;

		if (container == cont)
			return true;

		if (container instanceof ModuleDef && cont instanceof ModuleDef
				&& IDLUtil.getFQN((ModuleDef) container).equals(IDLUtil.getFQN((ModuleDef) cont)))
			return true;

		return false;
	}

	protected static String relativeName(Contained elem, Container cont) {
		String identifier = elem.getIdentifier();

		if (identifier == null && elem instanceof AliasDef && ((AliasDef) elem).getContainedType() instanceof ArrayDef) {
			identifier = ((ArrayDef) ((AliasDef) elem).getContainedType()).getName();
		}

		if (isVisible(elem, cont))
			return identifier;
		
		EObject econtainer = elem.eContainer();
		
		if (econtainer instanceof Field)
			return   relativeName((Contained) econtainer.eContainer(), cont) + "::" + identifier;
		
		// Saltamos el EnumDef
		/**
		 * module m { enum e {OP1, OP2}; }; 
		 * 
		 * es
		 *   m::OP1 y m::OP2
		 * y no
		 *   m::e::OP1 y m::e::OP2
		 */
		if (econtainer instanceof EnumDef)
		{
			EObject econtainercontainer = econtainer.eContainer();
			if (econtainercontainer instanceof Contained)
				return relativeName((Contained) econtainercontainer, cont) + "::" + identifier;
			else
				return identifier;
		}

		return relativeName((Contained) econtainer, cont) + "::" + identifier;
	}

	/**
	 * Unused
	 * 
	 * @param include
	 * @return
	 */
	public static int include2stream(Include include) {
		TranslationUnit tu = (TranslationUnit) include.eContainer();
		Resource resource = tu.eResource();
		ResourceSet resourceSet = resource.getResourceSet();
		EList<Resource> resources = resourceSet.getResources();

		int result = tu.getIncludes().indexOf(include);
		int res = resources.indexOf(resource);

		for (int i = 0; i < res; i++) {
			result += ((TranslationUnit) resources.get(i)).getIncludes().size();
		}

		return result;
	}

	/**
	 * Retrieves the list of includes used in a TranslationUnit
	 * 
	 * @param tu
	 *            TranslationUnit to explore for includes
	 * @param recursive
	 *            search includes
	 * @return list of TranslationUnits referred by this one, ordered for
	 *         "outer scope" concept
	 * @throws IOException
	 */
	private static Collection<TranslationUnit> getIncludes(TranslationUnit tu, boolean recursive) throws Exception {
		Collection<Include> includes = tu.getIncludes();
		LinkedList<TranslationUnit> result = new LinkedList<TranslationUnit>();

		for (Include incl : includes) {
			Resource resource = currentLoader.loadInclude(incl);

			TranslationUnit obj = (TranslationUnit) resource.getContents().get(0);

			// extract the list of includes ordered by "outer" for
			// using with depthTraverse
			result.add(obj);

			// recursively add includes
			if (recursive)
				result.addAll(getIncludes(obj, true));
		}

		return result;
	}

	/**
	 * Helper function to concatenate two scopes in the same exact order
	 * 
	 * @param outer
	 * @param inner
	 * @return
	 */
	private static IScope concatenate(IScope outer, IScope inner) {
		IScope result = outer;

		if (inner != IScope.NULLSCOPE)
			result = new SimpleScope(concatenate(outer, inner.getOuterScope()), inner.getContents());

		return result;
	}

	/**
	 * Retrieves the list of IScopedElement contained in a given context
	 * EObject, filtered by their EClass, that has to be a subclass of Contained
	 * (in order to have an identifier attribute to identify them).
	 * 
	 * @param context
	 *            EObject for which all the contents will be searched
	 * @param type
	 *            EClass of the elements to select and represent with
	 *            IScopedElement
	 * @return List of the resulting IScopedElement
	 */
	private static Iterable<IEObjectDescription> getScopedElements(EObject context, EClass type) {
		
		// if the elements we want to retrieve aren't subclases of Contained,
		// return null
		if (!IdlmmPackage.eINSTANCE.getContained().isSuperTypeOf(type))
			return null;

		Collection<EObject> scopeList = getFilteredContents(context, type);

		// create the scopedElements from the EObjets in the scopeList
		LinkedList<IEObjectDescription> scopedElements = new LinkedList<IEObjectDescription>();

		Container base = (context instanceof Container ? (Container) context : null);

		final IDLAttributeResolver resolver = IDLAttributeResolver.newResolver(base);
		for (IEObjectDescription elm : Scopes.scopeFor(scopeList, resolver, IScope.NULLSCOPE).getContents()) {
			scopedElements.add(elm);
		}

		// in case the context is an InterfaceDef, we also add
		// recursively the elements defined in it's inheritance father
		if (context instanceof InterfaceDef) {
			EList<InterfaceDef> fathers = ((InterfaceDef) context).getDerivesFrom();
			for (InterfaceDef id : fathers)
				scopedElements.addAll((LinkedList<IEObjectDescription>) getScopedElements(id, type));
		}

		return scopedElements;
	}

	// TODO: Redefinition of elements in the hierarchy
	/**
	 * Retrieves the list of EObjects of a given type, in a given context
	 * 
	 * @param context
	 * @param type
	 * @return
	 */
	private static Collection<EObject> getFilteredContents(EObject context, EClass type) {

		Collection<EObject> scopeList = new LinkedList<EObject>();

		// Are there other contexts with same FQN that the current
		// context?
		Collection<EObject> contexts = equivalentContexts(context);

		for (EObject con : contexts) {
			// we recover all the contents, adding to the scope list
			// only those of the specified type
			TreeIterator<EObject> allctts = con.eAllContents();

			while (allctts.hasNext()) {
				EObject eact = allctts.next();
				if (type.isSuperTypeOf(eact.eClass()))
					scopeList.add(eact);
			}
		}

		return scopeList;
	}

	private static Collection<EObject> equivalentContexts(EObject context) {
		Collection<EObject> contexts = new LinkedList<EObject>();

		contexts.add(context);

		// Find other ModuleDefs with the same FQN
		if (context instanceof ModuleDef) {
			ResourceSet set = context.eResource().getResourceSet();
			String myFQN = IDLUtil.getFQN((ModuleDef) context);

			for (Resource resource : set.getResources()) {
				TreeIterator<EObject> it = resource.getAllContents();
				while (it.hasNext()) {
					EObject eobj = it.next();

					if (eobj != context && eobj instanceof ModuleDef && IDLUtil.getFQN((ModuleDef) eobj).equals(myFQN))
						contexts.add(eobj);
				}
			}
		}
		return contexts;
	}

	// Static data

	private static IDLLoader currentLoader = null;

	public static void setCurrentLoader(IDLLoader loader) {
		currentLoader = loader;
	}
}
