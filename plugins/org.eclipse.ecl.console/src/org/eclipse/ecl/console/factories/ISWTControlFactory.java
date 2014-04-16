package org.eclipse.ecl.console.factories;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.w3c.dom.Element;

public interface ISWTControlFactory {
	public Control create(Composite parent, Element element);
}
