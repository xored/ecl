package org.eclipse.ecl.operations.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.operations.Concat;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class ConcatService implements ICommandService {
	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof Concat)) {
			return Status.CANCEL_STATUS;
		}
		Concat concat = (Concat) command;
		StringBuilder sb = new StringBuilder();
		for (String string : concat.getStrs()) {
			sb.append(string);
		}
		context.getOutput().write(sb.toString());
		return Status.OK_STATUS;
	}

}
