// $ANTLR 3.0.1 /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g 2008-11-14 13:26:02

package org.eclipse.ecl.internal.parser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.eclipse.ecl.parser.IEclParserErrorReporter;

public class EclLexer extends Lexer {
	public static final int RBRACK = 11;
	public static final int LBRACK = 10;
	public static final int SYMBOL = 20;
	public static final int SingleLineComment = 26;
	public static final int COMMAND_NAME = 13;
	public static final int NUMBER = 16;
	public static final int LCURLY = 22;
	public static final int T29 = 29;
	public static final int T28 = 28;
	public static final int T27 = 27;
	public static final int AND = 6;
	public static final int Tokens = 30;
	public static final int EOF = -1;
	public static final int SEMI = 19;
	public static final int COLON = 5;
	public static final int NAME = 12;
	public static final int WS = 24;
	public static final int NEWLINE = 4;
	public static final int CURLY_STRING = 18;
	public static final int DNAME = 14;
	public static final int OR = 7;
	public static final int RCURLY = 23;
	public static final int LOPEN = 8;
	public static final int IP4 = 15;
	public static final int DIGIT = 21;
	public static final int ROPEN = 9;
	public static final int MultiLineComment = 25;
	public static final int STRING = 17;

	private IEclParserErrorReporter reporter;

	public void setErrorReporter(IEclParserErrorReporter reporter) {
		this.reporter = reporter;
	}

	@Override
	public void displayRecognitionError(String[] tokenNames,
			RecognitionException e) {
		String hdr = getErrorHeader(e);
		String msg = getErrorMessage(e, tokenNames);
		// Now do something with hdr and msg...
		if (this.reporter != null) {
			this.reporter.reportError(hdr, msg);
		}
	}

	List tokens = new ArrayList();

	@Override
	public void emit(Token token) {
		token = token;
		tokens.add(token);
	}

	@Override
	public Token nextToken() {
		super.nextToken();
		if (tokens.size() == 0) {
			return Token.EOF_TOKEN;
		}
		return (Token) tokens.remove(0);
	}

	public EclLexer() {
		;
	}

	public EclLexer(CharStream input) {
		super(input);
	}

	@Override
	public String getGrammarFileName() {
		return "/Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g";
	}

