grammar Ecl;

options {
//  output=AST;
	k=2;
	language=Java;
}

// applies only to the parser:
@header {
package org.eclipse.ecl.internal.parser;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.Exec;
import org.eclipse.ecl.core.ExecutableParameter;
import org.eclipse.ecl.core.LiteralParameter;
import org.eclipse.ecl.core.Parallel;
import org.eclipse.ecl.core.Parameter;
import org.eclipse.ecl.core.Pipeline;
import org.eclipse.ecl.core.Sequence;
}

// applies only to the lexer:
@lexer::header {
package org.eclipse.ecl.internal.parser;
}
@lexer::members {
  public void displayRecognitionError(String[] tokenNames,
      RecognitionException e) {
      throw new SyntaxErrorException(e.line, e.charPositionInLine);
  }
}


@members {
	CoreFactory factory= CoreFactory.eINSTANCE;
  
	Command processSequence(Command cmd, Command c2 ) {
		//Construct sequence if not yet constructed.
		if (cmd instanceof Sequence) {
			Sequence seq = (Sequence) cmd;
			if (c2 != null) {
				seq.getCommands().add(c2);
			}
			return seq;
		}
		else {
			Sequence seq = factory.createSequence();
			seq.getCommands().add(cmd);
			seq.getCommands().add(c2);
			return seq;
		}
	}	
	
  public void displayRecognitionError(String[] tokenNames,
      RecognitionException e) {
      throw new SyntaxErrorException(e.line, e.charPositionInLine);
  }
}
  
// Parser rules
commands returns[Command cmd=null;]:
	exprs=expr_list  { cmd=exprs;}
;
expr_list returns [Command cmd=null]:
  NEWLINE*
  c =expression {
  	if( c != null ) {
  		cmd=c;
  	}
  } ((NEWLINE+|COLON) c2=expression {
		cmd = processSequence(cmd, c2);
  } )*
  (NEWLINE|COLON)*
;

expression returns[Command cmd=null;]: 
   c=and_expr {
   	cmd = c;
   }
;

and_expr returns [Command cmd=null;]: 
  or1=or_expr {cmd=or1;} (NEWLINE* AND NEWLINE* or2=or_expr{
  	//Construct parallel if not yet constructed.
	if (cmd instanceof Parallel) {
		Parallel par = (Parallel) cmd;
		if (or2 != null) {
			par.getCommands().add(or2);
		}
		cmd = par;
	}
	else {
		Parallel par = factory.createParallel();
		par.getCommands().add(cmd);
		par.getCommands().add(or2);
		cmd = par;
	}
  })*
;

or_expr returns [Command cmd=null;]: 
  c = cmd {
  cmd = c;
  } (NEWLINE* OR NEWLINE* cmd2=cmd{
  	//Construct pipe if not yet constructed.
	if (cmd instanceof Pipeline) {
		Pipeline pipe = (Pipeline) cmd;
		if (cmd2 != null) {
			pipe.getCommands().add(cmd2);
		}
		cmd = pipe;
	}
	else {
		Pipeline pipe = factory.createPipeline();
		pipe.getCommands().add(cmd);
		pipe.getCommands().add(cmd2);
		cmd = pipe;
	}
  })*
;

open_expr_list returns [Command cmd=null]:
  c = expression {
  	if( c != null ) {
  		cmd=c;
  	}
  } (COLON c2=expression {
  	cmd = processSequence(cmd, c2);
  } )*
;

cmd returns [Command cmd=null;]:
 c=command {
	cmd = c;
 } |
 LOPEN c=open_expr_list {
 	cmd = c; 
 } ROPEN
;

command returns[Exec cmd=null;]:
   n=command_name {
   	cmd = factory.createExec();
   	int pos = n.lastIndexOf("::");
   	if( pos == -1 ) {
   		cmd.setName(n);
   	}
   	else {
   		cmd.setNamespace(n.substring(0, pos));
   		cmd.setName(n.substring(pos+2));
   	}
   } 
   (ho=host {
		cmd.setHost(ho);
   })?
   (a=argument_value {
   	if( a != null ) {
 		cmd.getParameters().add(a);
   	}
   })* 
   (arg=argument {
   	if( arg != null ) {
 		cmd.getParameters().add(arg);
   	}
   })*
;

subcommand returns[Parameter param=null;]:
  LBRACK
    c=expr_list {
    	ExecutableParameter p = factory.createExecutableParameter();
  		p.setCommand(c);
	  	param = p;
    }
  RBRACK
