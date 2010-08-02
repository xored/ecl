package org.eclipse.ecl.internal.server.tcp.ui;

import java.io.IOException;

import org.eclipse.ecl.server.tcp.EclTcp;
import org.eclipse.ui.IStartup;

public class ServerStarter implements IStartup {

	public void earlyStartup() {
		try {
			EclTcp.runServer(5378);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
