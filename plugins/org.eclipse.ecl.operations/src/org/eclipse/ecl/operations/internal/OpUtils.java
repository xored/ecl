package org.eclipse.ecl.operations.internal;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.BoxedValue;
import org.eclipse.ecl.runtime.BoxedValues;
import org.eclipse.emf.ecore.EObject;

public class OpUtils {

	public static boolean asBoolean(EObject o) throws CoreException {
		try {
			return BoxedValues.toBoolean((BoxedValue) o);
		} catch (Exception e) {
			throw new CoreException(new Status(IStatus.ERROR,
					OperationsPlugin.PLUGIN_ID,
					"Expected Boolean-convertible argument but got "
							+ o.getClass()));
		}
	}
}
