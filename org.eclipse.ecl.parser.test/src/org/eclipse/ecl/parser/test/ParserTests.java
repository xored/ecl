package org.eclipse.ecl.parser.test;

import junit.framework.TestCase;

import org.eclipse.ecl.parser.EclParser;

import com.xored.peg.Block;

public class ParserTests extends TestCase {

	public void test01() throws Exception {
		assertTrue(EclParser.instance.parse("command") != Block.NO_PARSE);
	}

	public void test02() throws Exception {
		assertTrue(EclParser.instance.parse("org.eclipse.ecl.core::command") != Block.NO_PARSE);
	}

	public void test03() throws Exception {
		assertTrue(EclParser.instance
				.parse("command & command & command & command") != Block.NO_PARSE);
	}

	public void test04() throws Exception {
		assertTrue(EclParser.instance.parse("command | command") != Block.NO_PARSE);
	}

	public void test05() throws Exception {
		assertTrue(EclParser.instance
				.parse("(command | command) & (command & command)") != Block.NO_PARSE);
	}

	public void test06() throws Exception {
		assertTrue(EclParser.instance
				.parse(" command | \n command ;; command \n\n command") != Block.NO_PARSE);
	}

	public void testParam01() throws Exception {
		assertTrue(EclParser.instance.parse("command -arg value") != Block.NO_PARSE);
	}

	public void testParam02() throws Exception {
		assertTrue(EclParser.instance
				.parse("command -arg1 value1 -arg2 value2") != Block.NO_PARSE);
	}

	public void testParam03() throws Exception {
		assertTrue(EclParser.instance.parse("command -arg 123") != Block.NO_PARSE);
	}

	public void testParam04() throws Exception {
		assertTrue(EclParser.instance.parse("command -arg \"string\"") != Block.NO_PARSE);
	}

	public void testParam05() throws Exception {
		assertTrue(EclParser.instance.parse("command -arg {string}") != Block.NO_PARSE);
	}

	public void testParam06() throws Exception {
		assertTrue(EclParser.instance.parse("cmd [cmd {value}] {cmd}") != Block.NO_PARSE);
	}

	public void testParam07() throws Exception {
		assertTrue(EclParser.instance.parse("command -arg [command | command]") != Block.NO_PARSE);
	}

	public void testParam08() throws Exception {
		assertTrue(EclParser.instance.parse("command -arg") != Block.NO_PARSE);
	}

	public void testParam09() throws Exception {
		assertTrue(EclParser.instance
				.parse("command -arg [cmd] {cmd} -arg value") != Block.NO_PARSE);
	}
}
