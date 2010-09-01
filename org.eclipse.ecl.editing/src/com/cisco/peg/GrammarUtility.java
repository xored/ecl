/*
 * GrammarUtility.java
 *
 * Created on October 20, 2006, 4:06 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.cisco.peg;

/**
 * <p>
 * This interface is used to define post parsing optimizations on a parsed tree.
 * It also includes the optimization of parse error.
 * </p>
 * <p>
 * The reason for the existence of this interface is because the automatic
 * generators of parsed trees and errors simply include all possible information
 * regarding each step involved in the generation or either a tree or an error.
 * </p>
 * <p>
 * Most applications will, however, want to trim many of the possible causes for
 * an error (such as blanks, or high-level types) and just keep those of
 * terminals or simple sintactical components. Also, a parsed tree will have
 * nodes for every single step in the sintactic hierarchy of the grammar for a
 * given parsed text, even if thestep is just a placeholder for a multi-case
 * matching. In these cases, most applications would benefit from collapsing
 * such long branches in the tree to more compact semantically meanningful
 * nodes.
 * </p>
 * 
 * @author Edgar A. Duenez-Guzman
 */
public interface GrammarUtility {
	/**
	 * Modifies the provided (sub) tree in a specific way (for instance removing
	 * unnecesary nodes in the middle or leaves).
	 * 
	 * @param b
	 *            The Block to optimize.
	 */
	public void optimizeParsedTree(Block b);

	/**
	 * Modifies the provided error in a specific way (for instance removing
	 * unnecesary causes associated with it).
	 * 
	 * @param e
	 *            The ParseError to optimize.
	 */
	public void optimizeParseError(ParseError e);
}
