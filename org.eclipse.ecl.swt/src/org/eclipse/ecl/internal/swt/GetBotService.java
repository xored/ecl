package org.eclipse.ecl.internal.swt;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.IProcess;

public class GetBotService extends AbstractSWTService {

	public IStatus doService(Command command, IProcess context)
			throws Exception {
		Object bot;
		try {
			bot = getBotFromInput(context);
			if (bot == null) {
				return new Status(Status.ERROR, PLUGIN_ID,
						"Cannot create bot for " + input + ": "
								+ status.getMessage());
			}
			context.getOutput().write(bot);
		} catch (Exception e) {
			return new Status(Status.ERROR, PLUGIN_ID, "Cannot create bot for "
					+ input + ": " + e.getMessage());
		}
		return Status.OK_STATUS;
	}
}
