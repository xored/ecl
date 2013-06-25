package org.eclipse.ecl.interop.internal.commands;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.interop.ExecProcess;
import org.eclipse.ecl.interop.ExecProcessResult;
import org.eclipse.ecl.interop.InteropFactory;
import org.eclipse.ecl.interop.internal.EclInteropPlugin;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class ExecProcessService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {

		ExecProcess cmd = (ExecProcess) command;
		List<String> cmdArray = new ArrayList<String>();
		cmdArray.add(cmd.getCommand());
		for (String arg : cmd.getArgs())
			cmdArray.add(arg);

		Runtime runtime = Runtime.getRuntime();
		ExecProcessResult result = InteropFactory.eINSTANCE
				.createExecProcessResult();

		try {

			Process process = runtime.exec(
					cmdArray.toArray(new String[cmdArray.size()]), null, null);

			if (cmd.getStdin() != null && cmd.getStdin().length() > 0) {
				Writer stdin = new BufferedWriter(new OutputStreamWriter(
						process.getOutputStream()));
				stdin.write(cmd.getStdin());
				stdin.flush();
			}

			Executor executor = new Executor(process);
			executor.start();
			try {
				if (cmd.getTimeout() > 0)
					executor.join(cmd.getTimeout() * 1000);
				else
					executor.join();

				if (executor.exitCode == null)
					return error("Timeout period elapsed. Terminating.");
				else {
					result.setExitCode(process.exitValue());
					result.setStdout(executor.stdout);
					result.setStderr(executor.stderr);

					if (!cmd.isIgnoreExitCode() && result.getExitCode() != 0)
						return error("Execution failed, exit code: %s.",
								result.getExitCode());

					if (!cmd.isIgnoreStderr()
							&& result.getStderr().length() > 0)
						return error("Execution failed, stderr:\n%s.",
								result.getStderr());
				}
			} catch (InterruptedException e) {
				executor.interrupt();
				return error(e.getMessage());
			} finally {
				process.destroy();
			}

		} catch (IOException e) {
			return error(e.getMessage());
		}

		context.getOutput().write(result);
		return Status.OK_STATUS;
	}

	private static Status error(String message, Object... args) {
		return new Status(Status.ERROR, EclInteropPlugin.PLUGIN_ID,
				String.format(message, args));
	}

	private static class ReaderReader extends Thread {

		private Reader reader;
		private StringBuffer buffer;

		private ReaderReader(Reader reader, StringBuffer buffer) {
			this.reader = reader;
			this.buffer = buffer;
		}

		@Override
		public void run() {
			char[] chars = new char[4 * 1024];
			while (!isInterrupted()) {
				try {
					int read = reader.read(chars);
					if (read == -1)
						break;
					buffer.append(chars, 0, read);
				} catch (IOException e) {
					break;
				}
			}
		}

	}

	private static class Executor extends Thread {

		private final Process process;

		public Integer exitCode = null;
		public String stdout = "";
		public String stderr = "";

		private Executor(Process process) {
			this.process = process;
		}

		@Override
		public void run() {
			StringBuffer stdoutBuffer = new StringBuffer();
			ReaderReader stdoutReader = new ReaderReader(new BufferedReader(
					new InputStreamReader(process.getInputStream())),
					stdoutBuffer);

			StringBuffer stderrBuffer = new StringBuffer();
			ReaderReader stderrReader = new ReaderReader(new BufferedReader(
					new InputStreamReader(process.getErrorStream())),
					stderrBuffer);

			try {
				stdoutReader.start();
				stderrReader.start();

				exitCode = process.waitFor();

				stdoutReader.join();
				stderrReader.join();
			} catch (InterruptedException ignore) {
				return;
			} finally {
				stdoutReader.interrupt();
				stderrReader.interrupt();

				stdout = stdoutBuffer.toString();
				stderr = stderrBuffer.toString();
			}
		}

	}
}
