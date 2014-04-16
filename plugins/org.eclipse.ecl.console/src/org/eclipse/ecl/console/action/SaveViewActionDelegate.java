package org.eclipse.ecl.console.action;

import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.ecl.console.Console;
import org.eclipse.ecl.console.view.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

public class SaveViewActionDelegate implements IViewActionDelegate {

	private IViewPart view;

	@Override
	public void run(IAction action) {
		FileDialog dialog = new FileDialog(view.getSite().getShell(), SWT.SAVE);
		String filePath = dialog.open();
		if (filePath == null) {
			return;
		}

		Console console = Console.getInstance();
		String content = ((View) view).getContent(console);
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(filePath);
			out.write(content.getBytes());
		} catch (Exception ex) {
			Console.getInstance().printException(ex);
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException exIgnore) {
				}
			}
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
	}

	@Override
	public void init(IViewPart view) {
		this.view = view;
	}
}
