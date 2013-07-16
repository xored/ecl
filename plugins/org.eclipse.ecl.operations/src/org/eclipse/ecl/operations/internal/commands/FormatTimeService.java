package org.eclipse.ecl.operations.internal.commands;

import static org.eclipse.ecl.operations.internal.OperationsPlugin.createErr;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.operations.FormatTime;
import org.eclipse.ecl.runtime.BoxedValues;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class FormatTimeService implements ICommandService {
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof FormatTime)) {
			return Status.CANCEL_STATUS;
		}
		Object value = BoxedValues.unbox(context.getInput().take(10000));
		if (!(value instanceof Long)) {
			return createErr(
					"Expected long value from input pipe, but got '%s'", value);
		}

		context.getOutput().write(
				new SimpleDateFormat(((FormatTime) command).getFormat())
						.format(new Date((Long) value)));
		return Status.OK_STATUS;
	}

}