	// $ANTLR start T27
	public final void mT27() throws RecognitionException {
		try {
			int _type = T27;
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:39:5: ( '@'
			// )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:39:7: '@'
			{
				match('@');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end T27

	// $ANTLR start T28
	public final void mT28() throws RecognitionException {
		try {
			int _type = T28;
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:40:5: ( '-'
			// )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:40:7: '-'
			{
				match('-');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end T28

	// $ANTLR start T29
	public final void mT29() throws RecognitionException {
		try {
			int _type = T29;
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:41:5: ( '='
			// )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:41:7: '='
			{
				match('=');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end T29

	// $ANTLR start COLON
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:269:6: (
			// ';' )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:269:8: ';'
			{
				match(';');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end COLON

	// $ANTLR start AND
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:270:4: (
			// '&' )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:270:6: '&'
			{
				match('&');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end AND

	// $ANTLR start OR
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:271:3: (
			// '|' )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:271:5: '|'
			{
				match('|');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end OR

	// $ANTLR start SEMI
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:272:5: (
			// ':' )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:272:7: ':'
			{
				match(':');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end SEMI

	// $ANTLR start SYMBOL
	public final void mSYMBOL() throws RecognitionException {
		try {
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:274:16: ( (
			// 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '/' ) )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:275:3: (
			// 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '/' )
			{
				if ((input.LA(1) >= '.' && input.LA(1) <= '/')
						|| (input.LA(1) >= 'A' && input.LA(1) <= 'Z')
						|| input.LA(1) == '_'
						|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end SYMBOL

	// $ANTLR start DIGIT
	public final void mDIGIT() throws RecognitionException {
		try {
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:278:15: ( (
			// '0' .. '9' ) )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:279:1: (
			// '0' .. '9' )
			{
				// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:279:1:
				// ( '0' .. '9' )
				// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:279:2:
				// '0' .. '9'
				{
					matchRange('0', '9');

				}

			}

		} finally {
		}
	}

	// $ANTLR end DIGIT

	// $ANTLR start NUMBER
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:282:7: ( (
			// DIGIT )+ )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:283:3: (
			// DIGIT )+
			{
				// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:283:3:
				// ( DIGIT )+
				int cnt1 = 0;
				loop1: do {
					int alt1 = 2;
					int LA1_0 = input.LA(1);

					if (((LA1_0 >= '0' && LA1_0 <= '9'))) {
						alt1 = 1;
					}

					switch (alt1) {
					case 1:
						// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:283:3:
						// DIGIT
					{
						mDIGIT();

					}
						break;

					default:
						if (cnt1 >= 1)
							break loop1;
						EarlyExitException eee = new EarlyExitException(1,
								input);
						throw eee;
					}
					cnt1++;
				} while (true);

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end NUMBER

	// $ANTLR start IP4
	public final void mIP4() throws RecognitionException {
		try {
			int _type = IP4;
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:287:4: (
			// NUMBER '.' NUMBER '.' NUMBER '.' NUMBER )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:288:3:
			// NUMBER '.' NUMBER '.' NUMBER '.' NUMBER
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
		} finally {
		}
	}

	// $ANTLR end IP4

	// $ANTLR start STRING
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:291:7: (
			// '\"' (~ ( '\"' | '\\n' | '\\\\' ) | ( '\\\\' . ) )* '\"' )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:292:4: '\"'
			// (~ ( '\"' | '\\n' | '\\\\' ) | ( '\\\\' . ) )* '\"'
			{
				match('\"');
				// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:292:8:
				// (~ ( '\"' | '\\n' | '\\\\' ) | ( '\\\\' . ) )*
				loop2: do {
					int alt2 = 3;
					int LA2_0 = input.LA(1);

					if (((LA2_0 >= '\u0000' && LA2_0 <= '\t')
							|| (LA2_0 >= '\u000B' && LA2_0 <= '!')
							|| (LA2_0 >= '#' && LA2_0 <= '[') || (LA2_0 >= ']' && LA2_0 <= '\uFFFE'))) {
						alt2 = 1;
					} else if ((LA2_0 == '\\')) {
						alt2 = 2;
					}

					switch (alt2) {
					case 1:
						// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:292:9:
						// ~ ( '\"' | '\\n' | '\\\\' )
					{
						if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t')
								|| (input.LA(1) >= '\u000B' && input.LA(1) <= '!')
								|| (input.LA(1) >= '#' && input.LA(1) <= '[')
								|| (input.LA(1) >= ']' && input.LA(1) <= '\uFFFE')) {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;
					case 2:
						// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:292:26:
						// ( '\\\\' . )
					{
						// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:292:26:
						// ( '\\\\' . )
						// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:292:27:
						// '\\\\' .
						{
							match('\\');
							matchAny();

						}

					}
						break;

					default:
						break loop2;
					}
				} while (true);

				match('\"');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end STRING

	// $ANTLR start LOPEN
	public final void mLOPEN() throws RecognitionException {
		try {
			int _type = LOPEN;
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:295:8: (
			// '(' )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:295:10: '('
			{
				match('(');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end LOPEN

	// $ANTLR start ROPEN
	public final void mROPEN() throws RecognitionException {
		try {
			int _type = ROPEN;
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:298:8: (
			// ')' )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:298:10: ')'
			{
				match(')');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end ROPEN

	// $ANTLR start LCURLY
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:301:9: (
			// '{' )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:301:11: '{'
			{
				match('{');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end LCURLY

	// $ANTLR start RCURLY
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:304:9: (
			// '}' )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:304:11: '}'
			{
				match('}');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end RCURLY

	// $ANTLR start LBRACK
	public final void mLBRACK() throws RecognitionException {
		try {
			int _type = LBRACK;
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:307:9: (
			// '[' )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:307:11: '['
			{
				match('[');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end LBRACK

	// $ANTLR start RBRACK
	public final void mRBRACK() throws RecognitionException {
		try {
			int _type = RBRACK;
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:310:9: (
			// ']' )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:310:11: ']'
			{
				match(']');

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end RBRACK

	// $ANTLR start CURLY_STRING
	public final void mCURLY_STRING() throws RecognitionException {
		try {
			int _type = CURLY_STRING;
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:312:13: (
			// LCURLY ( . )* )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:312:15:
			// LCURLY ( . )*
			{
				int deep = 0;
				mLCURLY();
				deep += 1;
				// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:314:3:
				// ( . )*
				loop3: do {
					int alt3 = 2;
					int LA3_0 = input.LA(1);

					if (((LA3_0 >= '\u0000' && LA3_0 <= '\uFFFE'))) {
						alt3 = 1;
					}

					switch (alt3) {
					case 1:
						// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:315:3:
						// .
					{

						if (input.LA(1) == '{') {
							deep += 1;
						} else if (input.LA(1) == '}') {
							deep -= 1;
						}
						if (deep == 0) {
							mRCURLY();
							break loop3;
						}

						matchAny();

					}
						break;

					default:
						break loop3;
					}
				} while (true);

				if (deep > 0) {
					MismatchedTokenException e = new MismatchedTokenException(
							RCURLY, input);
					e.expecting = '}';
					throw e;
				}

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end CURLY_STRING

	// $ANTLR start NAME
	public final void mNAME() throws RecognitionException {
		try {
			int _type = NAME;
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:335:5: (
			// SYMBOL ( SYMBOL | DIGIT )* )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:336:2:
			// SYMBOL ( SYMBOL | DIGIT )*
			{
				mSYMBOL();
				// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:336:9:
				// ( SYMBOL | DIGIT )*
				loop4: do {
					int alt4 = 3;
					int LA4_0 = input.LA(1);

					if (((LA4_0 >= '.' && LA4_0 <= '/')
							|| (LA4_0 >= 'A' && LA4_0 <= 'Z') || LA4_0 == '_' || (LA4_0 >= 'a' && LA4_0 <= 'z'))) {
						alt4 = 1;
					} else if (((LA4_0 >= '0' && LA4_0 <= '9'))) {
						alt4 = 2;
					}

					switch (alt4) {
					case 1:
						// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:336:10:
						// SYMBOL
					{
						mSYMBOL();

					}
						break;
					case 2:
						// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:336:17:
						// DIGIT
					{
						mDIGIT();

					}
						break;

					default:
						break loop4;
					}
				} while (true);

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end NAME

	// $ANTLR start COMMAND_NAME
	public final void mCOMMAND_NAME() throws RecognitionException {
		try {
			int _type = COMMAND_NAME;
			Token d = null;
			Token s = null;
			Token c = null;

			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:339:13: ( (
			// ( NAME SEMI )? NAME ( '::' NAME )+ ( '-' NAME )* ) | (d= NAME s=
			// SEMI c= CURLY_STRING ) )
			int alt8 = 2;
			alt8 = dfa8.predict(input);
			switch (alt8) {
			case 1:
				// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:340:2:
				// ( ( NAME SEMI )? NAME ( '::' NAME )+ ( '-' NAME )* )
			{
				// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:340:2:
				// ( ( NAME SEMI )? NAME ( '::' NAME )+ ( '-' NAME )* )
				// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:340:3:
				// ( NAME SEMI )? NAME ( '::' NAME )+ ( '-' NAME )*
				{
					// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:340:3:
					// ( NAME SEMI )?
					int alt5 = 2;
					alt5 = dfa5.predict(input);
					switch (alt5) {
					case 1:
						// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:340:4:
						// NAME SEMI
					{
						mNAME();
						mSEMI();

					}
						break;

					}

					mNAME();
					// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:340:21:
					// ( '::' NAME )+
					int cnt6 = 0;
					loop6: do {
						int alt6 = 2;
						int LA6_0 = input.LA(1);

						if ((LA6_0 == ':')) {
							alt6 = 1;
						}

						switch (alt6) {
						case 1:
							// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:340:22:
							// '::' NAME
						{
							match("::");

							mNAME();

						}
							break;

						default:
							if (cnt6 >= 1)
								break loop6;
							EarlyExitException eee = new EarlyExitException(6,
									input);
							throw eee;
						}
						cnt6++;
					} while (true);

					// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:340:34:
					// ( '-' NAME )*
					loop7: do {
						int alt7 = 2;
						int LA7_0 = input.LA(1);

						if ((LA7_0 == '-')) {
							alt7 = 1;
						}

						switch (alt7) {
						case 1:
							// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:340:35:
							// '-' NAME
						{
							match('-');
							mNAME();

						}
							break;

						default:
							break loop7;
						}
					} while (true);

				}

			}
				break;
			case 2:
				// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:341:4:
				// (d= NAME s= SEMI c= CURLY_STRING )
			{
				// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:341:4:
				// (d= NAME s= SEMI c= CURLY_STRING )
				// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:341:5:
				// d= NAME s= SEMI c= CURLY_STRING
				{
					int dStart356 = getCharIndex();
					mNAME();
					d = new CommonToken(input, Token.INVALID_TOKEN_TYPE,
							Token.DEFAULT_CHANNEL, dStart356,
							getCharIndex() - 1);
					int sStart360 = getCharIndex();
					mSEMI();
					s = new CommonToken(input, Token.INVALID_TOKEN_TYPE,
							Token.DEFAULT_CHANNEL, sStart360,
							getCharIndex() - 1);
					int cStart364 = getCharIndex();
					mCURLY_STRING();
					c = new CommonToken(input, Token.INVALID_TOKEN_TYPE,
							Token.DEFAULT_CHANNEL, cStart364,
							getCharIndex() - 1);

				}

				d.setType(NAME);
				emit(d);
				s.setType(SEMI);
				emit(s);
				c.setType(CURLY_STRING);
				emit(c);

			}
				break;

			}
			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end COMMAND_NAME

	// $ANTLR start DNAME
	public final void mDNAME() throws RecognitionException {
		try {
			int _type = DNAME;
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:350:6: (
			// NAME ( '-' ( NAME )+ ) )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:351:2: NAME
			// ( '-' ( NAME )+ )
			{
				mNAME();
				// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:351:7:
				// ( '-' ( NAME )+ )
				// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:351:8:
				// '-' ( NAME )+
				{
					match('-');
					// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:351:12:
					// ( NAME )+
					int cnt9 = 0;
					loop9: do {
						int alt9 = 2;
						int LA9_0 = input.LA(1);

						if (((LA9_0 >= '.' && LA9_0 <= '/')
								|| (LA9_0 >= 'A' && LA9_0 <= 'Z')
								|| LA9_0 == '_' || (LA9_0 >= 'a' && LA9_0 <= 'z'))) {
							alt9 = 1;
						}

						switch (alt9) {
						case 1:
							// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:351:12:
							// NAME
						{
							mNAME();

						}
							break;

						default:
							if (cnt9 >= 1)
								break loop9;
							EarlyExitException eee = new EarlyExitException(9,
									input);
							throw eee;
						}
						cnt9++;
					} while (true);

				}

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end DNAME

	// $ANTLR start WS
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:354:3: ( (
			// ' ' | '\\t' )+ )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:354:5: (
			// ' ' | '\\t' )+
			{
				// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:354:5:
				// ( ' ' | '\\t' )+
				int cnt10 = 0;
				loop10: do {
					int alt10 = 2;
					int LA10_0 = input.LA(1);

					if ((LA10_0 == '\t' || LA10_0 == ' ')) {
						alt10 = 1;
					}

					switch (alt10) {
					case 1:
						// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:
					{
						if (input.LA(1) == '\t' || input.LA(1) == ' ') {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;

					default:
						if (cnt10 >= 1)
							break loop10;
						EarlyExitException eee = new EarlyExitException(10,
								input);
						throw eee;
					}
					cnt10++;
				} while (true);

				channel = HIDDEN;

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end WS

	// $ANTLR start NEWLINE
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:361:5: ( (
			// '\\r' | '\\n' )+ )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:361:9: (
			// '\\r' | '\\n' )+
			{
				// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:361:9:
				// ( '\\r' | '\\n' )+
				int cnt11 = 0;
				loop11: do {
					int alt11 = 2;
					int LA11_0 = input.LA(1);

					if ((LA11_0 == '\n' || LA11_0 == '\r')) {
						alt11 = 1;
					}

					switch (alt11) {
					case 1:
						// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:
					{
						if (input.LA(1) == '\n' || input.LA(1) == '\r') {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;

					default:
						if (cnt11 >= 1)
							break loop11;
						EarlyExitException eee = new EarlyExitException(11,
								input);
						throw eee;
					}
					cnt11++;
				} while (true);

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end NEWLINE

	// $ANTLR start MultiLineComment
	public final void mMultiLineComment() throws RecognitionException {
		try {
			int _type = MultiLineComment;
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:364:18: (
			// '/*' ( options {greedy=false; } : . )* '*/' )
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:365:3: '/*'
			// ( options {greedy=false; } : . )* '*/'
			{
				match("/*");

				// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:365:8:
				// ( options {greedy=false; } : . )*
				loop12: do {
					int alt12 = 2;
					int LA12_0 = input.LA(1);

					if ((LA12_0 == '*')) {
						int LA12_1 = input.LA(2);

						if ((LA12_1 == '/')) {
							alt12 = 2;
						} else if (((LA12_1 >= '\u0000' && LA12_1 <= '.') || (LA12_1 >= '0' && LA12_1 <= '\uFFFE'))) {
							alt12 = 1;
						}

					} else if (((LA12_0 >= '\u0000' && LA12_0 <= ')') || (LA12_0 >= '+' && LA12_0 <= '\uFFFE'))) {
						alt12 = 1;
					}

					switch (alt12) {
					case 1:
						// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:365:36:
						// .
					{
						matchAny();

					}
						break;

					default:
						break loop12;
					}
				} while (true);

				match("*/");

				channel = HIDDEN;

			}

			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end MultiLineComment

	// $ANTLR start SingleLineComment
	public final void mSingleLineComment() throws RecognitionException {
		try {
			int _type = SingleLineComment;
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:367:19: (
			// '//' | '#' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )?
			// )
			int alt16 = 2;
			int LA16_0 = input.LA(1);

			if ((LA16_0 == '/')) {
				alt16 = 1;
			} else if ((LA16_0 == '#')) {
				alt16 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException(
						"367:1: SingleLineComment : ( '//' | '#' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )? );",
						16, 0, input);

				throw nvae;
			}
			switch (alt16) {
			case 1:
				// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:368:3:
				// '//'
			{
				match("//");

			}
				break;
			case 2:
				// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:368:8:
				// '#' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )?
			{
				match('#');
				// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:368:12:
				// (~ ( '\\n' | '\\r' ) )*
				loop13: do {
					int alt13 = 2;
					int LA13_0 = input.LA(1);

					if (((LA13_0 >= '\u0000' && LA13_0 <= '\t')
							|| (LA13_0 >= '\u000B' && LA13_0 <= '\f') || (LA13_0 >= '\u000E' && LA13_0 <= '\uFFFE'))) {
						alt13 = 1;
					}

					switch (alt13) {
					case 1:
						// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:368:13:
						// ~ ( '\\n' | '\\r' )
					{
						if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t')
								|| (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
								|| (input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFE')) {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;

					default:
						break loop13;
					}
				} while (true);

				// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:368:28:
				// ( '\\n' | '\\r' ( '\\n' )? )?
				int alt15 = 3;
				int LA15_0 = input.LA(1);

				if ((LA15_0 == '\n')) {
					alt15 = 1;
				} else if ((LA15_0 == '\r')) {
					alt15 = 2;
				}
				switch (alt15) {
				case 1:
					// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:368:29:
					// '\\n'
				{
					match('\n');

				}
					break;
				case 2:
					// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:368:34:
					// '\\r' ( '\\n' )?
				{
					match('\r');
					// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:368:38:
					// ( '\\n' )?
					int alt14 = 2;
					int LA14_0 = input.LA(1);

					if ((LA14_0 == '\n')) {
						alt14 = 1;
					}
					switch (alt14) {
					case 1:
						// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:368:39:
						// '\\n'
					{
						match('\n');

					}
						break;

					}

				}
					break;

				}

				channel = HIDDEN;

			}
				break;

			}
			this.type = _type;
		} finally {
		}
	}

	// $ANTLR end SingleLineComment

	@Override
	public void mTokens() throws RecognitionException {
		// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:8: ( T27 |
		// T28 | T29 | COLON | AND | OR | SEMI | NUMBER | IP4 | STRING | LOPEN |
		// ROPEN | LCURLY | RCURLY | LBRACK | RBRACK | CURLY_STRING | NAME |
		// COMMAND_NAME | DNAME | WS | NEWLINE | MultiLineComment |
		// SingleLineComment )
		int alt17 = 24;
		alt17 = dfa17.predict(input);
		switch (alt17) {
		case 1:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:10: T27
		{
			mT27();

		}
			break;
		case 2:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:14: T28
		{
			mT28();

		}
			break;
		case 3:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:18: T29
		{
			mT29();

		}
			break;
		case 4:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:22: COLON
		{
			mCOLON();

		}
			break;
		case 5:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:28: AND
		{
			mAND();

		}
			break;
		case 6:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:32: OR
		{
			mOR();

		}
			break;
		case 7:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:35: SEMI
		{
			mSEMI();

		}
			break;
		case 8:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:40:
			// NUMBER
		{
			mNUMBER();

		}
			break;
		case 9:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:47: IP4
		{
			mIP4();

		}
			break;
		case 10:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:51:
			// STRING
		{
			mSTRING();

		}
			break;
		case 11:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:58: LOPEN
		{
			mLOPEN();

		}
			break;
		case 12:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:64: ROPEN
		{
			mROPEN();

		}
			break;
		case 13:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:70:
			// LCURLY
		{
			mLCURLY();

		}
			break;
		case 14:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:77:
			// RCURLY
		{
			mRCURLY();

		}
			break;
		case 15:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:84:
			// LBRACK
		{
			mLBRACK();

		}
			break;
		case 16:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:91:
			// RBRACK
		{
			mRBRACK();

		}
			break;
		case 17:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:98:
			// CURLY_STRING
		{
			mCURLY_STRING();

		}
			break;
		case 18:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:111: NAME
		{
			mNAME();

		}
			break;
		case 19:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:116:
			// COMMAND_NAME
		{
			mCOMMAND_NAME();

		}
			break;
		case 20:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:129:
			// DNAME
		{
			mDNAME();

		}
			break;
		case 21:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:135: WS
		{
			mWS();

		}
			break;
		case 22:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:138:
			// NEWLINE
		{
			mNEWLINE();

		}
			break;
		case 23:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:146:
			// MultiLineComment
		{
			mMultiLineComment();

		}
			break;
		case 24:
			// /Develop/xored/ecl/org.eclipse.ecl.parser/antlr/Ecl.g:1:163:
			// SingleLineComment
		{
			mSingleLineComment();

		}
			break;

		}

	}

	protected DFA8 dfa8 = new DFA8(this);
	protected DFA5 dfa5 = new DFA5(this);
	protected DFA17 dfa17 = new DFA17(this);
	static final String DFA8_eotS = "\7\uffff";
	static final String DFA8_eofS = "\7\uffff";
	static final String DFA8_minS = "\5\56\2\uffff";
	static final String DFA8_maxS = "\4\172\1\173\2\uffff";
	static final String DFA8_acceptS = "\5\uffff\1\1\1\2";
	static final String DFA8_specialS = "\7\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\1\21\uffff\32\1\4\uffff\1\1\1\uffff\32\1",
			"\2\2\12\3\1\4\6\uffff\32\2\4\uffff\1\2\1\uffff\32\2",
			"\2\2\12\3\1\4\6\uffff\32\2\4\uffff\1\2\1\uffff\32\2",
			"\2\2\12\3\1\4\6\uffff\32\2\4\uffff\1\2\1\uffff\32\2",
			"\2\5\12\uffff\1\5\6\uffff\32\5\4\uffff\1\5\1\uffff\32\5\1\6", "",
			"" };

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}

		@Override
		public String getDescription() {
			return "339:1: COMMAND_NAME : ( ( ( NAME SEMI )? NAME ( '::' NAME )+ ( '-' NAME )* ) | (d= NAME s= SEMI c= CURLY_STRING ) );";
		}
	}

	static final String DFA5_eotS = "\7\uffff";
	static final String DFA5_eofS = "\7\uffff";
	static final String DFA5_minS = "\5\56\2\uffff";
	static final String DFA5_maxS = "\5\172\2\uffff";
	static final String DFA5_acceptS = "\5\uffff\1\2\1\1";
	static final String DFA5_specialS = "\7\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\1\21\uffff\32\1\4\uffff\1\1\1\uffff\32\1",
			"\2\2\12\3\1\4\6\uffff\32\2\4\uffff\1\2\1\uffff\32\2",
			"\2\2\12\3\1\4\6\uffff\32\2\4\uffff\1\2\1\uffff\32\2",
			"\2\2\12\3\1\4\6\uffff\32\2\4\uffff\1\2\1\uffff\32\2",
			"\2\6\12\uffff\1\5\6\uffff\32\6\4\uffff\1\6\1\uffff\32\6", "", "" };

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}

		@Override
		public String getDescription() {
			return "340:3: ( NAME SEMI )?";
		}
	}

	static final String DFA17_eotS = "\10\uffff\1\25\3\uffff\1\27\3\uffff\1\33\2\uffff\1\33\6\uffff\1"
			+ "\33\1\uffff\2\33\2\uffff";
	static final String DFA17_eofS = "\40\uffff";
	static final String DFA17_minS = "\1\11\7\uffff\1\56\3\uffff\1\0\3\uffff\1\52\2\uffff\1\55\6\uffff"
			+ "\1\55\1\uffff\2\55\2\uffff";
	static final String DFA17_maxS = "\1\175\7\uffff\1\71\3\uffff\1\ufffe\3\uffff\1\172\2\uffff\1\172"
			+ "\6\uffff\1\172\1\uffff\2\172\2\uffff";
	static final String DFA17_acceptS = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\13\1\14\1\uffff"
			+ "\1\16\1\17\1\20\1\uffff\1\25\1\26\1\uffff\1\30\1\10\1\11\1\15\1"
			+ "\21\1\27\1\uffff\1\22\2\uffff\1\24\1\23";
	static final String DFA17_specialS = "\40\uffff}>";
	static final String[] DFA17_transitionS = {
			"\1\21\1\22\2\uffff\1\22\22\uffff\1\21\1\uffff\1\11\1\24\2\uffff"
					+ "\1\5\1\uffff\1\12\1\13\3\uffff\1\2\1\23\1\20\12\10\1\7\1\4\1"
					+ "\uffff\1\3\2\uffff\1\1\32\23\1\16\1\uffff\1\17\1\uffff\1\23"
					+ "\1\uffff\32\23\1\14\1\6\1\15",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\26\1\uffff\12\10",
			"",
			"",
			"",
			"\uffff\30",
			"",
			"",
			"",
			"\1\31\2\uffff\1\36\1\34\1\32\12\35\1\37\6\uffff\32\34\4\uffff"
					+ "\1\34\1\uffff\32\34",
			"",
			"",
			"\1\36\2\34\12\35\1\37\6\uffff\32\34\4\uffff\1\34\1\uffff\32"
					+ "\34",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\36\2\34\12\35\1\37\6\uffff\32\34\4\uffff\1\34\1\uffff\32"
					+ "\34",
			"",
			"\1\36\2\34\12\35\1\37\6\uffff\32\34\4\uffff\1\34\1\uffff\32"
					+ "\34",
			"\1\36\2\34\12\35\1\37\6\uffff\32\34\4\uffff\1\34\1\uffff\32"
					+ "\34", "", "" };

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA
			.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}

		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T27 | T28 | T29 | COLON | AND | OR | SEMI | NUMBER | IP4 | STRING | LOPEN | ROPEN | LCURLY | RCURLY | LBRACK | RBRACK | CURLY_STRING | NAME | COMMAND_NAME | DNAME | WS | NEWLINE | MultiLineComment | SingleLineComment );";
		}
	}

}