grammar Calculator;


expression: multiplyingExpression ((PLUS | MINUS) multiplyingExpression)*;
multiplyingExpression: powExpression ((TIMES | DIV) powExpression)*;
powExpression: integralExpression ((POW integralExpression | SQRT) )*;
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
WS : [ \t\r\n]+ -> skip ;