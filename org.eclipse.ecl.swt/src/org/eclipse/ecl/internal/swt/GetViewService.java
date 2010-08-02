package org.eclipse.ecl.internal.swt;

import net.sf.swtbot.eclipse.finder.SWTEclipseBot;
import net.sf.swtbot.eclipse.finder.widgets.SWTBotView;
import net.sf.swtbot.widgets.WidgetNotFoundException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.swt.GetView;

public class GetViewService extends AbstractSWTService {

	public IStatus doService(final Command command, final IProcess context)
			throws InterruptedException, CoreException {
		GetView gv = (GetView) command;
		try {
			SWTBotView view = new SWTEclipseBot().view(gv.getTitle());
			context.getOutput().write(view.widget);
		} catch (WidgetNotFoundException e) {
			return new Status(Status.ERROR, PLUGIN_ID, "View not found", e);
		}
		return Status.OK_STATUS;
	}
}
