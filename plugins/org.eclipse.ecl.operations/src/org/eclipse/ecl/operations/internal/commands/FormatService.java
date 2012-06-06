package org.eclipse.ecl.operations.internal.commands;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.operations.Format;
import org.eclipse.ecl.operations.internal.OperationsPlugin;
import org.eclipse.ecl.runtime.BoxedValues;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.EObject;

public class FormatService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		Format format = (Format) command;
		List<Object> args = new ArrayList<Object>();
		for (EObject arg : format.getArgs()) {
			args.add(BoxedValues.unbox(arg));
		}
		try {
			String result = String.format(format.getFormat(), args.toArray());
			context.getOutput().write(result);
		} catch (Exception e) {
			return new Status(
					IStatus.ERROR,
					OperationsPlugin.PLUGIN_ID,
					String.format("Error formatting string: %s", e.getMessage()),
					e);
		}
		return Status.OK_STATUS;
	}

}
