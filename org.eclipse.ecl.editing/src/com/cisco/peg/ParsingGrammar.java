/*
 * ParsingGrammar.java
 *
 * Created on September 10, 2006, 3:48 PM
 *
 * This code is an open source code, protected by the GNU General Public License.
 * If you didn't get a copy of that license with this code, contact the author
 * immediately at duenez@cs.utk.edu
 */

package com.cisco.peg;

import java.util.Vector;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * <p>
 * This class contains all the information related to a generated grammar. It
 * mainly provides methods to check the validity of the grammar tree, and to
 * query for Patterns (regular expressions) used to match lexical tokens. It
 * also provides look-up methods for types and names of Blocks.
 * </p>
 * <p>
 * The Block trees containing a grammar description must have the following
 * structure after optimizing them
 * </p>
 * 
 * <pre>
 *                  G
 *                  |
 *        --------------------
 *        |        |   ...   |
 *        D        D   ...   D
 *        |        |   ...   |
 *      ------  ------    ------
 *      |  | |  |  | |    |  | |
 *      I <- E  I <- E    I <- E
 * </pre>
 * 
 * Where <b>G</b> stands for the grammar tree root, <b>D</b> is a description
 * Block, <b>I</b> is an identifier acting as the rule name, <b><-</b> is the
 * lexical token corresponding to an assignment, and <b>E</b> corresponds to the
 * expression describing the contents of the description.
 * 
 * @see ParsingExpressionGrammar
 * @author Edgar A. Duenez-Guzman
 */
public class ParsingGrammar {

	public static final String EOF = "EOF";
	public static final int EOF_TYPE = -1000;

	/** Sorted literals. */
	// Array of indices in ascending literals.
	private int[] sortedLiterals;
	// Array containing the literals (string patterns) used in the grammar.
	private Vector<String> literals;
	// Array containing the compiled patterns corresponding (by index) to the
	// literal strings.
	private Vector<Pattern> patterns;

	/** Sorted identifiers. */
	// Array of indices in ascending literals.
	private int[] sortedIndices;
	// Array containing the values (names) of the identifiers
	private String[] identifiers;
	// Array containing the description Block associated (by index) with this
	// literal.
	private Block[] descriptions;

	/**
	 * Creates a new instance of ParsingGrammar given the specified Block tree.
	 * This constructor calls <tt>ParsingGrammar( grammar, true )</tt>. This
	 * Block tree MUST have the topology dicussed before after being optimized.
	 * 
	 * @see ParsingGrammar#ParsingGrammar(Block, boolean )
	 * @param grammar
	 *            The Block tree containing the grammar description
	 */
	public ParsingGrammar(Block grammar) {
		this(grammar, true);
	}

