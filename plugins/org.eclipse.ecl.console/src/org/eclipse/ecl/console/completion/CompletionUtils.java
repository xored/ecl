package org.eclipse.ecl.console.completion;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.console.commands.ConsoleFactory;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.ISession;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;

public class CompletionUtils {
	private static final String ANNOTATION_TYPES = "http://www.eclipse.org/ecl/console/types";
	private static final String ANNOTATION_TYPES_INPUT = "input";
	private static final String ANNOTATION_TYPES_OUPUT = "output";

	public static String getInputClassName(final Command command) {
		return getAnnotationEntry(command, ANNOTATION_TYPES, ANNOTATION_TYPES_INPUT);
	}
	
	public static String getOutputClassName(final Command command) {
		return getAnnotationEntry(command, ANNOTATION_TYPES, ANNOTATION_TYPES_OUPUT);
	}
	
	public static List<EClass> findEclCommands(final ISession session) throws CoreException {
		final IPipe pipe = session.createPipe();
		final Command command = ConsoleFactory.eINSTANCE.createListCommands();
	
		session.execute(command, null, pipe);
		
		final List<Object> content = CoreUtils.readPipeContent(pipe);
		final List<EClass> classes = new ArrayList<EClass>();
		
		for (final Object clazz : content) {
			classes.add((EClass) clazz);
		}
		
		return classes;
	}

	private static String getAnnotationEntry(final Command command, final String source, final String enrty) {
		final EAnnotation annotation = command.eClass().getEAnnotation(source);
		
		if (annotation == null || annotation.getDetails() == null) {
			return null;
		}
		
		return annotation.getDetails().get(enrty);
	}
}
