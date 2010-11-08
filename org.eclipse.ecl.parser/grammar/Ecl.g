script <- (sequence)? EOF
sequence <- expr ((NL|COLON)+ expr)* (NL|COLON)*
expr <- WS? parallel
parallel <- pipeline (AND pipeline)*
pipeline <- primary (OR primary)*
primary <- command | LPAREN sequence RPAREN
command <- (cmdNs '::')? cmdName (WS (param | paramValue))* WS?
cmdNs <- '[a-zA-Z]([a-zA-Z0-9\\.-])*'
cmdName <- '[a-zA-Z]([a-zA-Z0-9\\.-])*'
param <- paramName (WS paramValue)?
paramName <- '-' '-'? '[a-zA-Z]([a-zA-Z0-9:\\.-])*'?
paramValue <- literal | number | string | curly | subCommand
curly <- LCURLY (curly | !RCURLY .)* Spacing RCURLY
subCommand <- LBRACK sequence? RBRACK
literal <- '[a-zA-Z]([a-zA-Z0-9:\\.-])*'
number <- '[0-9\\.]+'
string <- '"' ('\\"' | !('"'|NL) .)* '"'

COLON <- ';' Spacing
AND <- '&' Spacing
OR <- '\|' Spacing
LPAREN <- '\(' Spacing
RPAREN <- '\)' Spacing
LCURLY <- '\{' Spacing
RCURLY <- '\}'
LBRACK <- '\[' Spacing
RBRACK <- '\]'
Spacing <- '\s*'
WS <- '[\s&&[^\n\r]]+'
NL <- '[\n\r]+'