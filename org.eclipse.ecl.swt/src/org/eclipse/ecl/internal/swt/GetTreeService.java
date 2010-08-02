package org.eclipse.ecl.internal.swt;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.swt.FindControls;
import org.eclipse.ecl.swt.SwtFactory;

public class GetTreeService extends AbstractSWTService {

	public IStatus doService(final Command command, final IProcess context)
			throws Exception {
		FindControls fc = SwtFactory.eINSTANCE.createFindControls();
		fc.setType("Tree");
		fc.setIndex(0);
		return new FindControlsService().doService(fc, context);
	}
}
