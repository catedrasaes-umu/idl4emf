package org.csu.idl.xtext.scoping;

import org.csu.idl.idlmm.Contained;
import org.csu.idl.idlmm.Container;
import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Function;

public class IDLAttributeResolver implements Function<EObject, String> {
	
	private Container container;

	private IDLAttributeResolver(Container container) {
		this.container = container;
	}

	public static IDLAttributeResolver newResolver(Container container) {
		return new IDLAttributeResolver(container);
	}
	
	@Override
	public String apply(EObject from) {
		return IDLScopingHelper.relativeName((Contained) from, container);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
