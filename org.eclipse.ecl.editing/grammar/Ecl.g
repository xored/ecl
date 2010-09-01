expression <- and_expr EOF
expr_list <- expression ((NL|COLON) expression)* (NL|COLON)*
and_expr <- or_expr (AND or_expr)*
or_expr <- cmd (OR cmd)*
open_expr_list <- expression (COLON expression)*
cmd <- command | LOPEN open_expr_list ROPEN
command <- command_name (WS host)? (WS arg (WS arg)*)?
subcommand <- LBRACK expr_list? RBRACK
command_name <- NAME | COMMAND_NAME | DNAME 
host <- '@' (NAME | IP4)
arg <- argument | argument_value
argument <- argument_name '='? argument_value?
argument_value <- simple_value | subcommand | convert_string
simple_value <-	NAME | NUMBER | STRING | CURLY_STRING
argument_name <- '-' '-'? NAME?
convert_string <- NAME SEMI CURLY_STRING
COLON <- ';'
AND <- '&'
OR <- '\|'
SEMI <- ':'
SYMBOL <- '[a-zA-Z_./]'
DIGIT <- '[0-9]'
NUMBER <- '[0-9]+'
IP4 <- '[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+'
STRING <- '"' ('\\"' | !('"'|NL) .)* '"'
LOPEN <- '\('
ROPEN <- '\)'
LCURLY <- '\{'
RCURLY <- '\}'
LBRACK <- '\['
RBRACK <- '\]'
CURLY_STRING <- LCURLY (CURLY_STRING | !RCURLY .)* RCURLY
NAME <- SYMBOL (SYMBOL|DIGIT)*
COMMAND_NAME <-
 (NAME SEMI)? NAME ('::' NAME)+ ('-' NAME)*
 | NAME SEMI CURLY_STRING
DNAME <- NAME ('-' NAME+)
WS <- '\s+'
NL <- '(\n|\r)+' | EOF