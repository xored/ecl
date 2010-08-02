package org.eclipse.dltk.tcl.ui.tests.ecl.internal.dltktest;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobManager;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.WaitForJob;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class WaitForJobService implements ICommandService {

	private static final String MANUAL_REFRESH = "manualrefresh";
	private static final String AUTO_REFRESH = "autorefresh";
	private static final String MANUAL_BUILD = "manualbuild";
	private static final String AUTO_BUILD = "autobuild";

	private final static Map<Object, String[]> familyObjects = new HashMap<Object, String[]>();

	static {
		familyObjects.put(ResourcesPlugin.FAMILY_AUTO_BUILD, new String[] {
				"autobuild", "auto-build", "auto_build" });
		familyObjects.put(ResourcesPlugin.FAMILY_MANUAL_BUILD, new String[] {
				"manualbuild", "manual-build", "manual_build" });
		familyObjects.put(ResourcesPlugin.FAMILY_AUTO_REFRESH, new String[] {
				"autorefresh", "auto-refresh", "auto_refresh" });
		familyObjects.put(ResourcesPlugin.FAMILY_MANUAL_REFRESH, new String[] {
				"manualrefresh", "manual-refresh", "manual_refresh" });
	}

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		WaitForJob wfj = (WaitForJob) command;
		String familyType = wfj.getFamily();
		int timeout = wfj.getTimeout();
		long endTime = -1;
		if (timeout > 0) {
			long startTime = System.currentTimeMillis();
			endTime = startTime + timeout;
		}
		boolean wasInterrupted = false;
		Object family = getFamily(familyType);
		do {
			try {
				IJobManager jobManager = Job.getJobManager();
				jobManager.join(family, null);
				wasInterrupted = endTime > 0
						&& System.currentTimeMillis() > endTime;
			} catch (OperationCanceledException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				wasInterrupted = true;
			}
		} while (wasInterrupted);
		if (family == null)
			return new Status(IStatus.WARNING, DLTKTestUtils.PLUGIN_ID,
					"Family \"" + familyType
							+ "\" is invalid. All jobs has been waiting");
		return Status.OK_STATUS;
	}

	private Object getFamily(String family) {
		for (Object o : familyObjects.keySet()) {
			String[] types = familyObjects.get(o);
			for (String type : types) {
				if (type.equalsIgnoreCase(family))
					return o;
			}
		}
		return null;
	}
}
