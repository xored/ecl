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
package org.eclipse.ecl.core;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class CommandStack {

	public CommandStack(Command command, CommandStack parent) {
		this.command = command;
		this.parent = parent;
	}

	private Map<String, Declaration> declarations = new LinkedHashMap<String, Declaration>();

	public void declare(String name, Declaration decl) {
		declarations.put(name, decl);
	}

	public Declaration lookup(String name) {
		Declaration decl = declarations.get(name);
		if (decl != null) {
			return decl;
		}

		CommandStack parent = getParent();
		if (parent == null) {
			return null;
		}

		return parent.lookup(name);
	}

	public Command getCommand() {
		return command;
	}

	public CommandStack getParent() {
		return parent;
	}

	public static void addListener(IStackListener listener) {
		listeners.addIfAbsent(listener);
	}

	public static void removeListener(IStackListener listener) {
		listeners.remove(listener);
	}

	public static void fireEnter(CommandStack stack) {
		for (IStackListener l : listeners) {
			l.enter(stack);
		}
	}

	public static void fireExit(CommandStack stack) {
		for (IStackListener l : listeners) {
			l.exit(stack);
		}
	}

	private final Command command;
	private final CommandStack parent;

	private static CopyOnWriteArrayList<IStackListener> listeners = new CopyOnWriteArrayList<IStackListener>();

}
