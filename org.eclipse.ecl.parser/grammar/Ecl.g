sequence <- expr ((NL|COLON)+ expr)* (NL|COLON)* EOF
expr <- WS? andExpr
andExpr <- orExpr (AND orExpr)*
orExpr <- primary (OR primary)*
primary <- command | LPAREN andExpr RPAREN
command <- '[a-zA-Z]([a-zA-Z0-9:\\./-])*' (WS (param | paramValue))* WS?
param <- paramName (WS paramValue)?
paramName <- '-' '-'? NAME?
paramValue <- NAME | NUMBER | STRING | curly | subCommand
curly <- LCURLY (curly | !RCURLY .)* Spacing RCURLY
subCommand <- LBRACK orExpr? RBRACK

NAME <- '[a-zA-Z]([a-zA-Z0-9]|-)*'
COLON <- ';' Spacing
AND <- '&' Spacing
OR <- '\|' Spacing
NUMBER <- '[0-9]+'
STRING <- '"' ('\\"' | !('"'|NL) .)* '"'
LPAREN <- '\(' Spacing
RPAREN <- '\)' WS?
LCURLY <- '\{' Spacing
RCURLY <- '\}' WS?
LBRACK <- '\[' Spacing
RBRACK <- '\]' WS?
Spacing <- '\s*'
WS <- '[\s&&[^\n\r]]+'
NL <- '[\n\r]+'