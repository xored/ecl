package org.eclipse.ecl.internal.swt;

import net.sf.swtbot.SWTBot;
import net.sf.swtbot.wait.Conditions;
import net.sf.swtbot.widgets.SWTBotShell;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;
import org.eclipse.swt.widgets.Display;

abstract public class AbstractSWTService implements ICommandService {

	public static final String PLUGIN_ID = "org.eclipse.ecl.swt";
	public static final int SHELL_ACTIVATE_TIME_OUT = 5000;
	protected Display display = Display.getDefault();
	protected SWTBot bot = new SWTBot();
	protected IStatus status = Status.OK_STATUS;
	protected Object input;

	public IStatus service(final Command command, final IProcess context)
			throws InterruptedException, CoreException {
		if (display == null || display.isDisposed())
			return new Status(IStatus.ERROR, PLUGIN_ID,
					ServiceMessages.Service_Display_disposed);
		display.syncExec(new Runnable() {
			public void run() {
				try {
					if (display.getActiveShell() == null) {
						SWTBot bot = new SWTBot();
						SWTBotShell[] shells = bot.shells();
						if (shells.length < 1) {
							status = new Status(IStatus.ERROR, PLUGIN_ID,
									ServiceMessages.Service_No_shell_found);
							return;
						}
						SWTBotShell shell = shells[shells.length - 1];
						shell.activate();
						bot.waitUntil(
								Conditions.shellIsActive(shell.getText()),
								SHELL_ACTIVATE_TIME_OUT);
					}
				} catch (Throwable e) {
					status = new Status(IStatus.ERROR, PLUGIN_ID, e
							.getMessage(), e);
				}
			}
		});
		try {
			status = doService(command, context);
		} catch (Exception e) {
			return new Status(IStatus.ERROR, PLUGIN_ID, e.getMessage());
		}
		return status;
	}

	abstract protected IStatus doService(final Command command,
			final IProcess context) throws Exception;

	protected Object getBotFromInput(IProcess context) throws Exception {
		input = context.getInput().take(ISession.DEFAULT_TAKE_TIMEOUT);
		if (input == null) {
			throw new Exception("Pipe was empty");
		}
		Object bot = SWTServiceUtils.bot(input);
		if (bot == null) {
			throw new Exception("Invalid pipe content");
		}
		return bot;
	}
}
