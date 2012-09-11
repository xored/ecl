package org.eclipse.ecl.doc;

import java.io.IOException;
import java.io.Writer;
import java.util.Stack;

public class EclDocWriter {

	private Writer out;

	public EclDocWriter(Writer out) {
		this.out = out;
	}

	public void close() throws IOException {
		while (!openNodes.isEmpty()) {
			closeTag();
		}
		out.flush();
		out.close();
	}

	public void dl() throws IOException {
		openTag("dl");
	}

	public void dt(String innerHtml) throws IOException {
		openTag("dt");
		writeText(innerHtml);
		closeTag();
	}

	public void b(String innerHtml) throws IOException {
		openTag("b");
		writeText(innerHtml);
		closeTag();
	}

	public void dd() throws IOException {
		openTag("dd");
	}

	public void dd(String innerHtml) throws IOException {
		dd();
		writeText(innerHtml);
		closeTag();
	}

	public void pre(String innerHtml) throws IOException {
		openTag("pre");
		closeOpenTag();
		out.append(innerHtml);
		closeTag();
	}

	public void writeText(String text) throws IOException {
		closeOpenTag();

		for (String line : text.split("(\r)?\n")) {
			writeIndent();
			out.append(line).append(NEWLINE);
		}
	}

	public void write(String text) throws IOException {
		out.append(text);
	}

	public void write(Integer text) throws IOException {
		write(text.toString());
	}

	private void writeOneLiner(String node, String text) throws IOException {
		closeOpenTag();
		writeIndent();
		out.append(String.format("<%s>", node)).append(text)
				.append(String.format("</%s>", node)).append(NEWLINE);
	}

	public void closeTag() throws IOException {
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

	private void closeOpenTag() throws IOException {
		if (openNodeClosed) {
			return;
		}
		out.append(">").append(NEWLINE);
		openNodeClosed = true;

	}

	public void openTag(String node) throws IOException {
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
}
