package org.eclipse.ecl.internal.parser.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.Script;
import org.eclipse.ecl.parser.EclCoreParser;
import org.eclipse.ecl.runtime.EclCompiler;
import org.eclipse.ecl.runtime.EclRuntime;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class ScriptService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		Script s = (Script) command;
		String content = s.getContent();
		if (content == null || content.length() == 0)
			return Status.OK_STATUS;
		Command c = EclCoreParser.newCommand(content);
		c = EclCompiler.compile(c);
		IProcess process = EclRuntime.createSession().execute(c);
		return process.waitFor();
	}

}
