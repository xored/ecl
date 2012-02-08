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

public class SkipAllEvent extends Event {

	public SkipAllEvent(boolean skip) {
		super(EventType.SKIP_ALL);
		this.skip = skip;
	}

	public SkipAllEvent(String data) {
		this(Boolean.valueOf(data));
	}

	public boolean isSkip() {
		return skip;
	}

	@Override
	public String toString() {
		return super.toString() + TYPE_SEP + skip;
	}

	private final boolean skip;

}
