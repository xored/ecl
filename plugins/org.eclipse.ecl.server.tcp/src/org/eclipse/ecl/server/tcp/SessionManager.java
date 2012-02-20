package org.eclipse.ecl.server.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class SessionManager {
	private Map<String, SessionRequestHandler> sessions = new HashMap<String, SessionRequestHandler>();
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
//			System.out.println("Connection: " + count + " from:"
//					+ client.getInetAddress().toString());
			String uuid = initRecover(client);
			if (uuid != null) {
				synchronized (sessions) {
					SessionRequestHandler handler = sessions.get(uuid);
					if (handler == null) {
						handler = new SessionRequestHandler(client, useJobs);
						executor.execute(handler);
						// handler.start();
					} else {
						handler.recover(client);
					}
				}
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
			synchronized (sessions) {
				while (sessions.containsKey(uuid)) {
					uuid = EcoreUtil.generateUUID();
				}
			}
			dout.writeUTF(uuid);
			return uuid;

		} else if ("restoresession".equals(utf)) {
			String uuid = din.readUTF();
			synchronized (sessions) {
				if (sessions.containsKey(uuid)) {
					return uuid;
				}
			}
			dout.writeUTF("no_session_failure");
		}
		return null;
	}
}
