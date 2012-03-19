package org.eclipse.ecl.operations.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.BoxedValue;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.operations.Lt;
import org.eclipse.ecl.operations.internal.OperationsPlugin;
import org.eclipse.ecl.runtime.BoxedValues;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class LtService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof Lt)) {
			return Status.CANCEL_STATUS;
		}
		Lt eq = (Lt) command;
		if (eq.getLeft() instanceof BoxedValue
				&& eq.getRight() instanceof BoxedValue) {
			Long long1 = BoxedValues.toLong((BoxedValue) eq.getLeft());
			Long long2 = BoxedValues.toLong((BoxedValue) eq.getRight());
			context.getOutput().write(long1 < long2);
			context.getOutput().close(Status.OK_STATUS);
		} else {
			Status st = new Status(IStatus.ERROR, OperationsPlugin.PLUGIN_ID,
					"Incorrect argument types: left: "
							+ eq.getLeft().getClass() + " right:"
							+ eq.getRight().getClass());
			context.getOutput().close(st);
			return st;
		}
		return Status.OK_STATUS;
	}

}
