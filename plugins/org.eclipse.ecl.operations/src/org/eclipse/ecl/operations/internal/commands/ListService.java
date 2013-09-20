package org.eclipse.ecl.operations.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.EclList;
import org.eclipse.ecl.operations.List;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class ListService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		List list = (List) command;
		EclList result = CoreFactory.eINSTANCE.createEclList();
		for (EObject item : list.getItems()) {
			result.getElements().add(EcoreUtil.copy(item));
		}
		context.getOutput().write(result);
		return Status.OK_STATUS;
	}

}
