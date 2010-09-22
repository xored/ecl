package org.eclipse.ecl.internal.stdlib;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class AssertFalseService implements ICommandService {

	public final static String PLUGIN_ID = "org.eclipse.ecl.core";

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		try {
			Boolean value = (Boolean) context.getInput().take(
					ISession.DEFAULT_TAKE_TIMEOUT);
			if (value == null) {
				new Status(IStatus.ERROR, PLUGIN_ID, "Invalid pipe content");
			} else {
				context.getInput().write(value);
				if (value.booleanValue()) {
					return new Status(IStatus.ERROR, PLUGIN_ID,
							"Assertion failed");
				}
			}
		} catch (ClassCastException e) {
			return new Status(IStatus.ERROR, PLUGIN_ID, "Invalid pipe content");
		}
		return Status.OK_STATUS;
	}
}