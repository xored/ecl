package org.eclipse.ecl.internal.parser.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class ScriptService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		// Script s = (Script) command;
		// String content = s.getContent();
		// if (content == null || content.length() == 0)
		// return Status.OK_STATUS;
		// Command c = new EclParser().command(content);
		// if (c == null) {
		// return new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID,
		// "Errors in the script.");
		// }
		// c = EclCompiler.compile(c);
		// IProcess process = EclRuntime.createSession().execute(c);
		return null;// process.waitFor();
	}

}
