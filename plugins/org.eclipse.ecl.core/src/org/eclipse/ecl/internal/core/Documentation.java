package org.eclipse.ecl.internal.core;

import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;

final class Documentation {

	private EMap<String, String> details = null;

	public Documentation(EModelElement element) {
		EAnnotation ann = element.getEAnnotation(CoreUtils.DOCS_ANN);
		if (ann == null)
			return;
		this.details = ann.getDetails();
	}

	public String get(String key) {
		if (details == null || !details.containsKey(key))
			return null;
		return details.get(key);
	}
}