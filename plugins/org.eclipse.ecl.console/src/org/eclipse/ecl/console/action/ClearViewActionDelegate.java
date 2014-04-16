package org.eclipse.ecl.console.action;

import org.eclipse.ecl.console.Console;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

public class ClearViewActionDelegate implements IViewActionDelegate {
	@Override
	public void run(IAction action) {
		Console.getInstance().clear();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
	}

	@Override
	public void init(IViewPart view) {
	}
}
