package org.eclipse.ecl.swt.dltk.tests;


public class EditorTests extends AbstractDltkTest {

	// String code = "set globalVar 0\n" + "namespace eval ns1 {\n"
	// + "\tnamespace eval ns2 {\n" + "\t\tset nsVar 0	\n"
	// + "\t\tproc proc1 { param1 param2 } {\n"
	// + "\t\t\tupvar $param2 upVar\n" + "\t\t\tset localVar 0\n"
	// + "\t\t\tputs $globalVar\n" + "\t\t\tputs $localVar\n"
	// + "\t\t\tputs $param1\n" + "\t\t\tputs $upVar\n"
	// + "\t\t\tns1::proc2\n" + "\t\t\tns1::proc3\n"
	// + "\t\t\tglobalProc\n" + "\t\t\tproc4\n" + "\t\t\t}\n"
	// + "\t\tproc proc4 { } { }\n" + "\t\tproc1 1 $nsVar\n" + "\t}\n"
	// + "\tproc proc3 { } { }\n" + "}\n" + "proc ns1::proc2 { } { }\n"
	// + "proc globalProc { } { }";
	//
	// private static final String PROJECT_NAME = "EditorProject";
	// private static final String SCRIPT_PATH = "SourceFolder";
	// private static final String SCRIPT_NAME = "Script1.tcl";
	//
	// private static final String NAMESPACE_1 = "ns1";
	// private static final String NAMESPACE_2 = "ns2";
	//
	// private static final String VAR_GLOBAL = "globalVar";
	// private static final String VAR_NAMESPACE = "nsVar";
	// private static final String VAR_LOCAL = "localVar";
	// private static final String VAR_PARAM = "param1";
	// private static final String VAR_UP = "upVar";
	// private static final String VAR_UP_PARAM = "param2";
	//
	// private static final String PROC_1 = "proc1";
	// private static final String PROC_2 = "proc2";
	// private static final String PROC_3 = "proc3";
	// private static final String PROC_4 = "proc4";
	// private static final String PROC_GLOBAL = "globalProc";
	//
	// private static final String FULL_PROC_2 = NAMESPACE_1 + "::" + PROC_2;
	// private static final String FULL_PROC_3 = PROC_3;
	// private static final String FULL_PROC_4 = PROC_4;
	// private static final String FULL_PROC_GLOBAL = PROC_GLOBAL;
	//
	// private static final String CALL_PROC_2 = NAMESPACE_1 + "::" + PROC_2;
	// private static final String CALL_PROC_3 = NAMESPACE_1 + "::" + PROC_3;
	// private static final String CALL_PROC_4 = PROC_4;
	// private static final String CALL_PROC_GLOBAL = PROC_GLOBAL;
	//
	// private static final String PROC_1_DECLARE = "proc " + PROC_1
	// + " { param1 param2 } {";
	//
	// public void setUp() throws Exception {
	// NonGUIHelper.createProject("EditorProject");
	// NonGUIHelper.createSourceFolder("EditorProject", "SourceFolder");
	// NonGUIHelper.createTclFile("EditorProject/SourceFolder", "Script1.tcl");
	// execute("FindControl Tree -parent [FindView \"Script Explorer\"]"
	// + " | GetTreeItem \"EditorProject/SourceFolder/Script1.tcl\""
	// + " | ContextMenu \"Open\" | Click");
	// super.setUp();
	// }
	//
	// public void tearDown() throws Exception {
	// super.tearDown();
	// }
	//
	// private String getDeclareProc(String fullName) {
	// return "proc " + fullName + " { } {";
	// }
	//
	// private String getDeclareVar(String name) {
	// return "set " + name + " 0";
	// }
	//
	// private String getCallVar(String name) {
	// return "$" + name;
	// }
	//
	// // ///////////////////////////////////////////////////////////////
	// //
	// // Navigate to a Tcl element's declaration using F3 key button
	// //
	// // ///////////////////////////////////////////////////////////////
	// /**
	// * Navigate to a Tcl element (procedure in global namespace) declaration
	// * using F3 key button (DLTK-580).
	// *
	// */
	// public void testGotoDeclaration001() {
	// String declare = getDeclareProc(FULL_PROC_GLOBAL);
	// createOperations().gotoDeclarationByF3(CALL_PROC_GLOBAL,
	// FULL_PROC_GLOBAL, declare);
	// }
	//
	// /**
	// * Navigate to a Tcl element (procedure in other namespace) declaration
	// * using F3 key button (DLTK-719).
	// *
	// */
	// public void testGotoDeclaration002() {
	// String declare = getDeclareProc(FULL_PROC_2);
	// createOperations().gotoDeclarationByF3(CALL_PROC_2, FULL_PROC_2,
	// declare);
	// }
	//
	// /**
	// * Navigate to a Tcl element (procedure in other namespace) declaration
	// * using F3 key button (DLTK-719).
	// *
	// */
	// public void testGotoDeclaration003() {
	// String declare = getDeclareProc(FULL_PROC_3);
	// createOperations().gotoDeclarationByF3(CALL_PROC_3, FULL_PROC_3,
	// declare);
	// }
	//
	// /**
	// * Navigate to a Tcl element (procedure in current namespace) declaration
	// * using F3 key button (DLTK-720).
	// *
	// */
	// public void testGotoDeclaration004() {
	// String declare = getDeclareProc(FULL_PROC_4);
	// createOperations().gotoDeclarationByF3(CALL_PROC_4, FULL_PROC_4,
	// declare);
	// }
	//
	// /**
	// * Navigate to a Tcl element (variable in global namespace) declaration
	// * using F3 key button (DLTK-721).
	// *
	// */
	// public void testGotoDeclaration005() {
	// String declare = getDeclareVar(VAR_GLOBAL);
	// String call = getCallVar(VAR_GLOBAL);
	// createOperations().gotoDeclarationByF3(call, VAR_GLOBAL, declare);
	// }
	//
	// /**
	// * Navigate to a Tcl element (variable in current namespace) declaration
	// * using F3 key button (DLTK-722).
	// *
	// */
	// public void testGotoDeclaration006() {
	// String declare = getDeclareVar(VAR_NAMESPACE);
	// String call = getCallVar(VAR_NAMESPACE);
	// createOperations().gotoDeclarationByF3(call, VAR_NAMESPACE, declare);
	// }
	//
	// /**
	// * Navigate to a Tcl element (local variable in procedure) declaration
	// using
	// * F3 key button (DLTK-723).
	// *
	// */
	// public void testGotoDeclaration007() {
	// String declare = getDeclareVar(VAR_LOCAL);
	// String call = getCallVar(VAR_LOCAL);
	// createOperations().gotoDeclarationByF3(call, VAR_LOCAL, declare);
	// }
	//
	// /**
	// * [Test] Navigate to a Tcl element (variable - parameter of procedure)
	// * declaration using F3 key button (DLTK-724). <br>
	// * <br>
	// * proc proc1 { param1 param2 } {<br>
	// * puts $param1<br>
	// * }<br>
	// *
	// */
	// /*
	// * public void testGotoDeclaration008() { String call =
	// * getCallVar(VAR_PARAM); createOperations().gotoDeclarationByF3(call,
	// * VAR_PARAM, PROC_1_DECLARE); }
	// */
	//
	// /**
	// * [Test] Navigate to a Tcl element (upvar variable) declaration using F3
	// * key button (DLTK-725).
	// *
	// */
	// public void testGotoDeclaration009() {
	// String call = getCallVar(VAR_UP);
	// createOperations().gotoDeclarationByF3(call, VAR_UP,
	// "upvar $" + VAR_UP_PARAM + " " + VAR_UP);
	// }
	//
	// /**
	// * [Test] Navigate to a Tcl element (variable - parameter of procedure)
	// * declaration using F3 key button (DLTK-724). <br>
	// * <br>
	// * proc proc1 { param1 param2 } {<br>
	// * upvar $param2 upVar<br>
	// * }<br>
	// *
	// */
	// /*
	// * public void testGotoDeclaration010() { String call =
	// * getCallVar(VAR_UP_PARAM); createOperations().gotoDeclarationByF3(call,
	// * VAR_UP_PARAM, PROC_1_DECLARE); }
	// */
	//
	// // ///////////////////////////////////////////////////////////////
	// //
	// // Navigate to a Tcl element's declaration using context menu
	// //
	// // ///////////////////////////////////////////////////////////////
	// /**
	// * Navigate to a Tcl element (procedure in global namespace) declaration
	// * using context menu. (DLTK-579).
	// *
	// */
	// public void testGotoDeclarationByContextMenu001() {
	// String declare = getDeclareProc(FULL_PROC_GLOBAL);
	// createOperations().gotoDeclarationByContextMenu(CALL_PROC_GLOBAL,
	// FULL_PROC_GLOBAL, declare);
	// }
	//
	// /**
	// * Navigate to a Tcl element (procedure in other namespace) declaration
	// * using context menu. (DLTK-727).
	// *
	// */
	// public void testGotoDeclarationByContextMenuByContextMenu002() {
	// String declare = getDeclareProc(FULL_PROC_2);
	// createOperations().gotoDeclarationByContextMenu(CALL_PROC_2,
	// FULL_PROC_2, declare);
	// }
	//
	// /**
	// * Navigate to a Tcl element (procedure in other namespace) declaration
	// * (DLTK-727).
	// *
	// */
	// public void testGotoDeclarationByContextMenu003() {
	// String declare = getDeclareProc(FULL_PROC_3);
	// createOperations().gotoDeclarationByContextMenu(CALL_PROC_3,
	// FULL_PROC_3, declare);
	// }
	//
	// /**
	// * Navigate to a Tcl element (procedure in current namespace) declaration
	// * (DLTK-729).
	// *
	// */
	// public void testGotoDeclarationByContextMenu004() {
	// String declare = getDeclareProc(FULL_PROC_4);
	// createOperations().gotoDeclarationByContextMenu(CALL_PROC_4,
	// FULL_PROC_4, declare);
	// }
	//
	// /**
	// * Navigate to a Tcl element (variable in global namespace) declaration
	// * (DLTK-731).
	// *
	// */
	// public void testGotoDeclarationByContextMenu005() {
	// String declare = getDeclareVar(VAR_GLOBAL);
	// String call = getCallVar(VAR_GLOBAL);
	// createOperations().gotoDeclarationByContextMenu(call, VAR_GLOBAL,
	// declare);
	// }
	//
	// /**
	// * Navigate to a Tcl element (variable in current namespace) declaration
	// * (DLTK-733).
	// *
	// */
	// public void testGotoDeclarationByContextMenu006() {
	// String declare = getDeclareVar(VAR_NAMESPACE);
	// String call = getCallVar(VAR_NAMESPACE);
	// createOperations().gotoDeclarationByContextMenu(call, VAR_NAMESPACE,
	// declare);
	// }
	//
	// /**
	// * Navigate to a Tcl element (local variable in procedure) declaration
	// using
	// * F3 key button (DLTK-735).
	// *
	// */
	// public void testGotoDeclarationByContextMenu007() {
	// String declare = getDeclareVar(VAR_LOCAL);
	// String call = getCallVar(VAR_LOCAL);
	// createOperations().gotoDeclarationByContextMenu(call, VAR_LOCAL,
	// declare);
	// }
	//
	// /**
	// * [Test] Navigate to a Tcl element (variable - parameter of procedure)
	// * declaration (DLTK-737). <br>
	// * <br>
	// * proc proc1 { param1 param2 } {<br>
	// * puts $param1<br>
	// * }<br>
	// *
	// */
	// /*
	// * public void testGotoDeclarationByContextMenu008() { String call =
	// * getCallVar(VAR_PARAM);
	// * createOperations().gotoDeclarationByContextMenu(call, VAR_PARAM,
	// * PROC_1_DECLARE); }
	// */
	//
	// /**
	// * [Test] Navigate to a Tcl element (upvar variable) declaration using F3
	// * key button (DLTK-739).
	// *
	// */
	// public void testGotoDeclarationByContextMenu009() {
	// String call = getCallVar(VAR_UP);
	// createOperations().gotoDeclarationByContextMenu(call, VAR_UP,
	// "upvar $" + VAR_UP_PARAM + " " + VAR_UP);
	// }
	//
	// /**
	// * [Test] Navigate to a Tcl element (variable - parameter of procedure)
	// * declaration (DLTK-737). <br>
	// * <br>
	// * proc proc1 { param1 param2 } {<br>
	// * upvar $param2 upVar<br>
	// * }<br>
	// *
	// */
	// /*
	// * public void testGotoDeclarationByContextMenu010() { String call =
	// * getCallVar(VAR_UP_PARAM);
	// * createOperations().gotoDeclarationByContextMenu(call, VAR_UP_PARAM,
	// * PROC_1_DECLARE); }
	// */
	//
	// // ///////////////////////////////////////////////////////////////
	// //
	// // Navigate to a Tcl element's declaration using main menu
	// //
	// // ///////////////////////////////////////////////////////////////
	// /**
	// * Navigate to a Tcl element (procedure in global namespace) declaration
	// * using "Navigate" menu (DLTK-578).
	// *
	// */
	// public void testGotoDeclarationByMainMenu001() {
	// String declare = getDeclareProc(FULL_PROC_GLOBAL);
	// createOperations().gotoDeclarationByMainMenu(CALL_PROC_GLOBAL,
	// FULL_PROC_GLOBAL, declare);
	// }
	//
	// /**
	// * Navigate to a Tcl element (procedure in other namespace) declaration
	// * using main menu. (DLTK-728).
	// *
	// */
	// public void testGotoDeclarationByMainMenu002() {
	// String declare = getDeclareProc(FULL_PROC_2);
	// createOperations().gotoDeclarationByMainMenu(CALL_PROC_2, FULL_PROC_2,
	// declare);
	// }
	//
	// /**
	// * Navigate to a Tcl element (procedure in other namespace) declaration
	// * (DLTK-728).
	// *
	// */
	// public void testGotoDeclarationByMainMenu003() {
	// String declare = getDeclareProc(FULL_PROC_3);
	// createOperations().gotoDeclarationByMainMenu(CALL_PROC_3, FULL_PROC_3,
	// declare);
	// }
	//
	// /**
	// * Navigate to a Tcl element (procedure in current namespace) declaration
	// * (DLTK-730).
	// *
	// */
	// public void testGotoDeclarationByMainMenu004() {
	// String declare = getDeclareProc(FULL_PROC_4);
	// createOperations().gotoDeclarationByMainMenu(CALL_PROC_4, FULL_PROC_4,
	// declare);
	// }
	//
	// /**
	// * Navigate to a Tcl element (variable in global namespace) declaration
	// * (DLTK-732).
	// *
	// */
	// public void testGotoDeclarationByMainMenu005() {
	// String declare = getDeclareVar(VAR_GLOBAL);
	// String call = getCallVar(VAR_GLOBAL);
	// createOperations().gotoDeclarationByMainMenu(call, VAR_GLOBAL, declare);
	// }
	//
	// /**
	// * Navigate to a Tcl element (variable in current namespace) declaration
	// * (DLTK-734).
	// *
	// */
	// public void testGotoDeclarationByMainMenu006() {
	// String declare = getDeclareVar(VAR_NAMESPACE);
	// String call = getCallVar(VAR_NAMESPACE);
	// createOperations().gotoDeclarationByMainMenu(call, VAR_NAMESPACE,
	// declare);
	// }
	//
	// /**
	// * Navigate to a Tcl element (local variable in procedure) declaration
	// using
	// * F3 key button (DLTK-736).
	// *
	// */
	// public void testGotoDeclarationByMainMenu007() {
	// String declare = getDeclareVar(VAR_LOCAL);
	// String call = getCallVar(VAR_LOCAL);
	// createOperations().gotoDeclarationByMainMenu(call, VAR_LOCAL, declare);
	// }
	//
	// /**
	// * [Test] Navigate to a Tcl element (variable - parameter of procedure)
	// * declaration (DLTK-738). <br>
	// * <br>
	// * proc proc1 { param1 param2 } {<br>
	// * puts $param1<br>
	// * }<br>
	// *
	// */
	// /*
	// * public void testGotoDeclarationByMainMenu008() { String call =
	// * getCallVar(VAR_PARAM);
	// createOperations().gotoDeclarationByMainMenu(call,
	// * VAR_PARAM, PROC_1_DECLARE); }
	// */
	//
	// /**
	// * [Test] Navigate to a Tcl element (upvar variable) declaration using F3
	// * key button (DLTK-740).
	// *
	// */
	// public void testGotoDeclarationByMainMenu009() {
	// String call = getCallVar(VAR_UP);
	// createOperations().gotoDeclarationByMainMenu(call, VAR_UP,
	// "upvar $" + VAR_UP_PARAM + " " + VAR_UP);
	// }

}
