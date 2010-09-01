package org.eclipse.ecl.editing.tests;

import junit.framework.TestCase;

import org.eclipse.ecl.internal.editing.parser.PegParser;

import com.cisco.peg.Block;
import com.cisco.peg.PEGParser;

public class PegParserTest extends TestCase {
	PEGParser parser;

	public PegParserTest() {
		parser = PegParser.getParser();
	}

	private void parse(String cmd) {
		Block b = parser.parse(cmd);
		assertFalse(b == Block.NO_PARSE);
	}

	private void check(String cmd, String cmd2) {
		parse(cmd);
	}

	public void testExecSequence() throws Exception {
		parse("TestCommand -hello=1;TestCommand -hello=2;TestCommand -hello=3;");
	}

	public void testExecParallel() throws Exception {
		parse("TestCommand -hello=1&SlowCommand&TestCommand -hello=3;");
	}

	public void testPipeline() throws Exception {
		parse("IncrementCommand|IncrementCommand|IncrementCommand");
	}

	public void testExec1() throws Exception {
		parse("EmitData 42");
	}

	public void testExec2() throws Exception {
		parse("EmitData [EmitData 42]");
	}

	public void testRandom() throws Exception {
		parse("Random 10");
	}

	public void testCommandParam() throws Throwable {
		parse("TestCommandParam {TestEmpty}");
	}

	public void testCompileInDepth01() throws Throwable {
		parse("TestCommandParam {TestCommandParam {TestEmpty}}");
	}

	public void testCompileInDepth02() throws Throwable {
		parse("TestCommandParam {TestCommandParam {TestEmpty}\n"
				+ "TestCommandParam {TestEmpty}}");
	}

	public void testCompileInDepth03() throws Throwable {
		parse("TestCommandParam {TestCommandParam {TestEmpty} |"
				+ "TestCommandParam {TestEmpty}}");
	}

	public void testUnknownParam() throws Throwable {
		parse("TestUnknownParam {TestEmpty}");
	}

	public void testIntParam01() throws Throwable {
		parse("TestIntParam 123");
	}

	public void testIntParam02() throws Throwable {
		parse("TestIntParam str");
	}

	public void testBoolParam01() throws Throwable {
		parse("TestBoolParam true");
	}

	public void testBoolParam02() throws Throwable {
		parse("TestBoolParam");
	}

	public void testParamCollision01() throws Throwable {
		parse("TestParamCollision hello world");
	}

	public void testParamCollision02() throws Throwable {
		parse("TestParamCollision -a1 hello -a2 world");
	}

	public void testOptionalParams01() throws Throwable {
		parse("TestOptionalParams -a1 hello -a2 world");
	}

	public void testOptionalParams02() throws Throwable {
		parse("TestOptionalParams -a1 hello");
	}

	public void testExecParam01() throws Throwable {
		parse("TestIntParam [TestEmpty]");
	}

	public void testLexer001b() throws Throwable {
		check("set1&set2", "(set1&set2)");
		check("(set1&set2)", "(set1&set2)");
	}

	public void testLexer001c() throws Throwable {
		check("set1|set2", "(set1|set2)");
		check("(set1|set2)", "(set1|set2)");
	}

	public void testParser001d() throws Throwable {
		check("set1;set2", "(set1;set2)");
		check("(set1;set2)", "(set1;set2)");
		check("set1;set2;", "(set1;set2)");
	}

	public void testParser001e() throws Throwable {
		check("set1;set2&set3", "(set1;(set2&set3))");
		check("set1;(set2&set3)", "(set1;(set2&set3))");
	}

	public void testParser001f() throws Throwable {
		check("set1&set2;set3", "((set1&set2);set3)");
		check("(set1&set2);set3", "((set1&set2);set3)");
		check("set1&(set2;set3)", "(set1&(set2;set3))");
	}

	public void testParser001g() throws Throwable {
		check("set1|set2&set3", "((set1|set2)&set3)");
		check("(set1|set2)&set3", "((set1|set2)&set3)");
		check("set1|(set2&set3)", "(set1|(set2&set3))");
	}

	public void testParser001h() throws Throwable {
		check("set1&set2|set3", "(set1&(set2|set3))");
		check("set1&set2|set3)", "(set1&(set2|set3))");
	}

	public void testParser002() throws Throwable {
		check("set1 a b c", "set1 a b c");
	}

