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
import org.eclipse.ecl.core.tests.model.SampleCommand;
import org.eclipse.ecl.core.util.CommandToStringConverter;
import org.eclipse.ecl.core.util.DefaultFormatter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;

public class FormatterTest extends TestCase {

	public void test01() throws Exception {
		SampleCommand testCommand = ModelFactory.eINSTANCE.createSampleCommand();
		testCommand.setHello("loooooooooooooooooooooooooooooooooooooooooooooooooooooo"
				+ "ooooooooooooooooooooooooooooooooooooooooooooooooooooooo" + "oooooooooooong");
		assertFormatter(testCommand, "sample loooooooooooooooooooooooooooooooooooooooooooooooooooooo"
				+ "ooooooooooooooooooooooooooooooooooooooooooooooooooooooo" + "oooooooooooong");
	}

	public void test02() throws Exception {
		SampleCommand testCommand = ModelFactory.eINSTANCE.createSampleCommand();
		testCommand.setHello("&loooooooooooooooooooooooooooooooooooooooooooooooooooooo"
				+ "oooooooooooooooooooooooooooooooooooooooooooooooooooooooo" + "ooooooooooong");
		assertFormatter(testCommand, "sample \"&loooooooooooooooooooooooooooooooooooooooooooooooooooooooooo"
				+ "ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooong\"");
	}

	public void test03() throws Exception {
		SampleCommand testCommand = ModelFactory.eINSTANCE.createSampleCommand();
		testCommand.setHello("&loooooooooooooooooooooooooooooooooooooo\noooooooooooooooo"
				+ "ooooooooooooooooooo\nooooooooooooooooooooooooooooooooooooo" + "ooooooooooong");
		assertFormatter(testCommand, "sample \"&loooooooooooooooooooooooooooooooooooooo\\n\"\n"
				+ "    + \"ooooooooooooooooooooooooooooooooooo\\n\"\n"
				+ "    + \"oooooooooooooooooooooooooooooooooooooooooooooooong\"");
	}

	public void test04() throws Exception {
		Pipeline pipeline = CoreFactory.eINSTANCE.createPipeline();
		SampleCommand test = ModelFactory.eINSTANCE.createSampleCommand();
		test.setHello("value");
		pipeline.getCommands().add((Command) EcoreUtil.copy(test));
		pipeline.getCommands().add((Command) EcoreUtil.copy(test));
		pipeline.getCommands().add((Command) EcoreUtil.copy(test));
		pipeline.getCommands().add((Command) EcoreUtil.copy(test));
		pipeline.getCommands().add((Command) EcoreUtil.copy(test));
		pipeline.getCommands().add((Command) EcoreUtil.copy(test));
		pipeline.getCommands().add((Command) EcoreUtil.copy(test));
		pipeline.getCommands().add((Command) EcoreUtil.copy(test));
		pipeline.getCommands().add((Command) EcoreUtil.copy(test));
		pipeline.getCommands().add((Command) EcoreUtil.copy(test));
		pipeline.getCommands().add((Command) EcoreUtil.copy(test));
		pipeline.getCommands().add((Command) EcoreUtil.copy(test));
		pipeline.getCommands().add((Command) EcoreUtil.copy(test));
		pipeline.getCommands().add((Command) EcoreUtil.copy(test));
		pipeline.getCommands().add((Command) EcoreUtil.copy(test));
		assertFormatter(
				pipeline,
				"sample value | sample value | sample value | sample value | sample value | sample value | sample value | sample value \n"
						+ "    | sample value | sample value | sample value | sample value | sample value | sample value | sample value");
	}

