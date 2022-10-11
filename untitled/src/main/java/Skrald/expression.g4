grammar expression;

start: expr EOF;

expr: expr'+'expr
     |expr'-'expr
     |expr'*'expr
     |expr'/'expr
     |'('expr')'
     | CONST;

CONST: [0-9];
