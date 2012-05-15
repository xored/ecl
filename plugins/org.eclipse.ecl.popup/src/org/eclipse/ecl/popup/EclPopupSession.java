package org.eclipse.ecl.popup;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.internal.core.Session;
import org.eclipse.ecl.parser.EclCoreParser;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.IProcess;

public class EclPopupSession {
	private Session session;

	public EclPopupSession() {
		this.session = new Session();
	}

	public EclResult exec(String command) {
		IStatus status = null;
		List<Object> pipe = new ArrayList<Object>();

		try {
			Command cmd = EclCoreParser.newCommand(command);
			IProcess process = session.execute(cmd);
			status = process.waitFor();
			pipe = CoreUtils.readPipeContent(process.getOutput());
		} catch (CoreException e) {
			status = e.getStatus();
		} catch (Exception e) {
			status = new Status(IStatus.ERROR, EclPopupPlugin.PLUGIN_ID,
					"Error executing command", e);
		}
		EclResult result = new EclResult(command, status, pipe.toArray(new Object[pipe
				.size()]));
		history.add(result);
		return result;
	}
	
	private List<EclResult> history = new ArrayList<EclResult>();
	public EclResult[] getHistory() {
		return history.toArray(new EclResult[history.size()]);
	}

	public static class EclResult {
		public EclResult(String command, IStatus status, Object[] pipe) {
			this.command = command;
			this.status = status;
			this.pipe = pipe;
		}

		public final String command;
		public final IStatus status;
		public final Object[] pipe;

		public String getCombinedOut() {
			StringBuilder sb = new StringBuilder();
			for (Object obj : pipe) {
				sb.append(obj.toString()).append("\n");
			}
			return sb.toString();
		}
	}
}
