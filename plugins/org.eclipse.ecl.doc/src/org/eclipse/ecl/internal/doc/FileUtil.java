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

import java.io.IOException;
import java.net.URL;

import org.eclipse.ecl.doc.EclDocPlugin;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

public class FileUtil {

	public static String readFileAsString(String file) throws IOException {
		URL url = EclDocPlugin.getDefault().getBundle().getResource(file);
		return Resources.toString(url, Charsets.UTF_8);
	}

}
