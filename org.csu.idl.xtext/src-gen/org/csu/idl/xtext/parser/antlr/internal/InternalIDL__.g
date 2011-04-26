lexer grammar InternalIDL;
@header {
package org.csu.idl.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T16 : '#include' ;
T17 : ';' ;
T18 : 'module' ;
T19 : '{' ;
T20 : '}' ;
T21 : 'abstract' ;
T22 : 'local' ;
T23 : 'interface' ;
T24 : ':' ;
T25 : ',' ;
T26 : 'oneway' ;
T27 : '(' ;
T28 : ')' ;
T29 : 'raises' ;
T30 : 'context' ;
T31 : 'readonly' ;
T32 : 'attribute' ;
T33 : 'getraises' ;
T34 : 'setraises' ;
T35 : 'exception' ;
T36 : 'native' ;
T37 : 'typedef' ;
T38 : '[' ;
T39 : ']' ;
T40 : 'struct' ;
T41 : 'union' ;
T42 : 'switch' ;
T43 : 'case' ;
T44 : 'default' ;
T45 : 'enum' ;
T46 : 'const' ;
T47 : '=' ;
T48 : 'sequence' ;
T49 : '<' ;
T50 : '>' ;
T51 : 'string' ;
T52 : 'wstring' ;
T53 : 'fixed' ;
T54 : 'long' ;
T55 : 'double' ;
T56 : 'unsigned' ;
T57 : 'short' ;
T58 : '|' ;
T59 : '^' ;
T60 : '&' ;
T61 : '>>' ;
T62 : '<<' ;
T63 : '+' ;
T64 : '-' ;
T65 : '*' ;
T66 : '/' ;
T67 : '%' ;
T68 : '~' ;
T69 : 'in' ;
T70 : 'out' ;
T71 : 'inout' ;
T72 : 'float' ;
T73 : 'char' ;
T74 : 'wchar' ;
T75 : 'boolean' ;
T76 : 'octet' ;
T77 : 'any' ;
T78 : 'Object' ;
T79 : 'void' ;

// $ANTLR src "../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g" 6013
RULE_WIDE_STRING_LITERAL : 'L' RULE_STRING;

// $ANTLR src "../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g" 6015
RULE_FIXED_PT_LITERAL : (RULE_INT '.' RULE_INT (('e'|'E') ('+'|'-')? RULE_INT)?|'.' RULE_INT (('e'|'E') ('+'|'-')? RULE_INT)?|RULE_INT ('e'|'E') ('+'|'-')? RULE_INT);

// $ANTLR src "../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g" 6017
RULE_FLOATING_PT_LITERAL : (RULE_INT '.' RULE_INT ('d'|'D')|RULE_INT ('d'|'D')|'.' RULE_INT ('d'|'D'));

// $ANTLR src "../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g" 6019
RULE_BOOLEAN_LITERAL : ('TRUE'|'FALSE');

// $ANTLR src "../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g" 6021
RULE_HEX_LITERAL : '0' 'x' ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g" 6023
RULE_ID : ('a'..'z'|'A'..'Z'|'_'|'::') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'::')*;

// $ANTLR src "../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g" 6025
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g" 6027
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g" 6029
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g" 6031
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g" 6033
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g" 6035
RULE_ANY_OTHER : .;


