package org.eclipse.ecl.internal.core;

import static org.eclipse.ecl.runtime.BoxedValues.box;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.Declaration;
import org.eclipse.ecl.core.Let;
import org.eclipse.ecl.core.Val;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class LetService implements ICommandService {
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof Let)) {
			return Status.CANCEL_STATUS;
		}

		Let let = (Let) command;
		DeclarationContainer locals = getLocals(context);

		boolean inputUsed = false;
		for (Declaration decl : let.getVals()) {
			if (!(decl instanceof Val)) {
				continue; // TODO other declarations support
			}
			Val val = (Val) decl;
			if (val.isInput()) {
				inputUsed = true;
				val.setValue(box(context.getInput().take(Long.MAX_VALUE)));
			}

			locals.declare(val.getName(), val);
		}

		return context
				.getSession()
				.execute(let.getBody(), inputUsed ? null : context.getInput(),
						context.getOutput()).waitFor();
	}

	protected static DeclarationContainer getLocals(IProcess context) {
		ISession session = context.getSession();
		if (!(session instanceof CommandSession)) {
			return null;
		}

		return ((CommandSession) session).getStack().getDeclarations();
	}
}
