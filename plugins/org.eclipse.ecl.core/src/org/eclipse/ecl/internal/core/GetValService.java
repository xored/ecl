package org.eclipse.ecl.internal.core;

import static java.lang.String.format;
import static org.eclipse.ecl.internal.core.CorePlugin.err;
import static org.eclipse.ecl.internal.core.LetService.getStack;
import static org.eclipse.emf.ecore.util.EcoreUtil.copy;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.Declaration;
import org.eclipse.ecl.core.GetVal;
import org.eclipse.ecl.core.Val;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class GetValService implements ICommandService {
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof GetVal)) {
			return Status.CANCEL_STATUS;
		}

		String name = ((GetVal) command).getName();
		Declaration declaration = getStack(context).lookup(name);

		if (!(declaration instanceof Val)) {
			throw new CoreException(err(format("Undeclared val '%s'", name)));
		}

		context.getOutput().write(copy(((Val) declaration).getValue()));

		return Status.OK_STATUS;
	}

}
