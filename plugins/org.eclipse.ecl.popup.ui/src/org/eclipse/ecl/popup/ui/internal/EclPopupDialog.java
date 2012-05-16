package org.eclipse.ecl.popup.ui.internal;

import org.eclipse.ecl.popup.EclPopupPlugin;
import org.eclipse.ecl.popup.EclPopupSession;
import org.eclipse.ecl.popup.EclPopupSession.EclResult;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.PopupDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.internal.WorkbenchPlugin;

@SuppressWarnings("restriction")
public class EclPopupDialog extends PopupDialog {
	private EclPopupSession session;

	public EclPopupDialog(IWorkbenchWindow window) {
		super(window.getShell(), SWT.RESIZE, true, true, // persist size
				false, // but not location
				true, true, null, "Start typing ECL command");

		this.session = EclPopupPlugin.getDefault().getSession();
		refresh("");
	}

	private StyledText filterText;
	private boolean afterExec = false;
	private boolean updateAfterExec = false;

	@Override
	protected Control createTitleControl(Composite parent) {
		filterText = new StyledText(parent, SWT.NONE);

		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.CENTER)
				.grab(true, false).applyTo(filterText);
		filterText.addKeyListener(new KeyListener() {

			@Override
			public void keyReleased(KeyEvent e) {
				// do nothing
			}

			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.keyCode) {
				case SWT.TAB:
					String newText = filterText.getText().trim() + "tabbed";
					filterText.setText(newText);
					filterText.setCaretOffset(newText.length());
					break;
				case SWT.CR:
				case SWT.KEYPAD_CR:
					execCommand();
					break;
				case SWT.ARROW_UP:
					history.receiveBottomFocus();
					break;
				case SWT.ARROW_DOWN:
					if (!result.isHidden()) {
						result.receiveTopFocus();
					} else {
						proposals.receiveTopFocus();
					}
					break;
				}
			}
		});
		filterText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				String text = ((StyledText) e.widget).getText().toLowerCase();
				refresh(text);
			}
		});
		return filterText;

	}

	@Override
	protected Control createDialogArea(Composite parent) {
		final Composite area = (Composite) super.createDialogArea(parent);
		GridDataFactory.swtDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(area);
		result = new ResultRow(area, "Result");
		result.hide();
		result.setFocusReceiver(new IFocusReceiver() {
			
			@Override
			public void receiveTopFocus() {
				focusFilterText();
			}
			
			@Override
			public void receiveBottomFocus() {
				history.receiveTopFocus();
			}
		});
		proposals = new ProposalRow(area);
		proposals.setFocusReceiver(new IFocusReceiver() {
			@Override
			public void receiveTopFocus() {
				focusFilterText();
			}

			@Override
			public void receiveBottomFocus() {
				history.receiveTopFocus();
			}
			
		});
		history = new ResultRow(area, "History");
		history.setResults(session.getHistory());
		history.setFocusReceiver(new IFocusReceiver() {
			
			@Override
			public void receiveTopFocus() {
				if(result.isHidden()) {
					proposals.receiveBottomFocus();
				} else {
					result.receiveBottomFocus();
				}
			}
			
			@Override
			public void receiveBottomFocus() {
				focusFilterText();
			}
		});
		getShell().addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(ControlEvent e) {
				int height = area.getSize().y / 2;
				proposals.setHeightHint(height);
				history.setHeightHint(height);
				result.setHeightHint(height);
				area.layout();
				
			}
		});
		return area;
	}

	private ResultRow history;
	private ProposalRow proposals;
	private ResultRow result;

	private void execCommand() {
		String command = filterText.getText();
		EclResult r = session.exec(command);
		result.setResults(new EclResult[] { r });
		result.show();
		proposals.hide();
		updateLayout();
		afterExec = true;
		updateAfterExec = true;
		filterText.setText("");
	}

	private void updateLayout() {
		result.getParent().layout();
	}

	@Override
	protected Control getFocusControl() {
		return filterText;
	}

	protected IDialogSettings getDialogSettings() {
		final IDialogSettings workbenchDialogSettings = WorkbenchPlugin
				.getDefault().getDialogSettings();
		IDialogSettings result = workbenchDialogSettings.getSection(getId());
		if (result == null) {
			result = workbenchDialogSettings.addNewSection(getId());
		}
		return result;
	}

	protected String getId() {
		return "org.eclipse.ecl.popup.EclPopup"; //$NON-NLS-1$
	}

	protected void refresh(String text) {
		if (result == null) {
			return;
		}
		if (afterExec) {
			history.setResults(session.getHistory());
			afterExec = false;
			return;
		}

		if (updateAfterExec) {
			result.hide();
			proposals.show();
			updateLayout();
			updateAfterExec = false;
		}

		proposals.setCommand(text);

	}

	public void focusFilterText() {
		filterText.setFocus();
		filterText.setCaretOffset(filterText.getText().length());
	}
}
