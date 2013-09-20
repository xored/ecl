package org.eclipse.ecl.interop.internal.commands;

import static org.eclipse.ecl.interop.internal.EclInteropPlugin.error;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.interop.Get;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class GetService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {

		Get get = (Get) command;
		String propName = get.getPropertyName();
		if (propName == null || propName.length() == 0)
			return error("Property name is not specified.");

		Object object = get.getObject();
		if (object == null)
			return error("The object is null, it is imposible to get anything from it.");
		else if (object instanceof EObject)
			return getFromEmfObject((EObject) object, propName, context);
		else
			return error("Unsupported object type.");
	}

	@SuppressWarnings("rawtypes")
	private IStatus getFromEmfObject(EObject object, String propName,
			IProcess context) throws CoreException {
		EStructuralFeature feature = object.eClass().getEStructuralFeature(
				propName);
		if (feature == null)
			return error("No such property \"%s\".", propName);
		Object result = object.eGet(feature);
		if (result instanceof List) {
			for (Object item : (List) result) {
				context.getOutput().write(item);
			}
		} else {
			context.getOutput().write(result);
		}
		return Status.OK_STATUS;
	}

}
