package org.eclipse.ecl.internal.debug.core;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;
import org.eclipse.ecl.debug.runtime.StackFrame.Arg;

public class EclValue extends EclDebugElement implements IValue {

	private final EclDebugThread thread;
	private final Arg arg;

	public EclValue(EclDebugThread thread, Arg arg) {
		this.thread = thread;
		this.arg = arg;
	}

	public IDebugTarget getDebugTarget() {
		return thread.getDebugTarget();
	}

	public String getReferenceTypeName() throws DebugException {
		return arg.getActualType();
	}

	public String getValueString() throws DebugException {
		return arg.getValue();
	}

	public boolean isAllocated() throws DebugException {
		return arg.isSet();
	}

	private static final IVariable[] EMPTY_VARIABLES = new IVariable[0];

	public IVariable[] getVariables() throws DebugException {
		return EMPTY_VARIABLES;
	}

	public boolean hasVariables() throws DebugException {
		return false;
	}

}
