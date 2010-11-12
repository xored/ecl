package org.eclipse.ecl.core.util;

public class DefaultFormatter implements ICommandFormatter {

	public static final int INDENT_SIZE = 4;

	protected static final String LINE_SEP = "\n";
	protected static final String SPACE = " ";
	protected static final String PIPE = "|";
	protected static final String OPEN_BRACE = "{";
	protected static final String CLOSE_BRACE = "}";
	protected static final String OPEN_BRACKET = "[";
	protected static final String CLOSE_BRACKET = "]";
	protected static final String ATTR_PREFIX = "-";

	public void newPipeCommand() {
		if (!firstPipeCommand) {
			buffer.append(SPACE).append(PIPE).append(SPACE);
		}
		firstPipeCommand = false;
	}

	public void newSequenceCommand() {
		if (!firstSequenceCommand) {
			newLine();
		}
		addIndent();
		firstSequenceCommand = false;
		firstPipeCommand = true;
	}

	public void addCommandName(String name) {
		buffer.append(name);
	}

	public void addAttrName(String name) {
		buffer.append(SPACE).append(ATTR_PREFIX).append(name);
	}

	public void addAttrValue(String value) {
		buffer.append(SPACE).append(value);
	}

	public void openGroup(boolean singleLine) {
		buffer.append(SPACE).append(OPEN_BRACE);
		if (!singleLine)
			level++;
	}

	public void closeGroup(boolean singleLine) {
		if (!singleLine) {
			level--;
			newLine();
			addIndent();
		}
		buffer.append(CLOSE_BRACE);
	}

	public void openExec() {
		buffer.append(SPACE).append(OPEN_BRACKET);
	}

	public void closeExec() {
		buffer.append(CLOSE_BRACKET);
	}

	@Override
	public String toString() {
		return buffer.toString();
	}

	protected void addIndent() {
		for (int i = 0; i < level * INDENT_SIZE; i++)
			buffer.append(SPACE);
	}

	protected void newLine() {
		buffer.append(LINE_SEP);
		lineNumber++;
	}

	protected StringBuffer buffer = new StringBuffer();
	protected int level;
	protected int lineNumber;

	protected boolean firstSequenceCommand = true;
	protected boolean firstPipeCommand = true;

}
