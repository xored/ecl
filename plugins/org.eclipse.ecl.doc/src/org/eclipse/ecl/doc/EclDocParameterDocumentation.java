package org.eclipse.ecl.doc;


public class EclDocParameterDocumentation {
	private EclDocDocumentation docs;

	public EclDocParameterDocumentation(EclDocParameter param) {
		docs = new EclDocDocumentation(param.getEFeature());
	}

	public String getDescription() {
		return docs.get(EclDocConstants.DESCRIPTION_DET);
	}
}
