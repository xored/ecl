package org.eclipse.ecl.internal.core;

import static org.eclipse.ecl.internal.core.CorePlugin.err;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.Declaration;
import org.eclipse.ecl.core.Global;
import org.eclipse.ecl.core.Val;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class GlobalService implements ICommandService {
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof Global)) {
			return Status.CANCEL_STATUS;
		}

		Global global = (Global) command;

		DeclarationContainer globals = getGlobals(context);
		for (Declaration decl : global.getVals()) {
			if (!(decl instanceof Val)) {
				continue; // TODO: pipes support
			}
			Val val = (Val) decl;
			if (val.isInput()) {
				throw new CoreException(
						err("Cannot initialize global value from input"));
			}

			if (val.getValue() == null) {
				throw new CoreException(
						err("Cannot declare uninitialized global value"));
			}

			globals.declare(val.getName(), val, global.isOverride());
		}
		return Status.OK_STATUS;
	}

	protected static DeclarationContainer getGlobals(IProcess context) {
		ISession session = context.getSession();
		if (!(session instanceof AbstractSession)) {
			return null;
		}

		return ((AbstractSession) session).getRoot().getGlobals();
	}

}
