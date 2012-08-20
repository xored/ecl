package org.eclipse.ecl.operations.internal.commands;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.ecl.operations.Repeat;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;

public class RepeatService implements ICommandService {

	public IStatus service(Command command, IProcess process)
			throws InterruptedException, CoreException {
		Repeat t = (Repeat) command;
		Integer times = t.getTimes();
		Integer delay = t.getDelay();
		if (delay == null)
			delay = 0;
		if (delay < 0)
			return new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID,
					"Illegal parameter 'delay'");
		if (times != null && times <= 0)
			return new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID,
					"Illegal parameter 'times'");
		List<Object> content = CoreUtils.readPipeContent(process.getInput());
		IStatus status = Status.OK_STATUS;
		for (int i = 0; i < times; i++) {
			IPipe input = process.getSession().createPipe();
			for (Object o : content)
				input.write(o);
			input.close(Status.OK_STATUS);
			IPipe output = process.getSession().createPipe();
			IProcess doProcess = process.getSession().execute(t.getCommand(),
					input, output);
			status = doProcess.waitFor();
			if (!status.isOK()) {
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
		return status;
	}
}
