package com.xored.peg;

public class InfiniteLoopException extends RuntimeException {
	private static final long serialVersionUID = 87123805885882326L;
	
	private final String rule;

	public InfiniteLoopException(String rule) {
		super("An infinite loop is discovered in the grammar. Suspicious rule is " + rule);
		this.rule = rule;
	}
	
	public String getRule() {
		return rule;
	}
}
