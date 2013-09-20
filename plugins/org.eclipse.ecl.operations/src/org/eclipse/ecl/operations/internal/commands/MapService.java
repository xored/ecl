package org.eclipse.ecl.operations.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.EclMap;
import org.eclipse.ecl.core.EclMapEntry;
import org.eclipse.ecl.operations.Entry;
import org.eclipse.ecl.operations.Map;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class MapService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		Map map = (Map) command;

		EclMap result = CoreFactory.eINSTANCE.createEclMap();
		for (Entry entry : map.getEntries()) {
			put(result, entry.getKey(), entry.getValue());
		}
		context.getOutput().write(result);
		return Status.OK_STATUS;
	}

	private static void put(EclMap map, EObject key, EObject val) {
		boolean found = false;
		for (EclMapEntry entry : map.getEntries()) {
			if (EcoreUtil.equals(key, entry.getKey())) {
				entry.setValue(val);
				found = true;
				break;
			}
		}
		if (!found) {
			EclMapEntry newEntry = CoreFactory.eINSTANCE.createEclMapEntry();
			newEntry.setKey(key);
			newEntry.setValue(val);
			map.getEntries().add(newEntry);
		}

	}
}
