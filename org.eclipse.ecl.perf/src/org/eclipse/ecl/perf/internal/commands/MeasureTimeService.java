package org.eclipse.ecl.perf.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.perf.MeasureTime;
import org.eclipse.ecl.perf.PerfCounter;
import org.eclipse.ecl.perf.PerfFactory;
import org.eclipse.ecl.perf.StartTimeMeasure;
import org.eclipse.ecl.perf.StopTimeMeasure;
import org.eclipse.ecl.perf.internal.EclPerfPlugin;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class MeasureTimeService implements ICommandService {
	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		/*
		 * With with = (With) command; ISession session = process.getSession();
		 * IPipe pipe = session.createPipe(); pipe.write(with.getObject());
		 * pipe.close(Status.OK_STATUS); IProcess doProcess =
		 * session.execute(with.getDo(), pipe, null); return
		 * doProcess.waitFor();
		 */
		MeasureTime measureTime = (MeasureTime) command;
		ISession session = context.getSession();
		IStatus startStatus = session.execute(
				createStart(measureTime.getLabel())).waitFor();
		if (!startStatus.isOK()) {
			return startStatus;
		}

		IStatus bodyStatus = session.execute(measureTime.getDo()).waitFor();
		if (!bodyStatus.isOK()) {
			return bodyStatus;
		}

		IPipe out = session.createPipe();
		IStatus stopStatus = session.execute(
				createStop(measureTime.getLabel()), null, out).waitFor();
		if (!stopStatus.isOK()) {
			return stopStatus;
		}

		Object o = out.take(0);
		if (o == null || !(o instanceof PerfCounter)) {
			return new Status(IStatus.ERROR, EclPerfPlugin.PLUGIN_ID,
					"Internal error: cannot get perf counter with name "
							+ measureTime.getLabel());
		}

		context.getOutput().write(o);
		context.getOutput().close(Status.OK_STATUS);
		return Status.OK_STATUS;
	}

	private StartTimeMeasure createStart(String label) {
		StartTimeMeasure result = PerfFactory.eINSTANCE
				.createStartTimeMeasure();
		result.setLabel(label);
		return result;
	}

	private StopTimeMeasure createStop(String label) {
		StopTimeMeasure result = PerfFactory.eINSTANCE.createStopTimeMeasure();
		result.setLabel(label);
		return result;
	}

}
