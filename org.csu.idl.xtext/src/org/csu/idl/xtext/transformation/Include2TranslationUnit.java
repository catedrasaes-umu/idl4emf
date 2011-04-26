/*
 * Include2TranslationUnit.java
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

package org.csu.idl.xtext.transformation;

import java.util.Iterator;

import org.csu.idl.idlmm.Include;
import org.csu.idl.idlmm.TranslationUnit;
import org.eclipse.emf.ecore.resource.*;

public class Include2TranslationUnit {
	
	private Iterator<Resource> it;
	private ResourceSet resourceSet;
	
	public static void convertInclude2TranslationUnit(TranslationUnit tu) {
		Include2TranslationUnit i2t = new Include2TranslationUnit(tu.eResource().getResourceSet());
		i2t.convert(i2t.getCurrentTranslationUnit());
	}

	protected Include2TranslationUnit(ResourceSet set) {
		resourceSet = set;
		it = resourceSet.getResources().iterator();
	}
	
	protected void convert(TranslationUnit tu) {
		
		for (Include include: tu.getIncludes()) {
			TranslationUnit current = getCurrentTranslationUnit();
			include.setTranslationUnit(current);
			
			// Recursivo
			convert(current);
		}
	}
	
	protected TranslationUnit getCurrentTranslationUnit() {
		return (TranslationUnit) it.next().getContents().get(0);
	}

}
