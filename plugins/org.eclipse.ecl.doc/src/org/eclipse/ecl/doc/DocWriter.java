package org.eclipse.ecl.doc;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.eclipse.ecl.core.util.EclCommandNameConvention;
import org.eclipse.ecl.internal.doc.FileUtil;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

public class DocWriter {
	private Writer out;
	private EPackage[] packages;
	private EClass command;

	private DocWriter(EPackage[] packages, Writer out) {
		this.out = out;
		this.packages = packages;
		this.command = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				"http://www.eclipse.org/ecl/core.ecore").getEClassifier(
				"Command");
		extractCommands();
	}

	private void extractCommands() {
		List<EClass> list = new ArrayList<EClass>();
		for (EPackage p : packages) {
			for (EClassifier classifier : p.getEClassifiers()) {
				if (classifier instanceof EClass) {
					EClass clazz = (EClass) classifier;
					if (clazz.getEAllSuperTypes().contains(command)
							&& !clazz.isAbstract() && !skipCommand(clazz)) {
						list.add(clazz);
					}
				}
			}
		}
		Collections.sort(list, new Comparator<EClass>() {

			@Override
			public int compare(EClass c1, EClass c2) {
				return getCommandName(c1).compareTo(getCommandName(c2));
			}
		});

		commands = list.toArray(new EClass[list.size()]);
	}
	
	private static final List<String> SKIP_COMMANDS = 
			Arrays.asList(new String[] { "if", "contains-image", "recognize", 
					"get-region", "get-region-text", "parallel", "pipeline", "script",
					"setup-player", "shoutdown-player", "unsupported", "options",
					"get-advanced-info", "sequence", "check", "control-command", "control-not-found",
					"exec", "foreach", "set-value"});
	protected boolean skipCommand(EClass command) {
		return SKIP_COMMANDS.contains(getCommandName(command));
	}

	private void write() throws IOException {
		openNode("html");
		writeAttribute("lang", "en");
		writeHead();
		writeBody();
	}

	private void writeBody() throws IOException {
		openNode("body");
		anchor("top");
		h2("Commands");
		openNode("ul");
		for (EClass command : commands) {
			openNode("li");
			openNode("a");
			writeAttribute("href",
					String.format("#%s", getCommandName(command)));
			writeText(getCommandName(command));
			closeNode();// a
			closeNode(); // li
		}
		closeNode(); // ul

		for (EClass command : commands) {
			writeCommand(command);
		}
		closeNode(); // body
	}

	private void writeCommand(EClass command) throws IOException {
		String name = getCommandName(command);
		anchor(name);
		h2(name);
		openNode("dl");

		strongDt("Description");
		String description = getDescription(command);
		if (description == null) {
			description = "To be described";
		}
		pDd(description);

		EStructuralFeature[] params = getParameters(command);
		if(params.length > 0) {
			strongDt("Parameters");
			for(EStructuralFeature param : params) {
				writeFeature(param);
			}
		}

		EStructuralFeature input = getInputParameter(command);
		if (input != null) {
			strongDt("Input");
			writeFeature(input);
		}

		String outputDescription = getOutputDescription(command);
		if (outputDescription != null) {
			strongDt("Output");
			dd(outputDescription);
		}

		String example = getExample(command);
		if (example != null) {
			strongDt("Example");
			dd(example);
		}
		
		closeNode(); // dl
		hr();

	}

	private void writeFeature(EStructuralFeature feature) throws IOException {
		openNode("dd");
		StringBuilder result = new StringBuilder();
		result.append(String
				.format("<span class=\"paramType\">%s</span> <span class=\"paramName\">%s</span>",
						mapType(feature.getEType().getName()), feature.getName()));
		
		EAnnotation docs = feature.getEAnnotation(DOC_SOURCE);
		if (docs != null && docs.getDetails().containsKey(DESCRIPTION)) {
			result.append(" - ").append(docs.getDetails().get(DESCRIPTION));
		}
		
		String defaultVal = feature.getDefaultValueLiteral();
		if(defaultVal != null && defaultVal.length() > 0) {
			if(result.charAt(result.length() - 1) != '.') {
				result.append(".");
			}
			result.append(String.format(" Default value is %s", defaultVal));
		}
		writeText(result.toString());
		closeNode();

	}

	private static final Map<String, String> typeToDisplay = new HashMap<String, String>();
	static {
		typeToDisplay.put("EInt", "Integer");
		typeToDisplay.put("EIntegerObject", "Integer");
		typeToDisplay.put("EBoolean", "Boolean");
		typeToDisplay.put("EBooleanObject", "Boolean");
		typeToDisplay.put("EString", "String");
		
	}
	private static String mapType(String name) {
		String result = typeToDisplay.get(name);
		if(result == null) {
			result = name;
		}
		return result;
	}
	private String getDescription(EModelElement elem) {
		EAnnotation docs = elem.getEAnnotation(DOC_SOURCE);
		if (docs != null && docs.getDetails().containsKey(DESCRIPTION)) {
			return docs.getDetails().get(DESCRIPTION);
		}

		return null;
	}
	
	private String getExample(EModelElement elem) {
		EAnnotation docs = elem.getEAnnotation(DOC_SOURCE);
		if (docs != null && docs.getDetails().containsKey(EXAMPLE)) {
			return docs.getDetails().get(EXAMPLE);
		}

		return null;
	}

	private EStructuralFeature[] getParameters() {
		return new EStructuralFeature[0];
	}

	private void pDd(String description) throws IOException {
		openNode("dd");
		writeParagraphs(description);
		closeNode(); // dd
	}

	private void dd(String description) throws IOException {
		openNode("dd");
		writeText(description);
		closeNode(); // dd
	}

	private void strongDt(String text) throws IOException {
		openNode("dt");
		writeOneLiner("strong", text);
		closeNode();
	}

	private void emDt(String text) throws IOException {
		openNode("dt");
		writeOneLiner("em", text);
		closeNode();
	}

	private void writeParagraphs(String text) throws IOException {
		for (String line : text.split(("(\r)?\n"))) {
			writeOneLiner("p", line);
		}
	}

	private static final String DOC_SOURCE = "http://www.eclipse.org/ecl/docs";
	private static final String INPUT_SOURCE = "http://www.eclipse.org/ecl/input";
	private static final String INTERNAL_SOURCE = "http://www.eclipse.org/ecl/internal";
	private static final String DESCRIPTION = "description";
	private static final String EXAMPLE = "example";
	private static final String RETURNS = "returns";
	// sorted by name
	private EClass[] commands;

	private EStructuralFeature getInputParameter(EClass command) {
		for (EStructuralFeature feature : command.getEAllStructuralFeatures()) {
			EAnnotation input = feature.getEAnnotation(INPUT_SOURCE);
			if (input != null) {
				return feature;
			}
		}
		return null;
	}

	private EStructuralFeature[] getParameters(EClass command) {
		List<EStructuralFeature> result = new ArrayList<EStructuralFeature>();
		for (EStructuralFeature feature : command.getEAllStructuralFeatures()) {
			if (feature.getEAnnotation(INTERNAL_SOURCE) == null
					&& feature.getEAnnotation(INPUT_SOURCE) == null) {
				result.add(feature);
			}
		}
		return result.toArray(new EStructuralFeature[result.size()]);
	}

	private String getInputDescription(EClass command) {
		for (EStructuralFeature feature : command.getEAllStructuralFeatures()) {
			EAnnotation input = feature.getEAnnotation(INPUT_SOURCE);
			if (input == null) {
				continue;
			}

			StringBuilder result = new StringBuilder();
			result.append(String.format("<code>%s</code>", feature.getName()));
			EAnnotation docs = feature.getEAnnotation(DOC_SOURCE);
			if (docs != null && docs.getDetails().containsKey(DESCRIPTION)) {
				result.append(" - ").append(docs.getDetails().get(DESCRIPTION));
			}
			return result.toString();
		}

		return "";
	}

	private String getOutputDescription(EClass command) {
		EAnnotation doc = command.getEAnnotation(DOC_SOURCE);
		if (doc == null || !doc.getDetails().containsKey(RETURNS)) {
			return null;
		}
		return doc.getDetails().get(RETURNS);

	}

	private String getCommandName(EClass command) {
		return EclCommandNameConvention.toCommandName(command.getName());
	}

	private void hr() throws IOException {
		openNode("hr");
		closeNode();
	}

	private void writeHead() throws IOException {
		openNode("head");
		title("ECL Documentation");
		openNode("style");
		try {
			writeText(FileUtil.readFileAsString("css/new.css"));
		} catch (Exception e) {
		}
		closeNode(); //style
		closeNode();
	}

	private void title(String title) throws IOException {
		writeOneLiner("title", title);
	}

	private void anchor(String anchor) throws IOException {
		openNode("a");
		writeAttribute("name", anchor);
		closeNode();
	}

	private void h3(String title) throws IOException {
		writeOneLiner("h3", title);
	}

	private void h2(String title) throws IOException {
		writeOneLiner("h2", title);
	}

	private void writeOneLiner(String node, String text) throws IOException {
		closeOpenNode();
		writeIndent();
		out.append(String.format("<%s>", node)).append(text)
				.append(String.format("</%s>", node)).append(NEWLINE);
	}

	private void writeText(String text) throws IOException {
		closeOpenNode();

		for (String line : text.split("(\r)?\n")) {
			writeIndent();
			out.append(line).append(NEWLINE);
		}
	}

	private void close() throws IOException {
		while (!openNodes.isEmpty()) {
			closeNode();
		}
		out.flush();
		out.close();
	}

	public static void writePackages(EPackage[] packages, Writer out)
			throws IOException {
		DocWriter w = new DocWriter(packages, out);
		w.write();
		w.close();
	}

	private void closeNode() throws IOException {
		level--;
		if (!openNodeClosed) {
			out.append(" />").append(NEWLINE);
			openNodeClosed = true;
			openNodes.pop();
		} else {
			writeIndent();
			out.append(String.format("</%s>", openNodes.pop())).append(NEWLINE);
		}
	}

	private void closeOpenNode() throws IOException {
		if (openNodeClosed) {
			return;
		}
		out.append(">").append(NEWLINE);
		openNodeClosed = true;

	}

	private void openNode(String node) throws IOException {
		if (!openNodeClosed) {
			out.append(">").append(NEWLINE);
		}

		writeIndent();
		out.append(String.format("<%s", node));
		openNodes.push(node);
		openNodeClosed = false;
		level++;
	}

	private void writeAttribute(String name, String value) throws IOException {
		out.append(String.format(" %s=\"%s\"", name, value));
	}

	private void writeIndent() throws IOException {
		for (int i = 0; i < level; i++) {
			out.append(INDENT);
		}
	}

	private boolean openNodeClosed = true;

	private static final String NEWLINE = "\n";
	private static final String INDENT = "  ";
	private int level = 0;
	private Stack<String> openNodes = new Stack<String>();
	// Utility methods

}
