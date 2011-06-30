package org.eclipse.ecl.perf.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.perf.StartTimeMeasure;
import org.eclipse.ecl.perf.internal.EclPerfPlugin;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class StartTimeMeasureService implements ICommandService {
	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		EclPerfPlugin.getDefault().getPerfService()
				.startTimeMeasure(((StartTimeMeasure) command).getLabel());
		return Status.OK_STATUS;
	}

}
