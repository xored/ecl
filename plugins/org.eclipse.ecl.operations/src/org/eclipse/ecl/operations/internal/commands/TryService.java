package org.eclipse.ecl.operations.internal.commands;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.ecl.operations.Try;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.ExecutionFlowStatus;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;

public class TryService implements ICommandService {

	public IStatus service(Command command, IProcess process)
			throws InterruptedException, CoreException {
		Try t = (Try) command;
		Integer times = t.getTimes();
		Integer delay = t.getDelay();
		if (delay == null)
			delay = 100;
		if (delay < 0)
			return new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID,
					"Illegal parameter 'delay'");
		if (times != null && times <= 0)
			return new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID,
					"Illegal parameter 'times'");
		List<Object> content = CoreUtils.readPipeContent(process.getInput());
		IStatus status = Status.OK_STATUS;
		try {
			for (int i = 0; times == null || i < times; i++) {
				IPipe input = process.getSession().createPipe();
				for (Object o : content)
					input.write(o);
				input.close(Status.OK_STATUS);
				IPipe output = process.getSession().createPipe();
				IProcess doProcess = process.getSession().execute(
						t.getCommand(), input, output);
				status = doProcess.waitFor();

				if (status instanceof ExecutionFlowStatus) {
					return status; // return immediately,
									// don't alter out pipe
				}

				if (status.isOK()) {
					content = CoreUtils.readPipeContent(output);
					for (Object o : content)
						process.getOutput().write(o);
					// return status;
					break;
				}
				if (delay > 0) {
					Thread.sleep(delay);
				}

			}
			// Do catch
			if (!status.isOK()) {
				if (t.getCatch() != null) {
					IPipe input = process.getSession().createPipe();
					for (Object o : content)
						input.write(o);
					input.close(Status.OK_STATUS);
					IPipe output = process.getSession().createPipe();
					IProcess doProcess = process.getSession().execute(
							t.getCatch(), input, output);
					IStatus status2 = doProcess.waitFor();

					if (status2 instanceof ExecutionFlowStatus) {
						return status2; // return immediately
										// don't alter out pipe
					}
					if (status2.isOK()) {
						content = CoreUtils.readPipeContent(output);
						for (Object o : content)
							process.getOutput().write(o);
						status = status2;
					} else {
						status = status2;
					}
				}
			}
		} finally {
			if (t.getFinally() != null) {
				IPipe input = process.getSession().createPipe();
				for (Object o : content)
					input.write(o);
				input.close(Status.OK_STATUS);
				IPipe output = process.getSession().createPipe();
				IProcess doProcess = process.getSession().execute(
						t.getFinally(), input, output);
				IStatus finallyStatus = doProcess.waitFor();

				if (!finallyStatus.isOK()) {
					status = finallyStatus; // failing finally block overrides
											// body status even if it is ExecutionFlowStatus
				}
			}
		}
		return status;
	}
}
