package org.eclipse.ecl.console.factories;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;
import org.xhtmlrenderer.simple.xhtml.FormControl;
import org.xhtmlrenderer.simple.xhtml.swt.SWTFormControl;

public class ConsoleSWTFormControl implements SWTFormControl {

	protected Control swtControl;

	public ConsoleSWTFormControl(Control swtControl) {
		this.swtControl = swtControl;
	}

	@Override
	public void dispose() {
		swtControl.dispose();
	}

	@Override
	public FormControl getFormControl() {
		return null;
	}

	@Override
	public int getIdealHeight() {
		return swtControl.computeSize(SWT.DEFAULT, SWT.DEFAULT).y;
	}

	@Override
	public int getIdealWidth() {
		// TODO: Gag
		return swtControl.getParent().getBounds().width - 45;
	}

	@Override
	public Control getSWTControl() {
		return swtControl;
	}
}
