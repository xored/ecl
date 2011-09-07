package org.eclipse.ecl.client.tcp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.ecl.internal.core.Pipe;
import org.eclipse.ecl.internal.core.Process;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class EclTcpSession implements ISession {

	private final AtomicBoolean closed = new AtomicBoolean(false);

	private InetAddress address;
	private int port;

	public EclTcpSession(InetAddress address, int port) throws IOException {
		this.address = address;
		this.port = port;
	}

	public IPipe createPipe() {
		return new Pipe();
	}

	public IProcess execute(final Command command) throws CoreException {
		return execute(command, null, null);
	}

	public IProcess execute(final Command command, IPipe in, IPipe out)
			throws CoreException {
		final IPipe input = in == null ? createPipe().close(Status.OK_STATUS)
				: in;
		final IPipe output = out == null ? createPipe() : out;
		final Process process = new Process(this, input, output);
		new Thread(new Runnable() {
			public void run() {
				Socket socket = null;
				IPipe pipe = null;
				try {
					socket = new Socket(address, port);
					pipe = CoreUtils.createEMFPipe(socket.getInputStream(),
							socket.getOutputStream());
					pipe.write(command);
					readInput(input, pipe);
					Object result = writeOutput(output, pipe);
					process.setStatus((IStatus) result);
				} catch (CoreException e) {
					try {
						process.setStatus(e.getStatus());
					} catch (CoreException e1) {
						CorePlugin.log(e1);
					}
				} catch (Throwable t) {
					try {
						process.setStatus(CorePlugin.err(t));
					} catch (CoreException e1) {
						CorePlugin.log(e1);
					}
				} finally {
					try {
						if (pipe != null) {
							pipe.close(Status.OK_STATUS);
						}
						if (socket != null) {
							socket.close();
						}
					} catch (Throwable e) {
						CorePlugin.log(e);
					}
				}
			}
		}, "ECL TCP session execute: " + command.getClass().getName()).start();
		return process;
	}

	private void readInput(final IPipe input, IPipe pipe) throws CoreException {
		while (true) {
			Object object = input.take(Long.MAX_VALUE);
			if (object instanceof IStatus) {
				pipe.write(object);
				break;
			}
			pipe.write(object);
		}
	}

	private IStatus writeOutput(final IPipe output, IPipe pipe)
			throws CoreException {
		while (true) {
			Object object = pipe.take(Long.MAX_VALUE);
			if (object instanceof IStatus) {
				return (IStatus) object;
			} else {
				output.write(object);
			}
		}
	}

	public void reconnect() throws CoreException {
		try {
			Socket socket = null;
			try {
				socket = new Socket(address, port);
			} finally {
				if (socket != null) {
					socket.close();
				}
			}
		} catch (IOException e) {
			throw new CoreException(CorePlugin.err(e));
		}
	}

	public void close() throws CoreException {
		closed.compareAndSet(false, true);
	}

	public boolean isClosed() {
		return closed.get();
	}
}
