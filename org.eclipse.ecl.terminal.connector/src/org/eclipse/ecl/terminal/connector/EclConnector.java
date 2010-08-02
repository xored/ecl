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

import java.io.OutputStream;

import org.eclipse.tm.internal.terminal.provisional.api.ISettingsPage;
import org.eclipse.tm.internal.terminal.provisional.api.ITerminalControl;
import org.eclipse.tm.internal.terminal.provisional.api.TerminalState;
import org.eclipse.tm.internal.terminal.provisional.api.provider.TerminalConnectorImpl;

@SuppressWarnings("restriction")
public class EclConnector extends TerminalConnectorImpl {
	private EclConnection connection;

	public EclConnector() {
	}

	@Override
	public String getSettingsSummary() {
		return "";//$NON-NLS-1$
	}

	@Override
	public OutputStream getTerminalToRemoteStream() {
		return (connection == null) ? null : connection.getOutputStream();
	}

	@Override
	public void connect(final ITerminalControl control) {
		super.connect(control);
		connection = new EclConnection(control);
		connection.connect();
		control.setState(TerminalState.CONNECTED);
	}

	@Override
	protected void doDisconnect() {
		EclConnection disconnectingConnection = connection;
		connection = null;
		disconnectingConnection.disconnect();
	}

	@Override
	public ISettingsPage makeSettingsPage() {
		return new EclSettingsPage();
	}

	@Override
	public boolean isLocalEcho() {
		return true;
	}

}
