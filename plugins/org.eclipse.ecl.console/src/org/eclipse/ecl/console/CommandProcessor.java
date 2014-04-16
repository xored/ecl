package org.eclipse.ecl.console;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.console.commands.ConsoleFactory;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.Pipeline;
import org.eclipse.ecl.data.commands.CommandsFactory;
import org.eclipse.ecl.parser.EclCoreParser;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.ISession;

public class CommandProcessor {
	private final ISession session;
	
	public CommandProcessor(final ISession session) {
		this.session = session;
	}
	
	public ISession getSession() {
		return session;
	}
	
	public void execute(final String cmd) throws CoreException {
		final Pipeline pipeline = CoreFactory.eINSTANCE.createPipeline();
		final IPipe pipe = session.createPipe();
		
		pipeline.getCommands().add(EclCoreParser.newCommand(cmd));
		pipeline.getCommands().add(CommandsFactory.eINSTANCE.createPrint());
		pipeline.getCommands().add(ConsoleFactory.eINSTANCE.createWrite());
		
		session.execute(pipeline, null, pipe);
	}
}
