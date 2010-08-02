package org.eclipse.ecl.core.tests.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class IsPipeEmptyService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		Object input = context.getInput().take(ISession.DEFAULT_TAKE_TIMEOUT);
		if (input instanceof IStatus)
			context.getOutput().write(true);
		else
			context.getOutput().write(false);
		return Status.OK_STATUS;
	}

}
