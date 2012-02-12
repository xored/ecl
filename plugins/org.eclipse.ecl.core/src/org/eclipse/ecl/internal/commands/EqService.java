package org.eclipse.ecl.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.Eq;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EqService implements ICommandService {
	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if(!(command instanceof Eq)) {
			return Status.CANCEL_STATUS;
		}
		Eq eq = (Eq) command;
		context.getOutput().write(EcoreUtil.equals(eq.getLeft(), eq.getRight()));
		context.getOutput().close(Status.OK_STATUS);
		return Status.OK_STATUS;
	}

}
