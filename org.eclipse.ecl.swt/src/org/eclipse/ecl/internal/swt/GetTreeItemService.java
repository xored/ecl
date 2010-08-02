package org.eclipse.ecl.internal.swt;

import net.sf.swtbot.widgets.AbstractSWTBot;
import net.sf.swtbot.widgets.SWTBotTree;
import net.sf.swtbot.widgets.SWTBotTreeItem;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.swt.GetTreeItem;

public class GetTreeItemService extends AbstractSWTService {

	public IStatus doService(final Command command, final IProcess context)
			throws Exception {
		GetTreeItem gti = (GetTreeItem) command;
		IStatus status = Status.OK_STATUS;

		final String text = gti.getText();
		Object bot = getBotFromInput(context);
		if (!(bot instanceof SWTBotTree)) {
			return new Status(Status.ERROR, PLUGIN_ID, "Invalid pipe content");
		}
		final SWTBotTree tree = (SWTBotTree) bot;

		SWTBotTreeItem item = (SWTBotTreeItem) SWTServiceUtils.findItemByPath(
				new SWTServiceUtils.ItemFinder() {
					public AbstractSWTBot first(final String text) {
						return tree.getTreeItem(text).expand();
					}

					public AbstractSWTBot next(AbstractSWTBot prev, String text)
							throws Exception {
						SWTBotTreeItem item = ((SWTBotTreeItem) prev)
								.getNode(text);
						if (item == null)
							return null;
						item = item.expand();
						return item;
					}
				}, text);

		if (item == null) {
			return new Status(IStatus.WARNING, PLUGIN_ID, "Item not found");
		}
		context.getOutput().write(item);
		return status;
	}
}
