package org.eclipse.ecl.operations.internal.commands;

import static org.eclipse.ecl.operations.internal.OperationsPlugin.createErr;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.EclMap;
import org.eclipse.ecl.core.EclMapEntry;
import org.eclipse.ecl.core.Get;
import org.eclipse.ecl.dispatch.IScriptletExtension;
import org.eclipse.ecl.runtime.BoxedValues;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class GetFromMapService implements IScriptletExtension {

	public GetFromMapService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		Get get = (Get) command;
		EclMap map = (EclMap) get.getInput();
		EObject value = get(map, get.getKey(), get.getDefault());
		if (value == null) {
			return createErr("Map does not contain key %s and default value is not specified",
					BoxedValues.unbox(get.getKey()));
		}
		context.getOutput().write(value);
		return Status.OK_STATUS;
	}

	@Override
	public boolean canHandle(Command c) {
		return (c instanceof Get) && ((Get) c).getInput() instanceof EclMap;
	}

	private static EObject get(EclMap map, EObject key, EObject def) {
		for (EclMapEntry entry : map.getEntries()) {
			if (EcoreUtil.equals(entry.getKey(), key)) {
				return entry.getValue();
			}
		}
		return def;
	}
}
