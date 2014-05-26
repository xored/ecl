package org.eclipse.ecl.runtime;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;

/**Handles a single command of a given type */
public abstract class SingleCommandService<T extends Command> implements ICommandService {
	private final Class<T> clazz;
	/**
	 * @param clazz - type of the command to be supported by this service
	 */
	protected SingleCommandService(Class<T> clazz) {
		this.clazz = clazz;
	}

	/**
	 * Actual implementation of command execution.
	 * @param command - a command to execute
	 * @return output, {@link java.lang.Iterable} to output one by one or a single output object 
	 */
	protected abstract Object serviceTyped(T command) throws InterruptedException, CoreException;

	@Override
	public final IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		T typedCommand = clazz.cast(command);
		
		Object rv = serviceTyped(typedCommand);
		
		IPipe output = context.getOutput();
		if (rv instanceof Iterable) {
			for (Object item: (Iterable<?>)rv) {
				output.write(item);
			}
		} else if (rv != null) {
			output.write(rv);
		}
		return Status.OK_STATUS;
	}


}
