package org.eclipse.ecl.parser.test;

import junit.framework.TestCase;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.core.Binding;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.Exec;
import org.eclipse.ecl.core.Pipeline;
import org.eclipse.ecl.core.Sequence;
import org.eclipse.ecl.parser.EclCoreParser;
import org.eclipse.ecl.parser.EclParserErrorCollector;
import org.eclipse.ecl.parser.EclParserErrorCollector.EclError;
import org.eclipse.ecl.parser.test.model.ParserTestModelPackage;
import org.eclipse.ecl.parser.test.model.TestBoolParam;
import org.eclipse.ecl.parser.test.model.TestCommandParam;
import org.eclipse.ecl.parser.test.model.TestEmpty;
import org.eclipse.ecl.parser.test.model.TestIntParam;
import org.eclipse.ecl.parser.test.model.TestOptionalParams;
import org.eclipse.ecl.parser.test.model.TestParamCollision;
import org.eclipse.ecl.runtime.EclCompiler;
import org.eclipse.emf.ecore.EAnnotation;

public class ParamHandlingTest extends TestCase {
	private static final ParserTestModelPackage testPackage = ParserTestModelPackage.eINSTANCE;

	public void testInputAnnotation() throws Throwable {
		EAnnotation a = testPackage.getTestCommandParam_Arg().getEAnnotation(
				"input");
		assertNotNull(a);
		a = testPackage.getTestUnknownParam_Arg().getEAnnotation("input");
		assertNull(a);
	}

	public void testCommandParam() throws Throwable {
		Exec command = (Exec) process("TestCommandParam {TestEmpty}");
		TestCommandParam test01 = (TestCommandParam) EclCompiler
				.compile(command);
		Command inner = test01.getArg();
		assertTrue(TestEmpty.class.isAssignableFrom(inner.getClass()));
	}

	public void testCompileInDepth01() throws Throwable {
		Exec command = (Exec) process("TestCommandParam {TestCommandParam {TestEmpty}}");
		TestCommandParam testcmd = (TestCommandParam) EclCompiler
				.compile(command);
		assertTrue(testcmd.getArg() instanceof TestCommandParam);
		TestCommandParam inner = (TestCommandParam) testcmd.getArg();
		Command innerInner = inner.getArg();
		assertTrue(innerInner instanceof TestEmpty);
	}

	public void testCompileInDepth02() throws Throwable {
		Exec command = (Exec) process("TestCommandParam {TestCommandParam {TestEmpty}\n"
				+ "TestCommandParam {TestEmpty}}");
		TestCommandParam testcmd = (TestCommandParam) EclCompiler
				.compile(command);
		assertTrue(testcmd.getArg() instanceof Sequence);
		Sequence seq = (Sequence) testcmd.getArg();
		assertEquals(2, seq.getCommands().size());
		assertTrue(seq.getCommands().get(0) instanceof TestCommandParam);
		assertTrue(seq.getCommands().get(1) instanceof TestCommandParam);
	}

	public void testCompileInDepth03() throws Throwable {
		Exec command = (Exec) process("TestCommandParam {TestCommandParam {TestEmpty} |"
				+ "TestCommandParam {TestEmpty}}");
		TestCommandParam testcmd = (TestCommandParam) EclCompiler
				.compile(command);
		assertTrue(testcmd.getArg() instanceof Pipeline);
		Pipeline pipe = (Pipeline) testcmd.getArg();
		assertEquals(2, pipe.getCommands().size());
		assertTrue(pipe.getCommands().get(0) instanceof TestCommandParam);
		assertTrue(pipe.getCommands().get(1) instanceof TestCommandParam);
	}

	public void testUnknownParam() throws Throwable {
		Exec command = (Exec) process("TestUnknownParam {TestEmpty}");
		try {
			EclCompiler.compile(command);
		} catch (CoreException e) {
			assertEquals("no converter found for param type: EObject", e
					.getMessage());
		}
	}

	public void testIntParam01() throws Throwable {
		Exec command = (Exec) process("TestIntParam 123");
		TestIntParam test = (TestIntParam) EclCompiler.compile(command);
		assertEquals(123, test.getArg());
	}

	public void testIntParam02() throws Throwable {
		Exec command = (Exec) process("TestIntParam str");
		try {
			EclCompiler.compile(command);
		} catch (CoreException e) {
			assertEquals("converting failed", e.getMessage());
		}
	}

	public void testBoolParam01() throws Throwable {
		Exec command = (Exec) process("TestBoolParam true");
		TestBoolParam test = (TestBoolParam) EclCompiler.compile(command);
		assertTrue(test.isArg());
	}

	public void testBoolParam02() throws Throwable {
		Exec command = (Exec) process("TestBoolParam");
		TestBoolParam test = (TestBoolParam) EclCompiler.compile(command);
		assertFalse(test.isArg());
	}

	public void testParamCollision01() throws Throwable {
		Exec command = (Exec) process("TestParamCollision hello world");
		try {
			EclCompiler.compile(command);
		} catch (CoreException e) {
			assertEquals("unnamed parameters disallowed here", e.getMessage());
		}
	}

	public void testParamCollision02() throws Throwable {
		Exec command = (Exec) process("TestParamCollision -a1 hello -a2 world");
		TestParamCollision test = (TestParamCollision) EclCompiler
				.compile(command);
		assertEquals("hello", test.getA1());
		assertEquals("world", test.getA2());
	}

	public void testOptionalParams01() throws Throwable {
		Exec command = (Exec) process("TestOptionalParams -a1 hello -a2 world");
		TestOptionalParams test = (TestOptionalParams) EclCompiler
				.compile(command);
		assertEquals("hello", test.getA1());
		assertEquals("world", test.getA2());
	}

	public void testOptionalParams02() throws Throwable {
		Exec command = (Exec) process("TestOptionalParams -a1 hello");
		TestOptionalParams test = (TestOptionalParams) EclCompiler
				.compile(command);
		assertEquals("hello", test.getA1());
		assertNull(test.getA2());
	}

	public void testExecParam01() throws Throwable {
		Exec command = (Exec) process("TestIntParam [TestEmpty]");
		TestIntParam test = (TestIntParam) EclCompiler.compile(command);
		assertEquals(1, test.getBindings().size());
		Binding binding = test.getBindings().get(0);
		assertEquals(testPackage.getTestIntParam_Arg(), binding.getFeature());
		assertTrue(binding.getCommand() instanceof TestEmpty);
	}

	private Command process(String content) throws Throwable {
		String method = Thread.currentThread().getStackTrace()[3]
				.getMethodName();
		System.out.println("Test:" + method);
		EclParserErrorCollector collector = new EclParserErrorCollector();
		Command cmd = EclCoreParser.newCommand(content, collector);
		EclError[] errors = collector.getErrors();
		for (int i = 0; i < errors.length; i++) {
			System.out.println(errors[i].getMessage());
		}
		return cmd;
	}
}
