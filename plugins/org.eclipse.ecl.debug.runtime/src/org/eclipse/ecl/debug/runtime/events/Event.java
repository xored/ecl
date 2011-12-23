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

public class Event {

	public static Event fromString(String text) {
		int sep = text.indexOf(TYPE_SEP);
		if (sep < 0) {
			EventType type = EventType.valueOf(text);
			if (type.isExtended()) {
				throw new IllegalArgumentException(
						"No details specified for type: " + text);
			}
			return new Event(type);
		}
		String type = text.substring(0, sep);
		String data = text.substring(sep + 1);
		if (EventType.SUSPENDED.toString().equals(type)) {
			return new SuspendEvent(data);
		}
		if (EventType.STEP_ENDED.toString().equals(type)) {
			return new StepEndEvent(data);
		}
		if (EventType.BREAKPOINT_ADD.toString().equals(type)) {
			return new BreakpointAddEvent(data);
		}
		if (EventType.BREAKPOINT_REMOVE.toString().equals(type)) {
			return new BreakpointRemoveEvent(data);
		}
		if (EventType.BREAKPOINT_HIT.toString().equals(type)) {
			return new BreakpointHitEvent(data);
		}
		throw new IllegalArgumentException("Unknown type: " + type);
	}

	public Event(EventType type) {
		this.type = type;
	}

	public EventType getType() {
		return type;
	}

	@Override
	public String toString() {
		return type.toString();
	}

	protected static final String TYPE_SEP = ":";

	protected static final String DATA_SEP = ";";

	private final EventType type;

}
