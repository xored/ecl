package org.eclipse.ecl.internal.server.tcp;

import java.net.Socket;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.EclRuntime;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

@Deprecated
public class Session extends Thread {
	private final static boolean DEBUG_LOG = false;
	private Socket socket;
	private ISession session;

	Session(Socket socket) {
		super("ECL tcp session:" + socket.getPort());
		this.socket = socket;
		session = EclRuntime.createSession();
		start();
	}

	public void run() {
		if (DEBUG_LOG) {
			System.out.println("SERVER: New TCP Server Session:");
		}
		try {
			IPipe pipe = CoreUtils.createEMFPipe(socket.getInputStream(),
					socket.getOutputStream());
			while (!isInterrupted()) {
				Command command = (Command) pipe.take(10000000);
				if (command == null)
					break;
				if (DEBUG_LOG) {
					System.out.println("SERVER:   Got command: " + command);
				}
				setName("ECL tcp session command:"
						+ command.getClass().getSimpleName());
				IProcess process = session.execute(command);
				IStatus status = process.waitFor();
				if (DEBUG_LOG) {
					System.out.println("SERVER:   Done: " + status);
				}
				Object output = null;
				do {
					output = process.getOutput().take(0);
					if (output == null) {
						break;
					} else {
						pipe.write(output);
					}
				} while (true);
				pipe.write(status);
			}
		} catch (Exception e) {
			if (DEBUG_LOG) {
				System.out.println("SERVER: Closing TCP Server Session due: "
						+ e.getMessage());
			}
		} finally {
			try {
				session.close();
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
