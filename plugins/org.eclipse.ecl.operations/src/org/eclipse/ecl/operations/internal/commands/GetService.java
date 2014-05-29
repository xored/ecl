package org.eclipse.ecl.operations.internal.commands;

import static org.eclipse.ecl.operations.internal.OperationsPlugin.createErr;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.Get;
import org.eclipse.ecl.dispatch.ServiceDispatchingUtils;
import org.eclipse.ecl.runtime.BoxedValues;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class GetService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		IStatus result = ServiceDispatchingUtils.handleWithExtensions(command, context);
		return result != null ? result : defaultService(command, context);
	}

	private IStatus defaultService(Command command, IProcess context) throws InterruptedException, CoreException {
		Get get = (Get) command;
		EObject input = get.getInput();
		Object propertyObject = BoxedValues.unbox(get.getKey());
		if (!(propertyObject instanceof String)) {
			return createErr("Key must be string when getting member value from EObject");
		}
		String name = (String) propertyObject;
		if (input == null) {
			return createErr("No input");
		}
		EStructuralFeature feature = input.eClass().getEStructuralFeature(name);
		if (feature == null) {
			return createErr("Input object of type %s does not have member %s", input.eClass().getName(), name);
		}

		Object result = input.eGet(feature);
		if (result == null) {
			if (get.getDefault() != null) {
				result = get.getDefault();
			} else {
				return createErr("%s has null value and default argument is not set", name);
			}

		}
		if (result instanceof List<?>) {
			for (Object item : (List<?>) result) {
				context.getOutput().write(item);
			}
		} else if (result instanceof Enum<?>) {
			context.getOutput().write(((Enum<?>) result).name());
		} else {
			context.getOutput().write(result);
		}

		return Status.OK_STATUS;
	}

}
