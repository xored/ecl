// $ANTLR 3.0.1 D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g 2010-11-23 16:25:21

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
    public String getGrammarFileName() { return "D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g"; }


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



    // $ANTLR start commands
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:69:1: commands returns [Command cmd=null;] : exprs= expr_list ;
    public final Command commands() throws RecognitionException {
        Command cmd = null;;

        Command exprs = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:69:36: (exprs= expr_list )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:70:2: exprs= expr_list
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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:72:1: expr_list returns [Command cmd=null] : ( NEWLINE )* c= expression ( ( ( NEWLINE )+ | COLON ) c2= expression )* ( NEWLINE | COLON )* ;
    public final Command expr_list() throws RecognitionException {
        Command cmd = null;

        Command c = null;

        Command c2 = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:72:37: ( ( NEWLINE )* c= expression ( ( ( NEWLINE )+ | COLON ) c2= expression )* ( NEWLINE | COLON )* )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:73:3: ( NEWLINE )* c= expression ( ( ( NEWLINE )+ | COLON ) c2= expression )* ( NEWLINE | COLON )*
            {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:73:3: ( NEWLINE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NEWLINE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:73:3: NEWLINE
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_expr_list84); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            pushFollow(FOLLOW_expression_in_expr_list92);
            c=expression();
            _fsp--;


              	if( c != null ) {
              		cmd=c;
              	}
              
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:78:5: ( ( ( NEWLINE )+ | COLON ) c2= expression )*
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
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:78:6: ( ( NEWLINE )+ | COLON ) c2= expression
            	    {
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:78:6: ( ( NEWLINE )+ | COLON )
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
            	            new NoViableAltException("78:6: ( ( NEWLINE )+ | COLON )", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:78:7: ( NEWLINE )+
            	            {
            	            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:78:7: ( NEWLINE )+
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
            	            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:78:7: NEWLINE
            	            	    {
            	            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_expr_list98); 

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
            	            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:78:16: COLON
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expr_list101); 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_expression_in_expr_list106);
            	    c2=expression();
            	    _fsp--;


            	    		cmd = processSequence(cmd, c2);
            	      

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:81:3: ( NEWLINE | COLON )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=NEWLINE && LA5_0<=COLON)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:
            	    {
            	    if ( (input.LA(1)>=NEWLINE && input.LA(1)<=COLON) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_expr_list115);    throw mse;
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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:84:1: expression returns [Command cmd=null;] : c= and_expr ;
    public final Command expression() throws RecognitionException {
        Command cmd = null;;

        Command c = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:84:38: (c= and_expr )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:85:4: c= and_expr
            {
            pushFollow(FOLLOW_and_expr_in_expression137);
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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:90:1: and_expr returns [Command cmd=null;] : or1= or_expr ( ( NEWLINE )* AND ( NEWLINE )* or2= or_expr )* ;
    public final Command and_expr() throws RecognitionException {
        Command cmd = null;;

        Command or1 = null;

        Command or2 = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:90:37: (or1= or_expr ( ( NEWLINE )* AND ( NEWLINE )* or2= or_expr )* )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:91:3: or1= or_expr ( ( NEWLINE )* AND ( NEWLINE )* or2= or_expr )*
            {
            pushFollow(FOLLOW_or_expr_in_and_expr156);
            or1=or_expr();
            _fsp--;

            cmd=or1;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:91:26: ( ( NEWLINE )* AND ( NEWLINE )* or2= or_expr )*
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
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:91:27: ( NEWLINE )* AND ( NEWLINE )* or2= or_expr
            	    {
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:91:27: ( NEWLINE )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==NEWLINE) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:91:27: NEWLINE
            	    	    {
            	    	    match(input,NEWLINE,FOLLOW_NEWLINE_in_and_expr161); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    match(input,AND,FOLLOW_AND_in_and_expr164); 
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:91:40: ( NEWLINE )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==NEWLINE) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:91:40: NEWLINE
            	    	    {
            	    	    match(input,NEWLINE,FOLLOW_NEWLINE_in_and_expr166); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_or_expr_in_and_expr171);
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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:109:1: or_expr returns [Command cmd=null;] : c= cmd ( ( NEWLINE )* OR ( NEWLINE )* cmd2= cmd )* ;
    public final Command or_expr() throws RecognitionException {
        Command cmd = null;;

        Command c = null;

        Command cmd2 = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:109:36: (c= cmd ( ( NEWLINE )* OR ( NEWLINE )* cmd2= cmd )* )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:110:3: c= cmd ( ( NEWLINE )* OR ( NEWLINE )* cmd2= cmd )*
            {
            pushFollow(FOLLOW_cmd_in_or_expr193);
            c=cmd();
            _fsp--;


              cmd = c;
              
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:112:5: ( ( NEWLINE )* OR ( NEWLINE )* cmd2= cmd )*
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
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:112:6: ( NEWLINE )* OR ( NEWLINE )* cmd2= cmd
            	    {
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:112:6: ( NEWLINE )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==NEWLINE) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:112:6: NEWLINE
            	    	    {
            	    	    match(input,NEWLINE,FOLLOW_NEWLINE_in_or_expr198); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    match(input,OR,FOLLOW_OR_in_or_expr201); 
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:112:18: ( NEWLINE )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==NEWLINE) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:112:18: NEWLINE
            	    	    {
            	    	    match(input,NEWLINE,FOLLOW_NEWLINE_in_or_expr203); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop10;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_cmd_in_or_expr208);
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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:130:1: open_expr_list returns [Command cmd=null] : c= expression ( COLON c2= expression )* ;
    public final Command open_expr_list() throws RecognitionException {
        Command cmd = null;

        Command c = null;

        Command c2 = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:130:42: (c= expression ( COLON c2= expression )* )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:131:3: c= expression ( COLON c2= expression )*
            {
            pushFollow(FOLLOW_expression_in_open_expr_list229);
            c=expression();
            _fsp--;


              	if( c != null ) {
              		cmd=c;
              	}
              
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:135:5: ( COLON c2= expression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==COLON) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:135:6: COLON c2= expression
            	    {
            	    match(input,COLON,FOLLOW_COLON_in_open_expr_list234); 
            	    pushFollow(FOLLOW_expression_in_open_expr_list238);
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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:140:1: cmd returns [Command cmd=null;] : (c= command | LOPEN c= open_expr_list ROPEN );
    public final Command cmd() throws RecognitionException {
        Command cmd = null;;

        Command c = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:140:32: (c= command | LOPEN c= open_expr_list ROPEN )
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
                    new NoViableAltException("140:1: cmd returns [Command cmd=null;] : (c= command | LOPEN c= open_expr_list ROPEN );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:141:2: c= command
                    {
                    pushFollow(FOLLOW_command_in_cmd258);
                    c=command();
                    _fsp--;


                    	cmd = c;
                     

                    }
                    break;
                case 2 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:144:2: LOPEN c= open_expr_list ROPEN
                    {
                    match(input,LOPEN,FOLLOW_LOPEN_in_cmd265); 
                    pushFollow(FOLLOW_open_expr_list_in_cmd269);
                    c=open_expr_list();
                    _fsp--;


                     	cmd = c; 
                     
                    match(input,ROPEN,FOLLOW_ROPEN_in_cmd273); 

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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:149:1: command returns [Exec cmd=null;] : n= command_name (ho= host )? (a= argument_value )* (arg= argument )* ;
    public final Exec command() throws RecognitionException {
        Exec cmd = null;;

        String n = null;

        String ho = null;

        Parameter a = null;

        Parameter arg = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:149:32: (n= command_name (ho= host )? (a= argument_value )* (arg= argument )* )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:150:4: n= command_name (ho= host )? (a= argument_value )* (arg= argument )*
            {
            pushFollow(FOLLOW_command_name_in_command289);
            n=command_name();
            _fsp--;


               	cmd = factory.createExec();
               	int pos = n.lastIndexOf("::");
               	if( pos == -1 ) {
               		cmd.setName(n);
               	}
               	else {
               		cmd.setNamespace(n.substring(0, pos));
               		cmd.setName(n.substring(pos+2));
               	}
               
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:161:4: (ho= host )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:161:5: ho= host
                    {
                    pushFollow(FOLLOW_host_in_command300);
                    ho=host();
                    _fsp--;


                    		cmd.setHost(ho);
                       

                    }
                    break;

            }

            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:164:4: (a= argument_value )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==LBRACK||LA15_0==NAME||(LA15_0>=NUMBER && LA15_0<=CURLY_STRING)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:164:5: a= argument_value
            	    {
            	    pushFollow(FOLLOW_argument_value_in_command312);
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

            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:169:4: (arg= argument )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:169:5: arg= argument
            	    {
            	    pushFollow(FOLLOW_argument_in_command325);
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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:176:1: subcommand returns [Parameter param=null;] : LBRACK c= expr_list RBRACK ;
    public final Parameter subcommand() throws RecognitionException {
        Parameter param = null;;

        Command c = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:176:42: ( LBRACK c= expr_list RBRACK )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:177:3: LBRACK c= expr_list RBRACK
            {
            match(input,LBRACK,FOLLOW_LBRACK_in_subcommand342); 
            pushFollow(FOLLOW_expr_list_in_subcommand350);
            c=expr_list();
            _fsp--;


                	ExecutableParameter p = factory.createExecutableParameter();
              		p.setCommand(c);
            	  	param = p;
                
            match(input,RBRACK,FOLLOW_RBRACK_in_subcommand356); 

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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:186:1: command_name returns [String name=null;] : (n= NAME | n= DNAME ) ;
    public final String command_name() throws RecognitionException {
        String name = null;;

        Token n=null;

        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:186:40: ( (n= NAME | n= DNAME ) )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:187:2: (n= NAME | n= DNAME )
            {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:187:2: (n= NAME | n= DNAME )
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
                    new NoViableAltException("187:2: (n= NAME | n= DNAME )", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:187:3: n= NAME
                    {
                    n=(Token)input.LT(1);
                    match(input,NAME,FOLLOW_NAME_in_command_name374); 

                    }
                    break;
                case 2 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:187:33: n= DNAME
                    {
                    n=(Token)input.LT(1);
                    match(input,DNAME,FOLLOW_DNAME_in_command_name381); 

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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:190:1: host returns [String host=null;] : ( '@' (n= NAME | n= IP4 ) ) ;
    public final String host() throws RecognitionException {
        String host = null;;

        Token n=null;

        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:190:33: ( ( '@' (n= NAME | n= IP4 ) ) )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:191:2: ( '@' (n= NAME | n= IP4 ) )
            {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:191:2: ( '@' (n= NAME | n= IP4 ) )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:191:3: '@' (n= NAME | n= IP4 )
            {
            match(input,26,FOLLOW_26_in_host399); 
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:191:7: (n= NAME | n= IP4 )
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
                    new NoViableAltException("191:7: (n= NAME | n= IP4 )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:191:8: n= NAME
                    {
                    n=(Token)input.LT(1);
                    match(input,NAME,FOLLOW_NAME_in_host404); 

                    }
                    break;
                case 2 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:191:15: n= IP4
                    {
                    n=(Token)input.LT(1);
                    match(input,IP4,FOLLOW_IP4_in_host408); 

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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:196:1: argument returns [Parameter param = null] : (p= named_argument ) ;
    public final Parameter argument() throws RecognitionException {
        Parameter param =  null;

        Parameter p = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:196:42: ( (p= named_argument ) )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:197:4: (p= named_argument )
            {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:197:4: (p= named_argument )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:197:5: p= named_argument
            {
            pushFollow(FOLLOW_named_argument_in_argument430);
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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:199:1: argument_value returns [Parameter param=null;] : (p= simple_value | p= subcommand | p= convert_string ) ;
    public final Parameter argument_value() throws RecognitionException {
        Parameter param = null;;

        Parameter p = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:199:47: ( (p= simple_value | p= subcommand | p= convert_string ) )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:200:3: (p= simple_value | p= subcommand | p= convert_string )
            {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:200:3: (p= simple_value | p= subcommand | p= convert_string )
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
                        new NoViableAltException("200:3: (p= simple_value | p= subcommand | p= convert_string )", 19, 1, input);

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
                    new NoViableAltException("200:3: (p= simple_value | p= subcommand | p= convert_string )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:200:4: p= simple_value
                    {
                    pushFollow(FOLLOW_simple_value_in_argument_value451);
                    p=simple_value();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:200:23: p= subcommand
                    {
                    pushFollow(FOLLOW_subcommand_in_argument_value458);
                    p=subcommand();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:200:39: p= convert_string
                    {
                    pushFollow(FOLLOW_convert_string_in_argument_value466);
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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:204:1: simple_value returns [Parameter param = null;] : (d= NAME | d= NUMBER | d2= STRING | d2= CURLY_STRING ) ;
    public final Parameter simple_value() throws RecognitionException {
        Parameter param =  null;;

        Token d=null;
        Token d2=null;

        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:204:46: ( (d= NAME | d= NUMBER | d2= STRING | d2= CURLY_STRING ) )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:205:2: (d= NAME | d= NUMBER | d2= STRING | d2= CURLY_STRING )
            {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:205:2: (d= NAME | d= NUMBER | d2= STRING | d2= CURLY_STRING )
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
                    new NoViableAltException("205:2: (d= NAME | d= NUMBER | d2= STRING | d2= CURLY_STRING )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:205:3: d= NAME
                    {
                    d=(Token)input.LT(1);
                    match(input,NAME,FOLLOW_NAME_in_simple_value483); 

                    }
                    break;
                case 2 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:205:10: d= NUMBER
                    {
                    d=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_simple_value487); 

                    }
                    break;
                case 3 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:205:19: d2= STRING
                    {
                    d2=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_simple_value491); 

                    }
                    break;
                case 4 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:205:29: d2= CURLY_STRING
                    {
                    d2=(Token)input.LT(1);
                    match(input,CURLY_STRING,FOLLOW_CURLY_STRING_in_simple_value495); 

                    }
                    break;

            }

             
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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:237:1: named_argument returns [Parameter param=null;] : ( '-' ( '-' )? n= NAME ( '=' )? (v= argument_value ) ) ;
    public final Parameter named_argument() throws RecognitionException {
        Parameter param = null;;

        Token n=null;
        Parameter v = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:237:47: ( ( '-' ( '-' )? n= NAME ( '=' )? (v= argument_value ) ) )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:238:2: ( '-' ( '-' )? n= NAME ( '=' )? (v= argument_value ) )
            {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:238:2: ( '-' ( '-' )? n= NAME ( '=' )? (v= argument_value ) )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:238:3: '-' ( '-' )? n= NAME ( '=' )? (v= argument_value )
            {
            match(input,27,FOLLOW_27_in_named_argument512); 
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:238:7: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:238:7: '-'
                    {
                    match(input,27,FOLLOW_27_in_named_argument514); 

                    }
                    break;

            }

            n=(Token)input.LT(1);
            match(input,NAME,FOLLOW_NAME_in_named_argument519); 
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:238:19: ( '=' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:238:19: '='
                    {
                    match(input,28,FOLLOW_28_in_named_argument521); 

                    }
                    break;

            }

            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:238:24: (v= argument_value )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:238:25: v= argument_value
            {
            pushFollow(FOLLOW_argument_value_in_named_argument527);
            v=argument_value();
            _fsp--;


            }


            }


             	v.setName(n.getText());
             	param=v;
             

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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:244:1: convert_string returns [Parameter param=null;] : (f= NAME SEMI v= CURLY_STRING ) ;
    public final Parameter convert_string() throws RecognitionException {
        Parameter param = null;;

        Token f=null;
        Token v=null;

        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:244:47: ( (f= NAME SEMI v= CURLY_STRING ) )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:245:2: (f= NAME SEMI v= CURLY_STRING )
            {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:245:2: (f= NAME SEMI v= CURLY_STRING )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:245:3: f= NAME SEMI v= CURLY_STRING
            {
            f=(Token)input.LT(1);
            match(input,NAME,FOLLOW_NAME_in_convert_string547); 
            match(input,SEMI,FOLLOW_SEMI_in_convert_string549); 
            v=(Token)input.LT(1);
            match(input,CURLY_STRING,FOLLOW_CURLY_STRING_in_convert_string553); 

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
    public static final BitSet FOLLOW_NEWLINE_in_expr_list84 = new BitSet(new long[]{0x0000000000003110L});
    public static final BitSet FOLLOW_expression_in_expr_list92 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_NEWLINE_in_expr_list98 = new BitSet(new long[]{0x0000000000003110L});
    public static final BitSet FOLLOW_COLON_in_expr_list101 = new BitSet(new long[]{0x0000000000003100L});
    public static final BitSet FOLLOW_expression_in_expr_list106 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_expr_list115 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_and_expr_in_expression137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_expr_in_and_expr156 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_NEWLINE_in_and_expr161 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_AND_in_and_expr164 = new BitSet(new long[]{0x0000000000003110L});
    public static final BitSet FOLLOW_NEWLINE_in_and_expr166 = new BitSet(new long[]{0x0000000000003110L});
    public static final BitSet FOLLOW_or_expr_in_and_expr171 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_cmd_in_or_expr193 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_NEWLINE_in_or_expr198 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_OR_in_or_expr201 = new BitSet(new long[]{0x0000000000003110L});
    public static final BitSet FOLLOW_NEWLINE_in_or_expr203 = new BitSet(new long[]{0x0000000000003110L});
    public static final BitSet FOLLOW_cmd_in_or_expr208 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_expression_in_open_expr_list229 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COLON_in_open_expr_list234 = new BitSet(new long[]{0x0000000000003100L});
    public static final BitSet FOLLOW_expression_in_open_expr_list238 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_command_in_cmd258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOPEN_in_cmd265 = new BitSet(new long[]{0x0000000000003100L});
    public static final BitSet FOLLOW_open_expr_list_in_cmd269 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ROPEN_in_cmd273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_name_in_command289 = new BitSet(new long[]{0x000000000C039402L});
    public static final BitSet FOLLOW_host_in_command300 = new BitSet(new long[]{0x0000000008039402L});
    public static final BitSet FOLLOW_argument_value_in_command312 = new BitSet(new long[]{0x0000000008039402L});
    public static final BitSet FOLLOW_argument_in_command325 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_LBRACK_in_subcommand342 = new BitSet(new long[]{0x0000000000003110L});
    public static final BitSet FOLLOW_expr_list_in_subcommand350 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RBRACK_in_subcommand356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_command_name374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DNAME_in_command_name381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_host399 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_NAME_in_host404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IP4_in_host408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_argument_in_argument430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_value_in_argument_value451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subcommand_in_argument_value458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convert_string_in_argument_value466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_simple_value483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_simple_value487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_simple_value491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_STRING_in_simple_value495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_named_argument512 = new BitSet(new long[]{0x0000000008001000L});
    public static final BitSet FOLLOW_27_in_named_argument514 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NAME_in_named_argument519 = new BitSet(new long[]{0x0000000010039400L});
    public static final BitSet FOLLOW_28_in_named_argument521 = new BitSet(new long[]{0x0000000000039400L});
    public static final BitSet FOLLOW_argument_value_in_named_argument527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_convert_string547 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_convert_string549 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CURLY_STRING_in_convert_string553 = new BitSet(new long[]{0x0000000000000002L});

}