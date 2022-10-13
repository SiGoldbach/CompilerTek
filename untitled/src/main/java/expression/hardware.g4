grammar hardware;

start: '.hardware'id1=IDENTIFIER '.inputs' inputVal+ '.outputs' outputVal+ latch* '.update' updateVal+ simulate EOF;

//start : command* EOF;

/*command : '.hardware' id=IDENTIFIER   # Name
        | '.inputs' idp=IDENTIFIER+     # Input
        |'.update' (id=IDENTIFIER '=' ex=expr)+ # Update
        ;*/


expr : '('ex1=expr')' # Paranthesis
    | ('!')ex1=expr # Not
    | ex1=expr ('&&') ex2=expr # And
    | ex1=expr ('||') ex2=expr # Or
    | id=IDENTIFIER # Binexpr
    ;

inputVal: id = IDENTIFIER #InputVal1;
outputVal: id = IDENTIFIER #OutputVal1;
updateVal: id = IDENTIFIER '=' ex=expr  #UpdateVal1;

latch: '.latch' id1=IDENTIFIER '->' id2=IDENTIFIER #Latch1;
//output: '.outputs' idp=IDENTIFIER+    # Output1;
simulate:'.simulate' id=IDENTIFIER '=' bin=BINARY # Simulate1;

IDENTIFIER: [a-zA-Z]+;
BINARY:[01]+;


WHITESPACE : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip;