package org.eclipse.ecl.server.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class SessionManager {
	private ExecutorService executor;
	int count = 0;
	private boolean useJobs = false;;

	public SessionManager(boolean useJobs) {
		executor = Executors.newCachedThreadPool();
		this.useJobs = useJobs;
	}

	public void acceptNewConnection(Socket client) {
		try {
			count++;
			String uuid = initRecover(client);
			if (uuid != null) {
				executor.execute(new SessionRequestHandler(client, useJobs));
			} else {
				client.close();
			}

		} catch (Throwable e) {
			CorePlugin.log(e);
		}
	}

	private String initRecover(Socket client) throws IOException {
		InputStream stream = client.getInputStream();
		DataInputStream din = new DataInputStream(stream);
		DataOutputStream dout = new DataOutputStream(client.getOutputStream());
		String utf = din.readUTF();
		if ("newsession".equals(utf)) {
			String uuid = EcoreUtil.generateUUID();
			uuid = EcoreUtil.generateUUID();
			dout.writeUTF(uuid);
			dout.flush();
			return uuid;

		}
		return null;
	}
}
