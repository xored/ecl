package org.eclipse.ecl.eclsh;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.parser.EclCoreParser;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.EclRuntime;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class EclShell implements IEclShell {
	ISession session;
	private OutputStream outputStream;

	public EclShell() {
		super();
	}

	public void execute(String command) {
		if (session == null) {
			writeCloseMessage(this.outputStream);
			return;
		}
		try {
			Command cmd = EclCoreParser.newCommand(command); //CoreFactory.eINSTANCE.createScript();
			if (cmd == null)
				return;
			IProcess process = session.execute(cmd);
			IStatus status = process.waitFor();
			if (status.getSeverity() != IStatus.OK) {
				outputStream.write((status.getMessage()).getBytes());
				outputStream.write("\r\n".getBytes());
			}
			
			//dump pipe
			PrintStream os = new PrintStream(outputStream);
			for(Object o : CoreUtils.readPipeContent(process.getOutput())) {
				os.println(o);
			}
			os.flush();
			
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void writeCloseMessage(OutputStream stream) {
		try {
			stream.write("Shell is closed...".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void connect(OutputStream stream) {
		session = EclRuntime.createSession();
		this.outputStream = stream;
	}

	public void disconnect() {
		session = null;
	}
}
