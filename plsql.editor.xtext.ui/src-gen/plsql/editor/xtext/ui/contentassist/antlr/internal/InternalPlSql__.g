lexer grammar InternalPlSql;
@header {
package plsql.editor.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'IS' ;
T12 : 'AS' ;
T13 : ':=' ;
T14 : 'DEFAULT' ;
T15 : 'IN' ;
T16 : 'RNDS' ;
T17 : 'WNDS' ;
T18 : 'RNPS' ;
T19 : 'WNPS' ;
T20 : 'TRUST' ;
T21 : 'BOOLEAN' ;
T22 : 'TRUE' ;
T23 : 'FALSE' ;
T24 : 'CURRENT_USER' ;
T25 : 'DEFINER' ;
T26 : 'PROCEDURE' ;
T27 : '.' ;
T28 : '(' ;
T29 : ')' ;
T30 : 'PACKAGE' ;
T31 : 'END' ;
T32 : ';' ;
T33 : 'FUNCTION' ;
T34 : 'RETURN' ;
T35 : ',' ;
T36 : 'OUT' ;
T37 : 'NOCOPY' ;
T38 : 'PRAGMA' ;
T39 : 'RESTRICT_REFERENCES' ;
T40 : 'TIMESTAMP' ;
T41 : 'NUMBER' ;
T42 : 'VARCHAR2' ;
T43 : 'DETERMINISTIC' ;
T44 : 'RESULT_CACHE' ;
T45 : 'RELIES_ON' ;
T46 : 'PIPELINED' ;
T47 : 'BEGIN' ;
T48 : 'DECLARE' ;
T49 : 'EXTERNAL' ;
T50 : 'NOT' ;
T51 : 'NULL' ;
T52 : '<<' ;
T53 : '>>' ;
T54 : 'CASE' ;
T55 : 'WHEN' ;
T56 : 'THEN' ;
T57 : 'ELSE' ;
T58 : 'CLOSE' ;
T59 : 'CONTINUE' ;
T60 : 'EXIT' ;
T61 : 'FETCH' ;
T62 : 'INTO' ;
T63 : 'BULK' ;
T64 : 'COLLECT' ;
T65 : 'LIMIT' ;
T66 : 'GOTO' ;
T67 : 'IF' ;
T68 : 'ELSIF' ;
T69 : 'LOOP' ;
T70 : 'WHILE' ;
T71 : 'FOR' ;
T72 : 'REVERSE' ;
T73 : '..' ;
T74 : 'RAISE' ;
T75 : 'CONSTANT' ;
T76 : ':' ;

// $ANTLR src "../plsql.editor.xtext.ui/src-gen/plsql/editor/xtext/ui/contentassist/antlr/internal/InternalPlSql.g" 13065
RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../plsql.editor.xtext.ui/src-gen/plsql/editor/xtext/ui/contentassist/antlr/internal/InternalPlSql.g" 13067
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../plsql.editor.xtext.ui/src-gen/plsql/editor/xtext/ui/contentassist/antlr/internal/InternalPlSql.g" 13069
RULE_INT : ('0'..'9')+;

// $ANTLR src "../plsql.editor.xtext.ui/src-gen/plsql/editor/xtext/ui/contentassist/antlr/internal/InternalPlSql.g" 13071
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../plsql.editor.xtext.ui/src-gen/plsql/editor/xtext/ui/contentassist/antlr/internal/InternalPlSql.g" 13073
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../plsql.editor.xtext.ui/src-gen/plsql/editor/xtext/ui/contentassist/antlr/internal/InternalPlSql.g" 13075
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../plsql.editor.xtext.ui/src-gen/plsql/editor/xtext/ui/contentassist/antlr/internal/InternalPlSql.g" 13077
RULE_ANY_OTHER : .;


