package org.eclipse.ecl.swt.dltk.tests;

import net.sf.swtbot.eclipse.finder.SWTBotEclipseTestCase;

public class LaunchTests extends SWTBotEclipseTestCase {

	// private static boolean DEBUG;
	// static {
	// String value = Platform
	// .getDebugOption("org.eclipse.dltk.ui.tests.swtbot/Launch");
	// DEBUG = Boolean.valueOf(value).booleanValue();
	// }
	//
	// private static final String PROJECT_NAME = "Launch";
	//
	// private static final String CORRECT_SCRIPT = "CorrectScript.tcl";
	// private static final String INCORRECT_SCRIPT = "InvalidScript.tcl";
	//
	// private LaunchOperations operation;
	// private DltkTestsHelper helper;
	// private IScriptProject project;
	//
	// public LaunchTests(String name) {
	// super();
	// setName(name);
	// helper = new DltkTestsHelper(name, bot);
	// operation = new LaunchOperations(bot);
	// DltkTestsHelper.DEBUG = DEBUG;
	// }
	//	
	// class Searcher implements IFileVisitor {
	// private String debuggingEnginePath = null;
	//
	// public boolean visit(IFileHandle file) {
	// if (file.isFile() && file.getName().startsWith("dbgp_tcldebug")) {
	// debuggingEnginePath = file.toOSString();
	// }
	//
	// if (file.isDirectory() && debuggingEnginePath == null) {
	// return true;
	// } else {
	// return false;
	// }
	// }
	//
	// public String getPath() {
	// return debuggingEnginePath;
	// }
	// };
	// public void setUp() throws Exception {
	// DltkTestsHelper.debug(getName() + " starting...");
	// super.setUp();
	// helper.setUpSuite();
	// helper.openTclPerspective();
	// helper.initOnlyDefInterpreter();
	// project = helper.setUpScriptProject(PROJECT_NAME);
	// DltkTestsHelper.debug(getName() + " started");
	// }
	//
	// public void tearDown() throws Exception {
	// DltkTestsHelper.debug(getName() + " finishing...");
	// helper.closeDialogs();
	// helper.deleteProject(PROJECT_NAME);
	//
	// helper.clearInterpreters();
	// helper.tearDownSuite();
	//
	// super.tearDown();
	// DltkTestsHelper.debug(getName() + " finished");
	// }
	//
	// protected String getProjectName() {
	// return project.getProject().getName();
	// }
	//
	// // /////////////////////////////////////////////////////////////////
	// //
	// // Tests
	// //
	// // /////////////////////////////////////////////////////////////////
	// /**
	// * Run a Tcl script using context menu. (DLTKTEST-82)
	// */
	// public void testRunByContextMenu() {
	// helper.assertInterpreter(project, DltkTestsHelper.DEF_INTERPRETER_ID);
	// operation.runByContextMenu(getProjectName(), CORRECT_SCRIPT);
	// operation.assertExecuteCompleteOk();
	// }
	//
	// /**
	// * Try to run incorrect Tcl script. (DLTKTEST-41)
	// */
	// public void testRunIncorrectScript() {
	// helper.assertInterpreter(project, DltkTestsHelper.DEF_INTERPRETER_ID);
	// operation.runByContextMenu(getProjectName(), INCORRECT_SCRIPT);
	// operation.assertExecuteCompleteWithError();
	// }
	//
	// /**
	// * Debug a Tcl script using context menu. (DLTKTEST-67)
	// */
	// public void testDebugByContextMenu() {
	// initializeActiveStateDebugEngine();
	// helper.assertInterpreter(project, DltkTestsHelper.DEF_INTERPRETER_ID);
	// operation.debugByContextMenu(getProjectName(), CORRECT_SCRIPT);
	// operation.waitingDebugConsole();
	// operation.assertExecuteCompleteOk();
	// }
	//
	// /**
	// * Check Tcl debug preferences. (DLTKTEST-127)
	// */
	// public void testCheckDebugPreferences() {
	// operation.checkDebugPreferences(getProjectName());
	// }
	//
	// private boolean initialized = false;
	//
	// private void initializeActiveStateDebugEngine() {
	// if (initialized) {
	// return;
	// }
	// TclDebugPlugin.getDefault().getPluginPreferences().setValue(
	// TclDebugConstants.DEBUGGING_ENGINE_ID_KEY,
	// TclActiveStateDebuggerRunner.ENGINE_ID);
	//
	// // PathFilesContainer container = new PathFilesContainer();
	// Plugin plugin = TclActiveStateDebuggerPlugin.getDefault();
	//
	// String path = TestMessages.LaunchTests_dbgp_tcldebug;
	// File file = new File(path);
	// // Lets search if we could not found in default location.
	// boolean inDefault = true;
	// if (!file.exists()) {
	// PathFilesContainer container = new PathFilesContainer(
	// EnvironmentManager.getLocalEnvironment());
	// Searcher searcher = new Searcher();
	// container.accept(searcher);
	// path = searcher.getPath();
	// inDefault = false;
	// }
	// if (!inDefault && path == null) {
	// assertNotNull("Couldn't find ActiveState debugger", path);
	// }
	//		
	// Map map = new HashMap();
	// map.put(LocalEnvironment.getInstance(), path);
	// String keyValue = EnvironmentPathUtils.encodePaths(map);
	// plugin.getPluginPreferences().setValue(
	// TclActiveStateDebuggerConstants.DEBUGGING_ENGINE_PATH_KEY,
	// keyValue);
	// initialized = true;
	// }

}
