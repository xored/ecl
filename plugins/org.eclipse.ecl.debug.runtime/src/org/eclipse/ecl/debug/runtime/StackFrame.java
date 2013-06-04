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
package org.eclipse.ecl.debug.runtime;

import java.util.ArrayList;
import java.util.List;

public class StackFrame {

	private final String file;
	private final String command;
	private final int line;

	private static final String SEP = ",";
	private final List<Arg> args;

	private static final List<Arg> EMPTY_ARGS = new ArrayList<Arg>();

	public static StackFrame fromString(String text) {
		String[] parts = text.split("(?<!\\\\)" + SEP);

		if (parts.length < 3) {
			throw new IllegalArgumentException("Invalid stack format: " + text);
		}
		String file = decode(parts[0]);
		String command = parts[1];
		int line = Integer.valueOf(parts[2]);

		List<Arg> args = parts.length > 3 ? decodeArgs(parts[3]) : EMPTY_ARGS;

		return new StackFrame(file, command, line, args);
	}

	public StackFrame(String file, String command, int line, List<Arg> args) {
		this.file = file;
		this.command = command;
		this.line = line;
		this.args = args;
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

	public List<Arg> getArgs() {
		return args;
	}

	private static String encode(String s) {
		return s.replace(",", "\\,");
	}

	private static String decode(String s) {
		return s.replace("\\,", ",");
	}

	@Override
	public String toString() {
		return encode(file) + SEP + command + SEP + line + SEP
				+ encodeArgs(args);
	}

	private static String encodeArgs(List<Arg> args) {
		StringBuilder b = new StringBuilder();

		for (Arg a : args) {
			b.append(a.toString());
			b.append(SEP);
		}

		return encode(b.toString());
	}

	private static List<Arg> decodeArgs(String text) {
		List<Arg> result = new ArrayList<Arg>();

		text = decode(text);

		String[] parts = text.split("(?<!\\\\)" + SEP);
		for (int i = 0; i < parts.length / 5; ++i)
			result.add(new Arg(decode(parts[i * 5]), decode(parts[i * 5 + 1]),
					decode(parts[i * 5 + 2]), decode(parts[i * 5 + 3]), Boolean
							.valueOf(parts[i * 5 + 4])));

		return result;
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
		StackFrame other = (StackFrame) obj;
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

		if (args.size() != other.args.size())
			return false;

		return args.equals(other.args);
	}

	public static class Arg {
		private final String type;
		private final String name;
		private final String value;
		private final String actualType;
		private final boolean isSet;

		public Arg(String type, String actualType, String name, String value,
				boolean isSet) {
			this.type = type;
			this.actualType = actualType;
			this.name = name;
			this.value = value;
			this.isSet = isSet;
		}

		public String getType() {
			return type;
		}

		public String getActualType() {
			return actualType;
		}

		public String getName() {
			return name;
		}

		public String getValue() {
			return value;
		}

		public boolean isSet() {
			return isSet;
		}

		public String toString() {
			return encode(type) + SEP + encode(getActualType()) + SEP
					+ encode(name) + SEP + encode(value) + SEP
					+ String.valueOf(isSet);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((actualType == null) ? 0 : actualType.hashCode());
			result = prime * result + (isSet ? 1231 : 1237);
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((type == null) ? 0 : type.hashCode());
			result = prime * result + ((value == null) ? 0 : value.hashCode());
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
			Arg other = (Arg) obj;
			if (actualType == null) {
				if (other.actualType != null)
					return false;
			} else if (!actualType.equals(other.actualType))
				return false;
			if (isSet != other.isSet)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (type == null) {
				if (other.type != null)
					return false;
			} else if (!type.equals(other.type))
				return false;
			if (value == null) {
				if (other.value != null)
					return false;
			} else if (!value.equals(other.value))
				return false;
			return true;
		}
	}

}
