package org.csu.idl.xtext;

import org.csu.idl.idlmm.TranslationUnit;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

public class IDLQualifiedNameProvider extends
		DefaultDeclarativeQualifiedNameProvider {
	
	public QualifiedName qualifiedName(TranslationUnit g) {
		return QualifiedName.create(g.toString());
	}

}
