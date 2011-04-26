lexer grammar InternalIDL;
@header {
package org.csu.idl.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T16 : 'float' ;
T17 : 'double' ;
T18 : 'short' ;
T19 : 'long' ;
T20 : 'char' ;
T21 : 'wchar' ;
T22 : 'string' ;
T23 : 'wstring' ;
T24 : 'boolean' ;
T25 : 'octet' ;
T26 : 'any' ;
T27 : 'Object' ;
T28 : 'void' ;
T29 : 'abstract' ;
T30 : 'local' ;
T31 : '>>' ;
T32 : '<<' ;
T33 : '+' ;
T34 : '-' ;
T35 : '*' ;
T36 : '/' ;
T37 : '%' ;
T38 : '~' ;
T39 : 'in' ;
T40 : 'out' ;
T41 : 'inout' ;
T42 : '#include' ;
T43 : ';' ;
T44 : 'module' ;
T45 : '{' ;
T46 : '}' ;
T47 : 'interface' ;
T48 : ':' ;
T49 : ',' ;
T50 : '(' ;
T51 : ')' ;
T52 : 'raises' ;
T53 : 'context' ;
T54 : 'attribute' ;
T55 : 'getraises' ;
T56 : 'setraises' ;
T57 : 'exception' ;
T58 : 'native' ;
T59 : 'typedef' ;
T60 : '[' ;
T61 : ']' ;
T62 : 'struct' ;
T63 : 'union' ;
T64 : 'switch' ;
T65 : 'case' ;
T66 : 'default' ;
T67 : 'enum' ;
T68 : 'const' ;
T69 : '=' ;
T70 : 'sequence' ;
T71 : '<' ;
T72 : '>' ;
T73 : 'fixed' ;
T74 : 'unsigned' ;
T75 : 'oneway' ;
T76 : 'readonly' ;
T77 : '|' ;
T78 : '^' ;
T79 : '&' ;

// $ANTLR src "../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g" 14009
RULE_WIDE_STRING_LITERAL : 'L' RULE_STRING;

// $ANTLR src "../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g" 14011
RULE_FIXED_PT_LITERAL : (RULE_INT '.' RULE_INT (('e'|'E') ('+'|'-')? RULE_INT)?|'.' RULE_INT (('e'|'E') ('+'|'-')? RULE_INT)?|RULE_INT ('e'|'E') ('+'|'-')? RULE_INT);

// $ANTLR src "../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g" 14013
RULE_FLOATING_PT_LITERAL : (RULE_INT '.' RULE_INT ('d'|'D')|RULE_INT ('d'|'D')|'.' RULE_INT ('d'|'D'));

// $ANTLR src "../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g" 14015
RULE_BOOLEAN_LITERAL : ('TRUE'|'FALSE');

// $ANTLR src "../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g" 14017
RULE_HEX_LITERAL : '0' 'x' ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g" 14019
RULE_ID : ('a'..'z'|'A'..'Z'|'_'|'::') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'::')*;

// $ANTLR src "../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g" 14021
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g" 14023
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g" 14025
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g" 14027
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g" 14029
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g" 14031
RULE_ANY_OTHER : .;


