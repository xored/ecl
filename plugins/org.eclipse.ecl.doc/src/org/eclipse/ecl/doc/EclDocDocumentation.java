package org.eclipse.ecl.doc;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;

final class EclDocDocumentation {

	private EMap<String, String> details = null;

	public EclDocDocumentation(EModelElement element) {
		EAnnotation ann = element.getEAnnotation(EclDocConstants.DOCS_ANN);
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
