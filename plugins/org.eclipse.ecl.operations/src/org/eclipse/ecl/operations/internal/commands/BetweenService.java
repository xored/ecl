package org.eclipse.ecl.operations.internal.commands;

import static org.eclipse.ecl.operations.internal.OperationsPlugin.createErr;
import static org.eclipse.ecl.operations.internal.commands.BinaryOpService.convertToNumber;
import static org.eclipse.ecl.operations.internal.commands.BinaryOpService.max;
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
import org.eclipse.ecl.operations.Between;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.EClass;

public class BetweenService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		if (!(command instanceof Between)) {
			return Status.CANCEL_STATUS;
		}

		Between bw = (Between) command;
		BoxedValue input = convertToNumber(bw.getInput());
		BoxedValue from = convertToNumber(bw.getInput());
		BoxedValue to = convertToNumber(bw.getInput());

		EClass widestType = max(input.eClass(), from.eClass(), to.eClass());
		input = toType(input, widestType);
		from = toType(from, widestType);
		to = toType(to, widestType);

		context.getOutput().write(isBetween(input, from, to));
		return Status.OK_STATUS;
	}

	private static boolean isBetween(BoxedValue input, BoxedValue from, BoxedValue to) throws CoreException {
		if (input instanceof EclInteger) {
			int i = ((EclInteger) input).getValue();
			int f = ((EclInteger) from).getValue();
			int t = ((EclInteger) to).getValue();
			return i <= t && i >= f;
		}

		if (input instanceof EclLong) {
			long i = ((EclLong) input).getValue();
			long f = ((EclLong) from).getValue();
			long t = ((EclLong) to).getValue();
			return i <= t && i >= f;
		}

		if (input instanceof EclFloat) {
			float i = ((EclFloat) input).getValue();
			float f = ((EclFloat) from).getValue();
			float t = ((EclFloat) to).getValue();
			return i <= t && i >= f;
		}

		if (input instanceof EclDouble) {
			double i = ((EclDouble) input).getValue();
			double f = ((EclLong) from).getValue();
			double t = ((EclLong) to).getValue();
			return i <= t && i >= f;
		}

		throw new CoreException(createErr("Unexpected argument type: %s", input.eClass().getName()));

	}

}
