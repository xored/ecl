package org.eclipse.ecl.internal.stdlib;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;
import org.eclipse.ecl.stdlib.AssertEquals;

public class AssertEqualsService implements ICommandService {

	public final static String PLUGIN_ID = "org.eclipse.ecl.core";

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		AssertEquals ae = (AssertEquals) command;
		Object expected = ae.getExpected();
		Object actual = context.getInput().take(ISession.DEFAULT_TAKE_TIMEOUT);
		if (actual == null) {
			return new Status(Status.ERROR, PLUGIN_ID, "Pipe was empty");
		}
		context.getOutput().write(actual);
		if (actual.equals(expected)) {
			return Status.OK_STATUS;
		} else {
			return new Status(Status.ERROR, PLUGIN_ID, "Assertion failed");
		}
	}
}