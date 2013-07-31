package org.eclipse.ecl.internal.core;

import static org.eclipse.ecl.internal.core.GlobalService.getGlobals;
import static org.eclipse.ecl.internal.core.ProcService.getProcs;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.Declaration;
import org.eclipse.ecl.core.Proc;
import org.eclipse.ecl.core.SessionState;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class SaveStateService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		LocalProcManager procs = getProcs(context);
		DeclarationContainer globals = getGlobals(context);

		SessionState state = CoreFactory.eINSTANCE.createSessionState();
		for (Proc proc : procs.declarations()) {
			state.getProcs().add(EcoreUtil.copy(proc));
		}

		for (Declaration decl : globals.declarations()) {
			state.getDecls().add(decl);
		}

		context.getOutput().write(state);
		return Status.OK_STATUS;
	}

}
