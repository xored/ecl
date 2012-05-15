package org.eclipse.ecl.popup.ui.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.ecl.core.util.EclCommandNameConvention;
import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.ecl.runtime.FQName;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;

public class ProposalRow extends ResultRow {

	public ProposalRow(Composite parent) {
		super(parent, "Proposals");
	}

	private Table control;
	private TableViewer table;

	@Override
	protected void createContent() {
		table = new TableViewer(this, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		control = table.getTable();
		table.setContentProvider(new ProposalContentProvider());
		GridDataFactory.swtDefaults().align(SWT.FILL, SWT.FILL)
				.grab(true, true).applyTo(table.getControl());
		table.getControl().addKeyListener(new KeyListener() {
			
			@Override
			public void keyReleased(KeyEvent e) {
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(control.getSelectionIndex() == -1) {
					return;
				}
				if(e.keyCode == SWT.ARROW_DOWN && control.getSelectionIndex() == control.getItemCount() - 1) {
					focusReceiver.receiveBottomFocus();
					return;
				}
				
				if(e.keyCode == SWT.ARROW_UP && control.getSelectionIndex() == 0) {
					focusReceiver.receiveTopFocus();
				}
			}
		});

	}

	@Override
	public void receiveBottomFocus() {
		if (control.getItemCount() == 0) {
			focusReceiver.receiveTopFocus(); // leave proposals
		} else {
			control.setSelection(control.getItemCount() - 1);
			control.forceFocus();
		}
	}

	@Override
	public void receiveTopFocus() {
		if (control.getItemCount() == 0) {
			focusReceiver.receiveBottomFocus(); // leave proposals
		} else {
			control.setSelection(0);
			control.forceFocus();
		}
	}

	public void setCommand(String cmd) {
		table.setInput(cmd);
	}

	private final class ProposalContentProvider implements
			IStructuredContentProvider {

		public ProposalContentProvider() {
			Set<FQName> commands = CorePlugin.getScriptletManager()
					.getAllCommandNames();
			nameParts = new String[commands.size()][];
			int i = -1;
			for (FQName command : commands) {
				i++;
				nameParts[i] = splitCmd(EclCommandNameConvention
						.toCommandName(command.name));
			}
		}

		@Override
		public void dispose() {
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		private static final int LIMIT = 20;

		@Override
		public Object[] getElements(Object inputElement) {
			String[] input = splitCmd(inputElement.toString());
			List<String> result = new ArrayList<String>();
			for (String[] parts : nameParts) {
				if (parts.length < input.length) {
					continue;
				}

				boolean matches = true;
				for (int i = 0; i < input.length; i++) {
					if (!parts[i].startsWith(input[i])) {
						matches = false;
					}
				}

				if (matches) {
					result.add(join(parts));
				}
				if (result.size() >= LIMIT) {
					break;
				}
			}

			return result.toArray(new String[result.size()]);
		}

		private String[] splitCmd(String cmd) {
			return cmd.split("-");
		}

		private String join(String[] parts) {
			StringBuilder result = new StringBuilder();
			for (String part : parts) {
				result.append(part).append("-");
			}
			result.setLength(result.length() - 1);
			return result.toString();
		}

		private String[][] nameParts;
	}
}
