package org.eclipse.ecl.internal.stdlib;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;
import org.eclipse.ecl.stdlib.Concat;

public class ConcatService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		Concat concat = (Concat) command;
		String input = (String) context.getInput().take(
				ISession.DEFAULT_TAKE_TIMEOUT);
		// EList<String> strings = concat.getString();
		// StringBuilder result = new StringBuilder();
		// for (String s : strings) {
		// result.append(s);
		// }
		// context.getOutput().write(result);
		context.getOutput().write(input + concat.getString());
		return Status.OK_STATUS;
	}
}
