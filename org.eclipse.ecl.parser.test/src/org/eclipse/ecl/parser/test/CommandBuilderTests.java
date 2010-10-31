package org.eclipse.ecl.parser.test;

import static org.eclipse.ecl.core.util.ScriptletFactory.makeExec;
import static org.eclipse.ecl.core.util.ScriptletFactory.makeExecutableParameter;
import static org.eclipse.ecl.core.util.ScriptletFactory.makeLiteralParameter;
import static org.eclipse.ecl.core.util.ScriptletFactory.makeParallel;
import static org.eclipse.ecl.core.util.ScriptletFactory.makePipe;
import static org.eclipse.ecl.core.util.ScriptletFactory.makeSeq;
import junit.framework.TestCase;

import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.parser.EclCoreParser;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class CommandBuilderTests extends TestCase {

	public void test00() throws Exception {
		Command parsed = EclCoreParser.newCommand("");
		assertTrue(EcoreUtil.equals(parsed, makeSeq()));
	}

	public void test01() throws Exception {
		Command parsed = EclCoreParser.newCommand("command");
		assertTrue(EcoreUtil.equals(parsed, makeExec("command")));
	}

	public void test02() throws Exception {
		Command parsed = EclCoreParser
				.newCommand("http://www.eclipse.org/ecl/core.ecore::command");
		assertTrue(EcoreUtil.equals(parsed,
				makeExec("http://www.eclipse.org/ecl/core.ecore", "command")));
	}

	public void test03() throws Exception {
		Command parsed = EclCoreParser
				.newCommand("command & command & command & command");
		assertTrue(EcoreUtil.equals(
				parsed,
				makeParallel(makeExec("command"), makeExec("command"),
						makeExec("command"), makeExec("command"))));
	}

	public void test04() throws Exception {
		Command parsed = EclCoreParser.newCommand("command | command");
		assertTrue(EcoreUtil.equals(parsed,
				makePipe(makeExec("command"), makeExec("command"))));
	}

	public void test05() throws Exception {
		Command parsed = EclCoreParser
				.newCommand("(command | command) & (command | command)");
		assertTrue(EcoreUtil.equals(
				parsed,
				makeParallel(
						makePipe(makeExec("command"), makeExec("command")),
						makePipe(makeExec("command"), makeExec("command")))));
	}

	public void test06() throws Exception {
		Command parsed = EclCoreParser
				.newCommand(" command | \n command ;; command \n\n command");
		assertTrue(EcoreUtil.equals(
				parsed,
				makeSeq(makePipe(makeExec("command"), makeExec("command")),
						makeExec("command"), makeExec("command"))));
	}

	public void test07() throws Exception {
		Command parsed = EclCoreParser
				.newCommand("command\ncommand\ncommand\ncommand");
		assertTrue(EcoreUtil.equals(
				parsed,
				makeSeq(makeExec("command"), makeExec("command"),
						makeExec("command"), makeExec("command"))));
	}

	public void testParam01() throws Exception {
		Command parsed = EclCoreParser.newCommand("command -arg value");
		assertTrue(EcoreUtil.equals(parsed,
				makeExec("command", makeLiteralParameter("arg", "value"))));
	}

	public void testParam02() throws Exception {
		Command parsed = EclCoreParser
				.newCommand("command -arg1 value1 -arg2 value2");
		assertTrue(EcoreUtil.equals(
				parsed,
				makeExec("command", makeLiteralParameter("arg1", "value1"),
						makeLiteralParameter("arg2", "value2"))));
	}

	public void testParam03() throws Exception {
		Command parsed = EclCoreParser.newCommand("command -arg 123");
		assertTrue(EcoreUtil.equals(parsed,
				makeExec("command", makeLiteralParameter("arg", "123"))));
	}

	public void testParam04() throws Exception {
		Command parsed = EclCoreParser.newCommand("command -arg \"string\"");
		assertTrue(EcoreUtil.equals(parsed,
				makeExec("command", makeLiteralParameter("arg", "string"))));
	}

	public void testParam05() throws Exception {
		Command parsed = EclCoreParser.newCommand("command -arg {string}");
		assertTrue(EcoreUtil.equals(parsed,
				makeExec("command", makeLiteralParameter("arg", "{string}"))));
	}

	public void testParam06() throws Exception {
		Command parsed = EclCoreParser
				.newCommand("command -arg [command | command]");
		assertTrue(EcoreUtil.equals(
				parsed,
				makeExec(
						"command",
						makeExecutableParameter(
								"arg",
								makePipe(makeExec("command"),
										makeExec("command"))))));
	}

	public void testParam07() throws Exception {
		Command parsed = EclCoreParser.newCommand("command -arg");
		assertTrue(EcoreUtil.equals(parsed,
				makeExec("command", makeLiteralParameter("arg", null))));
	}

}
