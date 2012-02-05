package org.eclipse.ecl.server.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class SessionManager {
	private Map<String, SessionRequestHandler> sessions = new HashMap<String, SessionRequestHandler>();

	public void acceptNewConnection(Socket client) {
		try {
			String uuid = initRecover(client);
			if (uuid != null) {
				synchronized (sessions) {
					SessionRequestHandler handler = sessions.get(uuid);
					if (handler == null) {
						handler = new SessionRequestHandler(client);
					} else {
						handler.recover(client);
					}
					handler.start();
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
