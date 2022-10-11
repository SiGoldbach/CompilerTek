grammar hardware;

//start: '.hardware'IDENTIFIER '.inputs'IDENTIFIER '.outputs'IDENTIFIER* LATCH*'.update'boolexpr+'.simulate'IDENTIFIER;

start : command* EOF;

command : '.hardware' id=IDENTIFIER   # Name
        | '.inputs' idp=IDENTIFIER+     # Input
        | '.outputs' idp=IDENTIFIER+    # Output
        |'.update' (id=IDENTIFIER '=' ex=expr)+ # Update
        |'.latch' id=IDENTIFIER '->' id2=IDENTIFIER # Latch
        |'.simulate' id=IDENTIFIER '=' bin=BINARY # Simulate
        ;

expr : '('ex1=expr')' # Paranthesis
    | ('!')ex1=expr # Not
    | ex1=expr ('&&') ex2=expr # And
    | ex1=expr ('||') ex2=expr # Or
    | id=IDENTIFIER # Binexpr
    ;


IDENTIFIER: [a-zA-Z]+;
BINARY:[01]+;


WHITESPACE : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip;