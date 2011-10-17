/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     xored software, Inc - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecl.core.tests;

import junit.framework.TestCase;

import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.Pipeline;
import org.eclipse.ecl.core.Sequence;
import org.eclipse.ecl.core.tests.model.ModelFactory;
import org.eclipse.ecl.core.tests.model.TestCommand;
import org.eclipse.ecl.core.util.CommandToStringConverter;
import org.eclipse.ecl.core.util.DefaultFormatter;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class FormatterTest extends TestCase {

	public void test01() throws Exception {
		TestCommand testCommand = ModelFactory.eINSTANCE.createTestCommand();
		testCommand
				.setHello("loooooooooooooooooooooooooooooooooooooooooooooooooooooo"
						+ "ooooooooooooooooooooooooooooooooooooooooooooooooooooooo"
						+ "oooooooooooong");
		assertFormatter(
				testCommand,
				"test loooooooooooooooooooooooooooooooooooooooooooooooooooooo"
						+ "ooooooooooooooooooooooooooooooooooooooooooooooooooooooo"
						+ "oooooooooooong");
	}

	public void test02() throws Exception {
		TestCommand testCommand = ModelFactory.eINSTANCE.createTestCommand();
		testCommand
				.setHello("&loooooooooooooooooooooooooooooooooooooooooooooooooooooo"
						+ "oooooooooooooooooooooooooooooooooooooooooooooooooooooooo"
						+ "ooooooooooong");
		assertFormatter(
				testCommand,
				"test \"&loooooooooooooooooooooooooooooooooooooooooooooooooooooooooo"
						+ "ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooong\"");
	}

	public void test03() throws Exception {
		TestCommand testCommand = ModelFactory.eINSTANCE.createTestCommand();
		testCommand
				.setHello("&loooooooooooooooooooooooooooooooooooooo\noooooooooooooooo"
						+ "ooooooooooooooooooo\nooooooooooooooooooooooooooooooooooooo"
						+ "ooooooooooong");
		assertFormatter(
				testCommand,
				"test \"&loooooooooooooooooooooooooooooooooooooo\\n\"\n"
						+ "    + \"ooooooooooooooooooooooooooooooooooo\\n\"\n"
						+ "    + \"oooooooooooooooooooooooooooooooooooooooooooooooong\"");
	}

	public void test04() throws Exception {
		Pipeline pipeline = CoreFactory.eINSTANCE.createPipeline();
		TestCommand test = ModelFactory.eINSTANCE.createTestCommand();
		test.setHello("value");
		pipeline.getCommands().add(EcoreUtil.copy(test));
		pipeline.getCommands().add(EcoreUtil.copy(test));
		pipeline.getCommands().add(EcoreUtil.copy(test));
		pipeline.getCommands().add(EcoreUtil.copy(test));
		pipeline.getCommands().add(EcoreUtil.copy(test));
		pipeline.getCommands().add(EcoreUtil.copy(test));
		pipeline.getCommands().add(EcoreUtil.copy(test));
		pipeline.getCommands().add(EcoreUtil.copy(test));
		pipeline.getCommands().add(EcoreUtil.copy(test));
		pipeline.getCommands().add(EcoreUtil.copy(test));
		pipeline.getCommands().add(EcoreUtil.copy(test));
		pipeline.getCommands().add(EcoreUtil.copy(test));
		pipeline.getCommands().add(EcoreUtil.copy(test));
		pipeline.getCommands().add(EcoreUtil.copy(test));
		pipeline.getCommands().add(EcoreUtil.copy(test));
		pipeline.getCommands().add(EcoreUtil.copy(test));
		assertFormatter(
				pipeline,
				"test value | test value | test value | test value | test value | test value | test value | test value | test value \n"
						+ "    | test value | test value | test value | test value | test value | test value | test value");
	}

	public void test05() throws Exception {
		Pipeline pipeline = CoreFactory.eINSTANCE.createPipeline();
		TestCommand test = ModelFactory.eINSTANCE.createTestCommand();
		test.setHello("loooooooooooooong value");
		pipeline.getCommands().add(EcoreUtil.copy(test));

		Sequence seq = CoreFactory.eINSTANCE.createSequence();
		seq.getCommands().add(EcoreUtil.copy(pipeline));

		pipeline.getCommands().add(EcoreUtil.copy(test));
		pipeline.getCommands().add(EcoreUtil.copy(test));
		pipeline.getCommands().add(EcoreUtil.copy(test));
		pipeline.getCommands().add(EcoreUtil.copy(test));
		pipeline.getCommands().add(EcoreUtil.copy(test));
		pipeline.getCommands().add(EcoreUtil.copy(test));
		pipeline.getCommands().add(EcoreUtil.copy(test));
		seq.getCommands().add(EcoreUtil.copy(pipeline));

		assertFormatter(
				seq,
				"test \"loooooooooooooong value\"\n"
						+ "test \"loooooooooooooong value\" | test \"loooooooooooooong value\" | test \"loooooooooooooong value\" \n"
						+ "    | test \"loooooooooooooong value\" | test \"loooooooooooooong value\" | test \"loooooooooooooong value\" \n"
						+ "    | test \"loooooooooooooong value\" | test \"loooooooooooooong value\"");
	}

	// public void test07() throws Exception {
	// TestCommand test = ModelFactory.eINSTANCE.createTestCommand();
	// test.setHello("loooooooooooooong value");
	// With with1 = CoreFactory.eINSTANCE.createWith();
	// Binding b = CoreFactory.eINSTANCE.createBinding();
	// b.setFeature(CorePackage.eINSTANCE.getWith_Object());
	// b.setCommand(EcoreUtil.copy(test));
	// with1.getBindings().add(EcoreUtil.copy(b));
	//
	// With with2 = CoreFactory.eINSTANCE.createWith();
	// with2.getBindings().add(EcoreUtil.copy(b));
	// Pipeline pipeline = CoreFactory.eINSTANCE.createPipeline();
	// pipeline.getCommands().add(EcoreUtil.copy(test));
	// pipeline.getCommands().add(EcoreUtil.copy(test));
	// pipeline.getCommands().add(EcoreUtil.copy(test));
	// pipeline.getCommands().add(EcoreUtil.copy(test));
	// pipeline.getCommands().add(EcoreUtil.copy(test));
	// pipeline.getCommands().add(EcoreUtil.copy(test));
	// pipeline.getCommands().add(EcoreUtil.copy(test));
	// pipeline.getCommands().add(EcoreUtil.copy(test));
	// with2.setDo(pipeline);
	//
	// Sequence seq = CoreFactory.eINSTANCE.createSequence();
	// seq.getCommands().add(EcoreUtil.copy(test));
	// seq.getCommands().add(with2);
	// seq.getCommands().add(EcoreUtil.copy(test));
	// with1.setDo(seq);
	//
	// assertFormatter(
	// with1,
	// "with [test \"loooooooooooooong value\"] {\n"
	// + "    test \"loooooooooooooong value\"\n"
	// +
	// "    with [test \"loooooooooooooong value\"] {test \"loooooooooooooong value\" | test\n"
	// +
	// "        -hello \"loooooooooooooong value\" | test \"loooooooooooooong value\" \n"
	// +
	// "        | test \"loooooooooooooong value\" | test \"loooooooooooooong value\" \n"
	// +
	// "        | test \"loooooooooooooong value\" | test \"loooooooooooooong value\" \n"
	// + "        | test \"loooooooooooooong value\"}\n"
	// + "    test \"loooooooooooooong value\"\n" + "}");
	// }

	private void assertFormatter(Command c, String text) {
		String noWrap = new CommandToStringConverter().convert(c,
				new DefaultFormatter(false));
		System.out.println(noWrap);
		String converted = new CommandToStringConverter().convert(c,
				new DefaultFormatter());
		System.out.println(converted);
		System.out.println();
		System.out.println();
		System.out.println();
		assertEquals(text, converted);
	}
}
