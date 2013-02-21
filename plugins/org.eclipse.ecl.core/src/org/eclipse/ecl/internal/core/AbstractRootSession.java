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
package org.eclipse.ecl.internal.core;

import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.core.CommandStack;

public abstract class AbstractRootSession extends AbstractSession {

	private AtomicBoolean closed = new AtomicBoolean(false);

	public AbstractRootSession() {
		super();
	}

	@Override
	protected CommandStack getStack() {
		return null;
	}

	@Override
	protected AbstractRootSession getRoot() {
		return this;
	}

	public void reconnect() throws CoreException {
		closed.compareAndSet(true, false);
	}

	public void close() throws CoreException {
		closed.set(true);
	}

	public boolean isClosed() {
		return closed.get();
	}
}
