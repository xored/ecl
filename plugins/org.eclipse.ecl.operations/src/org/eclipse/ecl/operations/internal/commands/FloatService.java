package org.eclipse.ecl.operations.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.core.BoxedValue;
import org.eclipse.ecl.core.EclString;
import org.eclipse.ecl.runtime.BoxedValues;

public class FloatService extends ConvertService {

	@Override
	Object doConvert(BoxedValue input) throws CoreException {
		if (input instanceof EclString) {
			String value = ((EclString) input).getValue();
			if (value.equals("inf") || value.equals("+inf")) {
				return Float.POSITIVE_INFINITY;
			}
			if (value.equals("-inf")) {
				return Float.NEGATIVE_INFINITY;
			}
		}
		return BoxedValues.toFloat(input);
	}

}
