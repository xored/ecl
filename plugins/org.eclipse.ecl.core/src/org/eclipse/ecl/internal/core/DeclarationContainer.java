package org.eclipse.ecl.internal.core;

import static java.lang.String.format;
import static org.eclipse.ecl.internal.core.CorePlugin.err;

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.core.Declaration;

public class DeclarationContainer {
	private final DeclarationContainer parent;

	public DeclarationContainer(DeclarationContainer parent) {
		this.parent = parent;
	}

	private Map<String, Declaration> declarations = new LinkedHashMap<String, Declaration>();

	public synchronized Iterable<Declaration> declarations() {
		return declarations.values();
	}

	public synchronized void declare(String name, Declaration decl)
			throws CoreException {
		if (declarations.containsKey(name)) {
			throw new CoreException(err(format("'%s' already declared", name)));
		}
		declarations.put(name, decl);
	}

	public synchronized Declaration lookup(String name) {
		Declaration decl = declarations.get(name);
		if (decl != null) {
			return decl;
		}

		if (parent == null) {
			return null;
		}

		return parent.lookup(name);
	}

}
