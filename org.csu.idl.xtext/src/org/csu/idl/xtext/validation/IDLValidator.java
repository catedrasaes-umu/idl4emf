/*
 * IDLJavaValidator.java
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

package org.csu.idl.xtext.validation;

import java.util.ArrayList;
import java.util.List;

import org.csu.idl.idlmm.Contained;
import org.csu.idl.idlmm.Container;
import org.csu.idl.idlmm.IdlmmPackage;
import org.csu.idl.idlmm.TranslationUnit;
import org.csu.idl.xtext.util.IDLUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.validation.Check;
 

public class IDLValidator extends AbstractIDLValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.GREETING__NAME);
//		}
//	}
	
	private String separator = System.getProperty("file.separator");
	
	@Check
	public void checkUnresolvedReferences(TranslationUnit tu) {
		ResourceSet resourceSet = tu.eResource().getResourceSet();
		
        for (Resource resource : resourceSet.getResources())
        {
            TreeIterator<EObject> it = resource.getAllContents();
            
            while (it.hasNext())
            {
                EObject current = it.next();
                EClass clazz = current.eClass();
                
                // Check references using reflective API
                for (EReference ref: clazz.getEAllReferences())
                {
                    Object value = current.eGet(ref);
                    
                    if (value instanceof EObject && ((EObject)value).eIsProxy())
                        undefinedReference(current, (EObject)value, ref);
                    else if (value instanceof EList<?>)
                    { 
                        EList<EObject> list = (EList<EObject>) value;
                        
                        int position = 0;
                        for (EObject obj : list)
                        {
                        	++position;
                            if (obj.eIsProxy())
                                undefinedReference(current, obj, ref, position);
                        }
                    }
                }
                                
            }
        }
	}
	
    private void undefinedReference(EObject obj, EObject value, EReference ref)
    {   
    	System.err.println("Undefined reference in " + obj.eClass().getName() + " " + context(obj));
        error("Undefined reference in " + obj.eClass().getName() + " " + context(obj), obj, ref);
    }
    
    private void undefinedReference(EObject obj, EObject value, EReference ref, int position)
    {   	
    	System.err.println("Undefined reference in " + obj.eClass().getName() + " " + context(obj) + " in element " + position);
        error("Undefined reference in " + obj.eClass().getName() + " " + context(obj) + " in element " + position, obj, ref);
    }
    
    private String context(EObject obj)
    {
        String fqn = obj.eResource().getURI().toString();

        // Remove the path upto the filename.
        int lastSeparatorIndex = fqn.lastIndexOf(separator);
        
        if (lastSeparatorIndex != -1)
            fqn = fqn.substring(lastSeparatorIndex + 1);
        
        while(!(obj instanceof Contained))
            obj = obj.eContainer();
        
        fqn += ":" + IDLUtil.getFQN((Contained) obj);
        
        return  fqn;
    }
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(IdlmmPackage.eINSTANCE);
		return result;
	}

}
