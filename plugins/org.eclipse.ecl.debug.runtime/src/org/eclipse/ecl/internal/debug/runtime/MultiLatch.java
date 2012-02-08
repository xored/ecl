package org.eclipse.ecl.internal.debug.runtime;

import java.util.concurrent.CountDownLatch;

public class MultiLatch {

	public void await() throws InterruptedException {
		latch.await();
	}

	public synchronized void lockAfterUnlock() {
		unlock();
		lock();
	}

	public synchronized boolean isLocked() {
		return latch.getCount() > 0;
	}

	public synchronized void lock() {
		if (!isLocked()) {
			latch = new CountDownLatch(1);
		}
	}

	public synchronized void unlock() {
		latch.countDown();
	}

	private volatile CountDownLatch latch = new CountDownLatch(1);

}