; 

command_name returns[String name=null;]:
 (n = NAME |/*n=COMMAND_NAME|*/ n=DNAME) { name = n.getText(); }
;
 
host returns [String host=null;]:
 ('@' (n=NAME|n=IP4)) {
 	host = n.getText();
 }
;

argument returns [Parameter param = null]:
   (p=named_argument) { param = p; }
;
argument_value returns [Parameter param=null;]:
  (p = simple_value | p= subcommand | p = convert_string) {
  	param = p;
  }
;
simple_value returns[Parameter param = null;]:
	(d=NAME|d=NUMBER|d2=STRING|d2=CURLY_STRING) { 
		LiteralParameter p = factory.createLiteralParameter();
		if( d != null ) {
  			p.setLiteral(d.getText());
  		}
  		else if( d2 != null ) {
        String value = d2.getText();
        StringBuilder result = new StringBuilder(value.length()-2);
        loop: for (int i = 1; i+1 < value.length(); i++){
          char ch = value.charAt(i);
          if (ch == '\\'){
            if (i+2 >= value.length())
              throw new SyntaxErrorException(d2.getLine(), 
                  d2.getCharPositionInLine()+i+1, "Invalid escape sequence");
            switch(value.charAt(i+1)){
              case 't': result.append("\t"); i++; continue loop;
              case 'b': result.append("\b"); i++; continue loop;
              case 'n': result.append("\n"); i++; continue loop;
              case 'r': result.append("\r"); i++; continue loop;
              case 'f': result.append("\f"); i++; continue loop;
              case '\'': result.append("'"); i++; continue loop;
              case '"': result.append("\""); i++; continue loop;
              case '\\': result.append("\\"); i++; continue loop;
            }
          }
          result.append(ch);
        }                      
        p.setLiteral(result.toString());
  		}
	  	param = p;
	}
;
named_argument returns [Parameter param=null;]: 
 ('-' '-'? n=NAME '='? (v=argument_value)) {
 	v.setName(n.getText());
 	param=v;
 }
;

convert_string returns [Parameter param=null;]:
 (f=NAME SEMI v=CURLY_STRING) {
 		LiteralParameter p = factory.createLiteralParameter();
 		String value = v.getText();
  		p.setLiteral(value.substring(1, value.length()-1));
  		p.setFormat(f.getText());
	  	param = p;
 }
;

 
// Lexer
COLON: ';';
AND: '&';
OR: '|';
SEMI: ':';

fragment SYMBOL:
  ('a'..'z'|'A'..'Z'|'_'|'.'|'/')
;

fragment DIGIT:
('0'..'9')
;

NUMBER:
  DIGIT+ 
;

// TODO: Add number checking
IP4:
  NUMBER '.' NUMBER '.' NUMBER '.' NUMBER
;
  
STRING:
   '"' (~('"'|'\n'|'\\')|('\\' . ))* '"'
;
protected
LOPEN  : '(';

protected
ROPEN  : ')';
  
protected
LCURLY  : '{';

protected
RCURLY  : '}';

protected
LBRACK  : '[';

protected
RBRACK  : ']';

CURLY_STRING: { int deep = 0; }
  LCURLY { deep += 1; }
  (
  { 
    if( input.LA( 1 ) == '{' ) {
      deep += 1;
    }
    else if( input.LA( 1 ) == '}' ) {
      deep -= 1;
    }
    if( deep == 0 ) {
      break loop3;
    }
  }.)* 
  RCURLY
  { 
  if( deep > 1 ) {
    MismatchedTokenException e = new MismatchedTokenException(RCURLY,input);
    e.expecting='}';
    throw e;
  }
  }
;

NAME:
 SYMBOL (SYMBOL|DIGIT)*
; 

//COMMAND_NAME:
// ((NAME SEMI)? NAME ('::' NAME)+ ('-' NAME)*)
// | (d=NAME s=SEMI c=CURLY_STRING ) {
// 	$d.setType(NAME);
//	emit(d);
//	$s.setType(SEMI);
//	emit(s);
//	$c.setType(CURLY_STRING);
//	emit(c);
// }
//;
DNAME:
	NAME ('-' NAME)+
;

WS: (' '|'\t')+ 
{
  $channel=HIDDEN;
}
; 

NEWLINE
    :   ('\r'|'\n')+
;

MultiLineComment :
  '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};
  
SingleLineComment :
  '//'|'#' (~('\n'|'\r'))* ('\n'|'\r'('\n')?)? {$channel=HIDDEN;};
