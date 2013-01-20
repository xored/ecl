package org.eclipse.ecl.operations.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.BoxedValue;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.operations.Convert;
import org.eclipse.ecl.operations.internal.OperationsPlugin;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.EObject;

public abstract class ConvertService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof Convert)) {
			return Status.CANCEL_STATUS;
		}
		EObject input = ((Convert) command).getInput();
		if (!(input instanceof BoxedValue)) {
			return new Status(IStatus.ERROR, OperationsPlugin.PLUGIN_ID,
					String.format("Cannot convert value of type '%s'", input
							.eClass().getInstanceTypeName()));
		}
		context.getOutput().write(doConvert((BoxedValue) input));
		return Status.OK_STATUS;
	}

	abstract Object doConvert(BoxedValue input) throws CoreException;

}
