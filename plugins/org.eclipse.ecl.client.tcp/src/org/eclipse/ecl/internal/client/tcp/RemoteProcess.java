/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     xored software, Inc - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecl.internal.client.tcp;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

//TODO same as Process
@Deprecated
public class RemoteProcess implements IProcess {

	private TcpSession session;
	private IStatus status;

	RemoteProcess(TcpSession session) {
		this.session = session;
	}

	public IPipe getInput() {
		throw new RuntimeException("not implemented");
	}

	public IPipe getOutput() {
		throw new RuntimeException("not implemented");
	}

	synchronized void setStatus(IStatus status) {
		this.status = status;
		notifyAll();
	}

	public synchronized IStatus waitFor() throws InterruptedException {
		while (status == null) {
			wait(100);
		}
		return status;
	}

	public synchronized boolean isAlive() {
		return status == null;
	}

	public ISession getSession() {
		return session;
	}

}
