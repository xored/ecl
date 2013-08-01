package org.eclipse.ecl.internal.core;

import static org.eclipse.ecl.internal.core.ProcService.getProcs;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.Declaration;
import org.eclipse.ecl.core.Proc;
import org.eclipse.ecl.core.RestoreState;
import org.eclipse.ecl.core.SessionState;
import org.eclipse.ecl.core.Val;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class RestoreStateService implements ICommandService {
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof RestoreState)) {
			return Status.CANCEL_STATUS;
		}

		SessionState state = ((RestoreState) command).getState();

		LocalProcManager procs = getProcs(context);
		DeclarationContainer globals = GlobalService.getGlobals(context);

		for (Proc proc : state.getProcs()) {
			procs.declare(proc);
		}
		for (Declaration decl : state.getDecls()) {
			if (!(decl instanceof Val)) {
				continue; // TODO pipes support
			}
			globals.declare(((Val) decl).getName(), decl);
		}
		return Status.OK_STATUS;
	}

}
