package org.eclipse.ecl.console.internal.ui;

import java.io.IOException;

import org.eclipse.dltk.console.ScriptConsolePrompt;
import org.eclipse.dltk.console.ui.ScriptConsole;
import org.eclipse.ecl.console.EclInterpreter;

public class EclConsole extends ScriptConsole {

	public EclConsole() throws IOException {
		super("ECL Console", null);
		EclInterpreter interpreter = new EclInterpreter();
		setInterpreter(interpreter);
		setPrompt(new ScriptConsolePrompt("> ", ">> ")); //$NON-NLS-1$ //$NON-NLS-2$
		setContentAssistProcessor(new EclConsoleCompletionProcessor(interpreter));
		setTextHover(new EclConsoleTextHover(interpreter));
	}
}
