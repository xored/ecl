package org.eclipse.ecl.internal.editing.parser;

import org.eclipse.ecl.editing.EclEditingPlugin;

import com.cisco.peg.Block;
import com.cisco.peg.PEGParser;
import com.cisco.peg.ParsingExpressionGrammar;
import com.cisco.peg.ParsingGrammar;
import com.cisco.peg.TreeOptimizer;

public class PegParser {
	static PEGParser parser = null;

	public static String getNameByType(int type) {
		return getParser().getGrammar().getNameByType(type);
	}

	public static PEGParser getParser() {
		if (parser == null) {
			String grammarText = null;
			try {
				grammarText = EclEditingPlugin.readFile("grammar/Ecl.g");
			} catch (Exception e) {
				// Could not happen
			}
			PEGParser tempParser = new PEGParser(new ParsingExpressionGrammar());
			Block block = tempParser.parse(grammarText);
			ParsingGrammar grammar = new ParsingGrammar(block, true);
			parser = new PEGParser(grammar);
		}
		return parser;
	}

	public static Block parse(String text) {
		Block b = getParser().parse(text);
		TreeOptimizer.removeEmpty(b);
		ParsingGrammar grammar = getParser().getGrammar();
		TreeOptimizer.removeChildrenOfType(b, grammar.getTypeByName("host"));
		TreeOptimizer.removeChildrenOfType(b, grammar
				.getTypeByName("command_name"));
		TreeOptimizer.removeChildrenOfType(b, grammar
				.getTypeByName("argument_value"));
		TreeOptimizer.removeChildrenOfType(b, grammar
				.getTypeByName("argument_name"));
		return b;
	}

	public static Block findBlock(Block block, int offset) {
		if (block.getBegin() <= offset && block.getEnd() >= offset) {
			int num = block.getNumChildren();
			if (num == 0)
				return block;
			for (int i = 0; i < num; i++) {
				Block child = block.getChild(i);
				Block res = findBlock(child, offset);
				if (res != null) {
					return res;
				}
			}
		}
		return null;
	}

	public static String findCommand(Block block, int offset) {
		if (block.getBegin() <= offset && block.getEnd() >= offset) {
			if ("cmd".equals(PegParser.getNameByType(block.getType()))) {
				Block name = block.getChild(0);
				return name.getSubtext();
			}
			int num = block.getNumChildren();
			for (int i = 0; i < num; i++) {
				Block child = block.getChild(i);
				String res = findCommand(child, offset);
				if (res != null) {
					return res;
				}
			}
		}
		return null;
	}
}
