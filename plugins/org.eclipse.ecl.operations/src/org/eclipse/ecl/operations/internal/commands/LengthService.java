package org.eclipse.ecl.operations.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.operations.Length;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class LengthService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if(!(command instanceof Length)) {
			return Status.CANCEL_STATUS;
		}
		context.getOutput().write(((Length)command).getInput().size());
		return Status.OK_STATUS;
	}

}
