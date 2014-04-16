package org.eclipse.ecl.console.factories;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.w3c.dom.Element;

public class CompositeSWTControlFactory implements ISWTControlFactory {

	private List<ISWTControlFactory> factories = new ArrayList<ISWTControlFactory>();

	public void register(ISWTControlFactory factory) {
		factories.add(factory);
	}

	public void unregister(ISWTControlFactory factory) {
		factories.remove(factory);
	}

	public Control create(Composite parent, Element element) {
		for (int index = 0; index < factories.size(); index++) {
			ISWTControlFactory factory = factories.get(index);
			Control result = factory.create(parent, element);
			if (result != null) {
				return result;
			}
		}
		return null;
	}
}
