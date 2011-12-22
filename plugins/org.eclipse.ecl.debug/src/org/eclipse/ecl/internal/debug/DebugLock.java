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
package org.eclipse.ecl.internal.debug;

import java.util.concurrent.CountDownLatch;

public abstract class DebugLock {

	public synchronized void suspend() {
		if (getIfLocked() == null) {
			latch = new CountDownLatch(1);
		}
	}

	public synchronized void resume() {
		latch.countDown();
		fireResume();
	}

	public void await() throws InterruptedException {
		CountDownLatch latch = getIfLocked();
		if (latch != null) {
			fireSuspend();
			latch.await();
		}
	}

	abstract protected void fireSuspend();

	abstract protected void fireResume();

	private synchronized CountDownLatch getIfLocked() {
		if (latch.getCount() > 0) {
			return latch;
		}
		return null;
	}

	private CountDownLatch latch = new CountDownLatch(1);

}
