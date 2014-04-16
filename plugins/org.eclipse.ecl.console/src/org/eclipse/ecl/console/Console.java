package org.eclipse.ecl.console;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.console.completion.CompletionUtils;
import org.eclipse.ecl.console.completion.EclContentProposalProvider;
import org.eclipse.ecl.console.view.View;
import org.eclipse.ecl.runtime.EclRuntime;
import org.eclipse.jface.fieldassist.IContentProposalProvider;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class Console {
	private static final String[] EMPTY_DATA = new String[0];
	
	private static final String HEADER = "<html>";
	private static final String FOOTER = "</html>";

	private static final String PROMT = "$";
	
	private static final String ANSWER_HEADER = "<div>";
	private static final String ANSWER_FOOTER = "</div>";
	private static final String CMD_LINE = "<div><table><tr><td>" + PROMT + "</td><td><console-element type='promt'/></td></tr></table></div>";
	
	private static Console instance;
	
	private final EclContentProposalProvider proposals = new EclContentProposalProvider();
	private final List<ConsoleUpdateListener> listeners = new ArrayList<ConsoleUpdateListener>();

	private final CommandProcessor processor = new CommandProcessor(EclRuntime.createSession());
	private final CommandHistory history = new CommandHistory();
	private final Content content = new Content();

	public static Console getInstance() {
		if (instance == null) {
			instance = new Console();
		}
		return instance;
	}

	protected Console() {
		try {
			proposals.swap(CompletionUtils.findEclCommands(processor.getSession()));
		} catch (final CoreException ignore) {
			// do nothing
		}
	}

	public String getHeader() {
		return HEADER;
	}

	public String getFooter() {
		return FOOTER;
	}

	public synchronized void write(final String content) {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				try {
					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					page.showView(View.ID);
					String[] data = EMPTY_DATA;
					if (content != null) {
						data = new String[] { ANSWER_HEADER, encode(content), ANSWER_FOOTER };
					}
					write(data);
				} catch (PartInitException exception) {
					printException(exception);
				}
			}
		});
	}

	public synchronized void clear() {
		content.clear();
		update();
	}

	public Content getContent() {
		return content;
	}

	public String getCommandLine() {
		return CMD_LINE;
	}

	protected void write(String data[]) {
		StringBuffer storedData = new StringBuffer();
		for (int index = 0; index < data.length; index++) {
			storedData.append(data[index]);
		}
		content.add(storedData.toString());
		update();
	}

	public void send(final String message) {
		if (!"".equals(message)) {
			history.add(message);
		}

		try {
			write(PROMT + " " + message);
			processor.execute(message);
		} catch (Throwable th) {
			write(EMPTY_DATA);
			printException(th);
		}
	}

	public String getPrevCommand() {
		return history.getPrev();
	}

	public String getNextCommand() {
		return history.getNext();
	}

	protected String encode(String value) {
		return "<pre><![CDATA[" + value + "]]></pre>";
	}

	public void addUpdateListener(ConsoleUpdateListener listener) {
		listeners.add(listener);
	}

	public void removeUpdateListener(ConsoleUpdateListener listener) {
		listeners.remove(listener);
	}
	
	public IContentProposalProvider getContentProposalProvider() {
		return proposals;
	}

	protected void update() {
		for (final ConsoleUpdateListener listener : listeners) {
			try {
				listener.update(this);
			} catch (Throwable throwable) {
				// ignore
			}
		}
	}

	public void printException(Throwable throwable) {
		final ByteArrayOutputStream stream = new ByteArrayOutputStream();
		final PrintWriter writer = new PrintWriter(stream);
		
		throwable.printStackTrace(writer);
		writer.flush();

		write(stream.toString());
	}
}
