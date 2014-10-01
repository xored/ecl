package org.eclipse.ecl.operations.internal.commands;

import static org.eclipse.ecl.operations.internal.OperationsPlugin.createErr;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		ParseTime parseCommand = (ParseTime) command;
		String format = parseCommand.getFormat();
		String strValue = parseCommand.getInput();
		if (strValue == null)
			return createErr("Mandatory input is missing");
	
		Date result = new SimpleDateFormat(format).parse(strValue, new ParsePosition(0));
		if (result == null)
			return createErr("Failed to parse date: %s of format: %s", strValue, format);
		context.getOutput().write(result.getTime());
		return Status.OK_STATUS;
	}
}
