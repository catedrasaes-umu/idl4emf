/*
 * Reader.java
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

package org.csu.idl.mwe2;

import java.util.ArrayList;
import java.util.List;

import org.csu.idl.preprocessor.Preprocessor;
import org.csu.idl.xtext.loader.IDLLoader;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

public class Reader implements IWorkflowComponent {

	private String idlFile = null;
	private String modelSlot = "model";
	private final List<String> includePath = new ArrayList<String>();

	public void addIncludePath(String includePath) {
		this.includePath.add(includePath);
	}

	public String getModelSlot() {
		return modelSlot;
	}

	public void setModelSlot(String modelSlot) {
		this.modelSlot = modelSlot;
	}

	public void setIdlFile(String idlFile) {
		this.idlFile = idlFile;
	}

	public String getIdlFile() {
		return idlFile;
	}

	public void invoke(IWorkflowContext ctx) {
		IDLLoader loader = new IDLLoader();
		Preprocessor preprocessor = loader.getPreprocessor();

		for (String include : includePath) {
			preprocessor.addIncludePath(include);
		}

		try {
			loader.load(idlFile);
		} catch (Exception e) {
			throw new WrappedException(e);
		}

		ctx.put(modelSlot, loader.getResource().getContents());
	}

	public void postInvoke() {
		// TODO Auto-generated method stub

	}

	public void preInvoke() {
		// TODO Auto-generated method stub

	}

}
