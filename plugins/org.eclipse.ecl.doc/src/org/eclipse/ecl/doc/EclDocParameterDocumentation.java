package org.eclipse.ecl.doc;

import org.eclipse.ecl.runtime.CoreUtils;

public class EclDocParameterDocumentation {
	private EclDocDocumentation docs;

	public EclDocParameterDocumentation(EclDocParameter param) {
		docs = new EclDocDocumentation(param.getEFeature());
	}

	public String getDescription() {
		return docs.get(CoreUtils.DESCRIPTION_DET);
	}
}
