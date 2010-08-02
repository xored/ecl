package org.eclipse.ecl.telnet.server.ui;

import org.eclipse.ecl.telnet.server.EclTelnetServerPlugin;
import org.eclipse.ui.IStartup;

public class ServerStarter implements IStartup {

	public void earlyStartup() {
		EclTelnetServerPlugin.getDefault();
	}
}
