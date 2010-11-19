package org.eclipse.ecl.internal.parser;

public class SyntaxErrorException extends RuntimeException {
	public final int line;
	public final int col;

	public SyntaxErrorException(int line, int col) {
		this.line = line;
		this.col = col;
	}
}
