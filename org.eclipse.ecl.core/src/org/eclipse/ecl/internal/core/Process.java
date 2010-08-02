/*******************************************************************************
 * Copyright (c) 2008 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Andrey Platov)
 *******************************************************************************/

package org.eclipse.ecl.internal.core;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class Process implements IProcess {

	private final IPipe in;
	private final IPipe out;
	private IStatus status;
	private final Session session;

	public Process(Session session, IPipe in, IPipe out) {
		this.session = session;
		this.in = in;
		this.out = out;
	}

	public IPipe getInput() {
		return in;
	}

	public IPipe getOutput() {
		return out;
	}

	synchronized void setStatus(IStatus status) throws CoreException {
		this.status = status;
		out.close(status);
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
