package org.eclipse.ecl.internal.swt;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.swt.FindControls;
import org.eclipse.ecl.swt.GetCheckbox;
import org.eclipse.ecl.swt.SwtFactory;

public class GetCheckboxService extends AbstractSWTService {

	public IStatus doService(final Command command, final IProcess context)
			throws Exception {
		GetCheckbox gcb = (GetCheckbox) command;
		FindControls fc = SwtFactory.eINSTANCE.createFindControls();
		fc.setType("CheckBox");
		fc.setText(gcb.getText());
		fc.setIndex(0);
		return new FindControlsService().doService(fc, context);
	}
}
