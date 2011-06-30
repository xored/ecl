package org.eclipse.ecl.perf.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.perf.PerfCounter;
import org.eclipse.ecl.perf.StopTimeMeasure;
import org.eclipse.ecl.perf.internal.EclPerfPlugin;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class StopTimeMeasureService implements ICommandService {
	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		PerfCounter result = EclPerfPlugin.getDefault().getPerfService()
				.stopTimeMeasure(((StopTimeMeasure) command).getLabel());
		context.getOutput().write(result);
		context.getOutput().close(Status.OK_STATUS);
		return Status.OK_STATUS;
	}

}
