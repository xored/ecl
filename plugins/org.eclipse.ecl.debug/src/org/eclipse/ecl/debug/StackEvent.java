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

import org.eclipse.ecl.debug.model.StackData;

public abstract class StackEvent extends Event {

	public StackEvent(EventType type, StackData[] data) {
		super(type);
		this.data = data;
	}

	public StackEvent(EventType type, String text) {
		this(type, asDataArray(text));
	}

	public StackData[] getData() {
		return data;
	}

	@Override
	public String toString() {
		return super.toString() + ":" + toString(data);
	}

	private static String toString(StackData[] data) {
		if (data.length == 0) {
			return "";
		}
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < data.length - 1; i++) {
			str.append(data[i]);
			str.append(";");
		}
		str.append(data[data.length - 1]);
		return str.toString();
	}

	private static StackData[] asDataArray(String text) {
		String[] parts = text.split(";");
		StackData[] data = new StackData[parts.length];
		for (int i = 0; i < data.length; i++) {
			data[i] = StackData.fromString(parts[i]);
		}
		return data;
	}

	private final StackData[] data;

}