	public void test05() throws Exception {
		Pipeline pipeline = CoreFactory.eINSTANCE.createPipeline();
		SampleCommand test = ModelFactory.eINSTANCE.createSampleCommand();
		test.setHello("loooooooooooooong value");
		pipeline.getCommands().add((Command) EcoreUtil.copy(test));

		Sequence seq = CoreFactory.eINSTANCE.createSequence();
		seq.getCommands().add((Command) EcoreUtil.copy(pipeline));

		pipeline.getCommands().add((Command) EcoreUtil.copy(test));
		pipeline.getCommands().add((Command) EcoreUtil.copy(test));
		pipeline.getCommands().add((Command) EcoreUtil.copy(test));
		pipeline.getCommands().add((Command) EcoreUtil.copy(test));
		pipeline.getCommands().add((Command) EcoreUtil.copy(test));
		pipeline.getCommands().add((Command) EcoreUtil.copy(test));
		pipeline.getCommands().add((Command) EcoreUtil.copy(test));
		seq.getCommands().add((Command) EcoreUtil.copy(pipeline));

		assertFormatter(
				seq,
				"sample \"loooooooooooooong value\"\n"
						+ "sample \"loooooooooooooong value\" | sample \"loooooooooooooong value\" | sample \"loooooooooooooong value\" \n"
						+ "    | sample \"loooooooooooooong value\" | sample \"loooooooooooooong value\" | sample \"loooooooooooooong value\" \n"
						+ "    | sample \"loooooooooooooong value\" | sample \"loooooooooooooong value\"");
	}

	@Test
	public void testSmallLineWidth() throws Exception {
		SampleCommand cmdA = ModelFactory.eINSTANCE.createSampleCommand();
		SampleCommand cmdB = ModelFactory.eINSTANCE.createSampleCommand();
		cmdB.setHello("value");

		Pipeline pipeline = CoreFactory.eINSTANCE.createPipeline();
		pipeline.getCommands().add(cmdA);
		pipeline.getCommands().add(cmdB);

		DefaultFormatter f = new DefaultFormatter();
		f.setLineWidth(12);
		f.setIndentSize(4);
		assertFormatter(f, pipeline, "sample \n    | sample value");
	}

	@Test
	public void testLongLineWidth() throws Exception {
		SampleCommand cmdA = ModelFactory.eINSTANCE.createSampleCommand();
		SampleCommand cmdB = ModelFactory.eINSTANCE.createSampleCommand();
		cmdB.setHello("value");

		Pipeline pipeline = CoreFactory.eINSTANCE.createPipeline();
		pipeline.getCommands().add(cmdA);
		pipeline.getCommands().add(cmdB);

		DefaultFormatter f = new DefaultFormatter();
		f.setLineWidth(80);
		f.setIndentSize(4);
		assertFormatter(f, pipeline, "sample | sample value");
	}

	@Test
	public void testSmallIndent() throws Exception {
		SampleCommand cmdA = ModelFactory.eINSTANCE.createSampleCommand();
		SampleCommand cmdB = ModelFactory.eINSTANCE.createSampleCommand();
		cmdB.setHello("value");

		Pipeline pipeline = CoreFactory.eINSTANCE.createPipeline();
		pipeline.getCommands().add(cmdA);
		pipeline.getCommands().add(cmdB);

		DefaultFormatter f = new DefaultFormatter();
		f.setLineWidth(12);
		f.setIndentSize(2);
		assertFormatter(f, pipeline, "sample \n  | sample value");
	}

	@Test
	public void testBigIndent() throws Exception {
		SampleCommand cmdA = ModelFactory.eINSTANCE.createSampleCommand();
		SampleCommand cmdB = ModelFactory.eINSTANCE.createSampleCommand();
		cmdB.setHello("value");

		Pipeline pipeline = CoreFactory.eINSTANCE.createPipeline();
		pipeline.getCommands().add(cmdA);
		pipeline.getCommands().add(cmdB);

		DefaultFormatter f = new DefaultFormatter();
		f.setLineWidth(12);
		f.setIndentSize(16);
		assertFormatter(f, pipeline, "sample \n                | sample value");
	}

	private void assertFormatter(Command c, String text) {
		assertFormatter(new DefaultFormatter(), c, text);
	}

	private void assertFormatter(DefaultFormatter formatter, Command c, String text) {
		String converted = new CommandToStringConverter().convert(c, formatter);
		assertEquals(text, converted);
	}

}
