package org.csu.idl.xtext;

import org.csu.idl.idlmm.TranslationUnit;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;

public class IDLQualifiedNameProvider extends
		DefaultDeclarativeQualifiedNameProvider {
	
	public String qualifiedName(TranslationUnit g) {
		return g.toString();
	}

}
