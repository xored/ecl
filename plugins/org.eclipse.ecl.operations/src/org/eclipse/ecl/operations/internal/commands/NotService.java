package org.eclipse.ecl.operations.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.BoxedValue;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.operations.Not;
import org.eclipse.ecl.operations.internal.OperationsPlugin;
import org.eclipse.ecl.runtime.BoxedValues;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class NotService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof Not)) {
			return Status.CANCEL_STATUS;
		}
		Not eq = (Not) command;
		if (eq.getLeft() instanceof BoxedValue) {
			context.getOutput().write(
					!BoxedValues.toBoolean((BoxedValue) eq.getLeft()));
		} else {
			Status st = new Status(IStatus.ERROR, OperationsPlugin.PLUGIN_ID,
					"Incorrect argument type for not: "
							+ eq.getLeft().getClass());
			return st;
		}
		context.getOutput().close(Status.OK_STATUS);
		return Status.OK_STATUS;
	}

}
