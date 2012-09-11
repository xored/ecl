package org.eclipse.ecl.doc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.List;

import org.eclipse.ecl.core.util.EclCommandNameConvention;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

public class EclDocCommand implements IEclDocProvider {

	private EClass eclass;
	private String name;
	private EclDocCommandDocumentation docs;
	private List<EclDocParameter> params;

	public EclDocCommand(EClass eclass) {
		this.eclass = eclass;
		this.name = EclCommandNameConvention.toCommandName(eclass.getName());
	}

	public boolean isExcluded() {
		return excludedCommands.contains(name);
	}

	public String getName() {
		return name;
	}

	public boolean isInternal() {
		return eclass.getEAnnotation(EclDocConstants.INTERNAL_ANN) != null;
	}

	public EClass getEClass() {
		return eclass;
	}

	public EclDocCommandDocumentation getDocumentation() {
		if (docs == null)
			docs = new EclDocCommandDocumentation(this);
		return docs;
	}

	public List<EclDocParameter> getParameters() {
		if (params != null)
			return params;

		params = new ArrayList<EclDocParameter>();
		EList<EStructuralFeature> features = getEClass()
				.getEAllStructuralFeatures();
		for (EStructuralFeature f : features)
			params.add(new EclDocParameter(f));

		return params;
	}

	public EclDocParameter findParameter(String name) {
		if (name.length() > 1 && name.charAt(0) == '-')
			name = name.substring(1);

		for (EclDocParameter p : getParameters())
			if (p.getName().equals(name))
				return p;
		return null;
	}

	// --

	private static ArrayList<EclDocCommand> commands = null;
	private static HashMap<String, EclDocCommand> commandsByName = null;

	private static List<String> excludedCommands = Arrays.asList("recognize",
			"contains-image", "sequence", "parallel", "get-advanced-info",
			"control-not-found", "pipeline", "setup-player",
			"shoutdown-player", "get-global", "set-global");

	private static EClass COMMAND = (EClass) EPackage.Registry.INSTANCE
			.getEPackage("http://www.eclipse.org/ecl/core.ecore")
			.getEClassifier("Command");

	public static synchronized List<EclDocCommand> getAllPublicCommands() {
		if (commands != null)
			return commands;

		commands = new ArrayList<EclDocCommand>();
		commandsByName = new HashMap<String, EclDocCommand>();

		// XXX while we are resolving EPackage.Descriptors to EPackages,
		// collection is modified, that is it -- coding horror
		boolean doCollection = true;
		while (doCollection) {
			commands.clear();
			commandsByName.clear();
			doCollection = false;

			try {
				for (Object o : EPackage.Registry.INSTANCE.values()) {

					if (o instanceof EPackage.Descriptor)
						o = ((EPackage.Descriptor) o).getEPackage();

					if (!(o instanceof EPackage))
						continue;

					EPackage p = (EPackage) o;
					for (EClassifier classifier : p.getEClassifiers()) {
						if (!(classifier instanceof EClass))
							continue;

						EClass class_ = (EClass) classifier;
						if (class_.isAbstract()
								|| !class_.getEAllSuperTypes()
										.contains(COMMAND))
							continue;

						EclDocCommand command = new EclDocCommand(class_);
						if (command.isExcluded() || command.isInternal())
							continue;

						if (commandsByName.containsKey(command.getName()))
							continue;

						commands.add(command);
						commandsByName.put(command.getName(), command);
					}
				}
			} catch (ConcurrentModificationException e) {
				doCollection = true;
			}
		}

		Collections.sort(commands, new Comparator<EclDocCommand>() {
			@Override
			public int compare(EclDocCommand a, EclDocCommand b) {
				return a.getName().compareTo(b.getName());
			}
		});

		return commands;
	}

	public static synchronized EclDocCommand get(String name) {
		if (commandsByName != null)
			return commandsByName.get(name);

		getAllPublicCommands();
		return commandsByName.get(name);
	}

	// --

	private static void writeParam(EclDocParameter param, EclDocWriter w)
			throws IOException {
		w.dd();
		{
			w.b(param.getName());

			int lower = param.getLowerBound();
			int upper = param.getUpperBound();

			if (upper != lower) {
				if (lower == 0 && upper == 1) {
					w.write(" optional");
				} else {
					w.write(" (");
					if (upper >= lower) {
						w.write(lower);
						w.write(", ");
						w.write(upper);
					} else {
						w.write(lower);
						w.write(", ");
						w.write("∞");
					}
					w.write(")");
				}
			} else if (lower != 1) {
				w.write(" ");
				w.write(lower);
			}

			w.write(" ");
			w.write(param.getFriendlyTypeName());

			if (param.isOptional()) {
				String literal = param.getFriendlyDefaultLiteral();
				if (!CoreUtils.isBlank(literal)) {
					w.write(" = ");
					w.write(literal);
				}
			}

			String paramDesc = param.getDocumentation().getDescription();
			if (!CoreUtils.isBlank(paramDesc)) {
				w.write(": ");
				w.write(paramDesc);
			}
		}
		w.closeTag();
	}

	@Override
	public void writeEclDoc(EclDocWriter w) throws IOException {
		String desc = getDocumentation().getDescription();
		desc = CoreUtils.isBlank(desc) ? getName() : desc;
		w.writeText(desc);

		// --

		EclDocParameter inputParam = null;
		ArrayList<EclDocParameter> params = new ArrayList<EclDocParameter>();
		for (EclDocParameter p : getParameters()) {
			if (p.isInput()) {
				inputParam = p;
				continue;
			}
			if (p.isInternal())
				continue;

			params.add(p);
		}

		if (inputParam != null) {
			w.dl();
			{
				w.dt("Input:");
				writeParam(inputParam, w);
			}
			w.closeTag();
		}

		if (params.size() > 0) {
			w.dl();
			{
				w.dt("Parameters:");
				for (EclDocParameter p : params)
					writeParam(p, w);
			}
			w.closeTag();
		}

		// --

		String returns = getDocumentation().getReturns();
		if (!CoreUtils.isBlank(returns)) {
			w.dl();
			{
				w.dt("Output:");
				w.dd(returns);
			}
			w.closeTag();
		}

		String example = getDocumentation().getExample();
		if (!CoreUtils.isBlank(example)) {
			w.dl();
			{
				w.dt("Example:");
				w.dd();
				{
					w.pre(example);
				}
				w.closeTag();
			}
			w.closeTag();
		}
		// String.format(
		// "<dl><dt>Example:</dt><dd><pre>%s</pre></dd></dl>", example);
		//
		// return String.format("%s%s%s%s%s", descBlock, inputBlock,
		// paramsBlock,
		// returnsBlock, exampleBlock);
	}
}
