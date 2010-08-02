package org.eclipse.ecl.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.Exec;
import org.eclipse.ecl.runtime.EclCompiler;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class ExecService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		Exec exec = (Exec) command;
		ISession session = context.getSession();
		Command target = EclCompiler.compile(exec);
		IProcess child = session.execute(target, context.getInput(), context
				.getOutput());
		return child.waitFor();
	}
}
