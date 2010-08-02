package org.eclipse.ecl.internal.swt;

import net.sf.swtbot.SWTBot;
import net.sf.swtbot.wait.DefaultCondition;
import net.sf.swtbot.wait.ICondition;
import net.sf.swtbot.widgets.AbstractSWTBot;
import net.sf.swtbot.widgets.TimeoutException;
import net.sf.swtbot.widgets.WidgetNotFoundException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.swt.WaitEnabled;

public class WaitEnabledService extends AbstractSWTService {

	public IStatus doService(Command command, IProcess context)
			throws Exception {
		WaitEnabled we = (WaitEnabled) command;
		Object bot = getBotFromInput(context);
		try {
			final AbstractSWTBot<?> target = (AbstractSWTBot<?>) bot;
			ICondition cond = new DefaultCondition() {

				public String getFailureMessage() {
					return "Widget is still disabled";
				}

				public boolean test() throws Exception {
					return target.isEnabled();
				}

			};
			new SWTBot().waitUntil(cond, we.getTimeout());
		} catch (WidgetNotFoundException e) {
		} catch (TimeoutException e) {
			return new Status(Status.ERROR, PLUGIN_ID, "Time is out", e);
		} catch (ClassCastException e) {
			return new Status(Status.ERROR, PLUGIN_ID, "Invalid pipe content",
					e);
		}
		return Status.OK_STATUS;
	}
}
