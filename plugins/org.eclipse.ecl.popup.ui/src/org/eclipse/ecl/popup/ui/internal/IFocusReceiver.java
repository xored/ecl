package org.eclipse.ecl.popup.ui.internal;

public interface IFocusReceiver {
	/**
	 * When the control left by up arrow
	 */
	void receiveTopFocus();
	
	/**
	 * When the control left by down arrow
	 */
	void receiveBottomFocus();
}
