package org.eclipse.ecl.internal.core;

import org.eclipse.ecl.core.util.EclTypeNameConvention;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.emf.ecore.EStructuralFeature;

public final class ParameterDefinition implements IEcldocProvider {
	private EStructuralFeature feature;
	private ParameterDocumentation docs;

	public ParameterDefinition(EStructuralFeature feature) {
		this.feature = feature;
	}

	public String getName() {
		return feature.getName();
	}

	public boolean isInternal() {
		return feature.getEAnnotation(CoreUtils.INTERNAL_ANN) != null;
	}

	public boolean isInput() {
		return feature.getEAnnotation(CoreUtils.INPUT_ANN) != null;
	}

	public boolean isOptional() {
		return !feature.isRequired();
	}

	public String getTypeName() {
		return feature.getEType().getName();
	}

	public String getFriendlyTypeName() {
		return EclTypeNameConvention.toTypeName(getTypeName());
	}

	public String getFriendlyDefaultLiteral() {
		String result = feature.getDefaultValueLiteral();
		if (!getFriendlyTypeName().equals("String"))
			return result;

		if (result == null || result.length() == 0)
			return "\"\"";
		else
			return '"' + result + '"';
	}

	public ParameterDocumentation getDocumentation() {

		if (docs == null)
			docs = new ParameterDocumentation(this);
		return docs;
	}

	public EStructuralFeature getEFeature() {
		return feature;
	}

	public int getLowerBound() {
		return feature.getLowerBound();
	}

	public int getUpperBound() {
		return feature.getUpperBound();
	}

	@Override
	public String getEcldoc() {
		String desc = getDocumentation().getDescription();
		String descBlock = CoreUtils.isBlank(desc) ? getName() : desc;

		String typeBlock = String.format(
				"<dl><dt>Type:</dt><dd>%s (%s)</dd></dl>",
				getFriendlyTypeName(), getTypeName());

		int lower = getLowerBound();
		int upper = getUpperBound();

		String quantity = null;
		if (upper != lower) {
			if (lower == 0 && upper == 1) {
				quantity = "Parameter is optional.";
			} else {
				if (upper >= lower)
					quantity = String.format("From %s to %s.", lower, upper);
				else
					quantity = String.format("From %s to ∞.", lower);
			}
		} else if (lower != 1)
			quantity = String.format("Exactly %s.", lower);
		String quantityBlock = quantity == null ? "" : String.format(
				"<dl><dt>Quantity:</dt><dd>%s</dd></dl>", quantity);

		String literal = isOptional() ? getFriendlyDefaultLiteral() : null;
		String literalBlock = CoreUtils.isBlank(literal) ? "" : String.format(
				"<dl><dt>Default value:</dt><dd>%s</dd></dl>", literal);

		String inputBlock = isInput() ? "<p>This parameter is marked as <i>input</i> parameter and may be omited. In this case, actual argument value will be taken from the pipe. Typically, that will be a result of the previous command execution.</p>"
				: "";

		return String.format("%s%s%s%s%s", descBlock, typeBlock, quantityBlock,
				literalBlock, inputBlock);
	}
}