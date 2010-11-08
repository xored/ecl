package org.eclipse.ecl.parser.test;

import junit.framework.TestCase;

import org.eclipse.ecl.parser.EclParser;

import com.xored.peg.Block;

public class ParserTests extends TestCase {

	public void test01() throws Exception {
		assertTrue(new EclParser("command").parse() != Block.NO_PARSE);
	}

	public void test02() throws Exception {
		assertTrue(new EclParser("org.eclipse.ecl.core::command").parse() != Block.NO_PARSE);
	}

	public void test03() throws Exception {
		assertTrue(new EclParser("command & command & command & command")
				.parse() != Block.NO_PARSE);
	}

	public void test04() throws Exception {
		assertTrue(new EclParser("command | command").parse() != Block.NO_PARSE);
	}

	public void test05() throws Exception {
		assertTrue(new EclParser("(command | command) & (command & command)")
				.parse() != Block.NO_PARSE);
	}

	public void test06() throws Exception {
		assertTrue(new EclParser(
				" command | \n command ;; command \n\n command").parse() != Block.NO_PARSE);
	}

	public void testParam01() throws Exception {
		assertTrue(new EclParser("command -arg value").parse() != Block.NO_PARSE);
	}

	public void testParam02() throws Exception {
		assertTrue(new EclParser("command -arg1 value1 -arg2 value2").parse() != Block.NO_PARSE);
	}

	public void testParam03() throws Exception {
		assertTrue(new EclParser("command -arg 123").parse() != Block.NO_PARSE);
	}

	public void testParam04() throws Exception {
		assertTrue(new EclParser("command -arg \"string\"").parse() != Block.NO_PARSE);
	}

	public void testParam05() throws Exception {
		assertTrue(new EclParser("command -arg {string}").parse() != Block.NO_PARSE);
	}

	public void testParam06() throws Exception {
		assertTrue(new EclParser("cmd [cmd {value}] {cmd}").parse() != Block.NO_PARSE);
	}

	public void testParam07() throws Exception {
		assertTrue(new EclParser("command -arg [command | command]").parse() != Block.NO_PARSE);
	}

	public void testParam08() throws Exception {
		assertTrue(new EclParser("command -arg").parse() != Block.NO_PARSE);
	}

	public void testParam09() throws Exception {
		assertTrue(new EclParser("command -arg [cmd] {cmd} -arg value").parse() != Block.NO_PARSE);
	}
}
