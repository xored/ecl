package org.eclipse.ecl.internal.client.tcp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.ecl.internal.core.Pipe;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class TcpSession implements ISession {

	private final static String PLUGIN_ID = "org.eclipse.ecl.internal.client.tcp";

	private final AtomicBoolean closed = new AtomicBoolean(false);

	private InetAddress address;
	private int port;

	public TcpSession(InetAddress address, int port) throws IOException {
		this.address = address;
		this.port = port;
	}

	public IPipe createPipe() {
		// throw new RuntimeException("rethink this");
		// add default implementation, while somebody rethink it
		return new Pipe();
	}

	public IProcess execute(final Command command) throws CoreException {
		final RemoteProcess ctx = new RemoteProcess(this);
		new Thread(new Runnable() {
			public void run() {
				try {
					Socket socket = new Socket(address, port);
					IPipe commandPipe = CoreUtils.createEMFPipe(
							socket.getInputStream(), socket.getOutputStream());
					commandPipe.write(command);
					Object result = null;
					while (true) {
						result = commandPipe.take(10000);
						if (result instanceof IStatus) {
							break;
						}
					}
					ctx.setStatus((IStatus) result);
				} catch (CoreException e) {
					ctx.setStatus(e.getStatus());
				} catch (Throwable t) {
					ctx.setStatus(CorePlugin.err(t.getMessage(), t));
				}
			}
		}, "ECL TCP session execute:" + command.getClass().getName()).start();
		return ctx;
	}

	public IProcess execute(final Command command, final IPipe in,
			final IPipe out) throws CoreException {
		// TODO this is just necessary implementation
		final RemoteProcess ctx = new RemoteProcess(this);
		new Thread(new Runnable() {
			public void run() {
				Socket socket = null;
				IPipe commandPipe = null;
				try {
					socket = new Socket(address, port);
					commandPipe = CoreUtils.createEMFPipe(
							socket.getInputStream(), socket.getOutputStream());
					commandPipe.write(command);
					Object result = null;
					while (true) {
						result = commandPipe.take(10000);
						if (result instanceof IStatus) {
							break;
						} else if (out != null) {
							out.write(result);
						}
					}
					ctx.setStatus((IStatus) result);
				} catch (CoreException e) {
					ctx.setStatus(e.getStatus());
				} catch (Throwable t) {
					ctx.setStatus(CorePlugin.err(t.getMessage(), t));
				} finally {
					try {
						if (commandPipe != null) {
							commandPipe.close(Status.OK_STATUS);
						}
						if (socket != null) {
							socket.close();
						}
					} catch (Throwable e) {
						CorePlugin.log(CorePlugin.err(e.getMessage(), e));
					}
				}
			}
		}, "ECL TCP session execute:" + command.getClass().getName()).start();
		return ctx;
	}

	public static int findFreePort(int nonPort) {
		int findFreePort = findFreePort();
		while (findFreePort == nonPort) {
			findFreePort = findFreePort();
		}
		return findFreePort;
	}

	public static int findFreePort() {
		ServerSocket socket = null;
		try {
			socket = new ServerSocket(0);
			return socket.getLocalPort();
		} catch (IOException e) {
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
				}
			}
		}
		return -1;
	}

	public void reconnect() throws CoreException {
		try {
			new Socket(address, port);
		} catch (IOException e) {
			throw new CoreException(new Status(IStatus.ERROR, PLUGIN_ID,
					e.getMessage(), e));
		}
	}

	public void close() throws CoreException {
		closed.compareAndSet(false, true);
	}

	public boolean isClosed() {
		return closed.get();
	}

}
