package org.eclipse.ecl.core.util;

import java.util.Arrays;
import java.util.List;

import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.Pipeline;
import org.eclipse.ecl.core.Sequence;
import org.eclipse.ecl.core.With;

public class ScriptletFactory {
	public static CoreFactory coreFactory = CoreFactory.eINSTANCE;

	public static Sequence seq(Command... commands) {
		return seq(Arrays.asList(commands));
	}

	public static Sequence seq(List<Command> commands) {
		Sequence sequence = coreFactory.createSequence();
		sequence.getCommands().addAll(commands);
		return sequence;
	}

	public static Pipeline pipe(Command... commands) {
		return pipe(Arrays.asList(commands));
	}

	public static Pipeline pipe(List<Command> commands) {
		Pipeline pipeline = coreFactory.createPipeline();
		for (Command command : commands) {
			addToPipe(pipeline, command);
		}
		return pipeline;
	}

	public static With with(Command withObject, Command doObject) {
		With with = coreFactory.createWith();
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
