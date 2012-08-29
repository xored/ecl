package org.eclipse.ecl.internal.core;

import org.eclipse.ecl.runtime.CoreUtils;

public final class ScriptletDocumentation {
	private Documentation docs;

	public ScriptletDocumentation(ScriptletDefinition def) {
		docs = new Documentation(def.getEClass());
	}

	public String getDescription() {
		return docs.get(CoreUtils.DESCRIPTION_DET);
	}

	public String getReturns() {
		return docs.get(CoreUtils.RETURNS_DET);
	}

	public String getExample() {
		return docs.get(CoreUtils.EXAMPLE_DET);
	}
}