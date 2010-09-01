package org.eclipse.ecl.console.internal.ui;

import java.io.IOException;

import org.eclipse.dltk.console.IScriptConsoleShell;
import org.eclipse.dltk.console.ui.IScriptConsoleViewer;
import org.eclipse.dltk.console.ui.ScriptConsoleTextHover;
import org.eclipse.ecl.console.ui.EclConsoleUiPlugin;
import org.eclipse.jface.text.IRegion;

public class EclConsoleTextHover extends ScriptConsoleTextHover {

	private IScriptConsoleShell interpreterShell;

	public EclConsoleTextHover(IScriptConsoleShell interpreterShell) {
		this.interpreterShell = interpreterShell;
	}

	@Override
	protected String getHoverInfoImpl(IScriptConsoleViewer viewer,
			IRegion hoverRegion) {
		try {
			int cursorPosition = hoverRegion.getOffset()
					- viewer.getCommandLineOffset();

			String commandLine = viewer.getCommandLine();
			if (commandLine == null) {
				return null;
			}

			return interpreterShell.getDescription(commandLine, cursorPosition);
		} catch (IOException e) {
			EclConsoleUiPlugin.logErr(e.getMessage(), e);
			return null;
		}
	}
}