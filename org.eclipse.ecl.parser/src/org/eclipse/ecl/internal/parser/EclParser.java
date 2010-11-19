// $ANTLR 3.0.1 D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g 2010-11-19 19:27:06

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
import org.eclipse.ecl.parser.IEclParserErrorReporter;


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
    	private IEclParserErrorReporter reporter;
    	public void setErrorReporter(IEclParserErrorReporter reporter) {
    		this.reporter = reporter;
    	}
    	public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e) {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            // Now do something with hdr and msg...
            if( this.reporter != null ) {
            	this.reporter.reportError(hdr, msg);
            }
        }
    	



    // $ANTLR start commands
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:102:1: commands returns [Command cmd=null;] : ( NEWLINE | exprs= expr_list );
    public final Command commands() throws RecognitionException {
        Command cmd = null;;

        Command exprs = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:102:36: ( NEWLINE | exprs= expr_list )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==NEWLINE) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF) ) {
                    alt1=1;
                }
                else if ( (LA1_1==LOPEN||(LA1_1>=NAME && LA1_1<=DNAME)) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("102:1: commands returns [Command cmd=null;] : ( NEWLINE | exprs= expr_list );", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==LOPEN||(LA1_0>=NAME && LA1_0<=DNAME)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("102:1: commands returns [Command cmd=null;] : ( NEWLINE | exprs= expr_list );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:103:2: NEWLINE
                    {
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_commands66); 

                    }
                    break;
                case 2 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:103:12: exprs= expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_commands72);
                    exprs=expr_list();
                    _fsp--;

                     cmd=exprs;

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
    // $ANTLR end commands


    // $ANTLR start expr_list
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:105:1: expr_list returns [Command cmd=null] : ( NEWLINE )? c= expression ( ( ( NEWLINE )+ | COLON ) c2= expression )* ( NEWLINE | COLON )* ;
    public final Command expr_list() throws RecognitionException {
        Command cmd = null;

        Command c = null;

        Command c2 = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:105:37: ( ( NEWLINE )? c= expression ( ( ( NEWLINE )+ | COLON ) c2= expression )* ( NEWLINE | COLON )* )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:106:3: ( NEWLINE )? c= expression ( ( ( NEWLINE )+ | COLON ) c2= expression )* ( NEWLINE | COLON )*
            {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:106:3: ( NEWLINE )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==NEWLINE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:106:3: NEWLINE
                    {
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_expr_list87); 

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_expr_list95);
            c=expression();
            _fsp--;


              	if( c != null ) {
              		cmd=c;
              	}
              
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:111:5: ( ( ( NEWLINE )+ | COLON ) c2= expression )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==NEWLINE) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==LOPEN||(LA5_1>=NAME && LA5_1<=DNAME)) ) {
                        alt5=1;
                    }
                    else if ( (LA5_1==NEWLINE) ) {
                        alt5=1;
                    }


                }
                else if ( (LA5_0==COLON) ) {
                    int LA5_4 = input.LA(2);

                    if ( (LA5_4==LOPEN||(LA5_4>=NAME && LA5_4<=DNAME)) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:111:6: ( ( NEWLINE )+ | COLON ) c2= expression
            	    {
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:111:6: ( ( NEWLINE )+ | COLON )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==NEWLINE) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==COLON) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("111:6: ( ( NEWLINE )+ | COLON )", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:111:7: ( NEWLINE )+
            	            {
            	            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:111:7: ( NEWLINE )+
            	            int cnt3=0;
            	            loop3:
            	            do {
            	                int alt3=2;
            	                int LA3_0 = input.LA(1);

            	                if ( (LA3_0==NEWLINE) ) {
            	                    alt3=1;
            	                }


            	                switch (alt3) {
            	            	case 1 :
            	            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:111:7: NEWLINE
            	            	    {
            	            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_expr_list101); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt3 >= 1 ) break loop3;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(3, input);
            	                        throw eee;
            	                }
            	                cnt3++;
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:111:16: COLON
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expr_list104); 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_expression_in_expr_list109);
            	    c2=expression();
            	    _fsp--;


            	    		cmd = processSequence(cmd, c2);
            	      

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:114:3: ( NEWLINE | COLON )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=NEWLINE && LA6_0<=COLON)) ) {
                    alt6=1;
                }


                switch (alt6) {
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
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_expr_list118);    throw mse;
            	    }


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
    // $ANTLR end expr_list


    // $ANTLR start expression
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:117:1: expression returns [Command cmd=null;] : c= and_expr ;
    public final Command expression() throws RecognitionException {
        Command cmd = null;;

        Command c = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:117:38: (c= and_expr )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:118:4: c= and_expr
            {
            pushFollow(FOLLOW_and_expr_in_expression140);
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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:123:1: and_expr returns [Command cmd=null;] : or1= or_expr ( ( NEWLINE )* AND ( NEWLINE )* or2= or_expr )* ;
    public final Command and_expr() throws RecognitionException {
        Command cmd = null;;

        Command or1 = null;

        Command or2 = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:123:37: (or1= or_expr ( ( NEWLINE )* AND ( NEWLINE )* or2= or_expr )* )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:124:3: or1= or_expr ( ( NEWLINE )* AND ( NEWLINE )* or2= or_expr )*
            {
            pushFollow(FOLLOW_or_expr_in_and_expr159);
            or1=or_expr();
            _fsp--;

            cmd=or1;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:124:26: ( ( NEWLINE )* AND ( NEWLINE )* or2= or_expr )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==NEWLINE) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==NEWLINE) ) {
                        alt9=1;
                    }
                    else if ( (LA9_1==AND) ) {
                        alt9=1;
                    }


                }
                else if ( (LA9_0==AND) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:124:27: ( NEWLINE )* AND ( NEWLINE )* or2= or_expr
            	    {
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:124:27: ( NEWLINE )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==NEWLINE) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:124:27: NEWLINE
            	    	    {
            	    	    match(input,NEWLINE,FOLLOW_NEWLINE_in_and_expr164); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);

            	    match(input,AND,FOLLOW_AND_in_and_expr167); 
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:124:40: ( NEWLINE )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==NEWLINE) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:124:40: NEWLINE
            	    	    {
            	    	    match(input,NEWLINE,FOLLOW_NEWLINE_in_and_expr169); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_or_expr_in_and_expr174);
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
            	    break loop9;
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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:142:1: or_expr returns [Command cmd=null;] : c= cmd ( ( NEWLINE )* OR ( NEWLINE )* cmd2= cmd )* ;
    public final Command or_expr() throws RecognitionException {
        Command cmd = null;;

        Command c = null;

        Command cmd2 = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:142:36: (c= cmd ( ( NEWLINE )* OR ( NEWLINE )* cmd2= cmd )* )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:143:3: c= cmd ( ( NEWLINE )* OR ( NEWLINE )* cmd2= cmd )*
            {
            pushFollow(FOLLOW_cmd_in_or_expr196);
            c=cmd();
            _fsp--;


              cmd = c;
              
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:145:5: ( ( NEWLINE )* OR ( NEWLINE )* cmd2= cmd )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==NEWLINE) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==NEWLINE) ) {
                        alt12=1;
                    }
                    else if ( (LA12_1==OR) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==OR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:145:6: ( NEWLINE )* OR ( NEWLINE )* cmd2= cmd
            	    {
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:145:6: ( NEWLINE )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==NEWLINE) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:145:6: NEWLINE
            	    	    {
            	    	    match(input,NEWLINE,FOLLOW_NEWLINE_in_or_expr201); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop10;
            	        }
            	    } while (true);

            	    match(input,OR,FOLLOW_OR_in_or_expr204); 
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:145:18: ( NEWLINE )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==NEWLINE) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:145:18: NEWLINE
            	    	    {
            	    	    match(input,NEWLINE,FOLLOW_NEWLINE_in_or_expr206); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_cmd_in_or_expr211);
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
    // $ANTLR end or_expr


    // $ANTLR start open_expr_list
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:163:1: open_expr_list returns [Command cmd=null] : c= expression ( COLON c2= expression )* ;
    public final Command open_expr_list() throws RecognitionException {
        Command cmd = null;

        Command c = null;

        Command c2 = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:163:42: (c= expression ( COLON c2= expression )* )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:164:3: c= expression ( COLON c2= expression )*
            {
            pushFollow(FOLLOW_expression_in_open_expr_list232);
            c=expression();
            _fsp--;


              	if( c != null ) {
              		cmd=c;
              	}
              
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:168:5: ( COLON c2= expression )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COLON) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:168:6: COLON c2= expression
            	    {
            	    match(input,COLON,FOLLOW_COLON_in_open_expr_list237); 
            	    pushFollow(FOLLOW_expression_in_open_expr_list241);
            	    c2=expression();
            	    _fsp--;


            	      	cmd = processSequence(cmd, c2);
            	      

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:173:1: cmd returns [Command cmd=null;] : (c= command | LOPEN c= open_expr_list ROPEN );
    public final Command cmd() throws RecognitionException {
        Command cmd = null;;

        Command c = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:173:32: (c= command | LOPEN c= open_expr_list ROPEN )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=NAME && LA14_0<=DNAME)) ) {
                alt14=1;
            }
            else if ( (LA14_0==LOPEN) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("173:1: cmd returns [Command cmd=null;] : (c= command | LOPEN c= open_expr_list ROPEN );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:174:2: c= command
                    {
                    pushFollow(FOLLOW_command_in_cmd261);
                    c=command();
                    _fsp--;


                    	cmd = c;
                     

                    }
                    break;
                case 2 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:177:2: LOPEN c= open_expr_list ROPEN
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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:182:1: command returns [Exec cmd=null;] : n= command_name (ho= host )? (a= argument_value )* (arg= argument )* ;
    public final Exec command() throws RecognitionException {
        Exec cmd = null;;

        String n = null;

        String ho = null;

        Parameter a = null;

        Parameter arg = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:182:32: (n= command_name (ho= host )? (a= argument_value )* (arg= argument )* )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:183:4: n= command_name (ho= host )? (a= argument_value )* (arg= argument )*
            {
            pushFollow(FOLLOW_command_name_in_command292);
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
               
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:194:4: (ho= host )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:194:5: ho= host
                    {
                    pushFollow(FOLLOW_host_in_command303);
                    ho=host();
                    _fsp--;


                    		cmd.setHost(ho);
                       

                    }
                    break;

            }

            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:197:4: (a= argument_value )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==LBRACK||LA16_0==NAME||(LA16_0>=NUMBER && LA16_0<=CURLY_STRING)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:197:5: a= argument_value
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
            	    break loop16;
                }
            } while (true);

            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:202:4: (arg= argument )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:202:5: arg= argument
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
            	    break loop17;
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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:209:1: subcommand returns [Parameter param=null;] : LBRACK c= expr_list RBRACK ;
    public final Parameter subcommand() throws RecognitionException {
        Parameter param = null;;

        Command c = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:209:42: ( LBRACK c= expr_list RBRACK )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:210:3: LBRACK c= expr_list RBRACK
            {
            match(input,LBRACK,FOLLOW_LBRACK_in_subcommand345); 
            pushFollow(FOLLOW_expr_list_in_subcommand353);
            c=expr_list();
            _fsp--;


                	ExecutableParameter p = factory.createExecutableParameter();
              		p.setCommand(c);
            	  	param = p;
                
            match(input,RBRACK,FOLLOW_RBRACK_in_subcommand359); 

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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:219:1: command_name returns [String name=null;] : (n= NAME | n= DNAME ) ;
    public final String command_name() throws RecognitionException {
        String name = null;;

        Token n=null;

        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:219:40: ( (n= NAME | n= DNAME ) )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:220:2: (n= NAME | n= DNAME )
            {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:220:2: (n= NAME | n= DNAME )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==NAME) ) {
                alt18=1;
            }
            else if ( (LA18_0==DNAME) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("220:2: (n= NAME | n= DNAME )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:220:3: n= NAME
                    {
                    n=(Token)input.LT(1);
                    match(input,NAME,FOLLOW_NAME_in_command_name377); 

                    }
                    break;
                case 2 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:220:33: n= DNAME
                    {
                    n=(Token)input.LT(1);
                    match(input,DNAME,FOLLOW_DNAME_in_command_name384); 

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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:223:1: host returns [String host=null;] : ( '@' (n= NAME | n= IP4 ) ) ;
    public final String host() throws RecognitionException {
        String host = null;;

        Token n=null;

        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:223:33: ( ( '@' (n= NAME | n= IP4 ) ) )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:224:2: ( '@' (n= NAME | n= IP4 ) )
            {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:224:2: ( '@' (n= NAME | n= IP4 ) )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:224:3: '@' (n= NAME | n= IP4 )
            {
            match(input,26,FOLLOW_26_in_host402); 
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:224:7: (n= NAME | n= IP4 )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==NAME) ) {
                alt19=1;
            }
            else if ( (LA19_0==IP4) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("224:7: (n= NAME | n= IP4 )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:224:8: n= NAME
                    {
                    n=(Token)input.LT(1);
                    match(input,NAME,FOLLOW_NAME_in_host407); 

                    }
                    break;
                case 2 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:224:15: n= IP4
                    {
                    n=(Token)input.LT(1);
                    match(input,IP4,FOLLOW_IP4_in_host411); 

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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:229:1: argument returns [Parameter param = null] : (p= named_argument ) ;
    public final Parameter argument() throws RecognitionException {
        Parameter param =  null;

        Parameter p = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:229:42: ( (p= named_argument ) )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:230:4: (p= named_argument )
            {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:230:4: (p= named_argument )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:230:5: p= named_argument
            {
            pushFollow(FOLLOW_named_argument_in_argument433);
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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:232:1: argument_value returns [Parameter param=null;] : (p= simple_value | p= subcommand | p= convert_string ) ;
    public final Parameter argument_value() throws RecognitionException {
        Parameter param = null;;

        Parameter p = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:232:47: ( (p= simple_value | p= subcommand | p= convert_string ) )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:233:3: (p= simple_value | p= subcommand | p= convert_string )
            {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:233:3: (p= simple_value | p= subcommand | p= convert_string )
            int alt20=3;
            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==SEMI) ) {
                    alt20=3;
                }
                else if ( (LA20_1==EOF||(LA20_1>=NEWLINE && LA20_1<=OR)||(LA20_1>=ROPEN && LA20_1<=NAME)||(LA20_1>=NUMBER && LA20_1<=CURLY_STRING)||LA20_1==27) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("233:3: (p= simple_value | p= subcommand | p= convert_string )", 20, 1, input);

                    throw nvae;
                }
                }
                break;
            case NUMBER:
            case STRING:
            case CURLY_STRING:
                {
                alt20=1;
                }
                break;
            case LBRACK:
                {
                alt20=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("233:3: (p= simple_value | p= subcommand | p= convert_string )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:233:4: p= simple_value
                    {
                    pushFollow(FOLLOW_simple_value_in_argument_value454);
                    p=simple_value();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:233:23: p= subcommand
                    {
                    pushFollow(FOLLOW_subcommand_in_argument_value461);
                    p=subcommand();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:233:39: p= convert_string
                    {
                    pushFollow(FOLLOW_convert_string_in_argument_value469);
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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:237:1: simple_value returns [Parameter param = null;] : (d= NAME | d= NUMBER | d2= STRING | d2= CURLY_STRING ) ;
    public final Parameter simple_value() throws RecognitionException {
        Parameter param =  null;;

        Token d=null;
        Token d2=null;

        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:237:46: ( (d= NAME | d= NUMBER | d2= STRING | d2= CURLY_STRING ) )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:238:2: (d= NAME | d= NUMBER | d2= STRING | d2= CURLY_STRING )
            {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:238:2: (d= NAME | d= NUMBER | d2= STRING | d2= CURLY_STRING )
            int alt21=4;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt21=1;
                }
                break;
            case NUMBER:
                {
                alt21=2;
                }
                break;
            case STRING:
                {
                alt21=3;
                }
                break;
            case CURLY_STRING:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("238:2: (d= NAME | d= NUMBER | d2= STRING | d2= CURLY_STRING )", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:238:3: d= NAME
                    {
                    d=(Token)input.LT(1);
                    match(input,NAME,FOLLOW_NAME_in_simple_value486); 

                    }
                    break;
                case 2 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:238:10: d= NUMBER
                    {
                    d=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_simple_value490); 

                    }
                    break;
                case 3 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:238:19: d2= STRING
                    {
                    d2=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_simple_value494); 

                    }
                    break;
                case 4 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:238:29: d2= CURLY_STRING
                    {
                    d2=(Token)input.LT(1);
                    match(input,CURLY_STRING,FOLLOW_CURLY_STRING_in_simple_value498); 

                    }
                    break;

            }

             
            		LiteralParameter p = factory.createLiteralParameter();
            		if( d != null ) {
              			p.setLiteral(d.getText());
              		}
              		else if( d2 != null ) {
            	  		String value = d2.getText();
              			p.setLiteral(value.substring(1, value.length()-1));
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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:250:1: named_argument returns [Parameter param=null;] : ( '-' ( '-' )? n= NAME ( '=' )? (v= argument_value ) ) ;
    public final Parameter named_argument() throws RecognitionException {
        Parameter param = null;;

        Token n=null;
        Parameter v = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:250:47: ( ( '-' ( '-' )? n= NAME ( '=' )? (v= argument_value ) ) )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:251:2: ( '-' ( '-' )? n= NAME ( '=' )? (v= argument_value ) )
            {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:251:2: ( '-' ( '-' )? n= NAME ( '=' )? (v= argument_value ) )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:251:3: '-' ( '-' )? n= NAME ( '=' )? (v= argument_value )
            {
            match(input,27,FOLLOW_27_in_named_argument515); 
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:251:7: ( '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:251:7: '-'
                    {
                    match(input,27,FOLLOW_27_in_named_argument517); 

                    }
                    break;

            }

            n=(Token)input.LT(1);
            match(input,NAME,FOLLOW_NAME_in_named_argument522); 
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:251:19: ( '=' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:251:19: '='
                    {
                    match(input,28,FOLLOW_28_in_named_argument524); 

                    }
                    break;

            }

            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:251:24: (v= argument_value )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:251:25: v= argument_value
            {
            pushFollow(FOLLOW_argument_value_in_named_argument530);
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
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:257:1: convert_string returns [Parameter param=null;] : (f= NAME SEMI v= CURLY_STRING ) ;
    public final Parameter convert_string() throws RecognitionException {
        Parameter param = null;;

        Token f=null;
        Token v=null;

        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:257:47: ( (f= NAME SEMI v= CURLY_STRING ) )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:258:2: (f= NAME SEMI v= CURLY_STRING )
            {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:258:2: (f= NAME SEMI v= CURLY_STRING )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:258:3: f= NAME SEMI v= CURLY_STRING
            {
            f=(Token)input.LT(1);
            match(input,NAME,FOLLOW_NAME_in_convert_string550); 
            match(input,SEMI,FOLLOW_SEMI_in_convert_string552); 
            v=(Token)input.LT(1);
            match(input,CURLY_STRING,FOLLOW_CURLY_STRING_in_convert_string556); 

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


 

    public static final BitSet FOLLOW_NEWLINE_in_commands66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_list_in_commands72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_expr_list87 = new BitSet(new long[]{0x0000000000003100L});
    public static final BitSet FOLLOW_expression_in_expr_list95 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_NEWLINE_in_expr_list101 = new BitSet(new long[]{0x0000000000003110L});
    public static final BitSet FOLLOW_COLON_in_expr_list104 = new BitSet(new long[]{0x0000000000003100L});
    public static final BitSet FOLLOW_expression_in_expr_list109 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_expr_list118 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_and_expr_in_expression140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_expr_in_and_expr159 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_NEWLINE_in_and_expr164 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_AND_in_and_expr167 = new BitSet(new long[]{0x0000000000003110L});
    public static final BitSet FOLLOW_NEWLINE_in_and_expr169 = new BitSet(new long[]{0x0000000000003110L});
    public static final BitSet FOLLOW_or_expr_in_and_expr174 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_cmd_in_or_expr196 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_NEWLINE_in_or_expr201 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_OR_in_or_expr204 = new BitSet(new long[]{0x0000000000003110L});
    public static final BitSet FOLLOW_NEWLINE_in_or_expr206 = new BitSet(new long[]{0x0000000000003110L});
    public static final BitSet FOLLOW_cmd_in_or_expr211 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_expression_in_open_expr_list232 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COLON_in_open_expr_list237 = new BitSet(new long[]{0x0000000000003100L});
    public static final BitSet FOLLOW_expression_in_open_expr_list241 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_command_in_cmd261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOPEN_in_cmd268 = new BitSet(new long[]{0x0000000000003100L});
    public static final BitSet FOLLOW_open_expr_list_in_cmd272 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ROPEN_in_cmd276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_name_in_command292 = new BitSet(new long[]{0x000000000C039402L});
    public static final BitSet FOLLOW_host_in_command303 = new BitSet(new long[]{0x0000000008039402L});
    public static final BitSet FOLLOW_argument_value_in_command315 = new BitSet(new long[]{0x0000000008039402L});
    public static final BitSet FOLLOW_argument_in_command328 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_LBRACK_in_subcommand345 = new BitSet(new long[]{0x0000000000003110L});
    public static final BitSet FOLLOW_expr_list_in_subcommand353 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RBRACK_in_subcommand359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_command_name377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DNAME_in_command_name384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_host402 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_NAME_in_host407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IP4_in_host411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_argument_in_argument433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_value_in_argument_value454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subcommand_in_argument_value461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convert_string_in_argument_value469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_simple_value486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_simple_value490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_simple_value494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_STRING_in_simple_value498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_named_argument515 = new BitSet(new long[]{0x0000000008001000L});
    public static final BitSet FOLLOW_27_in_named_argument517 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NAME_in_named_argument522 = new BitSet(new long[]{0x0000000010039400L});
    public static final BitSet FOLLOW_28_in_named_argument524 = new BitSet(new long[]{0x0000000000039400L});
    public static final BitSet FOLLOW_argument_value_in_named_argument530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_convert_string550 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_convert_string552 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CURLY_STRING_in_convert_string556 = new BitSet(new long[]{0x0000000000000002L});

}