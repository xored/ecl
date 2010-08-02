package org.eclipse.ecl.internal.swt;

import net.sf.swtbot.finder.UIThreadRunnable;
import net.sf.swtbot.finder.results.Result;
import net.sf.swtbot.widgets.SWTBotTable;
import net.sf.swtbot.widgets.SWTBotTableItem;
import net.sf.swtbot.widgets.WidgetNotFoundException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.swt.GetTableItem;
import org.eclipse.swt.widgets.Display;

public class GetTableItemService extends AbstractSWTService {

	public IStatus doService(final Command command, final IProcess context)
			throws Exception {
		GetTableItem gti = (GetTableItem) command;

		final Object item = gti.getItem();
		Object bot = getBotFromInput(context);
		if (!(bot instanceof SWTBotTable)) {
			return new Status(IStatus.WARNING, PLUGIN_ID,
					"Invalid pipe content");
		}
		final SWTBotTable table = (SWTBotTable) bot;
		SWTBotTableItem target = UIThreadRunnable.syncExec(
				Display.getDefault(), new Result<SWTBotTableItem>() {
					public SWTBotTableItem run() {
						try {
							if (item instanceof String) {
								return table.getTableItem((String) item);
							} else if (item instanceof Integer) {
								return table.getTableItem((Integer) item);
							}
							return null;
						} catch (WidgetNotFoundException e) {
							return null;
						}
					}
				});
		if (target == null) {
			return new Status(IStatus.WARNING, PLUGIN_ID, "Item not found");
		}
		context.getOutput().write(target);
		return status;
	}
}
