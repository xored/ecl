package org.eclipse.ecl.swt.dltk.tests;


public class InterpreterTests extends AbstractDltkTest {

	// public void setUp() throws Exception {
	// super.setUp();
	// openTclPerspective();
	// }
	//
	// public void tearDown() throws Exception {
	// clearInterpreters();
	// }
	//
	// /**
	// * Create an interpreter using add button. (DLTK-510)<br>
	// * <br>
	// *
	// * 1. Open Main menu Window->Preferences<br>
	// * 2. Expand Tcl/Interpreters<br>
	// * 3. Add 2 Interpreters with use "Add..." buttons<br>
	// * <br>
	// * Expected:<br>
	// * 1. System contain 2 interpreters<br>
	// * 2. First interpreter is default
	// *
	// */
	// public void testCreate() {
	// helper.assertInterpretersEmpty();
	//
	// new InterpreterOperations(bot).createInterpreter(
	// DltkTestsHelper.DEF_INTERPRETER_PATH,
	// DltkTestsHelper.DEF_INTERPRETER_ID, true, 0);
	//
	// new InterpreterOperations(bot).createInterpreter(
	// DltkTestsHelper.ALT_INTERPRETER_PATH,
	// DltkTestsHelper.ALT_INTERPRETER_ID, false, 1);
	//
	// helper.assertDefInterpreterExist();
	// helper.assertAltInterpreterExist();
	//
	// IInterpreterInstall interpr = helper
	// .getInterpreterByName(DltkTestsHelper.DEF_INTERPRETER_ID);
	// assertTrue(helper.isDefaultInterpreter(interpr));
	//
	// interpr = helper
	// .getInterpreterByName(DltkTestsHelper.ALT_INTERPRETER_ID);
	// assertFalse(helper.isDefaultInterpreter(interpr));
	// }
	//
	// /**
	// * Change default interpreter. (DLTK-602)<br>
	// * <br>
	// *
	// * Predefined conditions:<br>
	// * 1. System contain 2 interpreters (Default and Alternative) <br>
	// * <br>
	// * Actions:<br>
	// * 1. Open Interpreters Preferences page<br>
	// * - Main menu Window->Preferences<br>
	// * - Select in tree Tcl->Interpreters<br>
	// * Expected table with 2 interpreters. Row with default interpreter is
	// * checked.<br>
	// * 2. Click to checkbox in table with alternative interpreter <br>
	// * <br>
	// * Expected:<br>
	// * 1. Alternative interpreter is default
	// *
	// */
	// public void testChangeDefaultInterpreter() {
	// IInterpreterInstall[] interpreters = helper.initDefAndAltInterpreters();
	// helper.isDefaultInterpreter(interpreters[0]);
	//
	// new InterpreterOperations(bot).changeDefaultInterpreter();
	//
	// helper.isDefaultInterpreter(interpreters[1]);
	// }
	//
	// /**
	// * Remove default interpreter. (DLTK-635)<br>
	// * <br>
	// * Predefined conditions:<br>
	// * 1. System contain 2 interpreters (Default and Alternative)<br>
	// * <br>
	// * Actions:<br>
	// * 1. Open Interpreters Preferences page<br>
	// * Expected table with 2 interpreters. Row with default interpreter is
	// * checked.<br>
	// * <br>
	// * 2. Select row with Default Interpreter and click "Remove" button<br>
	// * Expected: Alternative interpreter is default<br>
	// */
	// public void testRemoveDefaultInterpreter() {
	// IInterpreterInstall interpr = helper.initDefAndAltInterpreters()[0];
	// helper.isDefaultInterpreter(interpr);
	//
	// new InterpreterOperations(bot).removeDefaultInterpreter();
	//
	// helper.assertInterpretersCount(1);
	//
	// interpr = (IInterpreterInstall) helper.getInterpreters().get(0);
	// assertEquals(interpr.getId(), DltkTestsHelper.ALT_INTERPRETER_ID);
	// assertTrue(helper.isDefaultInterpreter(interpr));
	// }
	//
	// /**
	// * Remove several interpreters. (DLTK-644)<br>
	// * <br>
	// * Predefined conditions:<br>
	// * 1. System contain 3 interpreters<br>
	// * <br>
	// * Actions:<br>
	// * 1. Open Interpreters Preferences page<br>
	// * Expected table with 3 interpreters. Row with default interpreter is
	// * checked.<br>
	// * <br>
	// * 2 Select first and last interpreters and click "Remove" button<br>
	// * <br>
	// * Expected:<br>
	// * One interpreter<br>
	// */
	// public void testRemoveInterpreters() {
	// IInterpreterInstall[] interpreters = helper.init3Interpreters();
	// helper.isDefaultInterpreter(interpreters[0]);
	// helper.assertInterpretersCount(3);
	//
	// new InterpreterOperations(bot).removeInterpreters();
	//
	// helper.assertInterpretersCount(1);
	//
	// IInterpreterInstall interpr = (IInterpreterInstall) helper
	// .getInterpreters().get(0);
	// assertEquals(interpr.getId(), DltkTestsHelper.DEF_INTERPRETER_ID);
	// }
	//
	// /**
	// * Remove all interpreters. (DLTK-645)<br>
	// * <br>
	// * Predefined conditions:<br>
	// * 1. System contain 1 interpreter<br>
	// * <br>
	// * Actions:<br>
	// * 1. Open Interpreters Preferences page<br>
	// * Expected table with 1 interpreters.<br>
	// * <br>
	// * 2 Select row and click "Remove" button<br>
	// * <br>
	// * Expected:<br>
	// * List of interpreters is empty<br>
	// * Error (Warning) message<br>
	// */
	// public void testRemoveAllInterpreters() {
	// helper.initOnlyDefInterpreter();
	// new InterpreterOperations(bot).removeAllInterpreters();
	// helper.assertInterpretersEmpty();
	// }
	//
	// /**
	// * Add interpreter to a project with use Script Explorer context menu
	// * "Properties". (DLTK-512) <br>
	// *
	// * Predefined conditions:<br>
	// * 1. System contain 2 Tcl interpreter (Default and Alternative)<br>
	// * 2. Workspace contain Tcl project without Interpreter Libraries<br>
	// * <br>
	// * Actions:<br>
	// * 1. Open Build Path/Libraries property page:<br>
	// * - Script Explorer "Properties".<br>
	// * - Tree Tcl/Build path.<br>
	// * - Page Libraries.<br>
	// * Expected empty list<br>
	// * 2. Add Tcl Interpreter Library<br>
	// * - Click to "Add Library" button<br>
	// * - Select "Tcl Interpreter Library" and click to "Next"<br>
	// * - Add interpreter:<br>
	// * - Select radio "Alternate interpreter"<br>
	// * - Selected from combo alternative interpreter<br>
	// * - Click "Finish" button<br>
	// * 3. Close all dialogs with use "OK" button<br>
	// * <br>
	// * Expected:<br>
	// * 1. Project contain specified Interpreter Library<br>
	// *
	// */
	// public void testAdd001() {
	// helper.initDefAndAltInterpreters();
	//
	// IScriptProject project = initProject(projectName =
	// DltkTestsHelper.EMPTY_PROJECT_WITHOUT_LIB);
	//
	// new InterpreterOperations(bot).addInterpreter001(projectName);
	//
	// helper.assertInterpreter(project, DltkTestsHelper.ALT_INTERPRETER_ID);
	// }
	//
	// /**
	// * Add interpreter to a project with use Script Explorer context menu
	// * "Build Path/Configure Build Path...". (DLTK-512)<br>
	// *
	// * Predefined conditions:<br>
	// * 1. System contain 2 Tcl interpreter (Default and Alternative)<br>
	// * 2. Workspace contain Tcl project without Interpreter Libraries<br>
	// * <br>
	// * Actions:<br>
	// * 1. Open Build Path/Libraries property page:<br>
	// * - Script Explorer context menu
	// "Build Path/Configure Build Path...".<br>
	// * - Page Libraries.<br>
	// * Expected empty list<br>
	// * 2. Add Tcl Interpreter Library<br>
	// * - Click to "Add Library" button<br>
	// * - Select "Tcl Interpreter Library" and click to "Next"<br>
	// * - Add interpreter: click "Finish" button (radio
	// * "Workspace Default interpreter" must be selected)<br>
	// * 3. Close all dialogs with use "OK" button<br>
	// * <br>
	// * Expected:<br>
	// * 1. Project contain specified Interpreter Library<br>
	// */
	// public void testAdd002() {
	// helper.initDefAndAltInterpreters();
	//
	// IScriptProject project = initProject(projectName =
	// DltkTestsHelper.EMPTY_PROJECT_WITHOUT_LIB);
	// new InterpreterOperations(bot).addInterpreter002(projectName);
	//
	// helper.assertInterpreter(project, DltkTestsHelper.DEF_INTERPRETER_ID);
	// }
	//
	// /**
	// * Try to add several Interpreter Libraries to a project. (DLTK-646)<br>
	// * <br>
	// * Predefined conditions:<br>
	// * 1. System contain 2 Tcl interpreter (Default and Alternative)<br>
	// * 2. Workspace contain Tcl project with Default Interpreter Libraries<br>
	// * <br>
	// * Actions:<br>
	// * 1. Open Build Path/Libraries property page<br>
	// * Expected list with one Interpreter Libraries<br>
	// * 2. Add Tcl Interpreter Library<br>
	// * - Click to "Add Library" button<br>
	// * - Select "Tcl Interpreter Library" and click to "Next"<br>
	// * - Add alternative interpreter: Select radio "Alternate interpreter",
	// * selected from combo alternative Interpreter and click "Finish"
	// button<br>
	// * <br>
	// * Expected:<br>
	// * 1. Error dialog with message about several Interpreter Libraries<br>
	// */
	// public void testAdd003() {
	// helper.initDefAndAltInterpreters();
	//
	// IScriptProject project = initProject(projectName =
	// DltkTestsHelper.EMPTY_PROJECT);
	// helper.assertInterpreter(project, DltkTestsHelper.DEF_INTERPRETER_ID);
	//
	// new InterpreterOperations(bot).addInterpreter003(projectName);
	//
	// helper.assertInterpreter(project, DltkTestsHelper.DEF_INTERPRETER_ID);
	// }
	//
	// /**
	// * Set default interpreter to a project. (DLTK-513)<br>
	// * <br>
	// * Predefined conditions:<br>
	// * 1. System contain 2 Tcl interpreter (Default and Alternative)<br>
	// * 2. Workspace contain Tcl project with Alternative Interpreter
	// Library<br>
	// * <br>
	// * Actions:<br>
	// * 1. Open Build Path/Libraries property page<br>
	// * Expect list with one element (Alternative Interpreter Library)<br>
	// * 2. Edit Tcl Interpreter Library<br>
	// * - Click to "Edit..." button<br>
	// * Expect "Edit Library" dialog with selected "Alternative Interpreter"
	// * radio<br>
	// * - Select "Workspace Default Interpreter" radio and click to
	// "Finish"<br>
	// * <br>
	// * Expected:<br>
	// * 1. Project contain Default Interpreter Library<br>
	// *
	// */
	// public void testSetDefault() {
	// helper.initDefAndAltInterpreters();
	//
	// IScriptProject project = initProject(projectName =
	// DltkTestsHelper.EMPTY_PROJECT_WITH_ALT_INTERPR);
	// helper.assertInterpreter(project, DltkTestsHelper.ALT_INTERPRETER_ID);
	//
	// new InterpreterOperations(bot).changeInterpreter001(projectName);
	//
	// helper.assertInterpreter(project, DltkTestsHelper.DEF_INTERPRETER_ID);
	// }
	//
	// /**
	// * Set alternative interpreter to a project. (DLTK-514)<br>
	// *<br>
	// * Predefined conditions:<br>
	// * 1. System contain 2 Tcl interpreter (Default and Alternative)<br>
	// * 2. Workspace contain Tcl project with Default Interpreter Library<br>
	// * <br>
	// * Actions:<br>
	// * 1. Open Build Path/Libraries property page<br>
	// * Expect list with one element (Default Interpreter Library)<br>
	// * 2. Edit Tcl Interpreter Library<br>
	// * - Click to "Edit..." button<br>
	// * Expect "Edit Library" dialog with selected ""Workspace Default
	// * Interpreter" radio<br>
	// * - Select "Alternative Interpreter" radio, select Altertative
	// Interpreter
	// * from combobox and click to "Finish"<br>
	// * <br>
	// * Expected:<br>
	// * 1. Project contain Alternative Interpreter Library<br>
	// */
	// public void testSetAlternative() {
	// helper.initDefAndAltInterpreters();
	//
	// IScriptProject project = initProject(projectName =
	// DltkTestsHelper.EMPTY_PROJECT);
	// helper.assertInterpreter(project, DltkTestsHelper.DEF_INTERPRETER_ID);
	//
	// new InterpreterOperations(bot).changeInterpreter002(projectName);
	//
	// helper.assertInterpreter(project, DltkTestsHelper.ALT_INTERPRETER_ID);
	// }
	//
	// /**
	// * Remove interpreter from a project. (DLTK-515)<br>
	// *<br>
	// * Predefined conditions:<br>
	// * 1. System contain Default Tcl interpreter<br>
	// * 2. Workspace contain Tcl project with Default Interpreter Library<br>
	// * <br>
	// * Actions:<br>
	// * 1. Open Build Path/Libraries property page<br>
	// * Expect list with one element (Default Interpreter Library)<br>
	// * 2. Remove Tcl Interpreter Library<br>
	// * - Click to "Remove" button<br>
	// * <br>
	// * Expected:<br>
	// * 1. Project have not Interpreter Library<br>
	// */
	// public void testRemoveFromProject() {
	// helper.initOnlyDefInterpreter();
	// IScriptProject project = initProject(projectName =
	// DltkTestsHelper.EMPTY_PROJECT);
	// helper.assertInterpreter(project, DltkTestsHelper.DEF_INTERPRETER_ID);
	//
	// new InterpreterOperations(bot).removeInterpreter(projectName);
	//
	// assertInterpreterEmpty(project);
	// }
	//
	// //
	// /////////////////////////////////////////////////////////////////////////
	// //
	// // Initialize methods
	// //
	// //
	// /////////////////////////////////////////////////////////////////////////
	// protected IScriptProject initProject(String projectName) {
	// IScriptProject result = null;
	// try {
	// this.projectName = projectName;
	//
	// result = helper.setUpScriptProject(projectName);
	// assertTrue(ErrorMessages.Project_errNotFound, result != null);
	//
	// IProject project = result.getProject();
	// assertTrue(ErrorMessages.Project_errNotFound, project != null
	// && project.exists());
	//
	// return result;
	// } catch (IOException ex) {
	// throw new RuntimeException(ErrorMessages.Common_initError, ex);
	// } catch (CoreException ex) {
	// throw new RuntimeException(ErrorMessages.Common_initError, ex);
	// }
	// }
	//
	// //
	// /////////////////////////////////////////////////////////////////////////
	// //
	// // Assert methods
	// //
	// //
	// /////////////////////////////////////////////////////////////////////////
	// public void assertInterpreterEmpty(IScriptProject project) {
	// String errorMessage = ErrorMessages.Common_prjInterprFound;
	// try {
	// IInterpreterInstall interpreter = ScriptRuntime
	// .getInterpreterInstall(project);
	// assertNull(errorMessage, interpreter);
	// } catch (CoreException ex) {
	// fail(errorMessage);
	// }
	// }

}
