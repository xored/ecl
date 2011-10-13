/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     xored software, Inc - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecl.internal.parser;

public class SyntaxErrorException extends RuntimeException {

	private static final long serialVersionUID = -3597387509846380248L;

	public final int line;
	public final int col;

	public SyntaxErrorException(int line, int col) {
		this(line, col, null);
	}

	public SyntaxErrorException(int line, int col, String msg) {
		super(msg);
		this.line = line;
		this.col = col;
	}

	@Override
	public String toString() {
		String result = "Syntax error on line " + line + ", col " + col;
		if (getMessage() != null && getMessage().length() > 0)
			result += ". " + getMessage();
		return result;
	}
}
