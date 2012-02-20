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
package org.eclipse.ecl.debug.core;

import java.net.Socket;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.debug.runtime.Session;
import org.eclipse.ecl.debug.runtime.events.Event;
import org.eclipse.ecl.internal.debug.core.Plugin;

public class DebuggerBaseTransport implements DebuggerTransport {

	public void create(int port, String host) throws CoreException {
		try {
			Socket socket = new Socket(host, port);
			session = new Session(socket) {

				@Override
				protected void handle(Event event) {
					final DebuggerCallback c = callback;
					if (c != null) {
						callback.handleResponse(event);
					}
				}

				@Override
				protected void handle(Exception e) {
					Plugin.log(e);
				}
			};
		} catch (Exception e) {
			throw new CoreException(Plugin.status(
					"Couldn't connect to debugger", e));
		}
	}

	@Override
	public void request(Event event) {
		session.request(event);
	}

	@Override
	public void setCallback(DebuggerCallback callback) {
		this.callback = callback;
	}

	private volatile DebuggerCallback callback;
	private Session session;

	public void terminate() {
		if (session != null) {
			session.terminate();
		}
	}

}
