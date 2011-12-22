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
package org.eclipse.ecl.debug;

public abstract class BreakpointEvent extends Event {

	public BreakpointEvent(EventType type, String path, int line) {
		super(type);
		this.path = path;
		this.line = line;
	}

	public BreakpointEvent(EventType type, String text) {
		super(type);
		int sep = text.indexOf(";");
		if (sep < 0) {
			throw new IllegalArgumentException(
					"Source file path or line is not specified: " + text);
		}
		line = Integer.valueOf(text.substring(0, sep));
		path = text.substring(sep + 1);
	}

	public String getPath() {
		return path;
	}

	public int getLine() {
		return line;
	}

	@Override
	public String toString() {
		return super.toString() + ":" + line + ";" + path;
	}

	private final String path;
	private final int line;

}
