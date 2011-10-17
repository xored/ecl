/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     xored software, Inc - initial API and implementation
 ******************************************************************************/
// $ANTLR 3.0 D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g 2011-06-03 17:09:26

package org.eclipse.ecl.internal.parser;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.FailedPredicateException;
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
import org.eclipse.ecl.gen.ast.AstExec;
import org.eclipse.ecl.gen.ast.AstFactory;
import org.eclipse.ecl.gen.ast.AstLiteral;

public class EclParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COLON", "AND", "OR", "LOPEN", "ROPEN", "LBRACK", "RBRACK", "NAME", "DNAME", "IP4", "NUMBER", "CURLY_STRING", "SEMI", "DIGIT", "STRING", "LCURLY", "RCURLY", "WS", "NEWLINE", "COMMENT", "LINE_COMMENT", "'@'", "'-'", "'='", "'+'"
    };
    public static final int RBRACK=10;
    public static final int LBRACK=9;
    public static final int LINE_COMMENT=24;
    public static final int NUMBER=14;
    public static final int LCURLY=19;
    public static final int AND=5;
    public static final int EOF=-1;
    public static final int SEMI=16;
    public static final int COLON=4;
    public static final int NAME=11;
    public static final int WS=21;
    public static final int NEWLINE=22;
    public static final int CURLY_STRING=15;
    public static final int DNAME=12;
    public static final int RCURLY=20;
    public static final int OR=6;
    public static final int LOPEN=7;
    public static final int IP4=13;
    public static final int DIGIT=17;
    public static final int ROPEN=8;
    public static final int COMMENT=23;
    public static final int STRING=18;

        public EclParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g"; }

      
    	CoreFactory factory = CoreFactory.eINSTANCE;  
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
    	    if (e.token == Token.EOF_TOKEN) {
    	      Token prev = getTokenStream().get(e.index - 1);
    	      throw new SyntaxErrorException(prev.getLine(),
    	          prev.getCharPositionInLine());
    	    }
          throw new SyntaxErrorException(e.line, e.charPositionInLine);
      }
      
      private boolean lookupNL() {
        int index=input.index();
        int start=input.mark();
        
        if (index >= input.size()) {
          return true;
        }
        if(index < input.size())
        {
          if(input.get(index).getType() == RBRACK)
            return true;
          if(input.get(index).getType() == RCURLY)
            return true;
          if(input.get(index).getType() == ROPEN)
            return true;
        }
        Token token;
        boolean result=false;
        while (index > 0)
        {
          // look back in the hidden channel until we find a linebreak
          index--;
          token = input.get(index);
          if (token.getType() == EOF) {
            result=true;
            break;
          }
          if (token.getChannel() != Token.HIDDEN_CHANNEL)
          {
            /* We are out of the hidden channel, in other word we found a "real" item,
            which means we didn't find a linebreak, so we are done (false)
            */
            break;
          }
          if (token.getType() == NEWLINE)
          {
            // found our LineBreak (true)
            result=true;
            break;
          }
        }
        input.rewind(start);
        return result;
    }



    // $ANTLR start commands
    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:121:1: commands returns [Command cmd=null;] : exprs= expr_list EOF ;
    public final Command commands() throws RecognitionException {
        Command cmd = null;;

        Command exprs = null;


        try {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:122:2: (exprs= expr_list EOF )
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:122:2: exprs= expr_list EOF
            {
            pushFollow(FOLLOW_expr_list_in_commands68);
            exprs=expr_list();
            _fsp--;

            cmd=exprs;
            match(input,EOF,FOLLOW_EOF_in_commands72); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cmd;
    }
    // $ANTLR end commands


    // $ANTLR start expr_list
    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:124:1: expr_list returns [Command cmd=null] : (c2= expression )* ;
    public final Command expr_list() throws RecognitionException {
        Command cmd = null;

        Command c2 = null;


        try {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:125:3: ( (c2= expression )* )
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:125:3: (c2= expression )*
            {
            Sequence seq = factory.createSequence();
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:126:3: (c2= expression )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==LOPEN||(LA1_0>=NAME && LA1_0<=DNAME)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:126:5: c2= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_expr_list94);
            	    c2=expression();
            	    _fsp--;

            	    seq.getCommands().add(c2);

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


                if (seq.getCommands().size() == 1) {
                  cmd = seq.getCommands().get(0);
                } else {
                  cmd = seq;
                }
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cmd;
    }
    // $ANTLR end expr_list


    // $ANTLR start expression
    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:136:1: expression returns [Command cmd=null;] : c= and_expr eos ;
    public final Command expression() throws RecognitionException {
        Command cmd = null;;

        Command c = null;


        try {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:137:4: (c= and_expr eos )
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:137:4: c= and_expr eos
            {
            pushFollow(FOLLOW_and_expr_in_expression121);
            c=and_expr();
            _fsp--;


               	cmd = c;
               
            pushFollow(FOLLOW_eos_in_expression128);
            eos();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cmd;
    }
    // $ANTLR end expression


    // $ANTLR start eos
    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:143:1: eos : ( EOF | COLON | {...}?);
    public final void eos() throws RecognitionException {
        try {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:145:5: ( EOF | COLON | {...}?)
            int alt2=3;
            switch ( input.LA(1) ) {
            case EOF:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF) ) {
                    /*int LA2_8 = */input.LA(3);

                    if ( (!(lookupNL())) ) {
                        alt2=1;
                    }
                    else if ( (lookupNL()) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("143:1: eos : ( EOF | COLON | {...}?);", 2, 8, input);

                        throw nvae;
                    }
                }
                else if ( ((LA2_1>=LOPEN && LA2_1<=ROPEN)||(LA2_1>=RBRACK && LA2_1<=DNAME)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("143:1: eos : ( EOF | COLON | {...}?);", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case COLON:
                {
                alt2=2;
                }
                break;
            case LOPEN:
            case ROPEN:
            case RBRACK:
            case NAME:
            case DNAME:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("143:1: eos : ( EOF | COLON | {...}?);", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:145:5: EOF
                    {
                    match(input,EOF,FOLLOW_EOF_in_eos143); 

                    }
                    break;
                case 2 :
                    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:146:5: COLON
                    {
                    match(input,COLON,FOLLOW_COLON_in_eos149); 

                    }
                    break;
                case 3 :
                    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:147:5: {...}?
                    {
                    if ( !(lookupNL()) ) {
                        throw new FailedPredicateException(input, "eos", "lookupNL()");
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end eos


    // $ANTLR start and_expr
    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:149:1: and_expr returns [Command cmd=null;] : or1= or_expr ( AND or2= or_expr )* ;
    public final Command and_expr() throws RecognitionException {
        Command cmd = null;;

        Command or1 = null;

        Command or2 = null;


        try {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:150:3: (or1= or_expr ( AND or2= or_expr )* )
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:150:3: or1= or_expr ( AND or2= or_expr )*
            {
            pushFollow(FOLLOW_or_expr_in_and_expr171);
            or1=or_expr();
            _fsp--;

            cmd=or1;
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:150:26: ( AND or2= or_expr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==AND) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:150:27: AND or2= or_expr
            	    {
            	    match(input,AND,FOLLOW_AND_in_and_expr176); 
            	    pushFollow(FOLLOW_or_expr_in_and_expr180);
            	    or2=or_expr();
            	    _fsp--;


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
            	      

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cmd;
    }
    // $ANTLR end and_expr


    // $ANTLR start or_expr
    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:168:1: or_expr returns [Command cmd=null;] : c= cmd ( OR cmd2= cmd )* ;
    public final Command or_expr() throws RecognitionException {
        Command cmd = null;;

        Command c = null;

        Command cmd2 = null;


        try {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:169:3: (c= cmd ( OR cmd2= cmd )* )
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:169:3: c= cmd ( OR cmd2= cmd )*
            {
            pushFollow(FOLLOW_cmd_in_or_expr202);
            c=cmd();
            _fsp--;


              cmd = c;
              
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:171:6: ( OR cmd2= cmd )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==OR) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:171:7: OR cmd2= cmd
            	    {
            	    match(input,OR,FOLLOW_OR_in_or_expr208); 
            	    pushFollow(FOLLOW_cmd_in_or_expr212);
            	    cmd2=cmd();
            	    _fsp--;


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
            	      

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cmd;
    }
    // $ANTLR end or_expr


    // $ANTLR start open_expr_list
    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:189:1: open_expr_list returns [Command cmd=null] : c= expression (c2= expression )* ;
    public final Command open_expr_list() throws RecognitionException {
        Command cmd = null;

        Command c = null;

        Command c2 = null;


        try {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:190:3: (c= expression (c2= expression )* )
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:190:3: c= expression (c2= expression )*
            {
            pushFollow(FOLLOW_expression_in_open_expr_list234);
            c=expression();
            _fsp--;


              	if( c != null ) {
              		cmd=c;
              	}
              
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:194:5: (c2= expression )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==LOPEN||(LA5_0>=NAME && LA5_0<=DNAME)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:194:6: c2= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_open_expr_list241);
            	    c2=expression();
            	    _fsp--;


            	      	cmd = processSequence(cmd, c2);
            	      

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cmd;
    }
    // $ANTLR end open_expr_list


    // $ANTLR start cmd
    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:199:1: cmd returns [Command cmd=null;] : (c= command | LOPEN c= open_expr_list ROPEN );
    public final Command cmd() throws RecognitionException {
        Command cmd = null;;

        Command c = null;


        try {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:200:2: (c= command | LOPEN c= open_expr_list ROPEN )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=NAME && LA6_0<=DNAME)) ) {
                alt6=1;
            }
            else if ( (LA6_0==LOPEN) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("199:1: cmd returns [Command cmd=null;] : (c= command | LOPEN c= open_expr_list ROPEN );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:200:2: c= command
                    {
                    pushFollow(FOLLOW_command_in_cmd261);
                    c=command();
                    _fsp--;


                    	cmd = c;
                     

                    }
                    break;
                case 2 :
                    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:203:2: LOPEN c= open_expr_list ROPEN
                    {
                    match(input,LOPEN,FOLLOW_LOPEN_in_cmd268); 
                    pushFollow(FOLLOW_open_expr_list_in_cmd272);
                    c=open_expr_list();
                    _fsp--;


                     	cmd = c; 
                     
                    match(input,ROPEN,FOLLOW_ROPEN_in_cmd276); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cmd;
    }
    // $ANTLR end cmd


    // $ANTLR start command
    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:208:1: command returns [Exec cmd=null;] : n= command_name (ho= host )? (a= argument_value )* (arg= argument )* ;
    public final Exec command() throws RecognitionException {
        Exec cmd = null;;

        String n = null;

        String ho = null;

        Parameter a = null;

        Parameter arg = null;


        try {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:209:3: (n= command_name (ho= host )? (a= argument_value )* (arg= argument )* )
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:209:3: n= command_name (ho= host )? (a= argument_value )* (arg= argument )*
            {

                Token t = input.LT(1);
                int line = t.getLine();
                int column = t.getCharPositionInLine();
              
            pushFollow(FOLLOW_command_name_in_command296);
            n=command_name();
            _fsp--;


               	AstExec exec = AstFactory.eINSTANCE.createAstExec();
               	exec.setLine(line);
                exec.setColumn(column + 1);
                cmd = exec;
               	int index = n.lastIndexOf("::");
               	if( index == -1 ) {
               		cmd.setName(n);
               	}
               	else {
               		cmd.setNamespace(n.substring(0, index));
               		cmd.setName(n.substring(index+2));
               	}
               
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:228:4: (ho= host )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:228:5: ho= host
                    {
                    pushFollow(FOLLOW_host_in_command307);
                    ho=host();
                    _fsp--;


                    		cmd.setHost(ho);
                       

                    }
                    break;

            }

            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:231:4: (a= argument_value )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==NAME) ) {
                    /*int LA8_7 = */input.LA(2);

                    if ( (!(lookupNL())) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==LBRACK||(LA8_0>=NUMBER && LA8_0<=CURLY_STRING)||LA8_0==STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:231:5: a= argument_value
            	    {
            	    pushFollow(FOLLOW_argument_value_in_command319);
            	    a=argument_value();
            	    _fsp--;


            	       	if( a != null ) {
            	     		cmd.getParameters().add(a);
            	       	}
            	       

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:236:4: (arg= argument )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:236:5: arg= argument
            	    {
            	    pushFollow(FOLLOW_argument_in_command332);
            	    arg=argument();
            	    _fsp--;


            	       	if( arg != null ) {
            	     		cmd.getParameters().add(arg);
            	       	}
            	       

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


                t = input.LT(-1);
                int end = t.getCharPositionInLine()+t.getText().length();
                int length = end - column;
                exec.setLength(length);
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cmd;
    }
    // $ANTLR end command


    // $ANTLR start subcommand
    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:249:1: subcommand returns [Parameter param=null;] : LBRACK c= expr_list RBRACK ;
    public final Parameter subcommand() throws RecognitionException {
        Parameter param = null;;

        Command c = null;


        try {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:250:3: ( LBRACK c= expr_list RBRACK )
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:250:3: LBRACK c= expr_list RBRACK
            {
            match(input,LBRACK,FOLLOW_LBRACK_in_subcommand353); 
            pushFollow(FOLLOW_expr_list_in_subcommand361);
            c=expr_list();
            _fsp--;


                	ExecutableParameter p = factory.createExecutableParameter();
              		p.setCommand(c);
            	  	param = p;
                
            match(input,RBRACK,FOLLOW_RBRACK_in_subcommand367); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return param;
    }
    // $ANTLR end subcommand


    // $ANTLR start command_name
    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:259:1: command_name returns [String name=null;] : (n= NAME | n= DNAME ) ;
    public final String command_name() throws RecognitionException {
        String name = null;;

        Token n=null;

        try {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:260:2: ( (n= NAME | n= DNAME ) )
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:260:2: (n= NAME | n= DNAME )
            {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:260:2: (n= NAME | n= DNAME )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==NAME) ) {
                alt10=1;
            }
            else if ( (LA10_0==DNAME) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("260:2: (n= NAME | n= DNAME )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:260:3: n= NAME
                    {
                    n=(Token)input.LT(1);
                    match(input,NAME,FOLLOW_NAME_in_command_name385); 

                    }
                    break;
                case 2 :
                    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:260:33: n= DNAME
                    {
                    n=(Token)input.LT(1);
                    match(input,DNAME,FOLLOW_DNAME_in_command_name392); 

                    }
                    break;

            }

             name = n.getText(); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return name;
    }
    // $ANTLR end command_name


    // $ANTLR start host
    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:263:1: host returns [String host=null;] : ( '@' (n= NAME | n= IP4 ) ) ;
    public final String host() throws RecognitionException {
        String host = null;;

        Token n=null;

        try {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:264:2: ( ( '@' (n= NAME | n= IP4 ) ) )
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:264:2: ( '@' (n= NAME | n= IP4 ) )
            {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:264:2: ( '@' (n= NAME | n= IP4 ) )
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:264:3: '@' (n= NAME | n= IP4 )
            {
            match(input,25,FOLLOW_25_in_host410); 
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:264:7: (n= NAME | n= IP4 )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==NAME) ) {
                alt11=1;
            }
            else if ( (LA11_0==IP4) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("264:7: (n= NAME | n= IP4 )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:264:8: n= NAME
                    {
                    n=(Token)input.LT(1);
                    match(input,NAME,FOLLOW_NAME_in_host415); 

                    }
                    break;
                case 2 :
                    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:264:15: n= IP4
                    {
                    n=(Token)input.LT(1);
                    match(input,IP4,FOLLOW_IP4_in_host419); 

                    }
                    break;

            }


            }


             	host = n.getText();
             

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return host;
    }
    // $ANTLR end host


    // $ANTLR start argument
    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:269:1: argument returns [Parameter param = null] : (p= named_argument ) ;
    public final Parameter argument() throws RecognitionException {
        Parameter param =  null;

        Parameter p = null;


        try {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:270:4: ( (p= named_argument ) )
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:270:4: (p= named_argument )
            {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:270:4: (p= named_argument )
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:270:5: p= named_argument
            {
            pushFollow(FOLLOW_named_argument_in_argument441);
            p=named_argument();
            _fsp--;


            }

             param = p; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return param;
    }
    // $ANTLR end argument


    // $ANTLR start argument_value
    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:272:1: argument_value returns [Parameter param=null;] : (p= simple_value | p= subcommand | p= convert_string ) ;
    public final Parameter argument_value() throws RecognitionException {
        Parameter param = null;;

        Parameter p = null;


        try {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:273:3: ( (p= simple_value | p= subcommand | p= convert_string ) )
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:273:3: (p= simple_value | p= subcommand | p= convert_string )
            {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:273:3: (p= simple_value | p= subcommand | p= convert_string )
            int alt12=3;
            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==SEMI) ) {
                    alt12=3;
                }
                else if ( (LA12_1==EOF||(LA12_1>=COLON && LA12_1<=DNAME)||(LA12_1>=NUMBER && LA12_1<=CURLY_STRING)||LA12_1==STRING||LA12_1==26) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("273:3: (p= simple_value | p= subcommand | p= convert_string )", 12, 1, input);

                    throw nvae;
                }
                }
                break;
            case NUMBER:
            case CURLY_STRING:
            case STRING:
                {
                alt12=1;
                }
                break;
            case LBRACK:
                {
                alt12=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("273:3: (p= simple_value | p= subcommand | p= convert_string )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:273:4: p= simple_value
                    {
                    pushFollow(FOLLOW_simple_value_in_argument_value462);
                    p=simple_value();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:273:23: p= subcommand
                    {
                    pushFollow(FOLLOW_subcommand_in_argument_value469);
                    p=subcommand();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:273:39: p= convert_string
                    {
                    pushFollow(FOLLOW_convert_string_in_argument_value477);
                    p=convert_string();
                    _fsp--;


                    }
                    break;

            }


              	param = p;
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return param;
    }
    // $ANTLR end argument_value


    // $ANTLR start simple_value
    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:277:1: simple_value returns [Parameter param = null;] : (d= NAME | d= NUMBER | d2= string | d3= CURLY_STRING ) ;
    public final Parameter simple_value() throws RecognitionException {
        Parameter param =  null;;

        Token d=null;
        Token d3=null;
        String d2 = null;


        try {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:278:2: ( (d= NAME | d= NUMBER | d2= string | d3= CURLY_STRING ) )
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:278:2: (d= NAME | d= NUMBER | d2= string | d3= CURLY_STRING )
            {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:278:2: (d= NAME | d= NUMBER | d2= string | d3= CURLY_STRING )
            int alt13=4;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt13=1;
                }
                break;
            case NUMBER:
                {
                alt13=2;
                }
                break;
            case STRING:
                {
                alt13=3;
                }
                break;
            case CURLY_STRING:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("278:2: (d= NAME | d= NUMBER | d2= string | d3= CURLY_STRING )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:278:3: d= NAME
                    {
                    d=(Token)input.LT(1);
                    match(input,NAME,FOLLOW_NAME_in_simple_value494); 

                    }
                    break;
                case 2 :
                    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:278:10: d= NUMBER
                    {
                    d=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_simple_value498); 

                    }
                    break;
                case 3 :
                    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:278:19: d2= string
                    {
                    pushFollow(FOLLOW_string_in_simple_value502);
                    d2=string();
                    _fsp--;


                    }
                    break;
                case 4 :
                    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:278:29: d3= CURLY_STRING
                    {
                    d3=(Token)input.LT(1);
                    match(input,CURLY_STRING,FOLLOW_CURLY_STRING_in_simple_value506); 

                    }
                    break;

            }

             
                AstLiteral literal = AstFactory.eINSTANCE.createAstLiteral();
                Token t = input.LT(-1);    
                literal.setLine(t.getLine());
                literal.setColumn(t.getCharPositionInLine());
                literal.setLength(t.getText().length());
            		LiteralParameter p = literal;
            		if( d != null ) {
              			p.setLiteral(d.getText());
              		}
              		else if( d2 != null ) {
                    String value = d2;
                    StringBuilder result = new StringBuilder(value.length());
                    loop: for (int i = 0; i < value.length(); i++){
                      char ch = value.charAt(i);
                      if (ch == '\\'){
                        if (i+1 >= value.length())
                          throw new SyntaxErrorException(1, 1, "Invalid escape sequence");
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
                  else if( d3 != null ) {
                    String text = d3.getText();
                    p.setLiteral(text.substring(1, text.length()-1));
                  }
            	  	param = p;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return param;
    }
    // $ANTLR end simple_value


    // $ANTLR start named_argument
    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:318:1: named_argument returns [Parameter param=null;] : ( '-' ( '-' )? n= NAME ( ( '=' )? (v= argument_value ) )? ) ;
    public final Parameter named_argument() throws RecognitionException {
        Parameter param = null;;

        Token n=null;
        Parameter v = null;


        try {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:319:2: ( ( '-' ( '-' )? n= NAME ( ( '=' )? (v= argument_value ) )? ) )
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:319:2: ( '-' ( '-' )? n= NAME ( ( '=' )? (v= argument_value ) )? )
            {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:319:2: ( '-' ( '-' )? n= NAME ( ( '=' )? (v= argument_value ) )? )
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:319:3: '-' ( '-' )? n= NAME ( ( '=' )? (v= argument_value ) )?
            {
            match(input,26,FOLLOW_26_in_named_argument523); 
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:319:7: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:319:7: '-'
                    {
                    match(input,26,FOLLOW_26_in_named_argument525); 

                    }
                    break;

            }

            n=(Token)input.LT(1);
            match(input,NAME,FOLLOW_NAME_in_named_argument530); 
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:319:19: ( ( '=' )? (v= argument_value ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LBRACK||(LA16_0>=NUMBER && LA16_0<=CURLY_STRING)||LA16_0==STRING||LA16_0==27) ) {
                alt16=1;
            }
            else if ( (LA16_0==NAME) ) {
                /*int LA16_2 = */input.LA(2);

                if ( (!(lookupNL())) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:319:20: ( '=' )? (v= argument_value )
                    {
                    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:319:20: ( '=' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==27) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:319:20: '='
                            {
                            match(input,27,FOLLOW_27_in_named_argument533); 

                            }
                            break;

                    }

                    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:319:25: (v= argument_value )
                    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:319:26: v= argument_value
                    {
                    pushFollow(FOLLOW_argument_value_in_named_argument539);
                    v=argument_value();
                    _fsp--;


                    }


                    }
                    break;

            }


            }


              if (v == null){    
                LiteralParameter l = factory.createLiteralParameter();
                l.setLiteral("true");
                param=l;
              } else {
                param=v;
              }
              param.setName(n.getText());
             

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return param;
    }
    // $ANTLR end named_argument


    // $ANTLR start convert_string
    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:331:1: convert_string returns [Parameter param=null;] : (f= NAME SEMI v= CURLY_STRING ) ;
    public final Parameter convert_string() throws RecognitionException {
        Parameter param = null;;

        Token f=null;
        Token v=null;

        try {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:332:2: ( (f= NAME SEMI v= CURLY_STRING ) )
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:332:2: (f= NAME SEMI v= CURLY_STRING )
            {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:332:2: (f= NAME SEMI v= CURLY_STRING )
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:332:3: f= NAME SEMI v= CURLY_STRING
            {
            f=(Token)input.LT(1);
            match(input,NAME,FOLLOW_NAME_in_convert_string561); 
            match(input,SEMI,FOLLOW_SEMI_in_convert_string563); 
            v=(Token)input.LT(1);
            match(input,CURLY_STRING,FOLLOW_CURLY_STRING_in_convert_string567); 

            }


             		LiteralParameter p = factory.createLiteralParameter();
             		String value = v.getText();
              		p.setLiteral(value.substring(1, value.length()-1));
              		p.setFormat(f.getText());
            	  	param = p;
             

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return param;
    }
    // $ANTLR end convert_string


    // $ANTLR start string
    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:361:1: string returns [String s = null] : f= STRING ( '+' r= STRING )* ;
    public final String string() throws RecognitionException {
        String s =  null;

        Token f=null;
        Token r=null;

        try {
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:362:3: (f= STRING ( '+' r= STRING )* )
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:362:3: f= STRING ( '+' r= STRING )*
            {
            f=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_string664); 
            StringBuilder sb = 
                new StringBuilder(f.getText().substring(1, f.getText().length()-1));
            // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:364:3: ( '+' r= STRING )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // D:\\Dev\\git\\ecl\\org.eclipse.ecl.parser\\antlr\\Ecl.g:364:4: '+' r= STRING
            	    {
            	    match(input,28,FOLLOW_28_in_string672); 
            	    r=(Token)input.LT(1);
            	    match(input,STRING,FOLLOW_STRING_in_string676); 
            	    sb.append(r.getText().substring(1, r.getText().length()-1));

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            s = sb.toString();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end string


 

    public static final BitSet FOLLOW_expr_list_in_commands68 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_commands72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expr_list94 = new BitSet(new long[]{0x0000000000001882L});
    public static final BitSet FOLLOW_and_expr_in_expression121 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_eos_in_expression128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_eos143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_eos149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_expr_in_and_expr171 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_and_expr176 = new BitSet(new long[]{0x0000000000001880L});
    public static final BitSet FOLLOW_or_expr_in_and_expr180 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_cmd_in_or_expr202 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_OR_in_or_expr208 = new BitSet(new long[]{0x0000000000001880L});
    public static final BitSet FOLLOW_cmd_in_or_expr212 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_expression_in_open_expr_list234 = new BitSet(new long[]{0x0000000000001882L});
    public static final BitSet FOLLOW_expression_in_open_expr_list241 = new BitSet(new long[]{0x0000000000001882L});
    public static final BitSet FOLLOW_command_in_cmd261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOPEN_in_cmd268 = new BitSet(new long[]{0x0000000000001880L});
    public static final BitSet FOLLOW_open_expr_list_in_cmd272 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ROPEN_in_cmd276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_name_in_command296 = new BitSet(new long[]{0x000000000604CA02L});
    public static final BitSet FOLLOW_host_in_command307 = new BitSet(new long[]{0x000000000404CA02L});
    public static final BitSet FOLLOW_argument_value_in_command319 = new BitSet(new long[]{0x000000000404CA02L});
    public static final BitSet FOLLOW_argument_in_command332 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_LBRACK_in_subcommand353 = new BitSet(new long[]{0x0000000000001C80L});
    public static final BitSet FOLLOW_expr_list_in_subcommand361 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RBRACK_in_subcommand367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_command_name385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DNAME_in_command_name392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_host410 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_NAME_in_host415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IP4_in_host419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_argument_in_argument441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_value_in_argument_value462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subcommand_in_argument_value469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convert_string_in_argument_value477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_simple_value494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_simple_value498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_simple_value502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_STRING_in_simple_value506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_named_argument523 = new BitSet(new long[]{0x0000000004000800L});
    public static final BitSet FOLLOW_26_in_named_argument525 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NAME_in_named_argument530 = new BitSet(new long[]{0x000000000804CA02L});
    public static final BitSet FOLLOW_27_in_named_argument533 = new BitSet(new long[]{0x000000000004CA00L});
    public static final BitSet FOLLOW_argument_value_in_named_argument539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_convert_string561 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_convert_string563 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CURLY_STRING_in_convert_string567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_string664 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_string672 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_STRING_in_string676 = new BitSet(new long[]{0x0000000010000002L});

}
