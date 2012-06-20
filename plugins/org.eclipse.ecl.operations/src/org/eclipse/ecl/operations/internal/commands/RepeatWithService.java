package org.eclipse.ecl.operations.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.EclString;
import org.eclipse.ecl.operations.RepeatWith;
import org.eclipse.ecl.operations.internal.OperationsPlugin;
import org.eclipse.ecl.parser.EclCoreParser;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class RepeatWithService implements ICommandService {
	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof RepeatWith)) {
			return Status.CANCEL_STATUS;
		}

		RepeatWith repeatWith = (RepeatWith) command;
		Command todo = repeatWith.getCommand();
		ISession session = context.getSession();
		for (Object cmd : repeatWith.getCommands()) {
			Command prefix = getCommand(cmd);
			IPipe pipe = session.createPipe();
			IStatus status = session.execute(prefix, null, pipe).waitFor();
			if (!status.isOK()) {
				return status;
			}
			IPipe output = session.createPipe();
			status = session.execute(todo, pipe, output).waitFor();
			if (!status.isOK()) {
				return status;
			}
			for (Object obj : CoreUtils.readPipeContent(output)) {
				context.getOutput().write(obj);
			}
		}
		return Status.OK_STATUS;
	}

	private static Command getCommand(Object cmd) throws CoreException {
		if (cmd instanceof Command) {
			return (Command) cmd;
		}
		if (cmd instanceof EclString) {
			return EclCoreParser.newCommand(((EclString) cmd).getValue());
		}

		throw new CoreException(new Status(IStatus.ERROR,
				OperationsPlugin.PLUGIN_ID, String.format(
						"Cannot convert value of type %s to command", cmd
								.getClass().getName())));
	}
}
