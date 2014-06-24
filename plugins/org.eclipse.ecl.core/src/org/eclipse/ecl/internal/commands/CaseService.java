package org.eclipse.ecl.internal.commands;

import static org.eclipse.emf.ecore.util.EcoreUtil.copy;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Case;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class CaseService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		if (!(command instanceof Case))
			return Status.CANCEL_STATUS;

		// Return a copy of the case command. The command itself will be executed later in switch.
		context.getOutput().write(copy(command));
		return Status.OK_STATUS;
	}

}
