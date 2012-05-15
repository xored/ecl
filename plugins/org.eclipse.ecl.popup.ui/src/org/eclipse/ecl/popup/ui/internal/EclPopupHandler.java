package org.eclipse.ecl.popup.ui.internal;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.jface.dialogs.PopupDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public class EclPopupHandler extends AbstractHandler {

	private IWorkbenchWindow window;

	public Object execute(ExecutionEvent executionEvent) {

		window = HandlerUtil.getActiveWorkbenchWindow(executionEvent);
		if (window == null) {
			return null;
		}

		final PopupDialog popupDialog = new EclPopupDialog(window);
		popupDialog.open();
		return null;
	}
}