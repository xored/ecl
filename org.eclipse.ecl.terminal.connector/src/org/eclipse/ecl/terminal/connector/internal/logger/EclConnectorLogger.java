/*******************************************************************************
 * Copyright (c) 2008 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Ruslan Sychev)
 *******************************************************************************/

package org.eclipse.ecl.terminal.connector.internal.logger;

import org.eclipse.tm.internal.terminal.provisional.api.Logger;

public class EclConnectorLogger {

	public static final int ALL = -1;

	public static final int INFO = 1;
	public static final int WARNING = 2;
	public static final int ERROR = 4;

	public static int levels;

	static {
		// TODO: init from .option file
		levels = ALL;
	}

	public static void info(String message) {
		log(INFO, message);
	}

	public static void warning(String message) {
		log(WARNING, message);
	}

	public static void error(String message) {
		log(ERROR, message);
	}

	public static void log(int level, String message) {
		if ((levels & level) != 0) {
			Logger.log(message);
		}
	}

	public static void log(int level, Exception exception) {
		if ((levels & level) != 0) {
			Logger.logException(exception);
		}
	}
}
