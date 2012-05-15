package org.eclipse.ecl.popup.ui.internal;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

class DialogRow extends Composite implements IFocusReceiver {

	public DialogRow(Composite parent, String title) {
		super(parent, SWT.NONE);
		GridLayoutFactory.swtDefaults().numColumns(2).equalWidth(false)
				.applyTo(this);
		Label titleLabel = new Label(this, SWT.NONE);
		titleLabel.setText(title);
		GridDataFactory.swtDefaults().grab(false, false)
				.align(SWT.BEGINNING, SWT.BEGINNING).applyTo(titleLabel);
		titleLabel.setFont(JFaceResources.getFontRegistry().getBold(
				JFaceResources.TEXT_FONT));
		createContent();
	}
	
	protected IFocusReceiver focusReceiver;
	public void setFocusReceiver(IFocusReceiver focusReceiver) {
		this.focusReceiver = focusReceiver;
	}

	private boolean hidden = false;
	public boolean isHidden() {
		return hidden;
	}
	public void hide() {
		GridDataFactory.swtDefaults().hint(0, 0).applyTo(this);
		hidden = true;
	}

	public void show() {
		GridDataFactory.swtDefaults().grab(true, false)
				.align(SWT.FILL, SWT.FILL).applyTo(this);
		hidden = false;
	}
	
	protected void createContent() {
		Label result = new Label(this, SWT.NONE);
		result.setText("content goes here");
	}
	@Override
	public void receiveTopFocus() {
	}
	@Override
	public void receiveBottomFocus() {
	}
}