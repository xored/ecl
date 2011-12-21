/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     xored software, Inc - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecl.server.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

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
	private volatile boolean starting = true;
	private boolean useJobs;
	private boolean useFixedPool;

	public boolean isStarting() {
		return starting;
	}

	public EclTcpServer(int port) throws IOException {
		this(port, true, false);
	}

	public EclTcpServer(int port, boolean useJobs, boolean useFixedPool)
			throws IOException {
		super("ECL TCP server: " + port + " main");
		this.socket = new ServerSocket(port);
		this.port = port;
		this.useJobs = useJobs;
		this.useFixedPool = useFixedPool;
	}

	@Override
	public void run() {
		starting = false;
		try {
			ExecutorService executor = null;
			if (useFixedPool) {
				executor = Executors.newFixedThreadPool(10, new ThreadFactory() {
					int ind = 0;

					@Override
					public Thread newThread(Runnable arg0) {
						ind++;
						return new Thread(arg0, "ECL TCP server: " + port
								+ " runner:" + ind);
					}
				});
			}
			while (!isInterrupted()) {
				Socket client = socket.accept();
				if (executor != null) {
					executor.submit(new SessionRequestHandler(client, useJobs));
				} else {
					new SessionRequestHandler(client, useJobs).start();
				}
			}
			executor.shutdown();
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

		SessionRequestHandler(Socket socket, boolean useJobs) {
			super("ECL tcp session:" + socket.getPort());
			this.socket = socket;
			this.session = EclRuntime.createSession(useJobs);
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
					IStatus status = writeOutput(pipe, process);
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
	}
}
