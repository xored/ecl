package org.eclipse.ecl.doc;

import java.io.IOException;

import org.eclipse.ecl.core.util.EclTypeNameConvention;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.emf.ecore.EStructuralFeature;

public class EclDocParameter implements IEclDocProvider {

	private EStructuralFeature efeature;
	private EclDocParameterDocumentation docs;

	public EclDocParameter(EStructuralFeature efeature) {
		this.efeature = efeature;
	}

	public String getName() {
		return efeature.getName();
	}

	public boolean isInternal() {
		return efeature.getEAnnotation(EclDocConstants.INTERNAL_ANN) != null;
	}

	public boolean isInput() {
		return efeature.getEAnnotation(EclDocConstants.INPUT_ANN) != null;
	}

	public boolean isOptional() {
		return !efeature.isRequired();
	}

	public String getTypeName() {
		return efeature.getEType().getName();
	}

	public String getFriendlyTypeName() {
		return EclTypeNameConvention.toTypeName(getTypeName());
	}

	public String getFriendlyDefaultLiteral() {
		String result = efeature.getDefaultValueLiteral();
		if (!getFriendlyTypeName().equals("String"))
			return result;

		if (result == null || result.length() == 0)
			return "\"\"";
		else
			return '"' + result + '"';
	}

	public EclDocParameterDocumentation getDocumentation() {
		if (docs == null)
			docs = new EclDocParameterDocumentation(this);
		return docs;
	}

	public EStructuralFeature getEFeature() {
		return efeature;
	}

	public int getLowerBound() {
		return efeature.getLowerBound();
	}

	public int getUpperBound() {
		return efeature.getUpperBound();
	}

	public void writeEclDoc(EclDocWriter w) throws IOException {
		String desc = getDocumentation().getDescription();
		desc = CoreUtils.isBlank(desc) ? getName() : desc;
		w.text(desc);

		w.dl();
		{
			w.dt("Type:");
			w.dd(String.format("%s (%s)", getFriendlyTypeName(), getTypeName()));
		}
		w.close();

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
		if (!CoreUtils.isBlank(quantity)) {
			w.dl();
			{
				w.dt("Quantity:");
				w.dd(quantity);
			}
			w.close();
		}

		String literal = isOptional() ? getFriendlyDefaultLiteral() : null;
		if (!CoreUtils.isBlank(literal)) {
			w.dl();
			{
				w.dt("Default value:");
				w.dd(literal);
			}
			w.close();
		}

		if (isInput())
			w.text("<p>This parameter is marked as <i>input</i> parameter and may be omited. In this case, actual argument value will be taken from the pipe. Typically, that will be a result of the previous command execution.</p>");
	}

}
