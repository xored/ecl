package org.eclipse.ecl.interop.internal.commands;

import static org.eclipse.ecl.interop.internal.EclInteropPlugin.error;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.interop.GetJavaProperty;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class GetJavaPropertyService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		GetJavaProperty cmd = (GetJavaProperty) command;
		
		String key = cmd.getKey();
		String value = System.getProperty(key);
		
		if (value == null)
			value = cmd.getDefault();

		if (value == null)
			return error("There is no Java property with key \"%s\" and default value is not specified.", key);

		context.getOutput().write(value);
		return Status.OK_STATUS;
	}

}
