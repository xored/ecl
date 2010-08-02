package org.eclipse.ecl.internal.swt;

import net.sf.swtbot.SWTBot;
import net.sf.swtbot.widgets.AbstractSWTBot;
import net.sf.swtbot.widgets.SWTBotMenu;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.swt.GetMenu;
import org.eclipse.swt.widgets.MenuItem;

public class GetMenuService extends AbstractSWTService {

	@Override
	public IStatus doService(Command command, IProcess context)
			throws Exception {
		final GetMenu gm = (GetMenu) command;
		MenuItem menu = (MenuItem) SWTServiceUtils.findItemByPath(
				new SWTServiceUtils.ItemFinder() {
					public AbstractSWTBot first(final String text) {
						return new SWTBot().menu(text);
					}

					public AbstractSWTBot next(AbstractSWTBot prev, String text)
							throws Exception {
						return ((SWTBotMenu) prev).menu(text);
					}
				}, gm.getPath()).widget;
		if (menu == null)
			return new Status(IStatus.WARNING, PLUGIN_ID, "Menu not found");
		context.getOutput().write(menu);
		return Status.OK_STATUS;
	}
}
