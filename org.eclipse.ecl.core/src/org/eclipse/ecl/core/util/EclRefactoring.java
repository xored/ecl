package org.eclipse.ecl.core.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.eclipse.ecl.core.Binding;
import org.eclipse.ecl.core.Block;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CorePackage;
import org.eclipse.ecl.core.Pipeline;
import org.eclipse.ecl.core.Sequence;
import org.eclipse.ecl.core.With;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EclRefactoring extends ScriptletFactory {

	public static List<Command> align(List<Command> commands) {
		List<Command> newCommands = new ArrayList<Command>();
		for (Command c : commands) {
			if (c instanceof Sequence) {
				newCommands.addAll(((Sequence) c).getCommands());
			} else {
				newCommands.add(c);
			}
		}
		return newCommands;
	}

	public static List<Command> exclude(List<Command> commands, Command ex) {
		int size = commands.size();
		for (int i = 0; i < size;) {
			Command command = commands.get(i);
			if (command instanceof Block) {
				Block block = (Block) command;
				exclude(block.getCommands(), ex);
			}
			if (command.equals(ex)) {
				commands.remove(i);
				size--;
				continue;
			}
			i++;
		}
		return commands;
	}

	public static List<Command> withify(List<Command> commands) {
		return withify(commands, new Comparator<Command>() {
			public int compare(Command c1, Command c2) {
				return EcoreUtil.equals(c1, c2) ? 0 : 1;
			}
		});
	}

	public static List<Command> withify(List<Command> commands,
			Comparator<Command> comparator) {
		List<Command> newCommands = new ArrayList<Command>();
		for (int i = 0; i < commands.size();) {
			Command command = commands.get(i);
			if (command instanceof Pipeline) {
				Pipeline pipeline = (Pipeline) command;
				if (pipeline.getCommands().size() > 1) {
					List<Command> toCollapse = new ArrayList<Command>();
					toCollapse.add(subPipe(pipeline, 1));
					Command object = pipeline.getCommands().get(0);
					int j = i + 1;
					for (; j < commands.size(); j++) {
						Command next = commands.get(j);
						if (next instanceof Pipeline) {
							Pipeline nextPipeline = (Pipeline) next;
							if (comparator.compare(object, nextPipeline
									.getCommands().get(0)) == 0) {
								toCollapse.add(subPipe(nextPipeline, 1));
							} else {
								break;
							}
						} else {
							break;
						}
					}
					if (toCollapse.size() > 1) {
						newCommands.add(makeWith(object,
								makeSeq(withify(toCollapse, comparator))));
					} else {
						newCommands.add(command);
					}
					i = j;
					continue;
				}
			}
			newCommands.add(command);
			i++;
		}
		return mergeNestedWithCommands(newCommands);
	}

	public static List<Command> mergeNestedWithCommands(List<Command> commands) {
		List<Command> newCommands = new ArrayList<Command>();
		for (Command command : commands) {
			if (command instanceof With) {
				command = mergeNestedWithCommands((With) command);
			}
			newCommands.add(command);
		}
		return newCommands;
	}

	public static With mergeNestedWithCommands(With withCommand) {
		Command doCommand = withCommand.getDo();
		// Handle case when single with command is wrapped by sequence
		if (doCommand instanceof Sequence) {
			Sequence seq = (Sequence) doCommand;
			if (seq.getCommands().size() == 1) {
				Command single = seq.getCommands().get(0);
				if (single instanceof With) {
					doCommand = single;
				}
			}
		}
		if (doCommand instanceof With) {
			// Merging
			// bind(with, CorePackage.eINSTANCE.getWith_Object(), withObject);
			With internalWith = mergeNestedWithCommands((With) doCommand);
			Command first = null;
			Command second = null;
			if (withCommand.getBindings().size() == 1) {
				Binding binding = withCommand.getBindings().get(0);
				if (binding.getFeature().getFeatureID() == CorePackage.WITH__OBJECT)
					first = binding.getCommand();
			}
			if (internalWith.getBindings().size() == 1) {
				Binding binding = internalWith.getBindings().get(0);
				if (binding.getFeature().getFeatureID() == CorePackage.WITH__OBJECT)
					second = binding.getCommand();
			}
			Command newObject = makePipe(first, second);
			Command newDo = internalWith.getDo();
			With newWith = makeWith(newObject, newDo);
			return newWith;
		}
		return withCommand;
	}

	private static Command subPipe(Pipeline pipeline, int from) {
		return subPipe(pipeline, from, pipeline.getCommands().size());
	}

	private static Command subPipe(Pipeline pipeline, int from, int to) {
		List<Command> commands = pipeline.getCommands();
		// it is checked already that size > 1
		if (commands.size() == 2) {
			return commands.get(1);
		}
		List<Command> rest = new ArrayList<Command>(commands);
		rest.remove(0);
		return makePipe(pipeline.getCommands().subList(from, to));
	}
}
