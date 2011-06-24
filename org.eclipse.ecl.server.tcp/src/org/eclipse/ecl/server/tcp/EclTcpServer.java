package org.eclipse.ecl.server.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.EclRuntime;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class EclTcpServer extends Thread {
	private final ServerSocket socket;
	private final int port;
	private boolean starting = true;

	public EclTcpServer(int port) throws IOException {
		super("ECL TCP server");
		this.socket = new ServerSocket(port);
		this.port = port;
	}

	public boolean isStarting() {
		return starting;
	}

	@Override
	public void run() {
		starting = false;
		try {
			while (!isInterrupted()) {
				new SessionRequestHandler(socket.accept());
			}
		} catch (Exception e) {
			CorePlugin.log(CorePlugin.err("Failed to start ECL TCP server", e));
		}
	}

	public int getPort() {
		return port;
	}

	private static final class SessionRequestHandler extends Thread {
		private final Socket socket;
		private final ISession session;

		SessionRequestHandler(Socket socket) {
			super("ECL tcp session:" + socket.getPort());
			this.socket = socket;
			this.session = EclRuntime.createSession();
			start();
		}

		public void run() {
			try {
				IPipe pipe = CoreUtils.createEMFPipe(socket.getInputStream(),
						socket.getOutputStream());
				while (!isInterrupted()) {
					Object object = pipe.take(Long.MAX_VALUE);
					if (!(object instanceof Command))
						break;
					Command command = (Command) object;
					IPipe input = readInput(pipe);
					IProcess process = session.execute(command, input, null);
					IStatus status = process.waitFor();
					writeOutput(pipe, process);
					pipe.write(status);
				}
			} catch (Exception e) {
				CorePlugin.log(e);
			} finally {
				try {
					session.close();
					socket.close();
				} catch (Exception e) {
					CorePlugin.log(e);
				}
			}
		}

		private IPipe readInput(IPipe pipe) throws CoreException {
			Object object;
			IPipe input = session.createPipe();
			while (true) {
				object = pipe.take(Long.MAX_VALUE);
				if (object instanceof IStatus) {
					input.close((IStatus) object);
					break;
				}
				input.write(object);
			}
			return input;
		}

		private void writeOutput(IPipe pipe, IProcess process)
				throws CoreException {
			Object object;
			do {
				object = process.getOutput().take(Long.MAX_VALUE);
				if (object == null || object instanceof IStatus) {
					break;
				} else {
					pipe.write(object);
				}
			} while (true);
		}
	}
}
