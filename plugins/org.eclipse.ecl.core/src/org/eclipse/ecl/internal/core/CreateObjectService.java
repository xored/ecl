package org.eclipse.ecl.internal.core;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CreateObject;
import org.eclipse.ecl.core.Import;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class CreateObjectService implements ICommandService {
	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		CreateObject co = (CreateObject) command;
		Import imp = co.getType();
		EClass toCreate = LocalProcManager.resolveImport(imp);
		EObject result = toCreate.getEPackage().getEFactoryInstance().create(toCreate);

		for (EStructuralFeature feature : toCreate.getEAllStructuralFeatures()) {
			Object value = co.eGet(co.eClass().getEStructuralFeature(feature.getName()));
			try {
				result.eSet(feature, value);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		context.getOutput().write(result);
		return Status.OK_STATUS;
	}

}
