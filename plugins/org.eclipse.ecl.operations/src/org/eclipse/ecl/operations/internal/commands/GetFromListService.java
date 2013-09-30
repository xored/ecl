package org.eclipse.ecl.operations.internal.commands;

import static org.eclipse.ecl.operations.internal.OperationsPlugin.createErr;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.EclList;
import org.eclipse.ecl.core.Get;
import org.eclipse.ecl.dispatch.IScriptletExtension;
import org.eclipse.ecl.runtime.BoxedValues;
import org.eclipse.ecl.runtime.IProcess;

public class GetFromListService implements IScriptletExtension {

	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		Get get = (Get) command;
		EclList list = (EclList) get.getInput();
		Object indexObject = BoxedValues.unbox(get.getKey());
		if (!(indexObject instanceof Integer)) {
			return createErr("Invalid key: %s. Only integers can be used to get values from lists", indexObject);
		}

		int index = (Integer) indexObject;
		if (index < 0 || index >= list.getElements().size()) {
			if (get.getDefault() == null) {
				return createErr("Index %d is out of bounds and no default value given", index);
			}

			context.getOutput().write(get.getDefault());
			return Status.OK_STATUS;
		}

		context.getOutput().write(list.getElements().get(index));
		return Status.OK_STATUS;
	}

	@Override
	public boolean canHandle(Command c) {
		return c instanceof Get && ((Get) c).getInput() instanceof EclList;
	}

}
