package org.eclipse.ecl.operations.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.BoxedValue;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.EclDouble;
import org.eclipse.ecl.core.EclFloat;
import org.eclipse.ecl.core.EclInteger;
import org.eclipse.ecl.core.EclLong;
import org.eclipse.ecl.operations.Eq;
import org.eclipse.ecl.runtime.BoxedValues;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EqService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof Eq)) {
			return Status.CANCEL_STATUS;
		}
		Eq eq = (Eq) command;
		boolean result = EcoreUtil.equals(eq.getLeft(), eq.getRight());
		if (!result) {
			result = compareAsNumbers(eq.getLeft(), eq.getRight());
		}
		context.getOutput().write(result);
		context.getOutput().close(Status.OK_STATUS);
		return Status.OK_STATUS;
	}

	private boolean compareAsNumbers(EObject left, EObject right) {
		try {
			BoxedValue leftNumber = BinaryOpService.convertToNumber(left);
			BoxedValue rightNumber = BinaryOpService.convertToNumber(right);
			EClass widest = BinaryOpService.max(leftNumber.eClass(), rightNumber.eClass());
			leftNumber = BoxedValues.toType(leftNumber, widest);
			rightNumber = BoxedValues.toType(rightNumber, widest);

			if (leftNumber instanceof EclInteger) {
				return ((EclInteger) leftNumber).getValue() == ((EclInteger) rightNumber).getValue();
			}
			if (leftNumber instanceof EclLong) {
				return ((EclLong) leftNumber).getValue() == ((EclLong) rightNumber).getValue();
			}
			if (leftNumber instanceof EclFloat) {
				return ((EclFloat) leftNumber).getValue() == ((EclFloat) rightNumber).getValue();
			}
			if (leftNumber instanceof EclDouble) {
				return ((EclDouble) leftNumber).getValue() == ((EclDouble) rightNumber).getValue();
			}
			return false;
		} catch (CoreException e) {
			return false;
		}
	}

}
