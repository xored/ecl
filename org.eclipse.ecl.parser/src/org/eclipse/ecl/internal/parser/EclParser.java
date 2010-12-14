// $ANTLR 3.0.1 D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g 2010-12-14 15:15:00

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEWLINE", "COLON", "AND", "OR", "LOPEN", "ROPEN", "LBRACK", "RBRACK", "NAME", "DNAME", "IP4", "NUMBER", "STRING", "CURLY_STRING", "SEMI", "SYMBOL", "DIGIT", "LCURLY", "RCURLY", "WS", "MultiLineComment", "SingleLineComment", "'@'", "'-'", "'='"
    };
    public static final int RBRACK=11;
    public static final int LBRACK=10;
    public static final int SYMBOL=19;
    public static final int SingleLineComment=25;
    public static final int NUMBER=15;
    public static final int LCURLY=21;
    public static final int AND=6;
    public static final int EOF=-1;
    public static final int SEMI=18;
    public static final int COLON=5;
    public static final int NAME=12;
    public static final int WS=23;
    public static final int NEWLINE=4;
    public static final int CURLY_STRING=17;
    public static final int DNAME=13;
    public static final int RCURLY=22;
    public static final int OR=7;
    public static final int LOPEN=8;
    public static final int IP4=14;
    public static final int DIGIT=20;
    public static final int ROPEN=9;
    public static final int MultiLineComment=24;
    public static final int STRING=16;

        public EclParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g"; }

      
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



    // $ANTLR start commands
    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:71:1: commands returns [Command cmd=null;] : exprs= expr_list ;
    public final Command commands() throws RecognitionException {
        Command cmd = null;;

        Command exprs = null;


        try {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:71:36: (exprs= expr_list )
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:72:2: exprs= expr_list
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
    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:74:1: expr_list returns [Command cmd=null] : ( NEWLINE )* c= expression ( ( ( NEWLINE )+ | COLON ) c2= expression )* ( NEWLINE | COLON )* ;
    public final Command expr_list() throws RecognitionException {
        Command cmd = null;

        Command c = null;

        Command c2 = null;


        try {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:74:37: ( ( NEWLINE )* c= expression ( ( ( NEWLINE )+ | COLON ) c2= expression )* ( NEWLINE | COLON )* )
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:75:3: ( NEWLINE )* c= expression ( ( ( NEWLINE )+ | COLON ) c2= expression )* ( NEWLINE | COLON )*
            {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:75:3: ( NEWLINE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NEWLINE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:75:3: NEWLINE
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_expr_list83); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            pushFollow(FOLLOW_expression_in_expr_list91);
            c=expression();
            _fsp--;


              	if( c != null ) {
              		cmd=c;
              	}
              
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:80:5: ( ( ( NEWLINE )+ | COLON ) c2= expression )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NEWLINE) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==NEWLINE) ) {
                        alt4=1;
                    }
                    else if ( (LA4_1==LOPEN||(LA4_1>=NAME && LA4_1<=DNAME)) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==COLON) ) {
                    int LA4_4 = input.LA(2);

                    if ( (LA4_4==LOPEN||(LA4_4>=NAME && LA4_4<=DNAME)) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:80:6: ( ( NEWLINE )+ | COLON ) c2= expression
            	    {
            	    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:80:6: ( ( NEWLINE )+ | COLON )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==NEWLINE) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==COLON) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("80:6: ( ( NEWLINE )+ | COLON )", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:80:7: ( NEWLINE )+
            	            {
            	            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:80:7: ( NEWLINE )+
            	            int cnt2=0;
            	            loop2:
            	            do {
            	                int alt2=2;
            	                int LA2_0 = input.LA(1);

            	                if ( (LA2_0==NEWLINE) ) {
            	                    alt2=1;
            	                }


            	                switch (alt2) {
            	            	case 1 :
            	            	    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:80:7: NEWLINE
            	            	    {
            	            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_expr_list97); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt2 >= 1 ) break loop2;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(2, input);
            	                        throw eee;
            	                }
            	                cnt2++;
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:80:16: COLON
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expr_list100); 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_expression_in_expr_list105);
            	    c2=expression();
            	    _fsp--;


            	    		cmd = processSequence(cmd, c2);
            	      

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:83:3: ( NEWLINE | COLON )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=NEWLINE && LA5_0<=COLON)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:
            	    {
            	    if ( (input.LA(1)>=NEWLINE && input.LA(1)<=COLON) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_expr_list114);    throw mse;
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
    // $ANTLR end expr_list


    // $ANTLR start expression
    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:86:1: expression returns [Command cmd=null;] : c= and_expr ;
    public final Command expression() throws RecognitionException {
        Command cmd = null;;

        Command c = null;


        try {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:86:38: (c= and_expr )
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:87:4: c= and_expr
            {
            pushFollow(FOLLOW_and_expr_in_expression136);
            c=and_expr();
            _fsp--;


               	cmd = c;
               

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


    // $ANTLR start and_expr
    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:92:1: and_expr returns [Command cmd=null;] : or1= or_expr ( ( NEWLINE )* AND ( NEWLINE )* or2= or_expr )* ;
    public final Command and_expr() throws RecognitionException {
        Command cmd = null;;

        Command or1 = null;

        Command or2 = null;


        try {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:92:37: (or1= or_expr ( ( NEWLINE )* AND ( NEWLINE )* or2= or_expr )* )
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:93:3: or1= or_expr ( ( NEWLINE )* AND ( NEWLINE )* or2= or_expr )*
            {
            pushFollow(FOLLOW_or_expr_in_and_expr155);
            or1=or_expr();
            _fsp--;

            cmd=or1;
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:93:26: ( ( NEWLINE )* AND ( NEWLINE )* or2= or_expr )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==NEWLINE) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==NEWLINE) ) {
                        alt8=1;
                    }
                    else if ( (LA8_1==AND) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==AND) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:93:27: ( NEWLINE )* AND ( NEWLINE )* or2= or_expr
            	    {
            	    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:93:27: ( NEWLINE )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==NEWLINE) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:93:27: NEWLINE
            	    	    {
            	    	    match(input,NEWLINE,FOLLOW_NEWLINE_in_and_expr160); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    match(input,AND,FOLLOW_AND_in_and_expr163); 
            	    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:93:40: ( NEWLINE )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==NEWLINE) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:93:40: NEWLINE
            	    	    {
            	    	    match(input,NEWLINE,FOLLOW_NEWLINE_in_and_expr165); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_or_expr_in_and_expr170);
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
            	    break loop8;
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
    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:111:1: or_expr returns [Command cmd=null;] : c= cmd ( ( NEWLINE )* OR ( NEWLINE )* cmd2= cmd )* ;
    public final Command or_expr() throws RecognitionException {
        Command cmd = null;;

        Command c = null;

        Command cmd2 = null;


        try {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:111:36: (c= cmd ( ( NEWLINE )* OR ( NEWLINE )* cmd2= cmd )* )
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:112:3: c= cmd ( ( NEWLINE )* OR ( NEWLINE )* cmd2= cmd )*
            {
            pushFollow(FOLLOW_cmd_in_or_expr192);
            c=cmd();
            _fsp--;


              cmd = c;
              
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:114:5: ( ( NEWLINE )* OR ( NEWLINE )* cmd2= cmd )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==NEWLINE) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==OR) ) {
                        alt11=1;
                    }
                    else if ( (LA11_1==NEWLINE) ) {
                        alt11=1;
                    }


                }
                else if ( (LA11_0==OR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:114:6: ( NEWLINE )* OR ( NEWLINE )* cmd2= cmd
            	    {
            	    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:114:6: ( NEWLINE )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==NEWLINE) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:114:6: NEWLINE
            	    	    {
            	    	    match(input,NEWLINE,FOLLOW_NEWLINE_in_or_expr197); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    match(input,OR,FOLLOW_OR_in_or_expr200); 
            	    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:114:18: ( NEWLINE )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==NEWLINE) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:114:18: NEWLINE
            	    	    {
            	    	    match(input,NEWLINE,FOLLOW_NEWLINE_in_or_expr202); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop10;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_cmd_in_or_expr207);
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
            	    break loop11;
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
    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:132:1: open_expr_list returns [Command cmd=null] : c= expression ( COLON c2= expression )* ;
    public final Command open_expr_list() throws RecognitionException {
        Command cmd = null;

        Command c = null;

        Command c2 = null;


        try {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:132:42: (c= expression ( COLON c2= expression )* )
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:133:3: c= expression ( COLON c2= expression )*
            {
            pushFollow(FOLLOW_expression_in_open_expr_list228);
            c=expression();
            _fsp--;


              	if( c != null ) {
              		cmd=c;
              	}
              
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:137:5: ( COLON c2= expression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==COLON) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:137:6: COLON c2= expression
            	    {
            	    match(input,COLON,FOLLOW_COLON_in_open_expr_list233); 
            	    pushFollow(FOLLOW_expression_in_open_expr_list237);
            	    c2=expression();
            	    _fsp--;


            	      	cmd = processSequence(cmd, c2);
            	      

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:142:1: cmd returns [Command cmd=null;] : (c= command | LOPEN c= open_expr_list ROPEN );
    public final Command cmd() throws RecognitionException {
        Command cmd = null;;

        Command c = null;


        try {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:142:32: (c= command | LOPEN c= open_expr_list ROPEN )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=NAME && LA13_0<=DNAME)) ) {
                alt13=1;
            }
            else if ( (LA13_0==LOPEN) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("142:1: cmd returns [Command cmd=null;] : (c= command | LOPEN c= open_expr_list ROPEN );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:143:2: c= command
                    {
                    pushFollow(FOLLOW_command_in_cmd257);
                    c=command();
                    _fsp--;


                    	cmd = c;
                     

                    }
                    break;
                case 2 :
                    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:146:2: LOPEN c= open_expr_list ROPEN
                    {
                    match(input,LOPEN,FOLLOW_LOPEN_in_cmd264); 
                    pushFollow(FOLLOW_open_expr_list_in_cmd268);
                    c=open_expr_list();
                    _fsp--;


                     	cmd = c; 
                     
                    match(input,ROPEN,FOLLOW_ROPEN_in_cmd272); 

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
    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:151:1: command returns [Exec cmd=null;] : n= command_name (ho= host )? (a= argument_value )* (arg= argument )* ;
    public final Exec command() throws RecognitionException {
        Exec cmd = null;;

        String n = null;

        String ho = null;

        Parameter a = null;

        Parameter arg = null;


        try {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:151:32: (n= command_name (ho= host )? (a= argument_value )* (arg= argument )* )
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:152:3: n= command_name (ho= host )? (a= argument_value )* (arg= argument )*
            {

                Token t = input.LT(1);
                int line = t.getLine();
                int column = t.getCharPositionInLine();
              
            pushFollow(FOLLOW_command_name_in_command292);
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
               
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:171:4: (ho= host )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:171:5: ho= host
                    {
                    pushFollow(FOLLOW_host_in_command303);
                    ho=host();
                    _fsp--;


                    		cmd.setHost(ho);
                       

                    }
                    break;

            }

            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:174:4: (a= argument_value )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==LBRACK||LA15_0==NAME||(LA15_0>=NUMBER && LA15_0<=CURLY_STRING)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:174:5: a= argument_value
            	    {
            	    pushFollow(FOLLOW_argument_value_in_command315);
            	    a=argument_value();
            	    _fsp--;


            	       	if( a != null ) {
            	     		cmd.getParameters().add(a);
            	       	}
            	       

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:179:4: (arg= argument )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:179:5: arg= argument
            	    {
            	    pushFollow(FOLLOW_argument_in_command328);
            	    arg=argument();
            	    _fsp--;


            	       	if( arg != null ) {
            	     		cmd.getParameters().add(arg);
            	       	}
            	       

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:192:1: subcommand returns [Parameter param=null;] : LBRACK c= expr_list RBRACK ;
    public final Parameter subcommand() throws RecognitionException {
        Parameter param = null;;

        Command c = null;


        try {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:192:42: ( LBRACK c= expr_list RBRACK )
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:193:3: LBRACK c= expr_list RBRACK
            {
            match(input,LBRACK,FOLLOW_LBRACK_in_subcommand349); 
            pushFollow(FOLLOW_expr_list_in_subcommand357);
            c=expr_list();
            _fsp--;


                	ExecutableParameter p = factory.createExecutableParameter();
              		p.setCommand(c);
            	  	param = p;
                
            match(input,RBRACK,FOLLOW_RBRACK_in_subcommand363); 

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
    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:202:1: command_name returns [String name=null;] : (n= NAME | n= DNAME ) ;
    public final String command_name() throws RecognitionException {
        String name = null;;

        Token n=null;

        try {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:202:40: ( (n= NAME | n= DNAME ) )
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:203:2: (n= NAME | n= DNAME )
            {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:203:2: (n= NAME | n= DNAME )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==NAME) ) {
                alt17=1;
            }
            else if ( (LA17_0==DNAME) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("203:2: (n= NAME | n= DNAME )", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:203:3: n= NAME
                    {
                    n=(Token)input.LT(1);
                    match(input,NAME,FOLLOW_NAME_in_command_name381); 

                    }
                    break;
                case 2 :
                    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:203:33: n= DNAME
                    {
                    n=(Token)input.LT(1);
                    match(input,DNAME,FOLLOW_DNAME_in_command_name388); 

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
    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:206:1: host returns [String host=null;] : ( '@' (n= NAME | n= IP4 ) ) ;
    public final String host() throws RecognitionException {
        String host = null;;

        Token n=null;

        try {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:206:33: ( ( '@' (n= NAME | n= IP4 ) ) )
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:207:2: ( '@' (n= NAME | n= IP4 ) )
            {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:207:2: ( '@' (n= NAME | n= IP4 ) )
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:207:3: '@' (n= NAME | n= IP4 )
            {
            match(input,26,FOLLOW_26_in_host406); 
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:207:7: (n= NAME | n= IP4 )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==NAME) ) {
                alt18=1;
            }
            else if ( (LA18_0==IP4) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("207:7: (n= NAME | n= IP4 )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:207:8: n= NAME
                    {
                    n=(Token)input.LT(1);
                    match(input,NAME,FOLLOW_NAME_in_host411); 

                    }
                    break;
                case 2 :
                    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:207:15: n= IP4
                    {
                    n=(Token)input.LT(1);
                    match(input,IP4,FOLLOW_IP4_in_host415); 

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
    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:212:1: argument returns [Parameter param = null] : (p= named_argument ) ;
    public final Parameter argument() throws RecognitionException {
        Parameter param =  null;

        Parameter p = null;


        try {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:212:42: ( (p= named_argument ) )
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:213:4: (p= named_argument )
            {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:213:4: (p= named_argument )
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:213:5: p= named_argument
            {
            pushFollow(FOLLOW_named_argument_in_argument437);
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
    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:215:1: argument_value returns [Parameter param=null;] : (p= simple_value | p= subcommand | p= convert_string ) ;
    public final Parameter argument_value() throws RecognitionException {
        Parameter param = null;;

        Parameter p = null;


        try {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:215:47: ( (p= simple_value | p= subcommand | p= convert_string ) )
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:216:3: (p= simple_value | p= subcommand | p= convert_string )
            {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:216:3: (p= simple_value | p= subcommand | p= convert_string )
            int alt19=3;
            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==SEMI) ) {
                    alt19=3;
                }
                else if ( (LA19_1==EOF||(LA19_1>=NEWLINE && LA19_1<=OR)||(LA19_1>=ROPEN && LA19_1<=NAME)||(LA19_1>=NUMBER && LA19_1<=CURLY_STRING)||LA19_1==27) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("216:3: (p= simple_value | p= subcommand | p= convert_string )", 19, 1, input);

                    throw nvae;
                }
                }
                break;
            case NUMBER:
            case STRING:
            case CURLY_STRING:
                {
                alt19=1;
                }
                break;
            case LBRACK:
                {
                alt19=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("216:3: (p= simple_value | p= subcommand | p= convert_string )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:216:4: p= simple_value
                    {
                    pushFollow(FOLLOW_simple_value_in_argument_value458);
                    p=simple_value();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:216:23: p= subcommand
                    {
                    pushFollow(FOLLOW_subcommand_in_argument_value465);
                    p=subcommand();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:216:39: p= convert_string
                    {
                    pushFollow(FOLLOW_convert_string_in_argument_value473);
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
    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:220:1: simple_value returns [Parameter param = null;] : (d= NAME | d= NUMBER | d2= STRING | d3= CURLY_STRING ) ;
    public final Parameter simple_value() throws RecognitionException {
        Parameter param =  null;;

        Token d=null;
        Token d2=null;
        Token d3=null;

        try {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:220:46: ( (d= NAME | d= NUMBER | d2= STRING | d3= CURLY_STRING ) )
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:221:2: (d= NAME | d= NUMBER | d2= STRING | d3= CURLY_STRING )
            {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:221:2: (d= NAME | d= NUMBER | d2= STRING | d3= CURLY_STRING )
            int alt20=4;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt20=1;
                }
                break;
            case NUMBER:
                {
                alt20=2;
                }
                break;
            case STRING:
                {
                alt20=3;
                }
                break;
            case CURLY_STRING:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("221:2: (d= NAME | d= NUMBER | d2= STRING | d3= CURLY_STRING )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:221:3: d= NAME
                    {
                    d=(Token)input.LT(1);
                    match(input,NAME,FOLLOW_NAME_in_simple_value490); 

                    }
                    break;
                case 2 :
                    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:221:10: d= NUMBER
                    {
                    d=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_simple_value494); 

                    }
                    break;
                case 3 :
                    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:221:19: d2= STRING
                    {
                    d2=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_simple_value498); 

                    }
                    break;
                case 4 :
                    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:221:29: d3= CURLY_STRING
                    {
                    d3=(Token)input.LT(1);
                    match(input,CURLY_STRING,FOLLOW_CURLY_STRING_in_simple_value502); 

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
    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:262:1: named_argument returns [Parameter param=null;] : ( '-' ( '-' )? n= NAME ( ( '=' )? (v= argument_value ) )? ) ;
    public final Parameter named_argument() throws RecognitionException {
        Parameter param = null;;

        Token n=null;
        Parameter v = null;


        try {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:262:47: ( ( '-' ( '-' )? n= NAME ( ( '=' )? (v= argument_value ) )? ) )
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:263:2: ( '-' ( '-' )? n= NAME ( ( '=' )? (v= argument_value ) )? )
            {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:263:2: ( '-' ( '-' )? n= NAME ( ( '=' )? (v= argument_value ) )? )
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:263:3: '-' ( '-' )? n= NAME ( ( '=' )? (v= argument_value ) )?
            {
            match(input,27,FOLLOW_27_in_named_argument519); 
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:263:7: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:263:7: '-'
                    {
                    match(input,27,FOLLOW_27_in_named_argument521); 

                    }
                    break;

            }

            n=(Token)input.LT(1);
            match(input,NAME,FOLLOW_NAME_in_named_argument526); 
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:263:19: ( ( '=' )? (v= argument_value ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LBRACK||LA23_0==NAME||(LA23_0>=NUMBER && LA23_0<=CURLY_STRING)||LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:263:20: ( '=' )? (v= argument_value )
                    {
                    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:263:20: ( '=' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==28) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:263:20: '='
                            {
                            match(input,28,FOLLOW_28_in_named_argument529); 

                            }
                            break;

                    }

                    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:263:25: (v= argument_value )
                    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:263:26: v= argument_value
                    {
                    pushFollow(FOLLOW_argument_value_in_named_argument535);
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
    // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:275:1: convert_string returns [Parameter param=null;] : (f= NAME SEMI v= CURLY_STRING ) ;
    public final Parameter convert_string() throws RecognitionException {
        Parameter param = null;;

        Token f=null;
        Token v=null;

        try {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:275:47: ( (f= NAME SEMI v= CURLY_STRING ) )
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:276:2: (f= NAME SEMI v= CURLY_STRING )
            {
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:276:2: (f= NAME SEMI v= CURLY_STRING )
            // D:\\dev\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:276:3: f= NAME SEMI v= CURLY_STRING
            {
            f=(Token)input.LT(1);
            match(input,NAME,FOLLOW_NAME_in_convert_string557); 
            match(input,SEMI,FOLLOW_SEMI_in_convert_string559); 
            v=(Token)input.LT(1);
            match(input,CURLY_STRING,FOLLOW_CURLY_STRING_in_convert_string563); 

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
    public static final BitSet FOLLOW_NEWLINE_in_expr_list83 = new BitSet(new long[]{0x0000000000003110L});
    public static final BitSet FOLLOW_expression_in_expr_list91 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_NEWLINE_in_expr_list97 = new BitSet(new long[]{0x0000000000003110L});
    public static final BitSet FOLLOW_COLON_in_expr_list100 = new BitSet(new long[]{0x0000000000003100L});
    public static final BitSet FOLLOW_expression_in_expr_list105 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_expr_list114 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_and_expr_in_expression136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_expr_in_and_expr155 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_NEWLINE_in_and_expr160 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_AND_in_and_expr163 = new BitSet(new long[]{0x0000000000003110L});
    public static final BitSet FOLLOW_NEWLINE_in_and_expr165 = new BitSet(new long[]{0x0000000000003110L});
    public static final BitSet FOLLOW_or_expr_in_and_expr170 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_cmd_in_or_expr192 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_NEWLINE_in_or_expr197 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_OR_in_or_expr200 = new BitSet(new long[]{0x0000000000003110L});
    public static final BitSet FOLLOW_NEWLINE_in_or_expr202 = new BitSet(new long[]{0x0000000000003110L});
    public static final BitSet FOLLOW_cmd_in_or_expr207 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_expression_in_open_expr_list228 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COLON_in_open_expr_list233 = new BitSet(new long[]{0x0000000000003100L});
    public static final BitSet FOLLOW_expression_in_open_expr_list237 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_command_in_cmd257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOPEN_in_cmd264 = new BitSet(new long[]{0x0000000000003100L});
    public static final BitSet FOLLOW_open_expr_list_in_cmd268 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ROPEN_in_cmd272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_name_in_command292 = new BitSet(new long[]{0x000000000C039402L});
    public static final BitSet FOLLOW_host_in_command303 = new BitSet(new long[]{0x0000000008039402L});
    public static final BitSet FOLLOW_argument_value_in_command315 = new BitSet(new long[]{0x0000000008039402L});
    public static final BitSet FOLLOW_argument_in_command328 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_LBRACK_in_subcommand349 = new BitSet(new long[]{0x0000000000003110L});
    public static final BitSet FOLLOW_expr_list_in_subcommand357 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RBRACK_in_subcommand363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_command_name381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DNAME_in_command_name388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_host406 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_NAME_in_host411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IP4_in_host415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_argument_in_argument437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_value_in_argument_value458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subcommand_in_argument_value465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convert_string_in_argument_value473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_simple_value490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_simple_value494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_simple_value498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_STRING_in_simple_value502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_named_argument519 = new BitSet(new long[]{0x0000000008001000L});
    public static final BitSet FOLLOW_27_in_named_argument521 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NAME_in_named_argument526 = new BitSet(new long[]{0x0000000010039402L});
    public static final BitSet FOLLOW_28_in_named_argument529 = new BitSet(new long[]{0x0000000000039400L});
    public static final BitSet FOLLOW_argument_value_in_named_argument535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_convert_string557 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_convert_string559 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CURLY_STRING_in_convert_string563 = new BitSet(new long[]{0x0000000000000002L});

}