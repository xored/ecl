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
package org.eclipse.ecl.debug.runtime;

import java.util.concurrent.CopyOnWriteArrayList;

public enum SuspendManager {

	INSTANCE;

	public void addListener(SuspendListener listener) {
		listeners.add(listener);
	}

	public void removeListener(SuspendListener listener) {
		listeners.remove(listener);
	}

	public void fireSuspend() {
		for (SuspendListener listener : listeners) {
			listener.suspend();
		}
	}

	public void fireResume() {
		for (SuspendListener listener : listeners) {
			listener.resume();
		}
	}

	private final CopyOnWriteArrayList<SuspendListener> listeners = new CopyOnWriteArrayList<SuspendListener>();

}
