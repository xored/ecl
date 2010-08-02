/*******************************************************************************
 * Copyright (c) 2008 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Ruslan Sychev)
 *******************************************************************************/

package org.eclipse.ecl.terminal.connector;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import org.eclipse.ecl.eclsh.AbstractEclShellConnection;
import org.eclipse.tm.internal.terminal.provisional.api.ITerminalControl;

public class EclConnection extends AbstractEclShellConnection {
	private PipedInputStream pipedInputStream;
	private PipedOutputStream pipedOutputStream;

	private ITerminalControl control;

	public EclConnection(ITerminalControl control) {
		this.control = control;
	}

	public void connect() {
		createStreams();
		connect(control.getRemoteToTerminalOutputStream());
	}

	public void disconnect() {
		super.disconnect();
		if (!isConnecting) {
			pipedInputStream = null;
			pipedOutputStream = null;
		}
	}

	public OutputStream getOutputStream() {
		return pipedOutputStream;
	}

	protected void createStreams() {
		pipedInputStream = new PipedInputStream();
		try {
			pipedOutputStream = new PipedOutputStream(pipedInputStream);
		} catch (IOException ioEx) {
			pipedInputStream = null;
		}
	}

	@Override
	public InputStream getInputStream() {
		return pipedInputStream;
	}
	protected void outputNewLine() {
		try {
			outputStream.write(13);
			outputStream.write(10);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}
