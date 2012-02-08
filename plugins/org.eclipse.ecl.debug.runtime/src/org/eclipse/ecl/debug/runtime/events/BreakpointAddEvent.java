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
package org.eclipse.ecl.debug.runtime.events;

public class BreakpointAddEvent extends BreakpointEvent {

	public BreakpointAddEvent(String path, int line) {
		super(EventType.BREAKPOINT_ADD, path, line);
	}

	public BreakpointAddEvent(String text) {
		super(EventType.BREAKPOINT_ADD, text);
	}

}
