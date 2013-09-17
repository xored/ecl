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
	private Variable arg;
	private IVariable[] children;
	private boolean resolved = false;

	public EclValue(EclDebugThread thread, Variable arg) {
		this.thread = thread;
		setVariable(arg);
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
		else {
			return arg.getType();
		}
	}

	public boolean isAllocated() throws DebugException {
		return true;
	}

	public IVariable[] getVariables() throws DebugException {
		resolve();
		return children;
	}

	public boolean hasVariables() throws DebugException {
		resolve();
		return !arg.getChildren().isEmpty();
	}

	private void resolve() {
		if (!resolved) {
			resolved = true;
			if (arg.isComplex()) {
				((EclDebugTarget) getDebugTarget()).resolveVariable(arg, this);
			}
		}
	}

	public void setVariable(Variable var) {
		this.arg = var;
		EList<Variable> list = arg.getChildren();
		children = new IVariable[list.size()];
		for (int i = 0; i < list.size(); i++) {
			children[i] = new EclVariable(thread, list.get(i));
		}
	}

}
