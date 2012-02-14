package org.eclipse.ecl.operations.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.core.BoxedValue;
import org.eclipse.ecl.runtime.BoxedValues;

public class IntService extends ConvertService {

	@Override
	Object doConvert(BoxedValue input) throws CoreException {
		return BoxedValues.toInteger(input);
	}
	
}
