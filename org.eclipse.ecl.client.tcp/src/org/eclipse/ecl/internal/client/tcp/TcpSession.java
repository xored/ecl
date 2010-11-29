package org.eclipse.ecl.internal.client.tcp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.ProcessStatus;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class TcpSession implements ISession {

	private final static String PLUGIN_ID = "org.eclipse.ecl.internal.client.tcp";

	private Socket socket;
	private IPipe commandPipe;

	private InetAddress address;
	private int port;

	public TcpSession(InetAddress address, int port) throws IOException {
		this.address = address;
		this.port = port;
		init();
	}

	protected void init() throws IOException {
		socket = new Socket(address, port);
		commandPipe = CoreUtils.createEMFPipe(socket.getInputStream(), socket
				.getOutputStream());
	}

	public IPipe createPipe() {
		throw new UnsupportedOperationException();
	}

	public IProcess execute(final Command command) throws CoreException {
		final RemoteProcess ctx = new RemoteProcess(this);
		new Thread(new Runnable() {
			public void run() {
				try {
					commandPipe.write(command);
					Object result = null;
					while (true) {
						result = commandPipe.take(10000);
						if (result instanceof ProcessStatus) {
							break;
						}
					}
					ProcessStatus ps = (ProcessStatus) result;
					ctx.setStatus(new Status(ps.getSeverity(),
							ps.getPluginId(), ps.getCode(), ps.getMessage(),
							null));
				} catch (CoreException e) {
					ctx.setStatus(e.getStatus());
				}
			}
		}).start();
		return ctx;
	}

	public IProcess execute(final Command command, final IPipe in,
			final IPipe out) throws CoreException {
		throw new UnsupportedOperationException();
	}

	public void reconnect() throws CoreException {
		try {
			close();
		} catch (Exception e) {
			// ignore closing exceptions
		}
		try {
			init();
		} catch (IOException e) {
			throw new CoreException(new Status(IStatus.ERROR, PLUGIN_ID, e
					.getMessage(), e));
		}
	}

	public void close() throws CoreException {
		commandPipe.close(Status.OK_STATUS);
		try {
			socket.close();
		} catch (IOException e) {
			throw new CoreException(new Status(IStatus.ERROR, PLUGIN_ID, e
					.getMessage(), e));
		}
	}

}
