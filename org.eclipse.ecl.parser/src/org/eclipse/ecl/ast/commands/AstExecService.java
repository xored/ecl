package org.eclipse.ecl.ast.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.gen.ast.AstExec;
import org.eclipse.ecl.internal.commands.ExecService;
import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.ecl.parser.LocatedStatus;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

@SuppressWarnings("restriction")
public class AstExecService implements ICommandService {
	public IStatus service(Command command, IProcess process)
			throws InterruptedException, CoreException {
		AstExec exec = (AstExec) command;
		IStatus s = new ExecService().service(exec, process);
		if (!s.isOK() && !(s instanceof LocatedStatus)) {
			return new LocatedStatus(IStatus.ERROR, CorePlugin.PLUGIN_ID,
					s.getMessage(), exec.getLine(), exec.getColumn(),
					exec.getLength());
		}
		return s;
	}
}
