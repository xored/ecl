package org.eclipse.ecl.internal.swt;

import net.sf.swtbot.eclipse.finder.SWTEclipseBot;
import net.sf.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor;
import net.sf.swtbot.widgets.WidgetNotFoundException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.swt.GetEditor;

public class GetEditorService extends AbstractSWTService {

	public IStatus doService(final Command command, final IProcess context)
			throws Exception {
		GetEditor fe = (GetEditor) command;
		try {
			SWTBotEclipseEditor editor = new SWTEclipseBot().editor(fe
					.getTitle());
			context.getOutput().write(editor.widget);
		} catch (WidgetNotFoundException e) {
			return new Status(Status.ERROR, PLUGIN_ID, "Editor not found", e);
		}
		return Status.OK_STATUS;
	}
}
