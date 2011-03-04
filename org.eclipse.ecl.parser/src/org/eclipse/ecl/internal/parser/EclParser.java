// $ANTLR 3.0 D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g 2011-03-04 15:39:58

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
import org.eclipse.ecl.gen.ast.AstFactory;
import org.eclipse.ecl.gen.ast.AstExec;
import org.eclipse.ecl.gen.ast.AstLiteral;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class EclParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COLON", "AND", "OR", "LOPEN", "ROPEN", "LBRACK", "RBRACK", "NAME", "DNAME", "IP4", "NUMBER", "STRING", "CURLY_STRING", "SEMI", "DIGIT", "LCURLY", "RCURLY", "WS", "NEWLINE", "COMMENT", "LINE_COMMENT", "'@'", "'-'", "'='"
    };
    public static final int RBRACK=10;
    public static final int LBRACK=9;
    public static final int LINE_COMMENT=24;
    public static final int NUMBER=14;
    public static final int LCURLY=19;
    public static final int AND=5;
    public static final int EOF=-1;
    public static final int SEMI=17;
    public static final int COLON=4;
    public static final int NAME=11;
    public static final int WS=21;
    public static final int NEWLINE=22;
    public static final int CURLY_STRING=16;
    public static final int DNAME=12;
    public static final int RCURLY=20;
    public static final int OR=6;
    public static final int LOPEN=7;
    public static final int IP4=13;
    public static final int DIGIT=18;
    public static final int ROPEN=8;
    public static final int COMMENT=23;
    public static final int STRING=15;

        public EclParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g"; }

      
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
        if(index==0)
          result=true;
        input.rewind(start);
        return result;
    }



    // $ANTLR start commands
    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:116:1: commands returns [Command cmd=null;] : exprs= expr_list ;
    public final Command commands() throws RecognitionException {
        Command cmd = null;;

        Sequence exprs = null;


        try {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:117:2: (exprs= expr_list )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:117:2: exprs= expr_list
            {
            pushFollow(FOLLOW_expr_list_in_commands68);
            exprs=expr_list();
            _fsp--;

            cmd=exprs;

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
    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:119:1: expr_list returns [Sequence seq=null] : ( EOF | (c2= expression )* );
    public final Sequence expr_list() throws RecognitionException {
        Sequence seq = null;

        Command c2 = null;


        try {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:120:3: ( EOF | (c2= expression )* )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EOF) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||LA2_1==RBRACK) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("119:1: expr_list returns [Sequence seq=null] : ( EOF | (c2= expression )* );", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==LOPEN||(LA2_0>=RBRACK && LA2_0<=DNAME)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("119:1: expr_list returns [Sequence seq=null] : ( EOF | (c2= expression )* );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:120:3: EOF
                    {
                    seq = factory.createSequence();
                    match(input,EOF,FOLLOW_EOF_in_expr_list88); 

                    }
                    break;
                case 2 :
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:121:9: (c2= expression )*
                    {
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:121:9: (c2= expression )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==LOPEN||(LA1_0>=NAME && LA1_0<=DNAME)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:121:11: c2= expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_expr_list96);
                    	    c2=expression();
                    	    _fsp--;

                    	    seq.getCommands().add(c2);

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


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
        return seq;
    }
    // $ANTLR end expr_list


    // $ANTLR start expression
    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:124:1: expression returns [Command cmd=null;] : c= and_expr eos ;
    public final Command expression() throws RecognitionException {
        Command cmd = null;;

        Command c = null;


        try {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:125:4: (c= and_expr eos )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:125:4: c= and_expr eos
            {
            pushFollow(FOLLOW_and_expr_in_expression118);
            c=and_expr();
            _fsp--;


               	cmd = c;
               
            pushFollow(FOLLOW_eos_in_expression125);
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
    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:131:1: eos : ( EOF | COLON | {...}?);
    public final void eos() throws RecognitionException {
        try {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:133:5: ( EOF | COLON | {...}?)
            int alt3=3;
            switch ( input.LA(1) ) {
            case EOF:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==COLON||(LA3_1>=LOPEN && LA3_1<=ROPEN)||(LA3_1>=RBRACK && LA3_1<=DNAME)) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("131:1: eos : ( EOF | COLON | {...}?);", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case COLON:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case COLON:
                case ROPEN:
                case RBRACK:
                    {
                    alt3=2;
                    }
                    break;
                case NAME:
                    {
                    int LA3_17 = input.LA(3);

                    if ( (!(lookupNL())) ) {
                        alt3=2;
                    }
                    else if ( (lookupNL()) ) {
                        alt3=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("131:1: eos : ( EOF | COLON | {...}?);", 3, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                case DNAME:
                    {
                    int LA3_18 = input.LA(3);

                    if ( (!(lookupNL())) ) {
                        alt3=2;
                    }
                    else if ( (lookupNL()) ) {
                        alt3=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("131:1: eos : ( EOF | COLON | {...}?);", 3, 18, input);

                        throw nvae;
                    }
                    }
                    break;
                case LOPEN:
                    {
                    int LA3_19 = input.LA(3);

                    if ( (!(lookupNL())) ) {
                        alt3=2;
                    }
                    else if ( (lookupNL()) ) {
                        alt3=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("131:1: eos : ( EOF | COLON | {...}?);", 3, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("131:1: eos : ( EOF | COLON | {...}?);", 3, 2, input);

                    throw nvae;
                }

                }
                break;
            case LOPEN:
            case ROPEN:
            case RBRACK:
            case NAME:
            case DNAME:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("131:1: eos : ( EOF | COLON | {...}?);", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:133:5: EOF
                    {
                    match(input,EOF,FOLLOW_EOF_in_eos140); 

                    }
                    break;
                case 2 :
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:134:5: COLON
                    {
                    match(input,COLON,FOLLOW_COLON_in_eos146); 

                    }
                    break;
                case 3 :
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:135:5: {...}?
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
    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:137:1: and_expr returns [Command cmd=null;] : or1= or_expr ( AND or2= or_expr )* ;
    public final Command and_expr() throws RecognitionException {
        Command cmd = null;;

        Command or1 = null;

        Command or2 = null;


        try {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:138:3: (or1= or_expr ( AND or2= or_expr )* )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:138:3: or1= or_expr ( AND or2= or_expr )*
            {
            pushFollow(FOLLOW_or_expr_in_and_expr168);
            or1=or_expr();
            _fsp--;

            cmd=or1;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:138:26: ( AND or2= or_expr )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==AND) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:138:27: AND or2= or_expr
            	    {
            	    match(input,AND,FOLLOW_AND_in_and_expr173); 
            	    pushFollow(FOLLOW_or_expr_in_and_expr177);
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
    // $ANTLR end and_expr


    // $ANTLR start or_expr
    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:156:1: or_expr returns [Command cmd=null;] : c= cmd ( OR cmd2= cmd )* ;
    public final Command or_expr() throws RecognitionException {
        Command cmd = null;;

        Command c = null;

        Command cmd2 = null;


        try {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:157:3: (c= cmd ( OR cmd2= cmd )* )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:157:3: c= cmd ( OR cmd2= cmd )*
            {
            pushFollow(FOLLOW_cmd_in_or_expr199);
            c=cmd();
            _fsp--;


              cmd = c;
              
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:159:6: ( OR cmd2= cmd )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==OR) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:159:7: OR cmd2= cmd
            	    {
            	    match(input,OR,FOLLOW_OR_in_or_expr205); 
            	    pushFollow(FOLLOW_cmd_in_or_expr209);
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
    // $ANTLR end or_expr


    // $ANTLR start open_expr_list
    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:177:1: open_expr_list returns [Command cmd=null] : c= expression ( COLON c2= expression )* ;
    public final Command open_expr_list() throws RecognitionException {
        Command cmd = null;

        Command c = null;

        Command c2 = null;


        try {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:178:3: (c= expression ( COLON c2= expression )* )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:178:3: c= expression ( COLON c2= expression )*
            {
            pushFollow(FOLLOW_expression_in_open_expr_list231);
            c=expression();
            _fsp--;


              	if( c != null ) {
              		cmd=c;
              	}
              
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:182:5: ( COLON c2= expression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COLON) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:182:6: COLON c2= expression
            	    {
            	    match(input,COLON,FOLLOW_COLON_in_open_expr_list236); 
            	    pushFollow(FOLLOW_expression_in_open_expr_list240);
            	    c2=expression();
            	    _fsp--;


            	      	cmd = processSequence(cmd, c2);
            	      

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:187:1: cmd returns [Command cmd=null;] : (c= command | LOPEN c= open_expr_list ROPEN );
    public final Command cmd() throws RecognitionException {
        Command cmd = null;;

        Command c = null;


        try {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:188:2: (c= command | LOPEN c= open_expr_list ROPEN )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=NAME && LA7_0<=DNAME)) ) {
                alt7=1;
            }
            else if ( (LA7_0==LOPEN) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("187:1: cmd returns [Command cmd=null;] : (c= command | LOPEN c= open_expr_list ROPEN );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:188:2: c= command
                    {
                    pushFollow(FOLLOW_command_in_cmd260);
                    c=command();
                    _fsp--;


                    	cmd = c;
                     

                    }
                    break;
                case 2 :
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:191:2: LOPEN c= open_expr_list ROPEN
                    {
                    match(input,LOPEN,FOLLOW_LOPEN_in_cmd267); 
                    pushFollow(FOLLOW_open_expr_list_in_cmd271);
                    c=open_expr_list();
                    _fsp--;


                     	cmd = c; 
                     
                    match(input,ROPEN,FOLLOW_ROPEN_in_cmd275); 

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
    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:196:1: command returns [Exec cmd=null;] : n= command_name (ho= host )? (a= argument_value )* (arg= argument )* ;
    public final Exec command() throws RecognitionException {
        Exec cmd = null;;

        String n = null;

        String ho = null;

        Parameter a = null;

        Parameter arg = null;


        try {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:197:3: (n= command_name (ho= host )? (a= argument_value )* (arg= argument )* )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:197:3: n= command_name (ho= host )? (a= argument_value )* (arg= argument )*
            {

                Token t = input.LT(1);
                int line = t.getLine();
                int column = t.getCharPositionInLine();
              
            pushFollow(FOLLOW_command_name_in_command295);
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
               
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:216:4: (ho= host )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:216:5: ho= host
                    {
                    pushFollow(FOLLOW_host_in_command306);
                    ho=host();
                    _fsp--;


                    		cmd.setHost(ho);
                       

                    }
                    break;

            }

            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:219:4: (a= argument_value )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==NAME) ) {
                    int LA9_7 = input.LA(2);

                    if ( (!(lookupNL())) ) {
                        alt9=1;
                    }


                }
                else if ( (LA9_0==LBRACK||(LA9_0>=NUMBER && LA9_0<=CURLY_STRING)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:219:5: a= argument_value
            	    {
            	    pushFollow(FOLLOW_argument_value_in_command318);
            	    a=argument_value();
            	    _fsp--;


            	       	if( a != null ) {
            	     		cmd.getParameters().add(a);
            	       	}
            	       

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:224:4: (arg= argument )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:224:5: arg= argument
            	    {
            	    pushFollow(FOLLOW_argument_in_command331);
            	    arg=argument();
            	    _fsp--;


            	       	if( arg != null ) {
            	     		cmd.getParameters().add(arg);
            	       	}
            	       

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:237:1: subcommand returns [Parameter param=null;] : LBRACK c= expr_list RBRACK ;
    public final Parameter subcommand() throws RecognitionException {
        Parameter param = null;;

        Sequence c = null;


        try {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:238:3: ( LBRACK c= expr_list RBRACK )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:238:3: LBRACK c= expr_list RBRACK
            {
            match(input,LBRACK,FOLLOW_LBRACK_in_subcommand352); 
            pushFollow(FOLLOW_expr_list_in_subcommand360);
            c=expr_list();
            _fsp--;


                	ExecutableParameter p = factory.createExecutableParameter();
              		p.setCommand(c);
            	  	param = p;
                
            match(input,RBRACK,FOLLOW_RBRACK_in_subcommand366); 

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
    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:247:1: command_name returns [String name=null;] : (n= NAME | n= DNAME ) ;
    public final String command_name() throws RecognitionException {
        String name = null;;

        Token n=null;

        try {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:248:2: ( (n= NAME | n= DNAME ) )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:248:2: (n= NAME | n= DNAME )
            {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:248:2: (n= NAME | n= DNAME )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==NAME) ) {
                alt11=1;
            }
            else if ( (LA11_0==DNAME) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("248:2: (n= NAME | n= DNAME )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:248:3: n= NAME
                    {
                    n=(Token)input.LT(1);
                    match(input,NAME,FOLLOW_NAME_in_command_name384); 

                    }
                    break;
                case 2 :
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:248:33: n= DNAME
                    {
                    n=(Token)input.LT(1);
                    match(input,DNAME,FOLLOW_DNAME_in_command_name391); 

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
    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:251:1: host returns [String host=null;] : ( '@' (n= NAME | n= IP4 ) ) ;
    public final String host() throws RecognitionException {
        String host = null;;

        Token n=null;

        try {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:252:2: ( ( '@' (n= NAME | n= IP4 ) ) )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:252:2: ( '@' (n= NAME | n= IP4 ) )
            {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:252:2: ( '@' (n= NAME | n= IP4 ) )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:252:3: '@' (n= NAME | n= IP4 )
            {
            match(input,25,FOLLOW_25_in_host409); 
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:252:7: (n= NAME | n= IP4 )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==NAME) ) {
                alt12=1;
            }
            else if ( (LA12_0==IP4) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("252:7: (n= NAME | n= IP4 )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:252:8: n= NAME
                    {
                    n=(Token)input.LT(1);
                    match(input,NAME,FOLLOW_NAME_in_host414); 

                    }
                    break;
                case 2 :
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:252:15: n= IP4
                    {
                    n=(Token)input.LT(1);
                    match(input,IP4,FOLLOW_IP4_in_host418); 

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
    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:257:1: argument returns [Parameter param = null] : (p= named_argument ) ;
    public final Parameter argument() throws RecognitionException {
        Parameter param =  null;

        Parameter p = null;


        try {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:258:4: ( (p= named_argument ) )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:258:4: (p= named_argument )
            {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:258:4: (p= named_argument )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:258:5: p= named_argument
            {
            pushFollow(FOLLOW_named_argument_in_argument440);
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
    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:260:1: argument_value returns [Parameter param=null;] : (p= simple_value | p= subcommand | p= convert_string ) ;
    public final Parameter argument_value() throws RecognitionException {
        Parameter param = null;;

        Parameter p = null;


        try {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:261:3: ( (p= simple_value | p= subcommand | p= convert_string ) )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:261:3: (p= simple_value | p= subcommand | p= convert_string )
            {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:261:3: (p= simple_value | p= subcommand | p= convert_string )
            int alt13=3;
            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==SEMI) ) {
                    alt13=3;
                }
                else if ( (LA13_1==EOF||(LA13_1>=COLON && LA13_1<=DNAME)||(LA13_1>=NUMBER && LA13_1<=CURLY_STRING)||LA13_1==26) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("261:3: (p= simple_value | p= subcommand | p= convert_string )", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case NUMBER:
            case STRING:
            case CURLY_STRING:
                {
                alt13=1;
                }
                break;
            case LBRACK:
                {
                alt13=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("261:3: (p= simple_value | p= subcommand | p= convert_string )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:261:4: p= simple_value
                    {
                    pushFollow(FOLLOW_simple_value_in_argument_value461);
                    p=simple_value();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:261:23: p= subcommand
                    {
                    pushFollow(FOLLOW_subcommand_in_argument_value468);
                    p=subcommand();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:261:39: p= convert_string
                    {
                    pushFollow(FOLLOW_convert_string_in_argument_value476);
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
    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:265:1: simple_value returns [Parameter param = null;] : (d= NAME | d= NUMBER | d2= STRING | d3= CURLY_STRING ) ;
    public final Parameter simple_value() throws RecognitionException {
        Parameter param =  null;;

        Token d=null;
        Token d2=null;
        Token d3=null;

        try {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:266:2: ( (d= NAME | d= NUMBER | d2= STRING | d3= CURLY_STRING ) )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:266:2: (d= NAME | d= NUMBER | d2= STRING | d3= CURLY_STRING )
            {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:266:2: (d= NAME | d= NUMBER | d2= STRING | d3= CURLY_STRING )
            int alt14=4;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt14=1;
                }
                break;
            case NUMBER:
                {
                alt14=2;
                }
                break;
            case STRING:
                {
                alt14=3;
                }
                break;
            case CURLY_STRING:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("266:2: (d= NAME | d= NUMBER | d2= STRING | d3= CURLY_STRING )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:266:3: d= NAME
                    {
                    d=(Token)input.LT(1);
                    match(input,NAME,FOLLOW_NAME_in_simple_value493); 

                    }
                    break;
                case 2 :
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:266:10: d= NUMBER
                    {
                    d=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_simple_value497); 

                    }
                    break;
                case 3 :
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:266:19: d2= STRING
                    {
                    d2=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_simple_value501); 

                    }
                    break;
                case 4 :
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:266:29: d3= CURLY_STRING
                    {
                    d3=(Token)input.LT(1);
                    match(input,CURLY_STRING,FOLLOW_CURLY_STRING_in_simple_value505); 

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
    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:307:1: named_argument returns [Parameter param=null;] : ( '-' ( '-' )? n= NAME ( ( '=' )? (v= argument_value ) )? ) ;
    public final Parameter named_argument() throws RecognitionException {
        Parameter param = null;;

        Token n=null;
        Parameter v = null;


        try {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:308:2: ( ( '-' ( '-' )? n= NAME ( ( '=' )? (v= argument_value ) )? ) )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:308:2: ( '-' ( '-' )? n= NAME ( ( '=' )? (v= argument_value ) )? )
            {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:308:2: ( '-' ( '-' )? n= NAME ( ( '=' )? (v= argument_value ) )? )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:308:3: '-' ( '-' )? n= NAME ( ( '=' )? (v= argument_value ) )?
            {
            match(input,26,FOLLOW_26_in_named_argument522); 
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:308:7: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:308:7: '-'
                    {
                    match(input,26,FOLLOW_26_in_named_argument524); 

                    }
                    break;

            }

            n=(Token)input.LT(1);
            match(input,NAME,FOLLOW_NAME_in_named_argument529); 
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:308:19: ( ( '=' )? (v= argument_value ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==LBRACK||(LA17_0>=NUMBER && LA17_0<=CURLY_STRING)||LA17_0==27) ) {
                alt17=1;
            }
            else if ( (LA17_0==NAME) ) {
                int LA17_2 = input.LA(2);

                if ( (!(lookupNL())) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:308:20: ( '=' )? (v= argument_value )
                    {
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:308:20: ( '=' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==27) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:308:20: '='
                            {
                            match(input,27,FOLLOW_27_in_named_argument532); 

                            }
                            break;

                    }

                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:308:25: (v= argument_value )
                    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:308:26: v= argument_value
                    {
                    pushFollow(FOLLOW_argument_value_in_named_argument538);
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
    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:320:1: convert_string returns [Parameter param=null;] : (f= NAME SEMI v= CURLY_STRING ) ;
    public final Parameter convert_string() throws RecognitionException {
        Parameter param = null;;

        Token f=null;
        Token v=null;

        try {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:321:2: ( (f= NAME SEMI v= CURLY_STRING ) )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:321:2: (f= NAME SEMI v= CURLY_STRING )
            {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:321:2: (f= NAME SEMI v= CURLY_STRING )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:321:3: f= NAME SEMI v= CURLY_STRING
            {
            f=(Token)input.LT(1);
            match(input,NAME,FOLLOW_NAME_in_convert_string560); 
            match(input,SEMI,FOLLOW_SEMI_in_convert_string562); 
            v=(Token)input.LT(1);
            match(input,CURLY_STRING,FOLLOW_CURLY_STRING_in_convert_string566); 

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


 

    public static final BitSet FOLLOW_expr_list_in_commands68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_expr_list88 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expr_list96 = new BitSet(new long[]{0x0000000000001882L});
    public static final BitSet FOLLOW_and_expr_in_expression118 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_eos_in_expression125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_eos140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_eos146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_expr_in_and_expr168 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_and_expr173 = new BitSet(new long[]{0x0000000000001880L});
    public static final BitSet FOLLOW_or_expr_in_and_expr177 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_cmd_in_or_expr199 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_OR_in_or_expr205 = new BitSet(new long[]{0x0000000000001880L});
    public static final BitSet FOLLOW_cmd_in_or_expr209 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_expression_in_open_expr_list231 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_COLON_in_open_expr_list236 = new BitSet(new long[]{0x0000000000001880L});
    public static final BitSet FOLLOW_expression_in_open_expr_list240 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_command_in_cmd260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOPEN_in_cmd267 = new BitSet(new long[]{0x0000000000001880L});
    public static final BitSet FOLLOW_open_expr_list_in_cmd271 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ROPEN_in_cmd275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_name_in_command295 = new BitSet(new long[]{0x000000000601CA02L});
    public static final BitSet FOLLOW_host_in_command306 = new BitSet(new long[]{0x000000000401CA02L});
    public static final BitSet FOLLOW_argument_value_in_command318 = new BitSet(new long[]{0x000000000401CA02L});
    public static final BitSet FOLLOW_argument_in_command331 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_LBRACK_in_subcommand352 = new BitSet(new long[]{0x0000000000001C80L});
    public static final BitSet FOLLOW_expr_list_in_subcommand360 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RBRACK_in_subcommand366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_command_name384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DNAME_in_command_name391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_host409 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_NAME_in_host414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IP4_in_host418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_argument_in_argument440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_value_in_argument_value461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subcommand_in_argument_value468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convert_string_in_argument_value476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_simple_value493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_simple_value497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_simple_value501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_STRING_in_simple_value505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_named_argument522 = new BitSet(new long[]{0x0000000004000800L});
    public static final BitSet FOLLOW_26_in_named_argument524 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NAME_in_named_argument529 = new BitSet(new long[]{0x000000000801CA02L});
    public static final BitSet FOLLOW_27_in_named_argument532 = new BitSet(new long[]{0x000000000001CA00L});
    public static final BitSet FOLLOW_argument_value_in_named_argument538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_convert_string560 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_convert_string562 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CURLY_STRING_in_convert_string566 = new BitSet(new long[]{0x0000000000000002L});

}