	public void testParser003() throws Throwable {
		check("set1 c -a b", "set1 c -a=b");
	}

	public void testParser004() throws Throwable {
		check("set1 c --a b", "set1 c -a=b");
	}

	public void testParser005() throws Throwable {
		check("set1 c -a=b", "set1 c -a=b");
	}

	public void testParser006() throws Throwable {
		check("set1 c --a=b", "set1 c -a=b");
	}

	public void testParser007() throws Throwable {
		check("set1 \"C\" --a=b", "set1 C -a=b");
	}

	public void testParser008() throws Throwable {
		check("set1 \"C\" --a={\nb\n}", "set1 C -a=\nb\n");
	}

	public void testParser009() throws Throwable {
		check("set1 a b {\nc\n}", "set1 a b \nc\n");
	}

	public void testParser010() throws Throwable {
		check("set1 a b [set1]", "set1 a b [set1]");
	}

	public void testParser011() throws Throwable {
		check("set1 a b", "set1 a b");
	}

	public void testParser012() throws Throwable {
		check("set1 a b [set1&set2]", "set1 a b [(set1&set2)]");
	}

	public void testParser013() throws Throwable {
		check(
				"http://www.eclipse.org/ecl/tests/model.ecore::TestCommand -hello=world",
				"http://www.eclipse.org/ecl/tests/model.ecore::TestCommand -hello=world");
	}

	public void testParser014() throws Throwable {
		check("A::B::c::TestCommand -hello=world",
				"A::B::c::TestCommand -hello=world");
	}

	public void testParser015() throws Throwable {
		check(
				"ns::TestCommand -hello=1;ns::SlowCommand;ns::TestCommand -hello=3;",
				"(ns::TestCommand -hello=1;ns::SlowCommand;ns::TestCommand -hello=3)");
	}

	public void testParser016() throws Throwable {
		check("cmd ruby:{N.new().format()}", "cmd ruby:{N.new().format()}");
	}

	public void testParser017() throws Throwable {
		check("get-length alfa", "get-length alfa");
	}

	public void testParser018() throws Throwable {
		check("a::b::get-length alfa", "a::b::get-length alfa");
	}

	// private Command process(String content) throws Throwable {
	// String method = Thread.currentThread().getStackTrace()[3]
	// .getMethodName();
	// System.out.println("Test:" + method);
	// EclParserErrorCollector collector = new EclParserErrorCollector();
	// Command cmd = EclCoreParser.newCommand(content, collector);
	// EclError[] errors = collector.getErrors();
	// for (int i = 0; i < errors.length; i++) {
	// System.out.println(errors[i].getMessage());
	// }
	// return cmd;
	// }
	//
	// public String pp(String pre, String val, String po) {
	// if (val == null) {
	// return "";
	// }
	// return nv(pre) + val + nv(po);
	// }
	//
	// private String nv(String pre) {
	// return pre != null ? pre : "";
	// }
	//
	// public String pp(String pre, String val) {
	// return pp(pre, val, null);
	// }
	//
	// public String toString(Command command) {
	// StringBuffer buffer = new StringBuffer();
	// if (command instanceof Exec) {
	// Exec exec = (Exec) command;
	// String ns = exec.getNamespace();
	// String host = exec.getHost();
	// buffer.append(pp(null, ns, "::") + exec.getName() + pp("@", host));
	// EList<Parameter> list = exec.getParameters();
	// for (Parameter parameter : list) {
	// buffer.append(" ");
	// buffer.append(toString(parameter));
	// }
	// } else if (command instanceof Sequence) {
	// toString((Sequence) command, buffer, ";");
	// } else if (command instanceof Parallel) {
	// toString((Parallel) command, buffer, "&");
	// } else if (command instanceof Pipeline) {
	// toString((Pipeline) command, buffer, "|");
	// }
	// return buffer.toString();
	// }
	//
	// private void toString(Block seq, StringBuffer buffer, String sep) {
	// EList<Command> list = seq.getCommands();
	// boolean first = true;
	// if (list.size() > 1) {
	// buffer.append("(");
	// }
	// for (Command command2 : list) {
	// if (!first) {
	// buffer.append(sep);
	// }
	// first = false;
	// buffer.append(toString(command2));
	// }
	// if (list.size() > 1) {
	// buffer.append(")");
	// }
	// }
}
