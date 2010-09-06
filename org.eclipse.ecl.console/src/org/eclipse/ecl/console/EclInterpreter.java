package org.eclipse.ecl.console;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.dltk.console.IScriptConsoleIO;
import org.eclipse.dltk.console.IScriptConsoleInterpreter;
import org.eclipse.dltk.console.IScriptExecResult;
import org.eclipse.dltk.console.IScriptInterpreter;
import org.eclipse.dltk.console.ScriptConsoleCompletionProposal;
import org.eclipse.dltk.console.ScriptExecResult;
import org.eclipse.ecl.client.tcp.EclTcpClientPlugin;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.model.editing.Complete;
import org.eclipse.ecl.model.editing.Description;
import org.eclipse.ecl.model.editing.Doc;
import org.eclipse.ecl.model.editing.EditingFactory;
import org.eclipse.ecl.model.editing.Proposal;
import org.eclipse.ecl.parser.EclCoreParser;
import org.eclipse.ecl.parser.EclParserErrorCollector;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class EclInterpreter implements IScriptInterpreter {
	private ISession session;

	public EclInterpreter() throws IOException {
		this.session = EclTcpClientPlugin.startLocalSession();
	}

	public void addInitialListenerOperation(Runnable runnable) {
		new Thread(runnable).start();
	}

	public InputStream getInitialOutputStream() {
		return null;
	}

	public boolean isValid() {
		return session != null;
	}

	public void close() throws IOException {
		try {
			if (session != null) {
				session.close();
				session = null;
			}
		} catch (CoreException e) {
			EclConsolePlugin.log(e);
		}
	}

	public List<ScriptConsoleCompletionProposal> getCompletions(
			String commandLine, int position) throws IOException {
		List<ScriptConsoleCompletionProposal> list = new ArrayList<ScriptConsoleCompletionProposal>();
		try {
			Complete c = EditingFactory.eINSTANCE.createComplete();
			c.setText(commandLine);
			c.setOffset(position);
			IPipe pipe = session.createPipe();
			IProcess pr = session.execute(c, null, pipe);
			IStatus status = null;
			while (status == null) {
				try {
					status = pr.waitFor();
				} catch (InterruptedException e) {
				}
			}
			List<Proposal> proposals = new ArrayList<Proposal>();
			if (status.isOK()) {
				Object o = null;
				while ((o = pipe.take(0)) != null) {
					if (o instanceof Proposal) {
						proposals.add((Proposal) o);
					}
				}
			}
			for (Proposal p : proposals) {
				list.add(new ScriptConsoleCompletionProposal(p.getInsert(), p
						.getDisplay(), p.getType().getName()));
			}
		} catch (CoreException e) {
			EclConsolePlugin.log(e);
		}
		return list;
	}

	public String getDescription(String commandLine, int position)
			throws IOException {
		try {
			Description dc = EditingFactory.eINSTANCE.createDescription();
			dc.setText(commandLine);
			dc.setOffset(position);
			IPipe pipe = session.createPipe();
			IProcess pr = session.execute(dc, null, pipe);
			IStatus status = null;
			while (status == null) {
				try {
					status = pr.waitFor();
				} catch (InterruptedException e) {
				}
			}
			if (status.isOK()) {
				Object o = null;
				while ((o = pipe.take(0)) != null) {
					if (o instanceof Doc) {
						return ((Doc) o).getText();
					}
				}
			}
		} catch (CoreException e) {
			EclConsolePlugin.log(e);
		}
		return null;
	}

	public String[] getNames(String type) throws IOException {
		EclConsolePlugin.logWarn("Method is not implemented: "
				+ "org.eclipse.ecl.console.EclInterpreter.getNames", null);
		return null;
	}

	public IScriptExecResult exec(String text) throws IOException {
		try {
			EclParserErrorCollector collector = new EclParserErrorCollector();
			Command command = EclCoreParser.newCommand(text, collector);
			if (command == null) {
				return handleNullCommand(collector);
			}
			IProcess pr = session.execute(command);
			IStatus status = pr.waitFor();
			if (status.isOK())
				return null;
			else
				return new ScriptExecResult(status.getMessage() + "\r\n", true);
		} catch (Exception e) {
			EclConsolePlugin.logErr(e.getMessage(), e);
			return new ScriptExecResult(
					"Execution is failed. Please see error log for details\r\n",
					true);
		}
	}

	private IScriptExecResult handleNullCommand(
			EclParserErrorCollector collector) {
		return new ScriptExecResult("Syntax error\r\n", true);
	}

	public int getState() {
		return IScriptConsoleInterpreter.WAIT_NEW_COMMAND;
	}

	public void consoleConnected(IScriptConsoleIO protocol) {
		EclConsolePlugin.logWarn("Method is not implemented: "
				+ "org.eclipse.ecl.console.EclInterpreter.consoleConnected",
				null);
	}
}
