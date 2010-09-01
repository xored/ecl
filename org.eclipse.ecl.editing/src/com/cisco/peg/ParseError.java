/*
 * ParseError.java
 *
 * Created on September 3, 2006, 5:25 PM
 *
 * This code is an open source code, protected by the GNU General Public License.
 * If you didn't get a copy of that license with this code, contact the author
 * immediately at duenez@cs.utk.edu
 */

package com.cisco.peg;

import java.util.Vector;

/**
 * This class represents the occurrence of a parsing error. An error can have
 * multiple causes, and for optimization purposes, some causes might be dropped.
 * 
 * @author Edgar A. Duenez-Guzman
 */
public class ParseError extends Object {
	/**
	 * Platform-dependent new-line character.
	 */
	public static final String NEW_LINE = System.getProperty("line.separator");
	/**
	 * The size (in characters) of this platform newline (computed at runtime).
	 */
	public static final int NEW_LINE_SIZE = NEW_LINE.length();
	private int line, position, origPosition;
	private Vector<String> causes;
	private Vector<Integer> types;

	/**
	 * Creates a new instance of ParseError with the specified String as source,
	 * and the specified position in the text at which this error happened. This
	 * constructor will initialize the line number and in-line position of the
	 * actual cause of this error to facilitate its manipulation.
	 * 
	 * @param source
	 *            The source text of the error (attempted to parse).
	 * @param pos
	 *            The index in the String at which this error is claimed to have
	 *            occurred.
	 */
	public ParseError(String source, int pos) {
		super();
		int current, newLine = -NEW_LINE_SIZE;
		line = 0;
		origPosition = pos;
		// Compute the actual line/place where this error happened in the
		// String.
		do {
			line++;
			current = newLine + NEW_LINE_SIZE;
			newLine = source.indexOf(NEW_LINE, current);
			// System.out.println( "New line at " + newLine + " Current = " +
			// current );
		} while (newLine >= 0 && newLine < pos);
		position = pos - current + 1;
	}

	/**
	 * Adds a possible cause for a ParseError to this error.
	 * 
	 * @param msg
	 *            The message to attach to the cause.
	 * @param type
	 *            The type of Block that is claimed to generate the error.
	 */
	public void addPossibleError(String msg, int type) {
		if (causes == null) {
			causes = new Vector<String>();
			types = new Vector<Integer>();
		}
		causes.add(msg);
		types.add(type);
	}

	/**
	 * Gets the original position of the error in the text.
	 * 
	 * @return The original index for the error.
	 */
	public int getOrigPosition() {
		return origPosition;
	}

	/**
	 * Gets the position in the current line of the error in the text.
	 * 
	 * @return The index for the error within the line.
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * Gets line in which this error occured, starting from zero.
	 * 
	 * @return The line number containing this error.
	 */
	public int getLine() {
		return line;
	}

	/**
	 * Gets a reference to the list of causes associated with this error.
	 * 
	 * @return The causes as a Vector of Strings.
	 */
	public Vector<String> getCauses() {
		return causes;
	}

	/**
	 * Gets a reference to the list of causes associated with this error.
	 * 
	 * @return The causes as a Vector of integers (types of Blocks).
	 */
	public Vector<Integer> getTypes() {
		return types;
	}

	/**
	 * Drops every cause that has the specified type from the list of possible
	 * causes for this error. This is for readability purposes.
	 * 
	 * @param type
	 *            The type of Blocks to ignore error causes from.
	 */
	public void dropCauseTypes(int type) {
		for (int i = 0; i < types.size(); i++)
			if (types.get(i) == type) {
				causes.remove(i);
				types.remove(i);
				i--;
			}
	}

	/**
	 * Return a String representation of all the causes in this error.
	 * 
	 * @return The complete error message.
	 */
	public String toString() {
		if (causes.size() == 0)
			return "";
		String message = causes.get(0);
		for (int i = 1; i < causes.size(); i++)
			message += " OR " + causes.get(i);
		return "Parse Error in line " + line + ", position " + position
				+ ":\n  " + message;
	}
}
