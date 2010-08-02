package org.eclipse.ecl.internal.swt;

import java.util.List;

import net.sf.swtbot.matcher.WidgetMatcherFactory;
import net.sf.swtbot.wait.Conditions;
import net.sf.swtbot.widgets.SWTBotShell;
import net.sf.swtbot.widgets.TimeoutException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.swt.WaitShellCloses;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Widget;
import org.hamcrest.Matchers;

public class WaitShellClosesService extends AbstractSWTService {

	public IStatus doService(Command command, IProcess context)
			throws InterruptedException, CoreException {
		WaitShellCloses wsc = (WaitShellCloses) command;
		List<? extends Widget> results = bot.getFinder().findControls(
				Matchers.allOf(Matchers.instanceOf(Shell.class),
						WidgetMatcherFactory.withText(wsc.getText())));
		if (results == null || results.isEmpty()) {
			return Status.OK_STATUS;
		}
		SWTBotShell shell = (SWTBotShell) SWTServiceUtils.bot(results.get(0));
		assert (shell != null);
		try {
			bot.waitUntil(Conditions.shellCloses(shell), wsc.getTimeout());
		} catch (TimeoutException e) {
			return new Status(Status.ERROR, PLUGIN_ID, "Time is out", e);
		}
		return Status.OK_STATUS;
	}
}
