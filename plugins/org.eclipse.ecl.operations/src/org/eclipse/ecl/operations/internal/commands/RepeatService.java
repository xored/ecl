package org.eclipse.ecl.operations.internal.commands;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.Let;
import org.eclipse.ecl.core.Val;
import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.ecl.operations.Repeat;
import org.eclipse.ecl.runtime.BoxedValues;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;

public class RepeatService implements ICommandService {

	public IStatus service(Command command, IProcess process)
			throws InterruptedException, CoreException {
		Repeat t = (Repeat) command;
		int times = t.getTimes();
		int delay = t.getDelay();
		if (delay < 0)
			return new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID,
					"Illegal parameter 'delay'");
		if (times <= 0)
			return new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID,
					"Illegal parameter 'times'");
		List<Object> content = CoreUtils.readPipeContent(process.getInput());
		IStatus status = Status.OK_STATUS;

		Val indexVal = t.getIndex();

		for (int i = 0; i < times; i++) {
			IPipe input = process.getSession().createPipe();
			for (Object o : content)
				input.write(o);
			input.close(Status.OK_STATUS);
			IPipe output = process.getSession().createPipe();

			IProcess doProcess = process.getSession().execute(wrapBody(i, indexVal, t.getCommand()),
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

	private static Command wrapBody(int i, Val indexVal, Command body) {
		if (indexVal == null) {
			return body;
		}

		Let let = CoreFactory.eINSTANCE.createLet();
		indexVal.setValue(BoxedValues.box(i));
		let.getVals().add(indexVal);
		let.setBody(body);
		return let;
	}
}
