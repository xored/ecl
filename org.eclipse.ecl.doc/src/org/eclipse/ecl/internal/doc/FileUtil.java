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
package org.eclipse.ecl.internal.doc;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.ecl.doc.EclDocPlugin;

public class FileUtil {
	public static String readFileAsString(String file) throws Exception {
		InputStream openStream = getInputStream(file);
		byte[] content = readBytesFromStream(openStream);
		return new String(content).replace("\r\n", "\n");
	}

	public static InputStream getInputStream(String file) throws IOException {
		URL entry = EclDocPlugin.getDefault().getBundle().getEntry(file);
		InputStream openStream = entry.openStream();
		return openStream;
	}

	public static byte[] readBytesFromStream(InputStream input)
			throws IOException {
		final BufferedInputStream buffer = new BufferedInputStream(input);
		final ByteArrayOutputStream output = new ByteArrayOutputStream(100000);
		try {
			final byte[] bytes = new byte[8192];
			int length = 0;
			while ((length = buffer.read(bytes)) > 0) {
				output.write(bytes, 0, length);
			}
		} finally {
			buffer.close();
		}
		return output.toByteArray();
	}
}
