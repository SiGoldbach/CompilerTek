grammar uge2opgsecond;
htmltags:  TAG+ EOF;




TAG: '<'[a-zA-Z0-9]+'>'|'</'[a-zA-Z0-9]+'>';




IGNORE: [\n\t ]->skip;