package org.eclipse.ecl.platform;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ecl.core.IWatchSource;
import org.eclipse.ecl.platform.internal.log.LogEntry;
import org.eclipse.ecl.platform.internal.log.LogReader;
import org.eclipse.ecl.platform.util.EclPlatformUtil;

public class ErrorLogWatchSource implements IWatchSource {

	public Object makeSnapshot() {
		List<LogEntry> entries = new ArrayList<LogEntry>();

		List<Integer> severitiesToLog = new ArrayList<Integer>();
		severitiesToLog.add(IStatus.ERROR);

		LogReader.parseLogFile(Platform.getLogFileLocation().toFile(), entries,
				-1, false, severitiesToLog);

		return entries;
	}

	@SuppressWarnings("unchecked")
	public List<Object> difference(Object snapshotA, Object snapshotB) {
		List<Object> result = new ArrayList<Object>();
		List<LogEntry> a = (List<LogEntry>) snapshotA;
		List<LogEntry> b = (List<LogEntry>) snapshotB;

		for (int i = a.size(); i < b.size(); ++i)
			result.add(EclPlatformUtil.createMessage(b.get(i)));

		return result;
	}
}
