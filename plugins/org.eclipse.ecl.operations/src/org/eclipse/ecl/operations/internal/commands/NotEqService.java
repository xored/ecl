package org.eclipse.ecl.operations.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.operations.NotEq;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class NotEqService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof NotEq)) {
			return Status.CANCEL_STATUS;
		}
		NotEq eq = (NotEq) command;
		context.getOutput().write(
				!EcoreUtil.equals(eq.getLeft(), eq.getRight()));
		context.getOutput().close(Status.OK_STATUS);
		return Status.OK_STATUS;
	}

}
