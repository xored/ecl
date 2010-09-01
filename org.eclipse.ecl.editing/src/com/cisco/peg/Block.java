/*
 * Block.java
 *
 * Created on October 19, 2005, 9:18 PM
 *
 * @author Edgar A. Duenez-Guzman
 *
 * This code is an open source code, protected by the GNU General Public License.
 * If you didn't get a copy of that license with this code, contact the author
 * immediately at duenez@cs.utk.edu
 */

package com.cisco.peg;

import java.util.Vector;

/**
 * <p>
 * Basic node of a parsed tree. It contains information about the content and
 * type of Block. Also, it has a list of children. Every String processed by a
 * parser will be transformed into a parsed tree, and thus is accessible from
 * the Blocks by means of <tt>getText()</tt>. The specific region in the text
 * that this Block has transformed into a node in the tree is between the
 * indices of <tt>getBegin()</tt> (inclusive) and <tt>getEnd()</tt> (exclusive).
 * </p>
 * <p>
 * 
 * @author Edgar A Duenez-Guzman
 */
public class Block {
	private static int level = 0; // Used to recursively printout.
	/**
	 * This is the no-parse Block. It is returned by parsing grammars when the
	 * parsing of a String fails. It is safe to compare directly using the ==
	 * and != operators against this Block to test for parsing errors.
	 */
	public static final Block NO_PARSE = new Block("NoParse", 0, 7);
	// The reference to the String parsed.
	private String text;
	// An user object, used during optimization to store arbitrary
	// "semantic value"
	private Object user;
	// The numerical type of this Block. This is provided as a mean to quickly
	// identify parsed Blocks.
	private int type;
	// The starting (inclusive) and ending (exclusive) positions in the parsed
	// String
	// corresponding to the area contained in this Block and all its sub-Blocks.
	private int begin, end;
	// The array of sub-Blocks for this node.
	private Vector<Block> children;

	/**
	 * Creates a new instance of Block with empty operator and with no children.
	 */
	public Block() {
		super();
		children = new Vector<Block>();
		text = "";
	}

	/**
	 * Creates a new instance of Block with the specified region in the
	 * provided, String as the parsed area of the String. By convention, all
	 * sub-Blocks should refer to the same String reference, and use a subset
	 * (not necessarily proper) of the portion used by this Block. This is not
	 * enforced though.
	 * 
	 * @param text
	 *            The reference to the parsed String that generated this Block.
	 * @param begin
	 *            The starting (inclusive) position in the String corresponding
	 *            to the contents of this Block.
	 * @param end
	 *            The ending (exclusive) position in the String corresponding to
	 *            the contents of this Block.
	 */
	public Block(String text, int begin, int end) {
		this();
		children = new Vector<Block>();
		this.text = text;
		this.begin = begin;
		this.end = end;
	}

	/**
	 * <p>
	 * Creates a new instance of Block with the specified String and region as
	 * parsed contents, the Block will be set to the specified type, and will
	 * add the Blocks given in the array as its children.
	 * </p>
	 * <p>
	 * By convention, all sub-Blocks should refer to the same String reference,
	 * and use a subset (not necessarily proper) of the portion used by this
	 * Block. This is not enforced though.
	 * </p>
	 * 
	 * @param text
	 *            The reference to the parsed String that generated this Block.
	 * @param begin
	 *            The starting (inclusive) position in the String corresponding
	 *            to the contents of this Block.
	 * @param end
	 *            The ending (exclusive) position in the String corresponding to
	 *            the contents of this Block.
	 * @param type
	 *            The numerical type to be given to this Block.
	 * @param child
	 *            The array of children. These will be referenced and not
	 *            copied. The array can be null or of length zero in which case,
	 *            the Block will be considered a terminal (leaf) node.
	 */
	public Block(String text, int begin, int end, int type, Block[] child) {
		this(text, begin, end);
		this.type = type;
		if (child != null) {
			for (int i = 0; i < child.length; i++)
				children.add(child[i]);
			children.trimToSize();
		}
	}

	/**
	 * Frees the non required memory used by the Vector of children by trimming
	 * to fit the number of children. This function resets the terminal status
	 * of the block to true if and only if the number of children is zero.
	 * 
	 * @see java.util.Vector#trimToSize()
	 */
	public void trimChildren() {
		children.trimToSize();
	}

