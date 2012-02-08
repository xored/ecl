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

public class StepEndEvent extends StackEvent {

	public StepEndEvent(StackFrame[] data) {
		super(EventType.STEP_ENDED, data);
	}

	public StepEndEvent(String text) {
		super(EventType.STEP_ENDED, text);
	}

}
