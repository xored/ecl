package org.eclipse.ecl.operations.internal.commands;

import static org.eclipse.ecl.operations.internal.OperationsPlugin.createErr;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.operations.ParseTime;
import org.eclipse.ecl.runtime.BoxedValues;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class ParseTimeService implements ICommandService {
	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof ParseTime)) {
			return Status.CANCEL_STATUS;
		}
		String format = ((ParseTime) command).getFormat();
		Object value = BoxedValues.unbox(context.getInput().take(10000));
		if (!(value instanceof String)) {
			return createErr(
					"Expected string value from input pipe, but got '%s'",
					value);
		}
		context.getOutput().write(
				new SimpleDateFormat(format).parse((String) value, new ParsePosition(0)).getTime());
		return Status.OK_STATUS;
	}
}
