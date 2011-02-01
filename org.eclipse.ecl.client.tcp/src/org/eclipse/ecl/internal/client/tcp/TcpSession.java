package org.eclipse.ecl.internal.client.tcp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.ProcessStatus;
import org.eclipse.ecl.gen.ast.LocatedProcessStatus;
import org.eclipse.ecl.internal.core.Pipe;
import org.eclipse.ecl.parser.LocatedErrorStatus;
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

	private InetAddress lastLocalAddress;

	private int lastLocalPort;

	public TcpSession(InetAddress address, int port) throws IOException {
		this.address = address;
		this.port = port;
		init(null, 0);
	}

	public TcpSession(InetAddress address, int port, InetAddress localAddress,
			int localPort) throws IOException {
		this.address = address;
		this.port = port;
		init(localAddress, localPort);
	}

	protected void init(InetAddress localAddress, int localPort)
			throws IOException {
		if (localAddress != null) {
			lastLocalAddress = localAddress;
			lastLocalPort = localPort;
			socket = new Socket(address, port, localAddress, localPort);
		} else {
			socket = new Socket(address, port);

		}
		commandPipe = CoreUtils.createEMFPipe(socket.getInputStream(),
				socket.getOutputStream());
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
					commandPipe.write(command);
					Object result = null;
					while (true) {
						result = commandPipe.take(10000);
						if (result instanceof ProcessStatus) {
							break;
						}
					}
					ProcessStatus ps = (ProcessStatus) result;
					if (ps instanceof LocatedProcessStatus) {
						LocatedProcessStatus lps = (LocatedProcessStatus) ps;
						ctx.setStatus(new LocatedErrorStatus(lps.getSeverity(),
								lps.getPluginId(), lps.getMessage(), lps
										.getLine(), lps.getColumn(), lps
										.getLength()));
					} else {
						ctx.setStatus(new Status(ps.getSeverity(), ps
								.getPluginId(), ps.getCode(), ps.getMessage(),
								null));
					}
				} catch (CoreException e) {
					ctx.setStatus(e.getStatus());
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
				try {
					commandPipe.write(command);
					Object result = null;
					while (true) {
						result = commandPipe.take(10000);
						if (result instanceof ProcessStatus) {
							break;
						} else if (out != null) {
							out.write(result);
						}
					}
					ProcessStatus ps = (ProcessStatus) result;
					if (ps instanceof LocatedProcessStatus) {
						LocatedProcessStatus lps = (LocatedProcessStatus) ps;
						ctx.setStatus(new LocatedErrorStatus(lps.getSeverity(),
								lps.getPluginId(), lps.getMessage(), lps
										.getLine(), lps.getColumn(), lps
										.getLength()));
					} else {
						ctx.setStatus(new Status(ps.getSeverity(), ps
								.getPluginId(), ps.getCode(), ps.getMessage(),
								null));
					}
				} catch (CoreException e) {
					ctx.setStatus(e.getStatus());
				} catch (Throwable e) {
					ctx.setStatus(new Status(Status.ERROR,
							"org.eclipse.core.ecl", e.getMessage(), e));
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
			close();
		} catch (Exception e) {
			// ignore closing exceptions
		}
		try {
			init(lastLocalAddress, findFreePort(port));
		} catch (IOException e) {
			throw new CoreException(new Status(IStatus.ERROR, PLUGIN_ID,
					e.getMessage(), e));
		}
	}

	public void close() throws CoreException {
		commandPipe.close(Status.OK_STATUS);
		try {
			socket.close();
		} catch (IOException e) {
			throw new CoreException(new Status(IStatus.ERROR, PLUGIN_ID,
					e.getMessage(), e));
		}
	}

	public boolean isClosed() {
		return socket.isClosed();
	}

}
