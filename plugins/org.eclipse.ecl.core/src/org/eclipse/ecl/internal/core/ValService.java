package org.eclipse.ecl.internal.core;

import static org.eclipse.emf.ecore.util.EcoreUtil.copy;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.Val;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class ValService implements ICommandService {
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof Val)) {
			return Status.CANCEL_STATUS;
		}
		context.getOutput().write(copy(command));

		return Status.OK_STATUS;
	}

}
