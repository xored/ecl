package org.eclipse.ecl.parser.test;

import static org.eclipse.ecl.core.util.ScriptletFactory.makeExec;
import static org.eclipse.ecl.core.util.ScriptletFactory.makeExecutableParameter;
import static org.eclipse.ecl.core.util.ScriptletFactory.makeLiteralParameter;
import static org.eclipse.ecl.core.util.ScriptletFactory.makeParallel;
import static org.eclipse.ecl.core.util.ScriptletFactory.makePipe;
import static org.eclipse.ecl.core.util.ScriptletFactory.makeSeq;
import junit.framework.TestCase;

import org.eclipse.ecl.ast.Ast;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class CommandBuilderTests extends TestCase {

	public void test00() throws Exception {
		Ast ast = new Ast("");
		assertTrue(EcoreUtil.equals(ast.toCommand(), makeSeq()));
	}

	public void test01() throws Exception {
		Ast ast = new Ast("command");
		assertTrue(EcoreUtil.equals(ast.toCommand(), makeExec("command")));
	}

	public void test02() throws Exception {
		Ast ast = new Ast("org.eclipse.ecl.core::command");
		assertTrue(EcoreUtil.equals(ast.toCommand(),
				makeExec("org.eclipse.ecl.core", "command")));
	}

	public void test03() throws Exception {
		Ast ast = new Ast("command & command & command & command");
		assertTrue(EcoreUtil.equals(
				ast.toCommand(),
				makeParallel(makeExec("command"), makeExec("command"),
						makeExec("command"), makeExec("command"))));
	}

	public void test04() throws Exception {
		Ast ast = new Ast("command | command");
		assertTrue(EcoreUtil.equals(ast.toCommand(),
				makePipe(makeExec("command"), makeExec("command"))));
	}

	public void test05() throws Exception {
		Ast ast = new Ast("(command | command) & (command | command)");
		assertTrue(EcoreUtil.equals(
				ast.toCommand(),
				makeParallel(
						makePipe(makeExec("command"), makeExec("command")),
						makePipe(makeExec("command"), makeExec("command")))));
	}

	public void test06() throws Exception {
		Ast ast = new Ast(" command | \n command ;; command \n\n command");
		assertTrue(EcoreUtil.equals(
				ast.toCommand(),
				makeSeq(makePipe(makeExec("command"), makeExec("command")),
						makeExec("command"), makeExec("command"))));
	}

	public void test07() throws Exception {
		Ast ast = new Ast("command\ncommand\ncommand\ncommand");
		assertTrue(EcoreUtil.equals(
				ast.toCommand(),
				makeSeq(makeExec("command"), makeExec("command"),
						makeExec("command"), makeExec("command"))));
	}

	public void testParam01() throws Exception {
		Ast ast = new Ast("command -arg value");
		assertTrue(EcoreUtil.equals(ast.toCommand(),
				makeExec("command", makeLiteralParameter("arg", "value"))));
	}

	public void testParam02() throws Exception {
		Ast ast = new Ast("command -arg1 value1 -arg2 value2");
		assertTrue(EcoreUtil.equals(
				ast.toCommand(),
				makeExec("command", makeLiteralParameter("arg1", "value1"),
						makeLiteralParameter("arg2", "value2"))));
	}

	public void testParam03() throws Exception {
		Ast ast = new Ast("command -arg 123");
		assertTrue(EcoreUtil.equals(ast.toCommand(),
				makeExec("command", makeLiteralParameter("arg", "123"))));
	}

	public void testParam04() throws Exception {
		Ast ast = new Ast("command -arg \"string\"");
		assertTrue(EcoreUtil.equals(ast.toCommand(),
				makeExec("command", makeLiteralParameter("arg", "string"))));
	}

	public void testParam05() throws Exception {
		Ast ast = new Ast("command -arg {string}");
		assertTrue(EcoreUtil.equals(ast.toCommand(),
				makeExec("command", makeLiteralParameter("arg", "{string}"))));
	}

	public void testParam06() throws Exception {
		Ast ast = new Ast("command -arg [command | command]");
		assertTrue(EcoreUtil.equals(
				ast.toCommand(),
				makeExec(
						"command",
						makeExecutableParameter(
								"arg",
								makePipe(makeExec("command"),
										makeExec("command"))))));
	}

	public void testParam07() throws Exception {
		Ast ast = new Ast("command -arg");
		assertTrue(EcoreUtil.equals(ast.toCommand(),
				makeExec("command", makeLiteralParameter("arg", null))));
	}

}
