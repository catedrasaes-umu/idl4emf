/*
 * ArrayExpander.java
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

import org.csu.idl.idlmm.AliasDef;
import org.csu.idl.idlmm.ArrayDef;
import org.csu.idl.idlmm.Field;
import org.csu.idl.idlmm.TranslationUnit;
import org.csu.idl.idlmm.UnionField;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;

public class ArrayExpander {
    public static void expand(TranslationUnit tu) {
        
        // Expanding arraydefs in AliasDef
        Set<EObject> aliasdefs = EcoreUtil2.findAllByType(EcoreUtil.getAllProperContents(tu, true), AliasDef.class); 
        
        for(EObject obj : aliasdefs) {
            AliasDef alias = (AliasDef) obj;
            if(alias.getContainedType() instanceof ArrayDef)
                expand(alias);
        }

        // Expanding arraydefs in Fields
        Set<EObject> fields = EcoreUtil2.findAllByType(EcoreUtil.getAllProperContents(tu, true), Field.class); 
        
        for(EObject obj : fields) {
            Field fld = (Field) obj;
            if(fld.getContainedType() instanceof ArrayDef)
                expand(fld);
        }
        
        // Expanding arraydefs in UnionFields
        Set<EObject> ufields = EcoreUtil2.findAllByType(EcoreUtil.getAllProperContents(tu, true), UnionField.class); 
        
        for(EObject obj : ufields) {
            UnionField ufld = (UnionField) obj;
            if(ufld.getContainedType() instanceof ArrayDef)
                expand(ufld);
        }
    }
    
    private static void expand(AliasDef alias) {
        ArrayDef array = (ArrayDef) alias.getContainedType();
        alias.setIdentifier(array.getName());
    }
    
    private static void expand(Field fld) {
        ArrayDef array = (ArrayDef) fld.getContainedType();
        fld.setIdentifier(array.getName());
    }
    
    private static void expand(UnionField ufld) {
        ArrayDef array = (ArrayDef) ufld.getContainedType();
        ufld.setIdentifier(array.getName());
    }
}
