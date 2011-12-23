/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Yuri Strot)
 *******************************************************************************/
package org.eclipse.ecl.internal.debug.core;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.Bundle;

public class Plugin {

	public static final String ID = "org.eclipse.ecl.debug.core";

	public static final String MARKER = ID + ".breakpoint.marker";

	public static IStatus status(Throwable t) {
		return status(t.getMessage(), t);
	}

	public static IStatus status(String message, Throwable t) {
		return new Status(IStatus.ERROR, ID, message, t);
	}

	public static void log(Throwable t) {
		log(status(t));
	}

	public static void log(IStatus status) {
		Bundle bundle = Platform.getBundle(ID);
		ILog log = Platform.getLog(bundle);
		log.log(status);
	}
}
