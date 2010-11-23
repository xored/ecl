package org.eclipse.ecl.internal.parser;

public class SyntaxErrorException extends RuntimeException {
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
