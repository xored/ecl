package org.eclipse.dltk.tcl.ui.tests.ecl.util;

import junit.framework.TestCase;
import net.sf.swtbot.SWTBot;
import net.sf.swtbot.eclipse.finder.SWTEclipseBot;
import net.sf.swtbot.eclipse.finder.widgets.SWTBotView;
import net.sf.swtbot.wait.DefaultCondition;
import net.sf.swtbot.widgets.SWTBotShell;
import net.sf.swtbot.widgets.WidgetNotFoundException;

import org.eclipse.core.runtime.Status;
import org.eclipse.dltk.tcl.ui.tests.ecl.internal.dltktest.DLTKTestUtils;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.parser.EclCoreParser;
import org.eclipse.ecl.runtime.EclRuntime;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewReference;

public class EclSWTTestCase extends TestCase {
	public EclSWTTestCase() {
		super();
	}

	public EclSWTTestCase(String name) {
		super(name);
	}

	protected void exec(String script) throws Exception {
		ISession session = EclRuntime.createSession();
		Command command = EclCoreParser.newCommand(script);
		IPipe source = session.createPipe();
		IPipe sink = session.createPipe();
		IProcess process = session.execute(command, source, sink);
		TestCase.assertEquals(Status.OK_STATUS.toString(), process.waitFor()
				.toString());
	}

	@Override
	public void runBare() throws Throwable {
		final boolean[] testOK = new boolean[1];
		final Display display = Display.getDefault();
		final boolean[] testDone = new boolean[] { false };
		final Throwable[] error = new Throwable[1];
		Thread initThread = new Thread() {
			public void run() {
				try {
					superRunBare();
					testOK[0] = true;
				} catch (Throwable e) {
					error[0] = e;
				} finally {
					testDone[0] = true;
					display.wake();
				}
			}
		};
		initThread.start();
		long start = System.currentTimeMillis();
		while (true) {
			if (!display.readAndDispatch()) {
				if (testDone[0])
					break;
				long cur = System.currentTimeMillis();
				if (cur - start > 600000) {
					throw new RuntimeException("Timeout in test");
				}
				display.sleep();
			}
		}
		Throwable throwable = error[0];
		if (throwable != null) {
			if (throwable instanceof Error)
				throw (Error) throwable;
			if (throwable instanceof Exception)
				throw (Exception) throwable;
			throw new Error(throwable);
		}
	}

	public void superRunBare() throws Throwable {
		closeWelcome();
		super.runBare();
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		closeWelcome();
	}

	@Override
	protected void tearDown() throws Exception {
		closeAllDialogs();
		super.tearDown();
	}

	public static void closeWelcome() {
		Display.getDefault().syncExec(new Runnable() {
			final SWTEclipseBot eclipseBot = new SWTEclipseBot();
			final String welcomePageId = "org.eclipse.ui.internal.introview";

			public void run() {
				IViewReference reference = DLTKTestUtils
						.findViewWithId(welcomePageId);
				if (reference == null)
					return;
				final SWTBotView view = new SWTBotView(reference, eclipseBot);
				view.close();
				eclipseBot.waitUntil(new DefaultCondition() {
					public boolean test() throws Exception {
						IViewReference reference = DLTKTestUtils
								.findViewWithId(welcomePageId);
						return (reference == null);
					}

					public String getFailureMessage() {
						return "Cannot close welcome view";
					}
				});
			}
		});
	}

	private void closeAllDialogs() {
		SWTBot bot = new SWTBot();
		try {
			SWTBotShell[] shells = bot.shells();
			for (int index = shells.length - 1; index > 0; index--) {
				if (shells[index].isOpen()) {
					shells[index].close();
				}
			}
		} catch (WidgetNotFoundException e) {
			// do nothing
		}
		bot.waitUntil(new DefaultCondition() {
			public String getFailureMessage() {
				return null;
			}

			public boolean test() throws Exception {
				try {
					return bot.shells().length == 1;
				} catch (WidgetNotFoundException e) {
					return false;
				}
			}
		});
	}
}
