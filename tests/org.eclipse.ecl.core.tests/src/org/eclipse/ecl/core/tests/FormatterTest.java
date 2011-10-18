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
				"sample value | sample value | sample value | sample value | sample value | sample value | sample value | sample value \n"
						+ "    | sample value | sample value | sample value | sample value | sample value | sample value | sample value");
	}

	public void test05() throws Exception {
		Pipeline pipeline = CoreFactory.eINSTANCE.createPipeline();
		SampleCommand test = ModelFactory.eINSTANCE.createSampleCommand();
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
				"sample \"loooooooooooooong value\"\n"
						+ "sample \"loooooooooooooong value\" | sample \"loooooooooooooong value\" | sample \"loooooooooooooong value\" \n"
						+ "    | sample \"loooooooooooooong value\" | sample \"loooooooooooooong value\" | sample \"loooooooooooooong value\" \n"
						+ "    | sample \"loooooooooooooong value\" | sample \"loooooooooooooong value\"");
	}

	private void assertFormatter(Command c, String text) {
		String converted = new CommandToStringConverter().convert(c, new DefaultFormatter());
		assertEquals(text, converted);
	}
}
