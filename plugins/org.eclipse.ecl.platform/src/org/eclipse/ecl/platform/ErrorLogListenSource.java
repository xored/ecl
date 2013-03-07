package org.eclipse.ecl.platform;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.ILogListener;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ecl.core.IListenSource;
import org.eclipse.ecl.platform.internal.log.LogEntry;
import org.eclipse.ecl.platform.util.EclPlatformUtil;

public class ErrorLogListenSource implements IListenSource {
	public static class CollectedLogEntries {
		List<LogEntry> entries = new ArrayList<LogEntry>();
		ILogListener listener = new ILogListener() {
			public void logging(IStatus status, String plugin) {
				entries.add(new LogEntry(status));
			}
		};
	}

	public Object begin() {
		final CollectedLogEntries e = new CollectedLogEntries();
		Platform.addLogListener(e.listener);
		return e;
	}

	public List<Object> finish(Object obj) {
		List<Object> result = new ArrayList<Object>();
		CollectedLogEntries ee = (CollectedLogEntries) obj;
		Platform.removeLogListener(ee.listener);
		for (Object o : ee.entries) {
			result.add(EclPlatformUtil.createMessage((LogEntry) o));
		}

		return result;
	}
}
