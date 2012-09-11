package org.eclipse.ecl.doc;

import org.eclipse.ecl.runtime.CoreUtils;

public final class EclDocCommandDocumentation {
	private EclDocDocumentation docs;

	public EclDocCommandDocumentation(EclDocCommand command) {
		docs = new EclDocDocumentation(command.getEClass());
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