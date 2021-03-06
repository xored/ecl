package org.eclipse.ecl.operations.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.operations.Or;
import org.eclipse.ecl.operations.internal.OpUtils;
import org.eclipse.ecl.runtime.BoxedValues;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.EObject;

public class OrService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		Or or = (Or) command;

		boolean result = false;
		for (EObject a : or.getArgs())
			result |= OpUtils.asBoolean(a);

		context.getOutput().write(BoxedValues.box(result));

		context.getOutput().close(Status.OK_STATUS);
		return Status.OK_STATUS;
	}

}
