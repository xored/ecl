// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g 2010-11-12 23:37:51

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
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int SYMBOL=19;
    public static final int T__26=26;
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

    // delegates
    // delegators


        public EclParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public EclParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return EclParser.tokenNames; }
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
    	



    // $ANTLR start "commands"
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
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==LOPEN||(LA1_0>=NAME && LA1_0<=DNAME)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

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

                    state._fsp--;

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
    // $ANTLR end "commands"


    // $ANTLR start "expr_list"
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:105:1: expr_list returns [Command cmd=null] : ( NEWLINE )? c= expression ( ( NEWLINE | COLON ) c2= expression )* ( NEWLINE | COLON )* ;
    public final Command expr_list() throws RecognitionException {
        Command cmd = null;

        Command c = null;

        Command c2 = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:105:37: ( ( NEWLINE )? c= expression ( ( NEWLINE | COLON ) c2= expression )* ( NEWLINE | COLON )* )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:106:3: ( NEWLINE )? c= expression ( ( NEWLINE | COLON ) c2= expression )* ( NEWLINE | COLON )*
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

            state._fsp--;


              	if( c != null ) {
              		cmd=c;
              	}
              
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:111:5: ( ( NEWLINE | COLON ) c2= expression )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:111:6: ( NEWLINE | COLON ) c2= expression
            	    {
            	    if ( (input.LA(1)>=NEWLINE && input.LA(1)<=COLON) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_expression_in_expr_list108);
            	    c2=expression();

            	    state._fsp--;


            	    		cmd = processSequence(cmd, c2);
            	      

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:114:3: ( NEWLINE | COLON )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=NEWLINE && LA4_0<=COLON)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:
            	    {
            	    if ( (input.LA(1)>=NEWLINE && input.LA(1)<=COLON) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
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
    // $ANTLR end "expr_list"


    // $ANTLR start "expression"
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:117:1: expression returns [Command cmd=null;] : c= and_expr ;
    public final Command expression() throws RecognitionException {
        Command cmd = null;;

        Command c = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:117:38: (c= and_expr )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:118:4: c= and_expr
            {
            pushFollow(FOLLOW_and_expr_in_expression139);
            c=and_expr();

            state._fsp--;


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
    // $ANTLR end "expression"


    // $ANTLR start "and_expr"
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:123:1: and_expr returns [Command cmd=null;] : or1= or_expr ( AND or2= or_expr )* ;
    public final Command and_expr() throws RecognitionException {
        Command cmd = null;;

        Command or1 = null;

        Command or2 = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:123:37: (or1= or_expr ( AND or2= or_expr )* )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:124:3: or1= or_expr ( AND or2= or_expr )*
            {
            pushFollow(FOLLOW_or_expr_in_and_expr158);
            or1=or_expr();

            state._fsp--;

            cmd=or1;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:124:26: ( AND or2= or_expr )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==AND) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:124:27: AND or2= or_expr
            	    {
            	    match(input,AND,FOLLOW_AND_in_and_expr163); 
            	    pushFollow(FOLLOW_or_expr_in_and_expr167);
            	    or2=or_expr();

            	    state._fsp--;


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
    // $ANTLR end "and_expr"


    // $ANTLR start "or_expr"
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:142:1: or_expr returns [Command cmd=null;] : c= cmd ( OR cmd2= cmd )* ;
    public final Command or_expr() throws RecognitionException {
        Command cmd = null;;

        Command c = null;

        Command cmd2 = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:142:36: (c= cmd ( OR cmd2= cmd )* )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:143:3: c= cmd ( OR cmd2= cmd )*
            {
            pushFollow(FOLLOW_cmd_in_or_expr189);
            c=cmd();

            state._fsp--;


              cmd = c;
              
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:145:5: ( OR cmd2= cmd )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==OR) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:145:6: OR cmd2= cmd
            	    {
            	    match(input,OR,FOLLOW_OR_in_or_expr194); 
            	    pushFollow(FOLLOW_cmd_in_or_expr198);
            	    cmd2=cmd();

            	    state._fsp--;


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
    // $ANTLR end "or_expr"


    // $ANTLR start "open_expr_list"
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:163:1: open_expr_list returns [Command cmd=null] : c= expression ( COLON c2= expression )* ;
    public final Command open_expr_list() throws RecognitionException {
        Command cmd = null;

        Command c = null;

        Command c2 = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:163:42: (c= expression ( COLON c2= expression )* )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:164:3: c= expression ( COLON c2= expression )*
            {
            pushFollow(FOLLOW_expression_in_open_expr_list219);
            c=expression();

            state._fsp--;


              	if( c != null ) {
              		cmd=c;
              	}
              
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:168:5: ( COLON c2= expression )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COLON) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:168:6: COLON c2= expression
            	    {
            	    match(input,COLON,FOLLOW_COLON_in_open_expr_list224); 
            	    pushFollow(FOLLOW_expression_in_open_expr_list228);
            	    c2=expression();

            	    state._fsp--;


            	      	cmd = processSequence(cmd, c2);
            	      

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "open_expr_list"


    // $ANTLR start "cmd"
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:173:1: cmd returns [Command cmd=null;] : (c= command | LOPEN c= open_expr_list ROPEN );
    public final Command cmd() throws RecognitionException {
        Command cmd = null;;

        Command c = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:173:32: (c= command | LOPEN c= open_expr_list ROPEN )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=NAME && LA8_0<=DNAME)) ) {
                alt8=1;
            }
            else if ( (LA8_0==LOPEN) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:174:2: c= command
                    {
                    pushFollow(FOLLOW_command_in_cmd248);
                    c=command();

                    state._fsp--;


                    	cmd = c;
                     

                    }
                    break;
                case 2 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:177:2: LOPEN c= open_expr_list ROPEN
                    {
                    match(input,LOPEN,FOLLOW_LOPEN_in_cmd255); 
                    pushFollow(FOLLOW_open_expr_list_in_cmd259);
                    c=open_expr_list();

                    state._fsp--;


                     	cmd = c; 
                     
                    match(input,ROPEN,FOLLOW_ROPEN_in_cmd263); 

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
    // $ANTLR end "cmd"


    // $ANTLR start "command"
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
            pushFollow(FOLLOW_command_name_in_command279);
            n=command_name();

            state._fsp--;


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
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:194:5: ho= host
                    {
                    pushFollow(FOLLOW_host_in_command290);
                    ho=host();

                    state._fsp--;


                    		cmd.setHost(ho);
                       

                    }
                    break;

            }

            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:197:4: (a= argument_value )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:197:5: a= argument_value
            	    {
            	    pushFollow(FOLLOW_argument_value_in_command302);
            	    a=argument_value();

            	    state._fsp--;


            	       	if( a != null ) {
            	     		cmd.getParameters().add(a);
            	       	}
            	       

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:202:4: (arg= argument )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:202:5: arg= argument
            	    {
            	    pushFollow(FOLLOW_argument_in_command315);
            	    arg=argument();

            	    state._fsp--;


            	       	if( arg != null ) {
            	     		cmd.getParameters().add(arg);
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
    // $ANTLR end "command"


    // $ANTLR start "subcommand"
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:209:1: subcommand returns [Parameter param=null;] : LBRACK c= expr_list RBRACK ;
    public final Parameter subcommand() throws RecognitionException {
        Parameter param = null;;

        Command c = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:209:42: ( LBRACK c= expr_list RBRACK )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:210:3: LBRACK c= expr_list RBRACK
            {
            match(input,LBRACK,FOLLOW_LBRACK_in_subcommand332); 
            pushFollow(FOLLOW_expr_list_in_subcommand340);
            c=expr_list();

            state._fsp--;


                	ExecutableParameter p = factory.createExecutableParameter();
              		p.setCommand(c);
            	  	param = p;
                
            match(input,RBRACK,FOLLOW_RBRACK_in_subcommand346); 

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
    // $ANTLR end "subcommand"


    // $ANTLR start "command_name"
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:219:1: command_name returns [String name=null;] : (n= NAME | n= DNAME ) ;
    public final String command_name() throws RecognitionException {
        String name = null;;

        Token n=null;

        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:219:40: ( (n= NAME | n= DNAME ) )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:220:2: (n= NAME | n= DNAME )
            {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:220:2: (n= NAME | n= DNAME )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==NAME) ) {
                alt12=1;
            }
            else if ( (LA12_0==DNAME) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:220:3: n= NAME
                    {
                    n=(Token)match(input,NAME,FOLLOW_NAME_in_command_name364); 

                    }
                    break;
                case 2 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:220:33: n= DNAME
                    {
                    n=(Token)match(input,DNAME,FOLLOW_DNAME_in_command_name371); 

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
    // $ANTLR end "command_name"


    // $ANTLR start "host"
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
            match(input,26,FOLLOW_26_in_host389); 
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:224:7: (n= NAME | n= IP4 )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==NAME) ) {
                alt13=1;
            }
            else if ( (LA13_0==IP4) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:224:8: n= NAME
                    {
                    n=(Token)match(input,NAME,FOLLOW_NAME_in_host394); 

                    }
                    break;
                case 2 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:224:15: n= IP4
                    {
                    n=(Token)match(input,IP4,FOLLOW_IP4_in_host398); 

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
    // $ANTLR end "host"


    // $ANTLR start "argument"
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
            pushFollow(FOLLOW_named_argument_in_argument420);
            p=named_argument();

            state._fsp--;


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
    // $ANTLR end "argument"


    // $ANTLR start "argument_value"
    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:232:1: argument_value returns [Parameter param=null;] : (p= simple_value | p= subcommand | p= convert_string ) ;
    public final Parameter argument_value() throws RecognitionException {
        Parameter param = null;;

        Parameter p = null;


        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:232:47: ( (p= simple_value | p= subcommand | p= convert_string ) )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:233:3: (p= simple_value | p= subcommand | p= convert_string )
            {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:233:3: (p= simple_value | p= subcommand | p= convert_string )
            int alt14=3;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:233:4: p= simple_value
                    {
                    pushFollow(FOLLOW_simple_value_in_argument_value441);
                    p=simple_value();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:233:23: p= subcommand
                    {
                    pushFollow(FOLLOW_subcommand_in_argument_value448);
                    p=subcommand();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:233:39: p= convert_string
                    {
                    pushFollow(FOLLOW_convert_string_in_argument_value456);
                    p=convert_string();

                    state._fsp--;


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
    // $ANTLR end "argument_value"


    // $ANTLR start "simple_value"
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
            int alt15=4;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt15=1;
                }
                break;
            case NUMBER:
                {
                alt15=2;
                }
                break;
            case STRING:
                {
                alt15=3;
                }
                break;
            case CURLY_STRING:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:238:3: d= NAME
                    {
                    d=(Token)match(input,NAME,FOLLOW_NAME_in_simple_value473); 

                    }
                    break;
                case 2 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:238:10: d= NUMBER
                    {
                    d=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_simple_value477); 

                    }
                    break;
                case 3 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:238:19: d2= STRING
                    {
                    d2=(Token)match(input,STRING,FOLLOW_STRING_in_simple_value481); 

                    }
                    break;
                case 4 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:238:29: d2= CURLY_STRING
                    {
                    d2=(Token)match(input,CURLY_STRING,FOLLOW_CURLY_STRING_in_simple_value485); 

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
    // $ANTLR end "simple_value"


    // $ANTLR start "named_argument"
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
            match(input,27,FOLLOW_27_in_named_argument502); 
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:251:7: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:251:7: '-'
                    {
                    match(input,27,FOLLOW_27_in_named_argument504); 

                    }
                    break;

            }

            n=(Token)match(input,NAME,FOLLOW_NAME_in_named_argument509); 
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:251:19: ( '=' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:251:19: '='
                    {
                    match(input,28,FOLLOW_28_in_named_argument511); 

                    }
                    break;

            }

            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:251:24: (v= argument_value )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:251:25: v= argument_value
            {
            pushFollow(FOLLOW_argument_value_in_named_argument517);
            v=argument_value();

            state._fsp--;


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
    // $ANTLR end "named_argument"


    // $ANTLR start "convert_string"
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
            f=(Token)match(input,NAME,FOLLOW_NAME_in_convert_string537); 
            match(input,SEMI,FOLLOW_SEMI_in_convert_string539); 
            v=(Token)match(input,CURLY_STRING,FOLLOW_CURLY_STRING_in_convert_string543); 

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
    // $ANTLR end "convert_string"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA3_eotS =
        "\12\uffff";
    static final String DFA3_eofS =
        "\2\2\10\uffff";
    static final String DFA3_minS =
        "\2\4\10\uffff";
    static final String DFA3_maxS =
        "\1\13\1\15\10\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\4\uffff\1\1\2\uffff";
    static final String DFA3_specialS =
        "\12\uffff}>";
    static final String[] DFA3_transitionS = {
            "\2\1\5\uffff\1\2",
            "\2\2\2\uffff\1\7\2\uffff\1\2\2\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()* loopback of 111:5: ( ( NEWLINE | COLON ) c2= expression )*";
        }
    }
    static final String DFA9_eotS =
        "\17\uffff";
    static final String DFA9_eofS =
        "\1\2\16\uffff";
    static final String DFA9_minS =
        "\1\4\16\uffff";
    static final String DFA9_maxS =
        "\1\33\16\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\14\uffff";
    static final String DFA9_specialS =
        "\17\uffff}>";
    static final String[] DFA9_transitionS = {
            "\4\2\1\uffff\4\2\2\uffff\3\2\10\uffff\1\1\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "194:4: (ho= host )?";
        }
    }
    static final String DFA10_eotS =
        "\16\uffff";
    static final String DFA10_eofS =
        "\1\1\15\uffff";
    static final String DFA10_minS =
        "\1\4\15\uffff";
    static final String DFA10_maxS =
        "\1\33\15\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\2\7\uffff\1\1\4\uffff";
    static final String DFA10_specialS =
        "\16\uffff}>";
    static final String[] DFA10_transitionS = {
            "\4\1\1\uffff\1\1\1\11\1\1\1\11\2\uffff\3\11\11\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "()* loopback of 197:4: (a= argument_value )*";
        }
    }
    static final String DFA14_eotS =
        "\24\uffff";
    static final String DFA14_eofS =
        "\1\uffff\1\2\22\uffff";
    static final String DFA14_minS =
        "\1\12\1\4\22\uffff";
    static final String DFA14_maxS =
        "\1\21\1\33\22\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\1\2\uffff\1\2\1\3\15\uffff";
    static final String DFA14_specialS =
        "\24\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\5\1\uffff\1\1\2\uffff\3\2",
            "\4\2\1\uffff\4\2\2\uffff\3\2\1\6\10\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "233:3: (p= simple_value | p= subcommand | p= convert_string )";
        }
    }
 

    public static final BitSet FOLLOW_NEWLINE_in_commands66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_list_in_commands72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_expr_list87 = new BitSet(new long[]{0x0000000000003100L});
    public static final BitSet FOLLOW_expression_in_expr_list95 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_expr_list100 = new BitSet(new long[]{0x0000000000003100L});
    public static final BitSet FOLLOW_expression_in_expr_list108 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_expr_list117 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_and_expr_in_expression139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_expr_in_and_expr158 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AND_in_and_expr163 = new BitSet(new long[]{0x0000000000003100L});
    public static final BitSet FOLLOW_or_expr_in_and_expr167 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_cmd_in_or_expr189 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_OR_in_or_expr194 = new BitSet(new long[]{0x0000000000003100L});
    public static final BitSet FOLLOW_cmd_in_or_expr198 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_expression_in_open_expr_list219 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COLON_in_open_expr_list224 = new BitSet(new long[]{0x0000000000003100L});
    public static final BitSet FOLLOW_expression_in_open_expr_list228 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_command_in_cmd248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOPEN_in_cmd255 = new BitSet(new long[]{0x0000000000003100L});
    public static final BitSet FOLLOW_open_expr_list_in_cmd259 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ROPEN_in_cmd263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_name_in_command279 = new BitSet(new long[]{0x000000000C039402L});
    public static final BitSet FOLLOW_host_in_command290 = new BitSet(new long[]{0x0000000008039402L});
    public static final BitSet FOLLOW_argument_value_in_command302 = new BitSet(new long[]{0x0000000008039402L});
    public static final BitSet FOLLOW_argument_in_command315 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_LBRACK_in_subcommand332 = new BitSet(new long[]{0x0000000000003110L});
    public static final BitSet FOLLOW_expr_list_in_subcommand340 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RBRACK_in_subcommand346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_command_name364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DNAME_in_command_name371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_host389 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_NAME_in_host394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IP4_in_host398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_argument_in_argument420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_value_in_argument_value441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subcommand_in_argument_value448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convert_string_in_argument_value456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_simple_value473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_simple_value477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_simple_value481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_STRING_in_simple_value485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_named_argument502 = new BitSet(new long[]{0x0000000008001000L});
    public static final BitSet FOLLOW_27_in_named_argument504 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NAME_in_named_argument509 = new BitSet(new long[]{0x0000000010039400L});
    public static final BitSet FOLLOW_28_in_named_argument511 = new BitSet(new long[]{0x0000000000039400L});
    public static final BitSet FOLLOW_argument_value_in_named_argument517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_convert_string537 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SEMI_in_convert_string539 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CURLY_STRING_in_convert_string543 = new BitSet(new long[]{0x0000000000000002L});

}