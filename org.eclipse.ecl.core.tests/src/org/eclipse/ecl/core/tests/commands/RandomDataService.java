package org.eclipse.ecl.core.tests.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.tests.model.Random;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class RandomDataService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		int count = ((Random) command).getCount();
		java.util.Random r = new java.util.Random(System.currentTimeMillis());
		for (int i = 0; i < count; i++) {
			context.getOutput().write(new Integer(r.nextInt()));
		}
		return Status.OK_STATUS;
	}
}
