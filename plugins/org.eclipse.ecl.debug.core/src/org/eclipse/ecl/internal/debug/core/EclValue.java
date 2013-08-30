package org.eclipse.ecl.internal.debug.core;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;
import org.eclipse.ecl.debug.model.Variable;
import org.eclipse.ecl.runtime.BoxedValues;
import org.eclipse.emf.common.util.EList;

public class EclValue extends EclDebugElement implements IValue {

	private final EclDebugThread thread;
	private final Variable arg;
	private final IVariable[] children;

	public EclValue(EclDebugThread thread, Variable arg) {
		this.thread = thread;
		this.arg = arg;
		EList<Variable> list = arg.getChildren();
		children = new IVariable[list.size()];
		for (int i = 0; i < list.size(); i++) {
			children[i] = new EclVariable(thread, list.get(i));
		}
	}

	public IDebugTarget getDebugTarget() {
		return thread.getDebugTarget();
	}

	public String getReferenceTypeName() throws DebugException {
		return arg.getType();
	}

	public String getValueString() throws DebugException {
		Object object = BoxedValues.unbox(arg.getValue());
		if (object != null) {
			return object.toString();
		}
		return "";
	}

	public boolean isAllocated() throws DebugException {
		return true;
	}

	public IVariable[] getVariables() throws DebugException {
		return children;
	}

	public boolean hasVariables() throws DebugException {
		return !arg.getChildren().isEmpty();
	}

}
