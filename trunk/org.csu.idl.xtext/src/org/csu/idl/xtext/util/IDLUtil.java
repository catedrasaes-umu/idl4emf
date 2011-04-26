/*
 * IDLUtil.java
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

package org.csu.idl.xtext.util;

import org.csu.idl.idlmm.*;

import org.eclipse.emf.ecore.EObject;

public class IDLUtil {
    /**
     * Returns the ModuleDef FQN
     * 
     * @param m
     * @return
     */
    public static String getFQN(Contained m) {
        String fqn = m.getIdentifier();

        EObject parent = m;
        while ((parent = parent.eContainer()) != null
                && parent instanceof Contained)
            fqn = ((Contained) parent).getIdentifier() + "::" + fqn;

        return fqn;
    }
    
    
    public static IDLType getType(Typed _this)
    {
        return _this.getContainedType() != null ? _this.getContainedType() : _this.getSharedType();
    }
    
    public static IDLType getOriginalType(IDLType _this)
    {
        if (_this instanceof AliasDef)
            return getOriginalType(getType((AliasDef)_this));

        return _this;
    }
}
