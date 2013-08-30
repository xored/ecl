package org.eclipse.ecl.debug.runtime;

import java.util.List;

import org.eclipse.ecl.debug.model.BreakpointEvent;
import org.eclipse.ecl.debug.model.Event;
import org.eclipse.ecl.debug.model.EventType;
import org.eclipse.ecl.debug.model.ModelFactory;
import org.eclipse.ecl.debug.model.SkipAllEvent;
import org.eclipse.ecl.debug.model.StackEvent;
import org.eclipse.ecl.debug.model.StackFrame;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class ModelUtils {
	public static Event createEvent(EventType type) {
		Event event = ModelFactory.eINSTANCE.createEvent();
		event.setType(type);
		return event;
	}

	public static BreakpointEvent createBreakpointEvent(EventType type, String path, int line) {
		BreakpointEvent event = ModelFactory.eINSTANCE.createBreakpointEvent();
		event.setType(type);
		event.setPath(path);
		event.setLine(line);
		return event;
	}

	public static StackEvent createStackEvent(EventType type, List<StackFrame> frames) {
		StackEvent event = ModelFactory.eINSTANCE.createStackEvent();
		event.setType(type);
		for (StackFrame fr : frames) {
			event.getStackFrame().add(EcoreUtil.copy(fr));
		}
		return event;
	}
	public static SkipAllEvent createSkipAllEvent(boolean value) {
		SkipAllEvent skipAll = ModelFactory.eINSTANCE.createSkipAllEvent();
		skipAll.setSkip(value);
		skipAll.setType(EventType.SKIP_ALL);
		return skipAll;
	}
}
