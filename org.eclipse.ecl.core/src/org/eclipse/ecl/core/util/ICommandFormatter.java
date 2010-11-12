package org.eclipse.ecl.core.util;

public interface ICommandFormatter {

	void newSequenceCommand();

	void newPipeCommand();

	void addCommandName(String name);

	void addAttrName(String name);

	void addAttrValue(String value);

	void openGroup(boolean singleLine);

	void closeGroup(boolean singleLine);

	void openExec();

	void closeExec();

	String toString();

}
