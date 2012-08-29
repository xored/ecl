package org.eclipse.ecl.internal.core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.ecl.core.util.EclCommandNameConvention;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

public final class ScriptletDefinition implements IEcldocProvider {

	private final String name;
	private final String namespace;
	private final IConfigurationElement config;
	private Set<String> friendlyNames;
	private ICommandService service;
	private ScriptletDocumentation docs;
	private ArrayList<ParameterDefinition> params;

	ScriptletDefinition(String ns, String name, IConfigurationElement config) {
		this.namespace = ns;
		this.name = name;
		this.config = config;
	}

	Set<String> getFriendlyNames() {
		if (friendlyNames == null) {
			friendlyNames = new HashSet<String>();
			IConfigurationElement[] elements = config
					.getChildren("friendly_name");
			for (IConfigurationElement e : elements) {
				String name = e.getAttribute("value");
				friendlyNames.add(name);
			}
		}
		return friendlyNames;
	}

	ICommandService getService() throws CoreException {
		if (service == null) {
			service = (ICommandService) config
					.createExecutableExtension(ScriptletManager.SCRIPTLET_CLASS_ATTR);
		}
		return service;
	}

	public EClass getEClass() {
		EPackage epackage = EPackage.Registry.INSTANCE.getEPackage(namespace);
		return (EClass) epackage.getEClassifier(name);
	}

	public String getCommandName() {
		return EclCommandNameConvention.toCommandName(getEClass().getName());
	}

	public boolean isInternal() {
		return getEClass().getEAnnotation(CoreUtils.INTERNAL_ANN) != null;
	}

	public ScriptletDocumentation getDocumentation() {
		if (docs == null)
			docs = new ScriptletDocumentation(this);
		return docs;
	}

	public List<ParameterDefinition> getParameters() {
		if (params != null)
			return params;

		params = new ArrayList<ParameterDefinition>();
		EList<EStructuralFeature> features = getEClass()
				.getEAllStructuralFeatures();
		for (EStructuralFeature f : features)
			params.add(new ParameterDefinition(f));

		return params;
	}

	public ParameterDefinition findParameter(String name) {
		if (name.length() > 1 && name.charAt(0) == '-')
			name = name.substring(1);

		for (ParameterDefinition p : getParameters())
			if (p.getName().equals(name))
				return p;
		return null;
	}

	private StringBuilder formatParam(ParameterDefinition param,
			StringBuilder builder) {
		if (builder == null)
			builder = new StringBuilder();

		builder.append("<dd><b>");
		builder.append(param.getName());
		builder.append("</b>");

		int lower = param.getLowerBound();
		int upper = param.getUpperBound();

		if (upper != lower) {
			if (lower == 0 && upper == 1) {
				builder.append(" optional");
			} else {
				builder.append(" (");
				if (upper >= lower) {
					builder.append(lower);
					builder.append(", ");
					builder.append(upper);
				} else {
					builder.append(lower);
					builder.append(", ");
					builder.append("∞");
				}
				builder.append(")");
			}
		} else if (lower != 1) {
			builder.append(" ");
			builder.append(lower);
		}

		builder.append(" ").append(param.getFriendlyTypeName());

		if (param.isOptional()) {
			String literal = param.getFriendlyDefaultLiteral();
			if (!CoreUtils.isBlank(literal))
				builder.append(" = ").append(literal);
		}

		String paramDesc = param.getDocumentation().getDescription();
		if (!CoreUtils.isBlank(paramDesc)) {
			builder.append(": ");
			builder.append(paramDesc);
		}

		builder.append("</dd>");

		return builder;
	}

	@Override
	public String getEcldoc() {
		String desc = getDocumentation().getDescription();
		String descBlock = CoreUtils.isBlank(desc) ? getCommandName() : desc;

		// --

		ParameterDefinition inputParam = null;
		StringBuilder params = new StringBuilder();
		for (ParameterDefinition p : getParameters()) {
			if (p.isInput()) {
				inputParam = p;
				continue;
			}
			if (p.isInternal())
				continue;
			formatParam(p, params);
		}
		String paramsBlock = params.length() == 0 ? "" : String.format(
				"<dl><dt>Parameters:</dt>%s</dl>", params.toString());

		String inputBlock = inputParam == null ? "" : String.format(
				"<dl><dt>Input:</dt>%s</dl>", formatParam(inputParam, null));

		// --

		String returns = getDocumentation().getReturns();
		String returnsBlock = CoreUtils.isBlank(returns) ? "" : String.format(
				"<dl><dt>Returns:</dt><dd>%s</dd></dl>", returns);

		String example = getDocumentation().getExample();
		String exampleBlock = CoreUtils.isBlank(example) ? "" : String.format(
				"<dl><dt>Example:</dt><dd><pre>%s</pre></dd></dl>", example);

		return String.format("%s%s%s%s%s", descBlock, inputBlock, paramsBlock,
				returnsBlock, exampleBlock);
	}
}