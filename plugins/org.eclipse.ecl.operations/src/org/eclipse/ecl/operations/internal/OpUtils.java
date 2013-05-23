package org.eclipse.ecl.operations.internal;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.EclBoolean;
import org.eclipse.emf.ecore.EObject;

public class OpUtils {

	public static boolean asBoolean(EObject o) throws CoreException {
		if (o instanceof EclBoolean)
			return ((EclBoolean) o).isValue();
		else
			throw new CoreException(new Status(IStatus.ERROR,
					OperationsPlugin.PLUGIN_ID,
					"Expected Boolean argument but got " + o.getClass()));
	}
}