	/**
	 * Adds the specified Block to the end of list of children of this node. If
	 * the same Block is added to 2 or more Blocks (even if it is the same) in
	 * the same parsed tree the results are undefined. This function only
	 * references the Block, and does not copy it.
	 * 
	 * @param block
	 *            The Block to be added as child of this Block.
	 */
	public void addChild(Block block) {
		children.add(block);
	}

	/**
	 * Removes the specified child, and shifts right any subsequent children.
	 * 
	 * @param i
	 *            The index of the child to remove.
	 */
	public void removeChild(int i) {
		children.remove(i);
	}

	/**
	 * Gets the child in position i of the list of children. This function
	 * returns the direct reference to the child and not a copy.
	 * 
	 * @param i
	 *            The index of the child to get.
	 * @return The i-th child of this block.
	 */
	public Block getChild(int i) {
		return children.get(i);
	}

	/**
	 * Gets the type (id) of this Block. This is used by the user, presumably to
	 * group Block with similar features into one type to handle them in the
	 * same way while executing them.
	 * 
	 * @return The type of the Block.
	 */
	public int getType() {
		return type;
	}

	/**
	 * Sets the type (id) of this Block to the specified value.
	 * 
	 * @param t
	 *            The new type of this Block.
	 */
	public void setType(int t) {
		type = t;
	}

	/**
	 * Gets the total number of children Blocks in this Block.
	 * 
	 * @return The number of children. They can then be accessed with indices
	 *         from 0 to getNumChildren()-1.
	 */
	public int getNumChildren() {
		return children.size();
	}

	/**
	 * Utility method that creates a copy of the region in the parsed String
	 * that this Block contains. This is equivalent to calling
	 * <tt>getText().substring( getBegin(), getEnd() )</tt>
	 * 
	 * @return A copy of the region of interest as a String.
	 */
	public String getSubtext() {
		return text.substring(begin, end);
	}

	/**
	 * Gets the referenced String from which (at least) this Block and probably
	 * all its sub-Blocks. This method does not copy the String, and instead it
	 * returns a reference to it. The returned String should not be modified by
	 * the user.
	 * 
	 * @return The parsed String from which this Block was created.
	 */
	public String getText() {
		return text;
	}

	/**
	 * Sets the reference String from which this Block was created. The provided
	 * String is references directly without making a copy of it.
	 * 
	 * @param t
	 *            The new reference to the text contained in this Block.
	 */
	public void setText(String t) {
		text = t;
	}

	/**
	 * Returns a reference to the user specified Object attached to this node.
	 * 
	 * @return The user Object of this Block.
	 */
	public Object getUserObject() {
		return user;
	}

	/**
	 * Sets a reference to the provided Object to be used as the user-defined
	 * data contained in this Block.
	 * 
	 * @param u
	 *            The new user Object for this Block.
	 */
	public void setUserObject(Object u) {
		user = u;
	}

	/**
	 * Gets the starting position in the text associated with this Block from
	 * which the contents of the node was generated.
	 * 
	 * @return The starting index in the text.
	 */
	public int getBegin() {
		return begin;
	}

	/**
	 * Sets the starting position in the text associated with this Block from
	 * which the contents of the node was presumably generated.
	 * 
	 * @param b
	 *            The new starting index to be used.
	 */
	public void setBegin(int b) {
		begin = b;
	}

	/**
	 * Gets the finishing position (exclusive) in the text associated with this
	 * Block from which the contents of the node was generated.
	 * 
	 * @return The finishing index in the text.
	 */
	public int getEnd() {
		return end;
	}

	/**
	 * Sets the finishing position (exclusive) in the text associated with this
	 * Block from which the contents of the node was presumably generated.
	 * 
	 * @param e
	 *            The new finishing index to be used.
	 */
	public void setEnd(int e) {
		end = e;
	}

	// ----------------------------- Object ---------------------------
	/**
	 * Returns the String representation of this Block by recursively calling
	 * this method in each children. This method is NOT thread safe.
	 * 
	 * @return The String representation of this Block and its children.
	 */
	public String toString() {
		String indent = "";
		for (int i = 0; i < level; i++)
			indent += "  ";
		indent += "Block ("
				+ text.substring(begin, end).replaceAll("[\\r\\n]", "\\\\n")
				+ "), type [" + type + "]\n";
		level++;
		for (int i = 0; i < children.size(); i++)
			indent += children.get(i);
		level--;
		return indent;
	}
}
