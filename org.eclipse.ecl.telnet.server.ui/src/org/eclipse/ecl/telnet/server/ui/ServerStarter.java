package org.eclipse.ecl.telnet.server.ui;

import java.io.IOException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.telnet.server.EclTelnetServerPlugin;
import org.eclipse.ui.IStartup;

public class ServerStarter implements IStartup {

	public void earlyStartup() {
		try {
			EclTelnetServerPlugin.getDefault().startServer(2323);
		} catch (IOException e) {
			EclTelnetServerPlugin.getDefault().getLog().log(
					new Status(IStatus.ERROR, EclTelnetServerPlugin.PLUGIN_ID,
							"Failed to start server", e)
				);
		}
	}
}
