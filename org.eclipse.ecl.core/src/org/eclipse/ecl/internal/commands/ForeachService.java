package org.eclipse.ecl.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.Foreach;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;
import org.eclipse.emf.ecore.EObject;

public class ForeachService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		Foreach foreach = (Foreach) command;
		IStatus status = Status.OK_STATUS;
		for (EObject o : foreach.getInput()) {
			ISession session = context.getSession();
			IPipe in = session.createPipe();
			in.write(o);
			in.close(Status.OK_STATUS);

			Command doCommand = foreach.getDo();
			status = session.execute(doCommand, in, null).waitFor();
			if (status.getSeverity() != IStatus.OK) {
				break;
			}
		}
		return status;
	}

}
