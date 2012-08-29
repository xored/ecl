package org.eclipse.ecl.internal.core;

import org.eclipse.ecl.runtime.CoreUtils;

public final class ParameterDocumentation {
	private Documentation docs;

	public ParameterDocumentation(ParameterDefinition def) {
		docs = new Documentation(def.getEFeature());
	}

	public String getDescription() {
		return docs.get(CoreUtils.DESCRIPTION_DET);
	}
}