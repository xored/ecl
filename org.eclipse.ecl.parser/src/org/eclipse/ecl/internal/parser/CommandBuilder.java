package org.eclipse.ecl.internal.parser;

import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.Exec;
import org.eclipse.ecl.core.ExecutableParameter;
import org.eclipse.ecl.core.LiteralParameter;
import org.eclipse.ecl.core.Parallel;
import org.eclipse.ecl.core.Parameter;
import org.eclipse.ecl.core.Pipeline;
import org.eclipse.ecl.core.Sequence;
import org.eclipse.ecl.parser.ParserConstants;

import com.xored.peg.Block;

public class CommandBuilder {
	public static Command build(Block block, boolean checked) {
		if (block != Block.NO_PARSE) {
			switch (ParserConstants.values()[block.getType()]) {
			case sequence:
				return sequence(block);
			case expr:
				return build(block.getChild(1), checked);
			case andExpr:
				return andExpr(block);
			case orExpr:
				return orExpr(block);
			case primary:
				if (block.getNumChildren() == 1)
					return build(block.getChild(0).getChild(1), checked);
				else
					return command(block);
			case command:
				return command(block);
			}
		}
		if (checked)
			return null;
		else
			throw new RuntimeException();
	}

	private static Command andExpr(Block block) {
		Command cmd = build(block.getChild(0), false);
		if (block.getChild(1).getNumChildren() == 0)
			return cmd;
		Parallel parallel = CoreFactory.eINSTANCE.createParallel();
		parallel.getCommands().add(cmd);
		for (int i = 0; i < block.getChild(1).getNumChildren(); i++) {
			Block child = block.getChild(1).getChild(i).getChild(0).getChild(1);
			parallel.getCommands().add(build(child, false));
		}
		return parallel;
	}

	private static Command orExpr(Block block) {
		Command cmd = build(block.getChild(0), false);
		if (block.getChild(1).getNumChildren() == 0)
			return cmd;
		Pipeline pipeline = CoreFactory.eINSTANCE.createPipeline();
		pipeline.getCommands().add(cmd);
		for (int i = 0; i < block.getChild(1).getNumChildren(); i++) {
			Block child = block.getChild(1).getChild(i).getChild(0).getChild(1);
			pipeline.getCommands().add(build(child, false));
		}
		return pipeline;
	}

	private static Command sequence(Block block) {
		if (block.getChild(0).getNumChildren() == 0)
			return CoreFactory.eINSTANCE.createSequence();
		block = block.getChild(0).getChild(0);
		Command cmd = build(block.getChild(0), false);
		block = block.getChild(1);
		if (block.getNumChildren() == 0)
			return cmd;
		Sequence sequence = CoreFactory.eINSTANCE.createSequence();
		sequence.getCommands().add(cmd);
		for (int i = 0; i < block.getNumChildren(); i++) {
			Block child = block.getChild(i).getChild(0).getChild(1);
			sequence.getCommands().add(build(child, false));
		}
		return sequence;
	}

	private static Command command(Block block) {
		Exec exec = CoreFactory.eINSTANCE.createExec();
		String name = block.getChild(0).getSubtext();
		int index = name.lastIndexOf("::");
		if (index >= 0) {
			exec.setNamespace(name.substring(0, index));
			name = name.substring(index + 2);
		}
		exec.setName(name);
		Block params = block.getChild(1);
		for (int i = 0; i < params.getNumChildren(); i++) {
			Block paramBlock = params.getChild(i).getChild(0).getChild(1)
					.getChild(0);
			String paramName = null;
			Block child = null;
			if (paramBlock.getNumChildren() > 1) {
				paramName = paramBlock.getChild(0).getSubtext();
				if (paramName.startsWith("-"))
					paramName = paramName.substring(1);
				if (paramName.startsWith("-"))
					paramName = paramName.substring(1);
				child = paramBlock.getChild(1);
				if (paramBlock.getChild(1).getNumChildren() > 0)
					child = child.getChild(0).getChild(1);
			} else {
				child = paramBlock.getChild(0);
			}
			Parameter param = value(child);
			param.setName(paramName);
			exec.getParameters().add(param);
		}
		return exec;
	}

	private static Parameter value(Block block) {
		if (block.getBegin() == block.getEnd())
			return CoreFactory.eINSTANCE.createLiteralParameter();
		return nonEmptyValue(block);
	}

	private static Parameter nonEmptyValue(Block block) {
		switch (block.getNumChildren()) {
		case 0:
			LiteralParameter literal = CoreFactory.eINSTANCE
					.createLiteralParameter();
			literal.setLiteral(block.getSubtext());
			return literal;
		case 1:
			return nonEmptyValue(block.getChild(0));
		default:
			switch (ParserConstants.values()[block.getType()]) {
			case subCommand:
				ExecutableParameter ep = CoreFactory.eINSTANCE
						.createExecutableParameter();
				Command script = build(block.getChild(1), false);
				ep.setCommand(script);
				return ep;
			case curly:
				literal = CoreFactory.eINSTANCE.createLiteralParameter();
				literal.setLiteral(block.getSubtext());
				return literal;
			default:
				literal = CoreFactory.eINSTANCE.createLiteralParameter();
				literal.setLiteral(block.getChild(1).getSubtext());
				return literal;
			}
		}
	}
}
