package org.eclipse.ecl.operations.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.operations.AssertNonEmpty;
import org.eclipse.ecl.operations.internal.OperationsPlugin;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class AssertNonEmptyService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		AssertNonEmpty assertEmpty = (AssertNonEmpty) command;

		Object contents = context.getInput()
				.take(ISession.DEFAULT_TAKE_TIMEOUT);
		if (contents == null || contents instanceof IStatus) {
			return new Status(IStatus.ERROR, OperationsPlugin.PLUGIN_ID,
					getMessage(assertEmpty));
		}
		return Status.OK_STATUS;
	}

	private String getMessage(AssertNonEmpty assertEmpty) {
		String message = assertEmpty.getMessage();
		return message == null || message.length() == 0 ? "Assertion failed: expected non-empty pipe"
				: message;
	}

}
