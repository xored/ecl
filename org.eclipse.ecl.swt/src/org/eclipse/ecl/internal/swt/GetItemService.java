package org.eclipse.ecl.internal.swt;

import net.sf.swtbot.widgets.SWTBotTable;
import net.sf.swtbot.widgets.SWTBotTree;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.swt.GetItem;
import org.eclipse.ecl.swt.GetTableItem;
import org.eclipse.ecl.swt.GetTreeItem;
import org.eclipse.ecl.swt.SwtFactory;

public class GetItemService extends AbstractSWTService {

	public IStatus doService(final Command command, final IProcess context)
			throws Exception {
		GetItem gi = (GetItem) command;
		Object bot = getBotFromInput(context);
		if (bot instanceof SWTBotTree) {
			GetTreeItem gti = SwtFactory.eINSTANCE.createGetTreeItem();
			gti.setText(gi.getItem());
			context.getInput().write(bot);
			return new GetTreeItemService().doService(gti, context);
		} else if (bot instanceof SWTBotTable) {
			GetTableItem gti = SwtFactory.eINSTANCE.createGetTableItem();
			gti.setItem(gi.getItem());
			context.getInput().write(bot);
			return new GetTableItemService().doService(gti, context);
		}
		return new Status(Status.ERROR, PLUGIN_ID, "Invalid pipe contents");
	}
}
