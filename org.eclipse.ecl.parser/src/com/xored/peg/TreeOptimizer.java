/*
 * TreeOptimizer.java
 *
 * Created on September 10, 2006, 4:34 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.xored.peg;

/**
 * This is a utility class that defines the most usual operations performed by a
 * GrammarUtility. This allows for prunning of long branches, branches from a
 * certain type of Block, and empty Blocks.
 * 
 * @see GrammarUtility
 * @author Edgar A. Duenez-Guzman
 */
public final class TreeOptimizer {
	/**
	 * Removes all Blocks of the specified type in the provided tree. This
	 * method recursively searches the tree for Blocks of the specified type,
	 * removes them, and adds their children to its parent Block.
	 * 
	 * @param tree
	 *            The root of the tree to modify.
	 * @param type
	 *            The type of Blocks to prune.
	 */
	public static void removeAllOfType(Block tree, int type) {
		boolean amILeave = tree.getNumChildren() == 0;
		int n;

		for (int i = 0; i < tree.getNumChildren(); i++)
			if (tree.getChild(i).getType() == type)
				tree.removeChild(i--); // Return to the previous child after
										// removing. for loop will increment

		for (int i = 0; i < tree.getNumChildren(); i++)
			removeAllOfType(tree.getChild(i), type);

		n = tree.getNumChildren();
		if (!amILeave && n == 0) // If I was not a leave, but I am now...
			tree.setEnd(tree.getBegin());
		else if (n > 0) {
			tree.setBegin(tree.getChild(0).getBegin());
			tree.setEnd(tree.getChild(n - 1).getEnd());
		}
	}

	/**
	 * Removes all child Blocks of the specified type in the specified tree,
	 * provided they have no children on their own. This method recursively
	 * searches the tree for leaves of the specified type and removes them.
	 * 
	 * @param tree
	 *            The root of the tree to modify.
	 * @param type
	 *            The type of Blocks to prune.
	 */
	public static void removeLeavesOfType(Block tree, int type) {
		for (int i = 0; i < tree.getNumChildren(); i++)
			if (tree.getChild(i).getType() == type
					&& tree.getChild(i).getNumChildren() == 0)
				tree.removeChild(i--); // Return to the previous child after
										// removing.

		for (int i = 0; i < tree.getNumChildren(); i++)
			removeAllOfType(tree.getChild(i), type);
	}

	/**
	 * Removes all child Blocks of the specified type in the provided tree. This
	 * method recursively searches the tree for children of the specified type
	 * and removes them.
	 * 
	 * @param tree
	 *            The root of the tree to modify.
	 * @param type
	 *            The type of Blocks to prune.
	 */
	public static void removeChildrenOfType(Block tree, int type) {
		if (tree.getType() == type)
			for (int i = 0; i < tree.getNumChildren(); i++)
				tree.removeChild(i--); // Return to the previous child after
										// removing.

		for (int i = 0; i < tree.getNumChildren(); i++)
			removeChildrenOfType(tree.getChild(i), type);
	}

	/**
	 * <pre>
	 *         Before      After
	 *          _._         _._
	 *         / | \      ./.| \.
	 *       ./  |  \. => /\
	 *       /\ .|       /\
	 *      /\
	 * </pre>
	 * 
	 * Collapses long sequences of one-parent/one-child (long branches) starting
	 * in the specified tree. The first node to have a number of children
	 * different than one will be preserved, and every parent node of which this
	 * is its only child will be erased.
	 * 
	 * @param tree
	 *            The tree to collapse the long branches from.
	 */
	public static void collapse(Block tree) {
		collapse(tree, null);
	}

	private static boolean in(int t, int[] ts) {
		if (ts == null)
			return true;
		for (int i = 0; i < ts.length; i++)
			if (t == ts[i])
				return true;
		return false;
	}

	/**
	 * <pre>
	 *         Before      After
	 *          _._         _._
	 *         / | \      ./.| \.
	 *       ./  |  \. => /\
	 *       /\ .|       /\
	 *      /\
	 * </pre>
	 * 
	 * Collapses branch sections with only one child each into the first node
	 * with none or more than one child. This method copies this non-linear node
	 * into the root of the long branch, and all intermediate nodes (including
	 * the branch root) are lost. Only nodes of the types specified in the array
	 * of integers will be considered for prunning. A Block with only one child
	 * but a type not the list will be considered not part of the branch.
	 * 
	 * @param tree
	 *            The tree to collapse.
	 * @param types
	 *            the types of nodes to collapse, if the node does not have the
	 *            appropriate type, it will not be collapsed, even if it is a
	 *            long branch, unless types is set to null, in which case all
	 *            node types are collapsed.
	 */
	public static void collapse(Block tree, int[] types) {
		Block dest = tree, temp = tree;
		while (temp.getNumChildren() == 1) {
			if (in(temp.getType(), types)) // Type to collapse
				dest = temp;
			temp = temp.getChild(0);
		}
		// Check if it was a leaf.
		if (in(temp.getType(), types)) // Type to collapse
			dest = temp;
		if (tree != dest) {
			tree.setBegin(dest.getBegin());
			tree.setEnd(dest.getEnd());
			tree.setText(dest.getText());
			tree.setType(dest.getType());
			tree.setUserObject(dest.getUserObject());
			tree.removeChild(0);
			for (int i = 0; i < dest.getNumChildren(); i++)
				tree.addChild(dest.getChild(i));
		}

		for (int i = 0; i < tree.getNumChildren(); i++)
			collapse(tree.getChild(i), types);
	}

	/**
	 * Removes all Blocks in the tree that have no text content associated with
	 * them (i.e. <tt>getBegin()</tt> and <tt>getEnd()</tt> are equal).
	 * 
	 * @param tree
	 *            The root of the tree to prune.
	 */
	public static void removeEmpty(Block tree) {
		for (int i = 0; i < tree.getNumChildren(); i++)
			if (tree.getChild(i).getBegin() == tree.getChild(i).getEnd())
				tree.removeChild(i--);
		for (int i = 0; i < tree.getNumChildren(); i++)
			removeEmpty(tree.getChild(i));
	}
}
