package org.eclipse.ecl.internal.core;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class ProcErrorStatus extends Status {
	final private IStatus status;
	
	public ProcErrorStatus(IStatus status) {
		super(status.getSeverity(), status.getPlugin(), status.getMessage());
		this.status = status;
	}
	
	public IStatus getStatus(){
		return status;
	}
}
