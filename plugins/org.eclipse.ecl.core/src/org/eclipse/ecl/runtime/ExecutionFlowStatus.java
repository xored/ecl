package org.eclipse.ecl.runtime;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.internal.core.CorePlugin;

public class ExecutionFlowStatus implements IStatus {
	public static final int CODE = 0x7137; // 'q7' in ascii
	protected final Object value;

	public ExecutionFlowStatus(Object value) {
		this.value = value;
	}

	@Override
	public IStatus[] getChildren() {
		return new IStatus[0];
	}

	@Override
	public int getCode() {
		return CODE;
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
		return CorePlugin.PLUGIN_ID;
	}

	@Override
	public int getSeverity() {
		return IStatus.CANCEL;
	}

	@Override
	public boolean isMultiStatus() {
		return false;
	}

	@Override
	public boolean isOK() {
		return false;
	}

	@Override
	public boolean matches(int severityMask) {
		return (getSeverity() & severityMask) != 0;
	}
}