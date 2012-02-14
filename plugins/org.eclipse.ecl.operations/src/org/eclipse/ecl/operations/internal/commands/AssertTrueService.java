package org.eclipse.ecl.operations.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.operations.AssertTrue;
import org.eclipse.ecl.operations.internal.OperationsPlugin;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class AssertTrueService implements ICommandService {
	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof AssertTrue)) {
			return Status.CANCEL_STATUS;
		}
		AssertTrue assertTrue = (AssertTrue) command;
		String message = assertTrue.getMessage();
		if (message == null || message.length() == 0) {
			message = "Assertion failed: expected 'true' but was 'false'";
		}
		if (!assertTrue.isInput()) {
			return new Status(IStatus.ERROR, OperationsPlugin.PLUGIN_ID,
					message);
		}
		return Status.OK_STATUS;
	}
}
