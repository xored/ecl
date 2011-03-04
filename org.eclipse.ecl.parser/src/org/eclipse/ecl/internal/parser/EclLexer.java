// $ANTLR 3.0 D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g 2011-03-04 17:25:06

package org.eclipse.ecl.internal.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class EclLexer extends Lexer {
    public static final int RBRACK=10;
    public static final int LBRACK=9;
    public static final int LINE_COMMENT=24;
    public static final int NUMBER=14;
    public static final int LCURLY=19;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int AND=5;
    public static final int Tokens=28;
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
      
      public void displayRecognitionError(String[] tokenNames,
          RecognitionException e) {
          throw new SyntaxErrorException(e.line, e.charPositionInLine);
      }

    public EclLexer() {;} 
    public EclLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g"; }

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:16:7: ( '@' )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:16:7: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:17:7: ( '-' )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:17:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:18:7: ( '=' )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:18:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start COLON
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:339:8: ( ';' )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:339:8: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COLON

    // $ANTLR start AND
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:340:6: ( '&' )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:340:6: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end AND

    // $ANTLR start OR
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:341:5: ( '|' )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:341:5: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OR

    // $ANTLR start SEMI
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:342:7: ( ':' )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:342:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SEMI

    // $ANTLR start DIGIT
    public final void mDIGIT() throws RecognitionException {
        try {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:345:1: ( ( '0' .. '9' ) )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:345:1: ( '0' .. '9' )
            {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:345:1: ( '0' .. '9' )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:345:2: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end DIGIT

    // $ANTLR start NUMBER
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:349:3: ( ( DIGIT )+ )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:349:3: ( DIGIT )+
            {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:349:3: ( DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:349:3: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NUMBER

    // $ANTLR start IP4
    public final void mIP4() throws RecognitionException {
        try {
            int _type = IP4;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:354:3: ( NUMBER '.' NUMBER '.' NUMBER '.' NUMBER )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:354:3: NUMBER '.' NUMBER '.' NUMBER '.' NUMBER
            {
            mNUMBER(); 
            match('.'); 
            mNUMBER(); 
            match('.'); 
            mNUMBER(); 
            match('.'); 
            mNUMBER(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IP4

    // $ANTLR start STRING
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:358:4: ( '\"' (~ ( '\"' | '\\n' | '\\\\' ) | ( '\\\\' . ) )* '\"' )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:358:4: '\"' (~ ( '\"' | '\\n' | '\\\\' ) | ( '\\\\' . ) )* '\"'
            {
            match('\"'); 
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:358:8: (~ ( '\"' | '\\n' | '\\\\' ) | ( '\\\\' . ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFE')) ) {
                    alt2=1;
                }
                else if ( (LA2_0=='\\') ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:358:9: ~ ( '\"' | '\\n' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:358:26: ( '\\\\' . )
            	    {
            	    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:358:26: ( '\\\\' . )
            	    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:358:27: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRING

    // $ANTLR start LOPEN
    public final void mLOPEN() throws RecognitionException {
        try {
            int _type = LOPEN;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:361:10: ( '(' )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:361:10: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LOPEN

    // $ANTLR start ROPEN
    public final void mROPEN() throws RecognitionException {
        try {
            int _type = ROPEN;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:364:10: ( ')' )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:364:10: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ROPEN

    // $ANTLR start LCURLY
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:367:11: ( '{' )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:367:11: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LCURLY

    // $ANTLR start RCURLY
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:370:11: ( '}' )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:370:11: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RCURLY

    // $ANTLR start LBRACK
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:373:11: ( '[' )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:373:11: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LBRACK

    // $ANTLR start RBRACK
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:376:11: ( ']' )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:376:11: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RBRACK

    // $ANTLR start CURLY_STRING
    public final void mCURLY_STRING() throws RecognitionException {
        try {
            int _type = CURLY_STRING;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:384:15: ( LCURLY ( . )* RCURLY )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:384:15: LCURLY ( . )* RCURLY
            {
             int deep = 0; 
            mLCURLY(); 
             deep += 1; 
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:386:3: ( . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='}') ) {
                    int LA3_1 = input.LA(2);

                    if ( ((LA3_1>='\u0000' && LA3_1<='\uFFFE')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='|')||(LA3_0>='~' && LA3_0<='\uFFFE')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:387:3: .
            	    {
            	     
            	        if (input.LA(1) == '"') {
            	          mSTRING();
            	        }
            	        if( input.LA( 1 ) == '{' ) {
            	          deep += 1;
            	        }
            	        else if( input.LA( 1 ) == '}' ) {
            	          deep -= 1;
            	        }
            	        if( deep == 0 ) {
            	          break loop3;
            	        }
            	      
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            mRCURLY(); 
             
              if( deep > 1 ) {
                MismatchedTokenException e = new MismatchedTokenException(RCURLY,input);
                e.expecting='}';
                throw e;
              }
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CURLY_STRING

    // $ANTLR start NAME
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:412:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '/' ) | DIGIT )* )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:412:2: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '/' ) | DIGIT )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:412:22: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '/' ) | DIGIT )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='.' && LA4_0<='/')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }
                else if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:412:23: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '/' )
            	    {
            	    if ( (input.LA(1)>='.' && input.LA(1)<='/')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:412:55: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NAME

    // $ANTLR start DNAME
    public final void mDNAME() throws RecognitionException {
        try {
            int _type = DNAME;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:427:2: ( NAME ( '-' NAME )+ )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:427:2: NAME ( '-' NAME )+
            {
            mNAME(); 
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:427:7: ( '-' NAME )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='-') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:427:8: '-' NAME
            	    {
            	    match('-'); 
            	    mNAME(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DNAME

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:430:5: ( ( ' ' | '\\t' )+ )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:430:5: ( ' ' | '\\t' )+
            {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:430:5: ( ' ' | '\\t' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\t'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


              channel=HIDDEN;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start NEWLINE
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:436:10: ( ( '\\r' | '\\n' )+ )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:436:10: ( '\\r' | '\\n' )+
            {
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:436:10: ( '\\r' | '\\n' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


              channel=HIDDEN;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NEWLINE

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:442:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:442:10: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:442:15: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFE')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:442:43: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 

            skip();

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    // $ANTLR start LINE_COMMENT
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:445:15: ( '//' (~ ( '\\n' | '\\r' ) )* )
            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:445:15: '//' (~ ( '\\n' | '\\r' ) )*
            {
            match("//"); 

            // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:445:20: (~ ( '\\n' | '\\r' ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:445:20: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            skip();

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LINE_COMMENT

    public void mTokens() throws RecognitionException {
        // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:10: ( T25 | T26 | T27 | COLON | AND | OR | SEMI | NUMBER | IP4 | STRING | LOPEN | ROPEN | LCURLY | RCURLY | LBRACK | RBRACK | CURLY_STRING | NAME | DNAME | WS | NEWLINE | COMMENT | LINE_COMMENT )
        int alt10=23;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:10: T25
                {
                mT25(); 

                }
                break;
            case 2 :
                // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:14: T26
                {
                mT26(); 

                }
                break;
            case 3 :
                // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:18: T27
                {
                mT27(); 

                }
                break;
            case 4 :
                // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:22: COLON
                {
                mCOLON(); 

                }
                break;
            case 5 :
                // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:28: AND
                {
                mAND(); 

                }
                break;
            case 6 :
                // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:32: OR
                {
                mOR(); 

                }
                break;
            case 7 :
                // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:35: SEMI
                {
                mSEMI(); 

                }
                break;
            case 8 :
                // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:40: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 9 :
                // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:47: IP4
                {
                mIP4(); 

                }
                break;
            case 10 :
                // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:51: STRING
                {
                mSTRING(); 

                }
                break;
            case 11 :
                // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:58: LOPEN
                {
                mLOPEN(); 

                }
                break;
            case 12 :
                // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:64: ROPEN
                {
                mROPEN(); 

                }
                break;
            case 13 :
                // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:70: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 14 :
                // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:77: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 15 :
                // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:84: LBRACK
                {
                mLBRACK(); 

                }
                break;
            case 16 :
                // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:91: RBRACK
                {
                mRBRACK(); 

                }
                break;
            case 17 :
                // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:98: CURLY_STRING
                {
                mCURLY_STRING(); 

                }
                break;
            case 18 :
                // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:111: NAME
                {
                mNAME(); 

                }
                break;
            case 19 :
                // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:116: DNAME
                {
                mDNAME(); 

                }
                break;
            case 20 :
                // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:122: WS
                {
                mWS(); 

                }
                break;
            case 21 :
                // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:125: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 22 :
                // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:133: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 23 :
                // D:\\dev\\q7\\workspace\\test\\META-INF\\Ecl.g:1:141: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\10\uffff\1\24\3\uffff\1\26\3\uffff\1\32\7\uffff\2\32\4\uffff";
    static final String DFA10_eofS =
        "\36\uffff";
    static final String DFA10_minS =
        "\1\11\7\uffff\1\56\3\uffff\1\0\3\uffff\1\55\2\uffff\1\52\4\uffff"+
        "\2\55\4\uffff";
    static final String DFA10_maxS =
        "\1\175\7\uffff\1\71\3\uffff\1\ufffe\3\uffff\1\172\2\uffff\1\57"+
        "\4\uffff\2\172\4\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\13\1\14\1\uffff"+
        "\1\16\1\17\1\20\1\uffff\1\24\1\25\1\uffff\1\10\1\11\1\15\1\21\2"+
        "\uffff\1\22\1\23\1\27\1\26";
    static final String DFA10_specialS =
        "\36\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\21\1\22\2\uffff\1\22\22\uffff\1\21\1\uffff\1\11\3\uffff"+
            "\1\5\1\uffff\1\12\1\13\3\uffff\1\2\1\uffff\1\23\12\10\1\7\1"+
            "\4\1\uffff\1\3\2\uffff\1\1\32\20\1\16\1\uffff\1\17\3\uffff\32"+
            "\20\1\14\1\6\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\25\1\uffff\12\10",
            "",
            "",
            "",
            "\uffff\27",
            "",
            "",
            "",
            "\1\33\2\30\12\31\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "\1\35\4\uffff\1\34",
            "",
            "",
            "",
            "",
            "\1\33\2\30\12\31\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\33\2\30\12\31\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
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
            return "1:1: Tokens : ( T25 | T26 | T27 | COLON | AND | OR | SEMI | NUMBER | IP4 | STRING | LOPEN | ROPEN | LCURLY | RCURLY | LBRACK | RBRACK | CURLY_STRING | NAME | DNAME | WS | NEWLINE | COMMENT | LINE_COMMENT );";
        }
    }
 

}