package org.eclipse.ecl.internal.server.tcp.ui;

import java.io.IOException;

import org.eclipse.ecl.server.tcp.EclTcp;
import org.eclipse.ui.IStartup;

public class ServerStarter implements IStartup {

	private static final String ECL_SERVER_PORT = "eclPort";

	public void earlyStartup() {
		try {
			String port = System.getProperty(ECL_SERVER_PORT);
			if (port != null)
				EclTcp.runServer(Integer.parseInt(port));
			else
				EclTcp.runServer(5378);
		} catch (NumberFormatException e) {
			Activator.log("Ecl server port is incorrect.", e);
		} catch (IOException e) {
			Activator.log(e);
		}
	}
}
