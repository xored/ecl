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
package org.eclipse.ecl.doc.tests;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URL;

import junit.framework.TestCase;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.ecl.doc.EclDocAllCommandsWriter;
import org.eclipse.ecl.doc.EclDocWriter;

public class EclDocTest extends TestCase {

	public void test01() throws Exception {
		EclDocWriter w = new EclDocWriter(getOutput());
		new EclDocAllCommandsWriter().write(w);
		w.finish();
	}

	private File getOutputFile() throws IOException {
		URL entry = Activator.getDefault().getBundle()
				.getEntry("output/core.html");
		entry = FileLocator.resolve(entry);
		String file = entry.getFile();
		return new File(file);
	}

	private Writer getOutput() throws IOException {
		return new FileWriter(getOutputFile());
	}
}
