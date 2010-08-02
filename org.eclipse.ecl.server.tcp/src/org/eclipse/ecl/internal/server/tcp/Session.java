package org.eclipse.ecl.internal.server.tcp;

import java.net.Socket;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.ProcessStatus;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.EclRuntime;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;
import org.eclipse.emf.ecore.EObject;

public class Session extends Thread {

	private Socket socket;
	private ISession session;

	Session(Socket socket) {
		this.socket = socket;
		session = EclRuntime.createSession();
		start();
	}

	public void run() {
		System.out.println("SERVER: New TCP Server Session:");
		try {
			IPipe pipe = CoreUtils.createEMFPipe(socket.getInputStream(),
					socket.getOutputStream());
			while (!interrupted()) {
				Command command = (Command) pipe.take(10000000);
				System.out.println("SERVER:   Got command: " + command);
				IProcess process = session.execute(command);
				IStatus status = process.waitFor();
				System.out.println("SERVER:   Done: " + status);
				ProcessStatus ps = CoreFactory.eINSTANCE.createProcessStatus();
				ps.setCode(status.getCode());
				ps.setMessage(status.getMessage());
				ps.setPluginId(status.getPlugin());
				ps.setSeverity(status.getSeverity());
				Object output = null;
				do {
					output = process.getOutput().take(0);
					if (output != null && output instanceof EObject) {
						pipe.write(output);
					} else {
						break;
					}
				} while (true);
				pipe.write(ps);
			}
		} catch (Exception e) {
			System.out.println("SERVER: Closing TCP Server Session due: "
					+ e.getMessage());
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
