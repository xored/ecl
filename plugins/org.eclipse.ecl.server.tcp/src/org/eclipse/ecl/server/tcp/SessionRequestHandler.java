package org.eclipse.ecl.server.tcp;

import java.net.Socket;
import java.net.SocketException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.EclRuntime;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

final class SessionRequestHandler extends Thread {
	private final Socket socket;
	private final ISession session;

	SessionRequestHandler(Socket socket, boolean useJobs) {
		super("ECL tcp session:" + socket.getPort());
		this.socket = socket;
		try {
			this.socket.setTcpNoDelay(true);
		} catch (SocketException e) {
			CorePlugin.log(e);
		}
		this.session = EclRuntime.createSession(useJobs);
	}

	public void run() {
		try {
			IPipe pipe = CoreUtils.createEMFPipe(socket.getInputStream(),
					socket.getOutputStream());
			while (!isInterrupted() && !socket.isClosed()) {
				try {
					pipe.reinit();
					Object object = pipe.take(Long.MAX_VALUE);
					if (!(object instanceof Command))
						break;
					Command command = (Command) object;
					IPipe input = readInput(pipe);
					IProcess process = session.execute(command, input, null);
					IStatus status = writeOutput(pipe, process);
					pipe.write(status);
					pipe.close(status);
				} catch (Exception e) {
					Throwable te = e;
					if (e instanceof CoreException) {
						if (e.getCause() instanceof SocketException) {
							te = e.getCause();
						}
					}
					if (te instanceof SocketException) {
						try {
							socket.close();
						} catch (Throwable e2) {
							// Ignore
						}
						break;
					}
					CorePlugin.log(e);
				}
			}
		} catch (Exception e) {
			CorePlugin.log(e);
		} finally {
			try {
				socket.close();
			} catch (Exception e) {
				CorePlugin.log(e);
			}
			try {
				session.close();
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

	private IStatus writeOutput(IPipe pipe, IProcess process)
			throws CoreException {
		Object object;
		do {
			object = process.getOutput().take(Long.MAX_VALUE);
			if (object instanceof IStatus) {
				return (IStatus) object;
			} else {
				pipe.write(object);
			}
		} while (true);
	}

	public void recover(Socket client) {
	}
}