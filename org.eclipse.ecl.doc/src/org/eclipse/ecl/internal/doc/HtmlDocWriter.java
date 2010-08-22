package org.eclipse.ecl.internal.doc;

import static java.text.MessageFormat.format;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.doc.EclDocPlugin;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

public class HtmlDocWriter {

	private static final int COLUMN_NUM = 5;

	private Writer writer;

	public void packages(EPackage[] packages, OutputStream out)
			throws IOException {
		packages(packages, new PrintWriter(new OutputStreamWriter(out)));
	}

	public void packages(EPackage[] packages, Writer writer) throws IOException {
		try {
			this.writer = writer;
			wStartDoc("Ecl Documentation", true);
			h1("Packages");
			wPackagesList(packages);
			for (EPackage p : packages) {
				h1(f("Package {0}", p.getName()), getPackageId(p));
				for (EClassifier c : p.getEClassifiers()) {
					if (c instanceof EClass) {
						wCommandOverview((EClass) c);
						br().br().nl();
					}
				}
			}
			wEndDoc();
		} finally {
			this.writer.flush();
			this.writer.close();
		}
	}

	void wStartDoc(String title, boolean includeCss) throws IOException {
		w("<html>").nl();
		if (title != null || includeCss) {
			w("<head>").nl();
			if (title != null)
				w("<title>{0}</title>", title).nl();
			if (includeCss)
				w("<style>").nl().w(getCssContent()).nl().w("</style>").nl();
			w("</head>").nl();
		}
		w("<body>").nl();
	}

	void wEndDoc() throws IOException {
		w("</body>").nl();
		w("</html>");
	}

	void wPackagesList(EPackage[] packages) throws IOException {
		w("<ul>").nl();
		for (EPackage p : packages) {
			w("<li><a href=\"#{1}\">{0}</a></li>\n", p.getName(),
					getPackageId(p));
		}
		w("</ul>").nl();
	}

	void wPackageOverview(EPackage p) throws IOException {
		EList<EClassifier> eClassifiers = p.getEClassifiers();
		int size = eClassifiers.size();
		int lines = size / COLUMN_NUM;
		w("<table>").nl();
		for (int i = 0; i < lines; i++) {
			w("<tr>").nl();
			for (int j = 0; (j < COLUMN_NUM) && (i * lines + j < size); j++) {
				EClassifier eClassifier = eClassifiers.get(i * lines + j);
				w("<td><a href=\"#{1}\">{0}</td>", eClassifier.getName(),
						getClassId(p, eClassifier)).nl();
			}
			w("</tr>").nl();
		}
		w("</table>").nl();
	}

	void wCommandOverview(EClass c) throws IOException {
		w("<span class=\"commandName\">").w(c.getName()).w("</span>");
		for (EStructuralFeature sf : c.getEAllStructuralFeatures()) {
			if (sf.getEAnnotation("internal") != null) {
				continue;
			}
			w("   <span class=\"paramName\">");
			if (sf.getEAnnotation("input") != null)
				w("&");
			else
				w("-");
			w(sf.getName()).w("</span>");
			w("[").w(String.valueOf(sf.getLowerBound())).w("..")
					.w(String.valueOf(sf.getUpperBound())).w("]");
			w(":").w("<span class=\"paramType\">").w(sf.getEType().getName())
					.w("</span>");
		}
	}

	void wSynopsis(EClass c) throws IOException {
		w("<b>").w(c.getName()).w("</b>");
		w("<i>");
		for (EStructuralFeature sf : c.getEAllStructuralFeatures()) {
			EAnnotation ann = sf.getEAnnotation("internal");
			if (ann != null) {
				continue;
			}
			w(" ");
			String name = sf.getName();
			if (sf.getLowerBound() == 0) {
				w("?");
			}
			if (sf.getUpperBound() == -1) {
				w(name).w(" ").w(name).w(" ...");
			} else {
				w(name);
				for (int i = 1; i < sf.getUpperBound(); i++) {
					w(" ").w(name);
				}
			}
			if (sf.getLowerBound() == 0) {
				w("?");
			}
		}
		w("</i>");
	}

	String getCssContent() {
		try {
			return FileUtil.readFileAsString("css/default.css");
		} catch (Exception e) {
			EclDocPlugin.err("Failed to get style", e);
		}
		return "";
	}

	String getClassId(EPackage p, EClassifier c) throws IOException {
		return f("{0}-{1}", p.getName(), c.getName());
	}

	String getPackageId(EPackage p) {
		return p.getName();
	}

	Set<String> getFriendlyNames(EPackage p, EClass cl) throws IOException {
		try {
			return CoreUtils.getFriendlyNames(p.getNsURI(), cl.getName());
		} catch (CoreException e) {
			// do nothing
			return Collections.emptySet();
		}
	}

	HtmlDocWriter h1(String text) throws IOException {
		return w("<h1>{0}</h1>", text);
	}

	HtmlDocWriter h1(String text, String id) throws IOException {
		return w("<h1 id=\"{1}\">{0}</h1>", text, id);
	}

	HtmlDocWriter h2(String text, String id) throws IOException {
		return w("<h2 id=\"{2}\">{0}</h2>", text, id);
	}

	HtmlDocWriter h4(String text) throws IOException {
		return w("<h4>{0}</h4>", text);
	}

	HtmlDocWriter w(String text) throws IOException {
		writer.write(text);
		return this;
	}

	HtmlDocWriter nl() throws IOException {
		return w("\n");
	}

	HtmlDocWriter w(String text, Object... args) throws IOException {
		writer.write(format(text, args));
		return this;
	}

	HtmlDocWriter br() throws IOException {
		return w("<br/>").nl();
	}

	HtmlDocWriter hr() throws IOException {
		return w("<hr/>").nl();
	}

	String f(String text, Object... args) throws IOException {
		return format(text, args);
	}
}
