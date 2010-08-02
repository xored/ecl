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

package org.eclipse.ecl.terminal.connector;

import org.eclipse.osgi.util.NLS;

public class EclMessages extends NLS {
	static {
		NLS.initializeMessages(EclMessages.class.getName(), EclMessages.class);
	}

	public static String SETTING_PAGE;

	public static String CONNECTOR_STARTING;
	public static String CONNECTOR_STARTED;
	public static String CONNECTOR_STOPPING;
	public static String CONNECTOR_STOPPED;
}
