package org.eclipse.ecl.doc;

public final class EclDocCommandDocumentation {
	private EclDocDocumentation docs;

	public EclDocCommandDocumentation(EclDocCommand command) {
		docs = new EclDocDocumentation(command.getEClass());
	}

	public String getDescription() {
		return docs.get(EclDocConstants.DESCRIPTION_DET);
	}

	public String getReturns() {
		return docs.get(EclDocConstants.RETURNS_DET);
	}

	public String getExample() {
		return docs.get(EclDocConstants.EXAMPLE_DET);
	}
}