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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ecl.debug.Event;

public abstract class Session extends Job {

	public Session(Socket socket) throws IOException {
		super("Event Dispatch");
		setSystem(true);

		this.socket = socket;
		writer = new PrintWriter(socket.getOutputStream());
		reader = new BufferedReader(new InputStreamReader(
				socket.getInputStream()));

		schedule();
	}

	public void request(Event event) {
		writer.println(event.toString());
		writer.flush();
	}

	public void close() {
		try {
			socket.close();
		} catch (IOException e) {
			// safe close
		}
	}

	protected abstract void handle(Event event);

	private final Socket socket;
	private final PrintWriter writer;
	private final BufferedReader reader;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.
	 * IProgressMonitor)
	 */
	protected IStatus run(IProgressMonitor monitor) {
		String line;
		try {
			while ((line = reader.readLine()) != null) {
				handle(Event.fromString(line));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Status.OK_STATUS;
	}

}
