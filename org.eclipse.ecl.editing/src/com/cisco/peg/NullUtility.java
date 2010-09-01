/*
 * NullUtility.java
 *
 * Created on October 26, 2006, 9:23 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.cisco.peg;

/**
 * Null implementation of a GrammarUtility. Only defined for completeness. This
 * class performs absolutely no actions on Blocks or ParseErrors.
 * 
 * @author Edgar A. Duenez-Guzman
 */
public class NullUtility implements GrammarUtility {
	/**
	 * This is an empty implementation of optimizeParsedTree
	 * 
	 * @param b
	 *            The Block.
	 */
	public void optimizeParsedTree(Block b) {
	}

	/**
	 * This is an empty implementation of optimizeParseError
	 * 
	 * @param e
	 *            The ParseError.
	 */
	public void optimizeParseError(ParseError e) {
	}
}
