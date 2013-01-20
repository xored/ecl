package org.eclipse.ecl.operations.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.operations.Emit;
import org.eclipse.ecl.runtime.BoxedValues;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EmitService implements ICommandService {
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof Emit)) {
			return Status.CANCEL_STATUS;
		}
		for (Object value : CoreUtils.readPipeContent(context.getInput())) {
			context.getOutput().write(EcoreUtil.copy(BoxedValues.box(value)));
		}
		for (Object value : ((Emit) command).getValues()) {
			context.getOutput().write(EcoreUtil.copy(BoxedValues.box(value)));
		}
		return Status.OK_STATUS;
	}

}
