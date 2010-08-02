package org.eclipse.ecl.internal.stdlib;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class LengthService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		int length = 0;
		IPipe sink = context.getInput();
		while (sink.take(ISession.DEFAULT_TAKE_TIMEOUT) != null) {
			length++;
		}
		context.getOutput().write(length);
		return Status.OK_STATUS;
	}
}
