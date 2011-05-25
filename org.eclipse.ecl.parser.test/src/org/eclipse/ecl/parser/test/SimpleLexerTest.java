package org.eclipse.ecl.parser.test;

import java.lang.reflect.Field;

import junit.framework.TestCase;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.Token;
import org.eclipse.ecl.internal.parser.EclLexer;

public class SimpleLexerTest extends TestCase {
	public void testLexer001() throws Exception {
		String content = "set a beta";
		process(content);
	}

	public void testLexer002() throws Exception {
		String content = "set a \"string\"";
		process(content);
	}

	public void testLexer003() throws Exception {
		String content = "set a \"string\"|set b a\nset d 20";
		process(content);
	}

	public void testLexer004() throws Exception {
		String content = "set a \"string\"|set b a {This is COOL\n\nThis is too\n}\nset d 20";
		process(content);
	}

	// public void testLexer005() throws Exception {
	// String content =
	// "set a \"string\"|set b a {This is COOL\n\nThis is too\n\nset d 20";
	// process(content);
	// }

	public void testLexer006() throws Exception {
		process("cmd ruby:{N.new().format()}");
	}

	public void testLexer007() throws Exception {
		process("/*Alfa\nBeta\bGamma*/\na::b::get-length alfa");
	}

	private void process(String content) throws IllegalAccessException {
		String method = Thread.currentThread().getStackTrace()[2]
				.getMethodName();
		System.out.println("Test:" + method);
		EclLexer lexer = new EclLexer(new ANTLRStringStream(content));
		// EclParserErrorCollector collector = new EclParserErrorCollector();
		// lexer.setErrorReporter(collector);
		while (true) {
			Token token = lexer.nextToken();
			int type = token.getType();
			if (type == Token.EOF) {
				break;
			}
			printToken(token, lexer);
		}
		// EclError[] errors = collector.getErrors();
		// for (int i = 0; i < errors.length; i++) {
		// System.out.println(errors[i].getMessage() + ":"
		// + errors[i].getHeader());
		// }
		// System.out.println("");
	}

	public static void printToken(Token token, EclLexer lexer)
			throws IllegalArgumentException, IllegalAccessException {
		boolean found = false;
		Class lexerClass = lexer.getClass();
		Field[] fields = lexerClass.getFields();
		int type = token.getType();
		for (int i = 0; i < fields.length; i++) {
			if (fields[i].getType().getName().equals("int")) {
				int int1 = fields[i].getInt(lexer);
				if (int1 == type) {
					System.out.print("[" + fields[i].getName() + "("
							+ token.getText() + ")] ");
					found = true;
					break;
				}
			}
		}
		if (!found) {
			System.out.print("[" + type + "(" + token.getText() + ")] ");
		}
	}
}
