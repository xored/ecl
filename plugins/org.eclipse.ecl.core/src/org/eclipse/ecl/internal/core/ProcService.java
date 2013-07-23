package org.eclipse.ecl.internal.core;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.Proc;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class ProcService implements ICommandService {
	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof Proc)) {
			return Status.CANCEL_STATUS;
		}

		getProcs(context).declare((Proc) command);

		return Status.OK_STATUS;
	}

	public static LocalProcManager getProcs(IProcess process) {
		ISession session = process.getSession();
		if (!(session instanceof AbstractSession)) {
			return null;
		}

		return ((AbstractSession) session).getRoot().getProcManager();
	}

}
