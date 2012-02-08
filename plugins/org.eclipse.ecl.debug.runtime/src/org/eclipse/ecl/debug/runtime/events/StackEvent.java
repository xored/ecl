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

import org.eclipse.ecl.debug.runtime.StackFrame;

public abstract class StackEvent extends Event {

	public StackEvent(EventType type, StackFrame[] frames) {
		super(type);
		this.frames = frames;
	}

	public StackEvent(EventType type, String text) {
		this(type, asDataArray(text));
	}

	public StackFrame[] getFrames() {
		return frames;
	}

	@Override
	public String toString() {
		return super.toString() + TYPE_SEP + toString(frames);
	}

	private static String toString(StackFrame[] frames) {
		if (frames.length == 0) {
			return "";
		}
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < frames.length - 1; i++) {
			str.append(frames[i]);
			str.append(DATA_SEP);
		}
		str.append(frames[frames.length - 1]);
		return str.toString();
	}

	private static StackFrame[] asDataArray(String text) {
		String[] parts = text.split(DATA_SEP);
		StackFrame[] frames = new StackFrame[parts.length];
		for (int i = 0; i < frames.length; i++) {
			frames[i] = StackFrame.fromString(parts[i]);
		}
		return frames;
	}

	private final StackFrame[] frames;

}
