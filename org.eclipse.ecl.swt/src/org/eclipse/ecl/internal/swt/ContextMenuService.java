package org.eclipse.ecl.internal.swt;

import net.sf.swtbot.widgets.AbstractSWTBot;
import net.sf.swtbot.widgets.SWTBotMenu;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.swt.ContextMenu;
import org.eclipse.swt.widgets.MenuItem;

public class ContextMenuService extends AbstractSWTService {

	public IStatus doService(Command command, IProcess context)
			throws Exception {
		ContextMenu cm = (ContextMenu) command;
		final Object bot = getBotFromInput(context);
		MenuItem menu = (MenuItem) SWTServiceUtils.findItemByPath(
				new SWTServiceUtils.ItemFinder() {
					public AbstractSWTBot first(final String text)
							throws Exception {
						return (SWTBotMenu) bot.getClass().getMethod(
								"contextMenu", String.class).invoke(bot, text);
					}

					public AbstractSWTBot next(AbstractSWTBot prev, String text)
							throws Exception {
						((SWTBotMenu) prev).click();
						return (SWTBotMenu) bot.getClass().getMethod(
								"contextMenu", String.class).invoke(bot, text);
					}
				}, cm.getText()).widget;
		context.getOutput().write(menu);
		return Status.OK_STATUS;
	}

}
