grammar uge2opg;
tags:  html* EOF;

html : TAGSTART html* TAGEND
     | TEXT
     ;

TAG: TAGEND TAGSTART;


TAGSTART: '<'+TEXT+'>';

TAGEND: '</'+TEXT+'>';
TEXT:[a-zA-Z0-9];
ID:[a-z];

IGNORE: [\n\t ]->skip;



