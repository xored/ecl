package org.eclipse.ecl.interop.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class GetMemoryUsageService implements ICommandService {

	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		Runtime rt = Runtime.getRuntime();
		rt.gc();
		long used = rt.totalMemory() - rt.freeMemory();
		context.getOutput().write(used);
		return Status.OK_STATUS;
	}
}
