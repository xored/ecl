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
import org.eclipse.ecl.parser.EclPartition;

import com.xored.peg.Block;

public class AstBuilder {
	public Command build(Block block) {
		if (block != Block.NO_PARSE) {
			switch (EclPartition.values()[block.getType()]) {
			case script:
				if (block.getChild(0).getNumChildren() == 0)
					return CoreFactory.eINSTANCE.createSequence();
				return build(block.getChild(0).getChild(0));
			case sequence:
				return sequence(block);
			case expr:
				return parallel(block.getChild(1));
			case pipeline:
				return pipeline(block);
			case primary:
				if (block.getNumChildren() == 1)
					return build(block.getChild(0).getChild(1));
				else
					return command(block);
			case command:
				return command(block);
			}
		}
		return null;
	}

	protected Command parallel(Block block) {
		Command cmd = build(block.getChild(0));
		if (block.getChild(1).getNumChildren() == 0)
			return cmd;
		Parallel parallel = CoreFactory.eINSTANCE.createParallel();
		parallel.getCommands().add(cmd);
		for (int i = 0; i < block.getChild(1).getNumChildren(); i++) {
			Block child = block.getChild(1).getChild(i).getChild(0).getChild(1)
					.getChild(0);
			parallel.getCommands().add(build(child));
		}
		return parallel;
	}

	protected Command pipeline(Block block) {
		Command cmd = build(block.getChild(0));
		if (block.getChild(1).getNumChildren() == 0)
			return cmd;
		Pipeline pipeline = CoreFactory.eINSTANCE.createPipeline();
		pipeline.getCommands().add(cmd);
		for (int i = 0; i < block.getChild(1).getNumChildren(); i++) {
			Block child = block.getChild(1).getChild(i).getChild(0).getChild(1);
			pipeline.getCommands().add(build(child));
		}
		return pipeline;
	}

	protected Command sequence(Block block) {
		Command cmd = build(block.getChild(0));
		block = block.getChild(1);
		if (block.getNumChildren() == 0)
			return cmd;
		Sequence sequence = CoreFactory.eINSTANCE.createSequence();
		sequence.getCommands().add(cmd);
		for (int i = 0; i < block.getNumChildren(); i++) {
			Block child = block.getChild(i).getChild(0).getChild(1);
			sequence.getCommands().add(build(child));
		}
		return sequence;
	}

	protected Command command(Block block) {
		Exec exec = CoreFactory.eINSTANCE.createExec();
		if (block.getChild(0).getNumChildren() > 0) {
			exec.setNamespace(block.getChild(0).getChild(0).getChild(0)
					.getSubtext());
		}
		String name = block.getChild(1).getSubtext();
		exec.setName(name);
		Block params = block.getChild(2);
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

	private Parameter value(Block block) {
		if (block.getBegin() == block.getEnd())
			return CoreFactory.eINSTANCE.createLiteralParameter();
		return nonEmptyValue(block);
	}

	private Parameter nonEmptyValue(Block block) {
		switch (block.getNumChildren()) {
		case 0:
			LiteralParameter literal = CoreFactory.eINSTANCE
					.createLiteralParameter();
			literal.setLiteral(block.getSubtext());
			return literal;
		case 1:
			return nonEmptyValue(block.getChild(0));
		default:
			switch (EclPartition.values()[block.getType()]) {
			case subCommand:
				ExecutableParameter ep = CoreFactory.eINSTANCE
						.createExecutableParameter();
				Command script = build(block.getChild(1));
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
