package org.eclipse.ecl.parser;

public enum EclPartition {
	script, sequence, expr, parallel, pipeline,
	// primary,
	command, commandNamespace, commandName,
	//
	param, paramName, paramValue, curly, subCommand, literal, number, string,
	//
	colon, and, or, lparen, rparen, lcurly, rcurly, lbrack, rbrack, spacing, ws, nl,
	//
	unknown
}