	/**
	 * Creates a new instance of ParsingGrammar given the specified Block tree
	 * and the optimize flag.
	 * <p>
	 * If the value of optimize is true, then this Block tree MUST have the
	 * topology dicussed before. Otherwise, a call to
	 * PEGUtility.utility.optimizeParsedTree( grammar ) is performed before
	 * processing the grammar.
	 * </p>
	 * <p>
	 * This class assigns numerical types in the order of definition of the
	 * Blocks. Thus, the first definition will be of type zero, the next of type
	 * one and so on.
	 * </p>
	 * 
	 * @see PEGUtility
	 * @param grammar
	 *            The Block tree containing the grammar description.
	 * @param optimize
	 *            If true, the tree will be optimized prior to processing.
	 */
	public ParsingGrammar(Block grammar, boolean optimize) {
		super();
		if (optimize) // Optimizes the tree to transform into a grammar.
			PEGUtility.utility.optimizeParsedTree(grammar);
		try {
			Block temp; // Used as a short-cut to children.

			if (grammar.getChild(0).getNumChildren() > 0) {

				descriptions = new Block[grammar.getNumChildren()];
				identifiers = new String[grammar.getNumChildren()];
				sortedIndices = new int[grammar.getNumChildren()];

				for (int i = 0; i < grammar.getNumChildren(); i++) {
					temp = grammar.getChild(i).getChild(0); // The identifier
															// Block.
					identifiers[i] = temp.getSubtext().trim();
					descriptions[i] = grammar.getChild(i).getChild(2);
				}
				sortIdentifiers(); // Sorts the indices to the identifiers to
									// allow
				// binary search on them.
			} else { // In case of just one rule

				descriptions = new Block[1];
				identifiers = new String[1];
				sortedIndices = new int[1];

				temp = grammar.getChild(0); // The identifier Block.
				identifiers[0] = temp.getSubtext().trim();
				descriptions[0] = grammar.getChild(2);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new GrammarFormatException(
					"The grammar tree does not have the required structure.");
		}
		checkIdentifiers(); // Checks that all identifiers are described.
		getLiterals(); // Checks and compiles the patterns (reg-exp's)
		sortLiterals(); // Sorts the indices to the literals to allow binary
						// search on them.
	}

	/**
	 * This method calls the recursive version of the checking with each
	 * description as a parameter. In other words, it traverses the whole tree
	 * to check for identifiers not defined.
	 */
	private void checkIdentifiers() {
		for (int i = 0; i < descriptions.length; i++)
			checkIdentifiers(descriptions[i]);
	}

	/**
	 * Recursive check for non-defined Identifiers in the grammar tree. If an
	 * identifier has not been defined, then it throws a GrammarFormatException.
	 * 
	 * @throws GrammarFormatException
	 *             If an identifier is not defined but used.
	 */
	private void checkIdentifiers(Block desc) {
		if (desc.getType() == ParsingExpressionGrammar.IDENTIFIER)
			if (getTypeByName(desc.getSubtext()) == -1)
				throw new GrammarFormatException("Identifier "
						+ desc.getSubtext()
						+ " is not found among the definitions in the grammar.");
		for (int i = 0; i < desc.getNumChildren(); i++)
			checkIdentifiers(desc.getChild(i));
	}

	/**
	 * Preprocess the literals in the tree. This method calls its recursive
	 * version in each description thus traversing the whole tree. It also
	 * compiles the literals for later use.
	 */
	private void getLiterals() {
		literals = new Vector<String>();
		patterns = new Vector<Pattern>();
		for (int i = 0; i < descriptions.length; i++)
			getLiterals(descriptions[i], literals);

		for (int i = 0; i < literals.size(); i++)
			try {
				patterns.add(Pattern.compile(literals.get(i)));
			} catch (PatternSyntaxException e) {
				throw new GrammarFormatException("The pattern '"
						+ literals.get(i) + "' is invalid.");
			}
	}

	/**
	 * Recursive check for literals. This method extracts all the literals found
	 * in the grammar tree into the provided Vector.
	 */
	private void getLiterals(Block desc, Vector<String> lits) {
		String literal;
		if (desc.getType() == ParsingExpressionGrammar.LITERAL) {
			literal = desc.getSubtext().trim();
			literal = literal.substring(1, literal.length() - 1);
			lits.add(literal);
		}
		for (int i = 0; i < desc.getNumChildren(); i++)
			getLiterals(desc.getChild(i), lits);
	}

	/**
	 * Sorts the identifiers in order to be able to perform binary search later.
	 * This method only sorts the indices and not the actual names or
	 * descriptions associated with them.
	 */
	private void sortIdentifiers() {
		Integer indices[] = new Integer[sortedIndices.length];
		for (int i = 0; i < indices.length; i++)
			indices[i] = i;
		java.util.Arrays.sort(indices, new java.util.Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return identifiers[a].compareTo(identifiers[b]);
			}
		});
		for (int i = 0; i < indices.length; i++)
			sortedIndices[i] = indices[i];
	}

	/**
	 * Sorts the literals in order to be able to perform binary search later.
	 * This method only sorts the indices and not the actual literals or
	 * Patterns associated with them.
	 */
	private void sortLiterals() {
		Integer indices[] = new Integer[literals.size()];
		for (int i = 0; i < literals.size(); i++)
			indices[i] = i;
		java.util.Arrays.sort(indices, new java.util.Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return literals.get(a).compareTo(literals.get(b));
			}
		});
		sortedLiterals = new int[indices.length];
		for (int i = 0; i < indices.length; i++)
			sortedLiterals[i] = indices[i];
	}

	/**
	 * Obtains the number of descriptions available in this grammar.
	 * 
	 * @return The number of descriptions in the grammar.
	 */
	public int getNumDescriptions() {
		return descriptions.length;
	}

	/**
	 * Assumes that the grammar has the required structure. It returns the
	 * description Block tree of the definition with the specified type.
	 * 
	 * @return The description Block.
	 * @param type
	 *            The numerical type of the description to obtain.
	 */
	public Block getBlockDescription(int type) {
		return descriptions[type];
	}

	/**
	 * Assumes that the grammar has the required structure. It returns the
	 * description Block tree of the definition with the specified identifier.
	 * 
	 * @param name
	 *            The name of the type to obtain the description of.
	 * @return The description Block or null if the name is not found.
	 */
	public Block getBlockDescription(String name) {
		int ty = getTypeByName(name);
		return ty == -1 ? null : getBlockDescription(ty);
	}

	/**
	 * This method allows for post-generation addition of literals (Patterns).
	 * It re-sorts the literals to accomodate the addition and thus calling this
	 * method should not be abused.
	 * 
	 * @param literal
	 *            The literal to add to the grammar.
	 */
	public void addLiteral(String literal) {
		literals.add(literal);
		patterns.add(Pattern.compile(literal));
		sortLiterals();
	}

	/**
	 * This method obtains the Pattern associated with the String representation
	 * of the provided literal (which might include trailing and/or leading
	 * white spaces).
	 * 
	 * @param literal
	 *            The string representation of the Pattern.
	 * @return The compiled Pattern corresponding the the literal.
	 */
	public Pattern getPattern(String literal) {
		literal = literal.trim();
		literal = literal.substring(1, literal.length() - 1);
		// ----------------BINARY SEARCH----------------
		int begin = 0, end = literals.size() - 1, middle;
		while (begin <= end) {
			middle = (begin + end) / 2;
			if (literal.compareTo(literals.get(sortedLiterals[middle])) > 0)
				begin = middle + 1;
			else if (literal.compareTo(literals.get(sortedLiterals[middle])) < 0)
				end = middle - 1;
			else
				// if( literal.compareTo( literals[middle] ) == 0 )
				return patterns.get(sortedLiterals[middle]);
		}
		return null;
	}

	/**
	 * Obtains the String name of the definition with the specified type.
	 * 
	 * @param type
	 *            The numerical type to get the name of.
	 * @return The name of the definition.
	 */
	public String getNameByType(int type) {
		if (type == EOF_TYPE)
			return EOF;
		if (type < 0)
			return ParsingExpressionGrammar.Definitions[-type]; // The meta type
		return identifiers[type];
	}

	/**
	 * Obtains the numerical type of the definition with the specified name
	 * (which might include trailing and/or leading white spaces).
	 * 
	 * @param name
	 *            The String name of the type to get the type.
	 * @return The numerical type value of the definition.
	 */
	public int getTypeByName(String name) {
		name = name.trim();
		if (EOF.equals(name))
			return EOF_TYPE;
		// ----------------BINARY SEARCH----------------
		int begin = 0, end = descriptions.length - 1, middle;
		while (begin <= end) {
			middle = (begin + end) / 2;
			if (name.compareTo(identifiers[sortedIndices[middle]]) > 0)
				begin = middle + 1;
			else if (name.compareTo(identifiers[sortedIndices[middle]]) < 0)
				end = middle - 1;
			else
				// if( name.compareTo( identifiers[middle] ) == 0 )
				return sortedIndices[middle];
		}
		return -1;
	}
}
