package org.eclipse.ecl.internal.core;

import static org.eclipse.ecl.internal.core.LetService.getLocals;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.Declaration;
import org.eclipse.ecl.core.ProcInstance;
import org.eclipse.ecl.core.Val;
import org.eclipse.ecl.internal.core.ReturnService.ReturnStatus;
import org.eclipse.ecl.runtime.BoxedValues;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class ProcInstanceService implements ICommandService {
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof ProcInstance)) {
			return Status.CANCEL_STATUS;
		}

		ProcInstance instance = (ProcInstance) command;
		DeclarationContainer locals = getLocals(context);

		boolean inputUsed = false;
		for (Declaration decl : instance.getDefinition().getVals()) {
			if (!(decl instanceof Val)) {
				continue; // TODO: pipe support
			}

			Val val = EcoreUtil.copy((Val) decl);
			val.setValue(BoxedValues.box(instance.eGet(instance.eClass()
					.getEStructuralFeature(val.getName()))));
			if (val.isInput()) {
				inputUsed = true;
			}
			locals.declare(val.getName(), val);
		}

		IPipe out = context.getSession().createPipe();
		IStatus s = context
				.getSession()
				.execute(instance.getDefinition().getBody(),
						inputUsed ? null : context.getInput(),
						out).waitFor();

		if (s instanceof ReturnStatus) {
			context.getOutput().write(((ReturnStatus) s).getValue());
			return Status.OK_STATUS;
		}

		for (Object object : CoreUtils.readPipeContent(out)) {
			context.getOutput().write(object);
		}
		return s.isOK() ? Status.OK_STATUS : new ProcErrorStatus(s);
	}

}
