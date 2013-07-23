package org.eclipse.ecl.internal.core;

import static org.eclipse.ecl.internal.core.LetService.getStack;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CommandStack;
import org.eclipse.ecl.core.Declaration;
import org.eclipse.ecl.core.ProcInstance;
import org.eclipse.ecl.core.Val;
import org.eclipse.ecl.runtime.BoxedValues;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class ProcInstanceService implements ICommandService {
	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof ProcInstance)) {
			return Status.CANCEL_STATUS;
		}

		ProcInstance instance = (ProcInstance) command;
		CommandStack stack = getStack(context);

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
			stack.declare(val.getName(), val);
		}

		return context
				.getSession()
				.execute(instance.getDefinition().getBody(),
						inputUsed ? null : context.getInput(),
						context.getOutput()).waitFor();
	}

}
