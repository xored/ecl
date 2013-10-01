package org.eclipse.ecl.operations.internal.commands;

import static org.eclipse.ecl.operations.internal.OperationsPlugin.PLUGIN_ID;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.operations.Recur;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.EObject;

public class RecurService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		Recur recur = (Recur) command;
		throw new CoreException(new RecurStatus(recur.getValues().toArray(new EObject[0])));
	}

	public static class RecurStatus implements IStatus {
		public final EObject[] vals;

		public RecurStatus(EObject[] vals) {
			this.vals = vals;
		}

		@Override
		public IStatus[] getChildren() {
			return new IStatus[0];
		}

		@Override
		public int getCode() {
			return 0;
		}

		@Override
		public Throwable getException() {
			return null;
		}

		@Override
		public String getMessage() {
			return null;
		}

		@Override
		public String getPlugin() {
			return PLUGIN_ID;
		}

		@Override
		public int getSeverity() {
			return OK;
		}

		@Override
		public boolean isMultiStatus() {
			return false;
		}

		@Override
		public boolean isOK() {
			return true;
		}

		@Override
		public boolean matches(int severityMask) {
			return (OK & severityMask) != 0;
		}

	}

}
