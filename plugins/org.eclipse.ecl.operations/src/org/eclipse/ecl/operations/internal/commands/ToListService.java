package org.eclipse.ecl.operations.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.EclList;
import org.eclipse.ecl.runtime.BoxedValues;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class ToListService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		EclList result = CoreFactory.eINSTANCE.createEclList();
		for (Object object : CoreUtils.readPipeContent(context.getInput())) {
			result.getElements().add(BoxedValues.box(object));
		}
		context.getOutput().write(result);
		return Status.OK_STATUS;
	}

}
