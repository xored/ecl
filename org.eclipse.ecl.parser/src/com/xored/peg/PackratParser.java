package com.xored.peg;

public class PackratParser extends PEGParser {
	// The implementation is for performance, so in order to allocate memory
	// efficiently,
	// we invalidate a previously created data by simply incrementing a counter
	// which is used as a timestamp for parsing.
	protected int fingercount; // The fingerprint value to be used to
								// automatically invalidate table entries over
								// time.
	// This tables contain partially parsed results, and is what guarantees
	// linear time,
	// since no type of Block is attempted to be parsed at the same position in
	// the
	// String twice.
	private Block[][] table; // Indexed by type and position.
	// This is used to detect circular references in the parsing. One of the
	// easiest errors to catch in a grammar definition.
	private boolean[][] used; // Indexed by type and position.
	// This is a fingerprint for each parsed Block attempted, used to know when
	// a
	// value in the table is valid. (valid means its value is equal to
	// fingercount).
	private int[][] fingerprint; // Indexed by type and position.

	public PackratParser() {
		super();
	}

	public PackratParser(ParsingGrammar grammar) {
		super(grammar);
	}

	@Override
	public void setGrammar(ParsingGrammar gram) {
		super.setGrammar(gram);
		table = new Block[grammar.getNumDescriptions()][0];
		used = new boolean[grammar.getNumDescriptions()][0];
		fingerprint = new int[grammar.getNumDescriptions()][0];
	}

	@Override
	public Block parse(String text, int type) {
		if (table[0].length <= text.length()) {
			for (int i = 0; i < table.length; i++) {
				table[i] = new Block[text.length() + 1];
				used[i] = new boolean[text.length() + 1];
				fingerprint[i] = new int[text.length() + 1];
			}
		}
		fingercount++;
		parse(text, type, 0);
		return table[type][0];
	}

	@Override
	public Block parse(String text, int type, int position) {
		Block b;
		// If we have updated this value in this fingercount.
		if (debug)
			System.out.println("[ " + type + ", " + position + "]");
		if (fingercount == fingerprint[type][position])
			if (used[type][position])
				throw new Error("The grammar has a circular dependence.");
			else
				// TODO: Might have to put this before the recursive call
				return table[type][position]; // The result is already computed

		// Place the marker to detect circular references.
		fingerprint[type][position] = fingercount;
		used[type][position] = true;
		table[type][position] = Block.NO_PARSE;

		b = parse(text, grammar.getBlockDescription(type), position);
		if (b == Block.NO_PARSE || b.getType() < 0) // If it is a NO_PARSE or a
													// meta-type, simply pass it
													// up.
		{
			b.setType(type);
			table[type][position] = b;
		} else
			table[type][position] = new Block(b.getText(), b.getBegin(),
					b.getEnd(), type, new Block[] { b });

		// Unset the used to allow others to use this result
		used[type][position] = false;
		return table[type][position];
	}
}
