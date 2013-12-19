package org.eclipse.ecl.operations.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.operations.Recur;
import org.eclipse.ecl.runtime.ExecutionFlowStatus;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.EObject;

public class RecurService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		Recur recur = (Recur) command;
		throw new CoreException(new RecurStatus(recur.getValues().toArray(new EObject[0])));
	}

	public static class RecurStatus extends ExecutionFlowStatus {
		public RecurStatus(EObject[] vals) {
			super(vals);
		}

		public EObject[] getVals() {
			return (EObject[]) value;
		}
	}

}
