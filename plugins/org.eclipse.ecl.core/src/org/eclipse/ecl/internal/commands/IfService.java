package org.eclipse.ecl.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.If;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class IfService implements ICommandService {
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof If)) {
			return Status.CANCEL_STATUS;
		}

		If iff = (If) command;
		ISession session = context.getSession();

		Command branch = iff.isCondition() ? iff.getThen() : iff.getElse();
		if (branch == null) {
			return Status.OK_STATUS; // nothing to do
		}
		return session.execute(branch, context.getInput(), context.getOutput())
				.waitFor();
	}

}
