/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Yuri Strot)
 *******************************************************************************/
package org.eclipse.ecl.debug.model;

public class StackData {

	private final String file;
	private final String command;
	private final int line;

	public static StackData fromString(String text) {
		String[] parts = text.split(",");
		if (parts.length != 3) {
			throw new IllegalArgumentException("Invalid stack format: " + text);
		}
		String file = parts[0];
		String command = parts[1];
		int line = Integer.valueOf(parts[2]);
		return new StackData(file, command, line);
	}

	public StackData(String file, String command, int line) {
		this.file = file;
		this.command = command;
		this.line = line;
	}

	public String getFile() {
		return file;
	}

	public String getCommand() {
		return command;
	}

	public int getLine() {
		return line;
	}

	@Override
	public String toString() {
		return file + "," + command + "," + line;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((command == null) ? 0 : command.hashCode());
		result = prime * result + ((file == null) ? 0 : file.hashCode());
		result = prime * result + line;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StackData other = (StackData) obj;
		if (command == null) {
			if (other.command != null)
				return false;
		} else if (!command.equals(other.command))
			return false;
		if (file == null) {
			if (other.file != null)
				return false;
		} else if (!file.equals(other.file))
			return false;
		if (line != other.line)
			return false;
		return true;
	}

}
