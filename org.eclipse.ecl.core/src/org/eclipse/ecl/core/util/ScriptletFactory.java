package org.eclipse.ecl.core.util;

import java.util.Arrays;
import java.util.List;

import org.eclipse.ecl.core.Binding;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.Pipeline;
import org.eclipse.ecl.core.Sequence;
import org.eclipse.ecl.core.With;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ScriptletFactory {

	public static <T extends Command> T bind(T command,
			EStructuralFeature feature, Command binded) {
		Binding binding = CoreFactory.eINSTANCE.createBinding();
		binding.setFeature(feature);
		binding.setCommand(binded);
		command.getBindings().add(binding);
		return command;
	}

	public static Sequence seq(Command... commands) {
		return makeSeq(Arrays.asList(commands));
	}

	public static Sequence makeSeq(Command... commands) {
		return makeSeq(Arrays.asList(commands));
	}

	public static Sequence makeSeq(List<Command> commands) {
		Sequence sequence = CoreFactory.eINSTANCE.createSequence();
		sequence.getCommands().addAll(commands);
		return sequence;
	}

	public static Pipeline makePipe(Command... commands) {
		return makePipe(Arrays.asList(commands));
	}

	public static Pipeline makePipe(List<Command> commands) {
		Pipeline pipeline = CoreFactory.eINSTANCE.createPipeline();
		for (Command command : commands) {
			if (command != null)
				addToPipe(pipeline, command);
		}
		return pipeline;
	}

	public static With makeWith(Command withObject, Command doObject) {
		With with = CoreFactory.eINSTANCE.createWith();
		with.setObject(withObject);
		with.setDo(doObject);
		return with;
	}

	private static void addToPipe(Pipeline pipeline, Command command) {
		if (command == null)
			return;
		if (command instanceof Pipeline) {
			for (Command inner : ((Pipeline) command).getCommands()) {
				addToPipe(pipeline, inner);
			}
		} else if (command instanceof Sequence) {
			throw new RuntimeException("Cannot add sequence in pipeline");
		} else {
			pipeline.getCommands().add(command);
		}
	}
}
