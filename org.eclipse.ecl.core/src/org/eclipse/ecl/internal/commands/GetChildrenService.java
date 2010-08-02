package org.eclipse.ecl.internal.commands;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.GetChildren;
import org.eclipse.ecl.core.model.Any;
import org.eclipse.ecl.core.model.IModel;
import org.eclipse.ecl.internal.core.ModelManager;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class GetChildrenService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		GetChildren gc = (GetChildren)command;
		Any input = gc.getObject();
		IModel model = ModelManager.getModel(input.getModel());
		List<Any> children = model.getChildren(input);
		
		return null;
	}

}
