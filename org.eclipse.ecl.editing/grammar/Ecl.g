expression <- Spacing and_expr EOF
expr_list <- expression ((NL|COLON) expression)* (NL|COLON)*
and_expr <- or_expr (AND or_expr)*
or_expr <- cmd (OR cmd)*
open_expr_list <- expression (COLON expression)*
cmd <- command | LOPEN open_expr_list ROPEN
command <- command_name (WS host)? (WS arg (WS arg)*)? Spacing
subcommand <- LBRACK expr_list? RBRACK
command_name <- NAME ('::' NAME)?
host <- '@' (NAME | IP4)
arg <- argument | argument_value
argument <- argument_name '='? argument_value?
argument_value <- simple_value | subcommand | convert_string
simple_value <-	NAME | NUMBER | STRING | CURLY_STRING
argument_name <- '-' '-'? NAME?
convert_string <- NAME SEMI CURLY_STRING
COLON <- ';' Spacing
AND <- '&' Spacing
OR <- '\|' Spacing
SEMI <- ':' Spacing
NUMBER <- '[0-9]+'
IP4 <- '[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+'
STRING <- '"' ('\\"' | !('"'|NL) .)* '"'
LOPEN <- '\(' Spacing
ROPEN <- '\)' Spacing
LCURLY <- '\{' Spacing
RCURLY <- '\}' Spacing
LBRACK <- '\[' Spacing
RBRACK <- '\]' Spacing
CURLY_STRING <- LCURLY (CURLY_STRING | !RCURLY .)* Spacing RCURLY
NAME <- '[a-zA-Z]([a-zA-Z0-9]|-)*'
Spacing <- '(\n|\r|\s)*'
WS <- '\s+'
NL <- '(\n|\r)+' | EOF