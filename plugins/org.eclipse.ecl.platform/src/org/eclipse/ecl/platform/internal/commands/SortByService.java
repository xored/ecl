package org.eclipse.ecl.platform.internal.commands;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.platform.commands.SortBy;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

public class SortByService implements ICommandService {

	
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		SortBy sb = (SortBy) command;
		final String field = sb.getField();
		List<Object> pipe = CoreUtils.readPipeContent(context.getInput());
		Collections.sort(pipe, new Comparator<Object>() {

			@SuppressWarnings({ "rawtypes", "unchecked" })
			
			public int compare(Object o1, Object o2) {
				if(!(o1 instanceof EObject) || !(o2 instanceof EObject)) {
					return 0;
				}
				EObject eo1 = (EObject) o1;
				EObject eo2 = (EObject) o2;
				Object attr1 = getAttrVal(eo1, field);
				Object attr2 = getAttrVal(eo2, field);
				if(attr1 == null) return -1;
				try {
					if(attr1 instanceof Comparable) {
						return ((Comparable) attr1).compareTo(attr2); 
					}
				} catch(Exception e) {
					return attr1.toString().compareTo(attr2 == null ? "" : attr2.toString());
				}
				return 0;
			}
		});
		for(Object o : pipe) {
			context.getOutput().write(o);
		}
		return Status.OK_STATUS;
	}
	
	private Object getAttrVal(EObject o, String name) {
		EAttribute e = findAttr(o, name);
		if(e == null) {
			return null;
		}
		
		return o.eGet(e);
	}
	private EAttribute findAttr(EObject o, String name) {
		for(EAttribute e : o.eClass().getEAllAttributes()) {
			if(e.getName().equals(name)) {
				return e;
			}
		}
		return null;
	}

}
