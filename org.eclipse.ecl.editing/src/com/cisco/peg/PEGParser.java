package com.cisco.peg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PEGParser {
	/**
	 * The parsed grammar
	 */
	protected ParsingGrammar grammar;

	public static boolean debug = false; // Set to true to print all [type,pos]
											// pairs
											// while parsing.

	/**
	 * Creates a new instance of PackratParser with no associated grammar. In
	 * order to be able to use this parser, a grammar must be set by calling
	 * setGrammar.
	 */
	public PEGParser() {
		super();
	}

	/**
	 * Creates a new instance of PackratParser with the provided grammar.
	 * 
	 * @param grammar
	 *            The ParsingGrammar used to parse Strings.
	 */
	public PEGParser(ParsingGrammar grammar) {
		this();
		setGrammar(grammar);
	}

	/**
	 * Sets the grammar to be used by this parser and clear all information
	 * about previos parses and current state.
	 * 
	 * @param gram
	 *            The grammar to be used.
	 */
	public void setGrammar(ParsingGrammar gram) {
		grammar = gram;
	}

	/**
	 * Gets a reference to the grammar used by this parser. This is not a copy
	 * of the ParsingGrammar.
	 * 
	 * @return The grammar of this parser.
	 */
	public ParsingGrammar getGrammar() {
		return grammar;
	}

	/**
	 * This method attempts to parse the specified text for a Block of the
	 * specified type.
	 * 
	 * @see PackratParser#parse( String, int boolean )
	 * @return The parsed Block tree, or Block.NO_PARSE if failed.
	 * @param text
	 *            The source text to parse from.
	 * @param name
	 *            The name of the Block type to be produced.
	 */
	public Block parseNamedBlock(String text, String name) {
		return parse(text, grammar.getTypeByName(name));
	}

	/**
	 * This method attempts to parse the specified text for a Block of the first
	 * (usually top-level in the hierarchy) type in the grammar.
	 * 
	 * @see PackratParser#parse( String, int boolean )
	 * @return The parsed Block tree, or Block.NO_PARSE if failed.
	 * @param text
	 *            The source text to parse from.
	 */
	public Block parse(String text) {
		return parse(text, 0);
	}

	/**
	 * This method attempts to parse the specified text for a Block of the
	 * specified type.
	 * 
	 * @return The parsed Block tree, or Block.NO_PARSE if failed.
	 * @see PackratParser#parse( String, int boolean )
	 * @param type
	 *            The type to attempt to parse.
	 * @param text
	 *            The source text to parse from.
	 */
	public Block parse(String text, int type) {
		return parse(text, type, 0);
	}

	/**
	 * A recursive parsing method. This will attempt to create a parsed tree of
	 * the specified type, starting from the specified position. This, along
	 * with <tt>parse( String, Block, int )</tt> provide the underlying
	 * implementation of the PackratParser. Ideally, these methods should not be
	 * called directly, and instead, the other <tt>parse</tt> methods should be
	 * used, since these do not create a new fingerprint, and instead rely on
	 * the structure created by the other methods.
	 * 
	 * @param text
	 *            The test to parse.
	 * @param type
	 *            The numerical type of the Block to try to parse.
	 * @param position
	 *            The starting position.
	 */
	public Block parse(String text, int type, int position) {
		Block b;
		if (debug)
			System.out.println("[ " + type + ", " + position + "]");
		b = parse(text, grammar.getBlockDescription(type), position);
		b.setType(type);
		return b;
	}

	/**
	 * A recursive parsing method. This will attempt to create a parsed tree,
	 * given the specified Block description (obtained from a grammar, starting
	 * from the specified position. This, along with
	 * <tt>parse( String, int, int )</tt> provide the underlying implementation
	 * of the PackratParser. Ideally, these methods should not be called
	 * directly, and instead, the other <tt>parse</tt> methods should be used,
	 * since these do not create a new fingerprint, and instead rely on the
	 * structure created by the other methods.
	 * 
	 * @param text
	 *            The test to parse.
	 * @param description
	 *            A tree defining the structure the String should have.
	 * @param position
	 *            The starting position.
	 * @return The parsed Block tree.
	 */
	public Block parse(String text, Block description, int position) {
		Block b, retBlock;
		int type, newPos;

		// The type of the expression part of the block description can only be:
		switch (description.getType()) {
		case ParsingExpressionGrammar.EXPRESSION: // Parse both type and
													// meta-type.
		case -ParsingExpressionGrammar.EXPRESSION:
			retBlock = parse(text, description.getChild(0), position);
			if (retBlock != Block.NO_PARSE)
				return retBlock;
			// Assume it is optimized (it is a grammar). If it only has one (/
			// S) block
			if (description.getNumChildren() == 2
					&& description.getChild(1).getChild(0).getType() == ParsingExpressionGrammar.SLASH) {
				// If the result is valid, approve.
				retBlock = parse(text, description.getChild(1).getChild(1),
						position);
				if (retBlock != Block.NO_PARSE)
					return new Block(retBlock.getText(), retBlock.getBegin(),
							retBlock.getEnd(),
							-ParsingExpressionGrammar.EXPRESSION,
							new Block[] { retBlock });
			} else // It has at least 2 (/ S) blocks...
			{
				description = description.getChild(1); // Go to the (/ S)* Block
				for (int i = 0; i < description.getNumChildren(); i++) {
					// Try to parse each one and if the result is valid,
					// approve.
					retBlock = parse(text, description.getChild(i).getChild(1),
							position);
					if (retBlock != Block.NO_PARSE)
						return new Block(retBlock.getText(),
								retBlock.getBegin(), retBlock.getEnd(),
								-ParsingExpressionGrammar.EXPRESSION,
								new Block[] { retBlock });
				}
			}
			return Block.NO_PARSE;
		case ParsingExpressionGrammar.SEQUENCE: // Parse both type and
												// meta-type.
		case -ParsingExpressionGrammar.SEQUENCE:
			newPos = position;
			// b will contain all the parsed Blocks.
			b = new Block(text, position, position,
					-ParsingExpressionGrammar.SEQUENCE, null);
			if (description.getChild(0).getType() == ParsingExpressionGrammar.OPEN) {
				retBlock = parse(text, description.getChild(1), position);
				if (retBlock == Block.NO_PARSE)
					return Block.NO_PARSE;
				b.setEnd(retBlock.getEnd());
				b.addChild(retBlock);
				return b;
			}
			for (int i = 0; i < description.getNumChildren(); i++) {
				// Try to parse each one, updating the position
				retBlock = parse(text, description.getChild(i), newPos);
				// If the result is NoParse, propagate it.
				if (retBlock == Block.NO_PARSE)
					return Block.NO_PARSE;
				// Otherwise, add the parsed child and update the position
				b.addChild(retBlock);
				newPos = retBlock.getEnd();
			}
			// Update this entry's end index
			b.setEnd(newPos);
			return b;
		case ParsingExpressionGrammar.PREFIX: // Parse both type and meta-type.
		case -ParsingExpressionGrammar.PREFIX:
			if (description.getNumChildren() > 1) // There is a '&' or '!' and
													// then an Identifier
			{
				// try to parse
				retBlock = parse(text, description.getChild(1), position);
				// Check if parse succeeded and parse accordingly.
				if (description.getChild(0).getType() == ParsingExpressionGrammar.AND)
					return (retBlock == Block.NO_PARSE ? Block.NO_PARSE
							: new Block(text, position, position,
									-ParsingExpressionGrammar.PREFIX, null));
				else
					return (retBlock == Block.NO_PARSE ? new Block(text,
							position, position,
							-ParsingExpressionGrammar.PREFIX, null)
							: Block.NO_PARSE);
			}
			// else, simply return child block
			return parse(text, description.getChild(0), position);
		case ParsingExpressionGrammar.SUFFIX:
		case -ParsingExpressionGrammar.SUFFIX: // Meta type SUFFIX
			// There is a '?', '+' or '*' after an Identifier
			if (description.getNumChildren() > 1) {
				newPos = position;
				// try to parse
				retBlock = parse(text, description.getChild(0), newPos);

				// Allows for general case block consumed. Block b will contain
				// all generated Blocks.
				b = new Block(text, position, position,
						-ParsingExpressionGrammar.SUFFIX, null);

				// Check if parse succeeded and parse accordingly.
				switch (description.getChild(1).getType()) {
				case ParsingExpressionGrammar.QUESTION:
					// If succeeded, use it, if not, use empty
					return (retBlock != Block.NO_PARSE ? retBlock : b);
				case ParsingExpressionGrammar.PLUS:
					if (retBlock == Block.NO_PARSE)
						return Block.NO_PARSE; // A plus requires a match
					else {
						b.addChild(retBlock);
						newPos = retBlock.getEnd();
					}
					retBlock = parse(text, description.getChild(0), newPos);
				case ParsingExpressionGrammar.STAR:
					while (retBlock != Block.NO_PARSE) {
						b.addChild(retBlock);
						newPos = retBlock.getEnd();
						retBlock = parse(text, description.getChild(0), newPos);
					}
					// Update ending place.
					b.setEnd(newPos);
				}
				return b;
			} else
				// Simply point to child block
				return parse(text, description.getChild(0), position);
		case ParsingExpressionGrammar.IDENTIFIER: // Parse both type and
													// meta-type.
		case -ParsingExpressionGrammar.IDENTIFIER:
			if (ParsingGrammar.EOF.equals(description.getSubtext())) {
				if (position < text.length())
					return Block.NO_PARSE;
				else
					return new Block(text, position, position,
							ParsingGrammar.EOF_TYPE, null);
			}
			// Find the appropriate block to match
			type = grammar.getTypeByName(description.getSubtext());
			b = parse(text, type, position);
			return b;
		case ParsingExpressionGrammar.LITERAL: // Parse both type and meta-type.
		case -ParsingExpressionGrammar.LITERAL:
			String lit = description.getSubtext();
			Pattern p = grammar.getPattern(lit);
			Matcher m = p.matcher(text.substring(position));
			if (m.lookingAt())
				// Meta-Type LITERAL (negative)
				return new Block(text, position, position + m.end(),
						-ParsingExpressionGrammar.LITERAL, null);
			else
				return Block.NO_PARSE;
		case ParsingExpressionGrammar.DOT: // Parse both type and meta-type.
		case -ParsingExpressionGrammar.DOT:
			return (position < text.length() ?
			// Meta-Type DOT (negative)
			new Block(text, position, position + 1,
					-ParsingExpressionGrammar.DOT, null) : Block.NO_PARSE);
		}
		// Print the debug information that this String went unprocessed. This
		// is generally an error, since it means the grammar did not cover this
		// case.
		if (debug)
			System.out
					.println("Used default for type " + description.getType());
		return Block.NO_PARSE;
	}
}
