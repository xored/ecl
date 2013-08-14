package org.eclipse.ecl.operations.internal.commands;

import static java.lang.Math.abs;
import static org.eclipse.ecl.operations.internal.commands.BinaryOpService.convertToNumber;
import static org.eclipse.ecl.operations.internal.commands.BinaryOpService.max;
import static org.eclipse.ecl.runtime.BoxedValues.box;
import static org.eclipse.ecl.runtime.BoxedValues.toType;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.BoxedValue;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.EclDouble;
import org.eclipse.ecl.core.EclFloat;
import org.eclipse.ecl.core.EclInteger;
import org.eclipse.ecl.core.EclLong;
import org.eclipse.ecl.operations.Abs;
import org.eclipse.ecl.operations.internal.OperationsPlugin;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class AbsService implements ICommandService {

	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		if (!(command instanceof Abs)) {
			return Status.CANCEL_STATUS;
		}

		BoxedValue arg = convertToNumber(((Abs) command).getArg());
		arg = toType(arg, max(arg.eClass()));
		context.getOutput().write(calcAbs(arg));
		return Status.OK_STATUS;
	}

	private static BoxedValue calcAbs(BoxedValue value) throws CoreException {
		if (value instanceof EclInteger) {
			return box(abs(((EclInteger) value).getValue()));
		}

		if (value instanceof EclLong) {
			return box(abs(((EclLong) value).getValue()));
		}

		if (value instanceof EclDouble) {
			return box(abs(((EclDouble) value).getValue()));
		}

		if (value instanceof EclFloat) {
			return box(abs(((EclFloat) value).getValue()));
		}

		throw new CoreException(OperationsPlugin.createErr("Unexpected arg type: %s", value.eClass().getName()));
	}

}
