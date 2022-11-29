grammar Calculator;


expression: multiplyingExpression ((PLUS | MINUS) multiplyingExpression)*;
multiplyingExpression: powExpression ((TIMES | DIV) powExpression)*;
powExpression: cstExpression ((POW cstExpression | SQRT) )*;
cstExpression: integralExpression (COS | SIN | TAN)*;
integralExpression: MINUS DOUBLE | DOUBLE;


DOUBLE: ('0' .. '9') + ('.' ('0' .. '9') +)? ;
DOT: '.';
TIMES: '*' ;
DIV: '/' ;
POW: '^';
SQRT:'#';
PLUS: '+' ;
MINUS: '-' ;
INTEGRAL: 'cal';
COS:'cos';
SIN:'sin';
TAN:'tan';
WS : [ \t\r\n]+ -> skip ;