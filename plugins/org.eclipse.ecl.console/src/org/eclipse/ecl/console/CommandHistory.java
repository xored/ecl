package org.eclipse.ecl.console;

import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
	private static final String EMPTY_STRING = "";

	private final List<String> commands = new ArrayList<String>();
	private int index = 0;

	public void add(String command) {
		commands.add(command);
		index = commands.size();
	}

	public boolean isEmpty() {
		return commands.isEmpty();
	}

	public String getCurrent() {
		return isEmpty() ? EMPTY_STRING : commands.get(Math.max(0, Math.min(commands.size() - 1, index)));
	}

	public String getPrev() {
		if (index > 0) {
			index--;
		}
		return getCurrent();
	}

	public String getNext() {
		if (index < commands.size() - 1) {
			index++;
		}
		return getCurrent();
	}
}
