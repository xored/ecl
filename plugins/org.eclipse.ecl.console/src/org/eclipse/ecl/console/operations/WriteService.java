package org.eclipse.ecl.console.operations;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.console.Console;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class WriteService implements ICommandService {

	@Override
	public IStatus service(final Command command, final IProcess context) throws InterruptedException, CoreException {
		final StringBuilder builder = new StringBuilder();
		final List<Object> objects = CoreUtils.readPipeContent(context.getInput());
		
		for (final Object object : objects) {
			builder.append(object).append("\n");
		}
		
		if (!builder.toString().startsWith("|\n")) {
			Console.getInstance().write(builder.toString());
		}
		
		return Status.OK_STATUS;
	}
	
}
