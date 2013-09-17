package org.eclipse.ecl.debug.ui;

import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.jface.text.source.Annotation;

/**
 * Default instruction pointer annotation.
 */
public class EclActiveCommandAnnotation extends Annotation {

	private IStackFrame fStackFrame;

	public EclActiveCommandAnnotation(IStackFrame frame, String markerAnnotationSpecificationId, String text) {
		super(markerAnnotationSpecificationId, false, text);
		fStackFrame = frame;
	}

	public boolean equals(Object other) {
		if (other instanceof EclActiveCommandAnnotation) {
			return getStackFrame().equals(((EclActiveCommandAnnotation) other).getStackFrame());
		}
		return false;
	}

	public int hashCode() {
		return getStackFrame().hashCode();
	}

	private IStackFrame getStackFrame() {
		return fStackFrame;
	}
}
