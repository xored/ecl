package com.xored.peg;

/**
 * Thrown whenever a missing non-terminal symbol is found
 * in a grammar source.
 */
public class MissingRuleException extends RuntimeException {
	private static final long serialVersionUID = 218270468056653572L;
	
	private final String ruleName;

	/**
	 * Constructs the exception with a message and a rule's name.
	 * @param message error explanation
	 * @param ruleName a name of the rule which is missing.
	 */
	public MissingRuleException(String message, String ruleName) {
		super(message);
		this.ruleName = ruleName;
	}

	/**
	 * Returns a name of the rule which is missing.
	 * @return a name of the rule which is missing.
	 */
	public String getRuleName() {
		return ruleName;
	}
}
