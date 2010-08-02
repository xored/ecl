package org.eclipse.ecl.swt.dltk.tests;

import static org.eclipse.ecl.swt.dltk.tests.TestUtils.execute;

public class ProjectTests extends AbstractDltkTest {
	// public void testCreateTclProject000() throws Exception {
	// execute("FindMenu \"Window/Open Perspective/Other...\" | Click\n"
	// + "WaitShellIsActive \"Open Perspective\"\n"
	// + "FindControl Table | Select \"Java (default)\"\n"
	// + "FindControl Button OK | Click\n"
	// + "FindMenu \"File/New/Project...\" | Click\n"
	// + "WaitShellIsActive \"New Project\"\n"
	// + "FindControl Tree | GetTreeItem \"Tcl/Tcl Project\" | Select\n"
	// + "FindControl Button \"Next >\" | Click\n"
	// + "WaitShellIsActive \"Create Tcl project\"\n"
	// + "FindControl -label \"Project name:\" | SetText TclProject001\n"
	// + "FindControl Button \"Finish\" | Click\n"
	// + "WaitShellIsActive \"Open Associated Perspective?\"\n"
	// + "FindControl Button \"Yes\" | Click\n"
	// +
	// "FindControl Tree -parent [FindView \"Script Explorer\"] | GetTreeItem TclProject001 | ContextMenu Delete | Click\n"
	// + "WaitShellIsActive \"Delete Resources\"\n"
	// +
	// "FindControl CheckBox \"Delete project contents on disk (cannot be undone)\" | Select\n"
	// + "FindControl Button OK | Click");
	// }

	/**
	 * Create a Tcl project in workspace using main menu and switch to Tcl
	 * perspective. (DLTK-502)<br>
	 * <br>
	 * Predefined conditions:<br>
	 * 1. Current perspective - not Tcl<br>
	 * <br>
	 * Actions:<br>
	 * 1. Open "New Project" wizard using Project File->New->Project...<br>
	 * 2. Select "Tcl/Tcl Project" and press "Next" button<br>
	 * 3. Enter project name and press "Finish" button<br>
	 * Expect "Open Associated Perspective?" dialog<br>
	 * 4. Press "OK"<br>
	 * <br>
	 * Expect:<br>
	 * 1. Created Tcl project<br>
	 * 2. Tcl perspective opened<br>
	 * 
	 */
	public void testCreateTclProject001() throws Exception {
		openJavaPerspective();
		execute("FindMenu \"File/New/Project...\" | Click");
		execute("WaitShellIsActive \"New Project\"");
		execute("FindControl Tree | GetTreeItem \"Tcl/Tcl Project\" | Select");
		execute("FindControl Button \"Next >\" | Click");
		execute("WaitShellIsActive \"Create Tcl project\"");
		execute("FindControl -label \"Project name:\" | SetText TclProject001");
		execute("FindControl Button \"Finish\" | Click");
		execute("WaitShellIsActive \"Open Associated Perspective?\"");
		execute("FindControl Button \"Yes\" | Click");
		// TODO assert tcl perspective opened
		assertProjectItemExist("TclProject001");
		deleteProject("TclProject001", true);
	}

	/**
	 * Create a Tcl project in workspace with default interpreter with use
	 * context menu of Script Explorer view. (DLTK-746)<br>
	 *<br>
	 * Predefined conditions:<br>
	 * 1. System contain Default Tcl interpreter<br>
	 * 2. Tcl perspective is opened<br>
	 * <br>
	 * Actions:<br>
	 * 1. Open "Create Tcl project" dialog using context menu New->Tcl Project
	 * in ScriptExplorer<br>
	 * 2. Enter project name and press "Finish" button<br>
	 * 3. Press "OK"<br>
	 * <br>
	 * Expect:<br>
	 * 1. Created Tcl project<br>
	 * 2. Project have default Interpreter Library<br>
	 * 
	 */
	public void testCreateTclProject002() throws Exception {
		initDefInterpreter();
		openTclPerspective();
		execute("FindControl Tree -parent [FindView \"Script Explorer\"] | ContextMenu \"New/Tcl Project\" | Click");
		execute("WaitShellIsActive \"Create Tcl project\"");
		execute("FindControl Text | SetText TclProject002");
		execute("FindControl Button \"Finish\" | Click");
		// TODO assert project have default Interpreter Library
		clearInterpreters();
		assertProjectItemExist("TclProject002");
		deleteProject("TclProject002", true);

	}

	/**
	 * Create a Tcl project using a project specific interpreter. (DLTK-505)<br>
	 *<br>
	 * Predefined conditions:<br>
	 * 1. System contain two interpreters<br>
	 * 2. Tcl perspective is opened<br>
	 * <br>
	 * Actions:<br>
	 * 1. Open "Create Tcl project" dialog<br>
	 * 2. Select "Use a project specific interpreter" radio and select
	 * alternative interpreter in combo<br>
	 * 3. Enter project name and press "Finish" button<br>
	 * 4. Press "OK"<br>
	 * <br>
	 * Expect:<br>
	 * 1. Created Tcl project<br>
	 * 2. Project have alternative Interpreter Library<br>
	 * 
	 */
	public void testCreateTclProject005() throws Exception {
		openTclPerspective();
		initDefAndAltInterpreters();
		execute("FindControl Tree -parent [FindView \"Script Explorer\"] | ContextMenu \"New/Tcl Project\" | Click");
		execute("WaitShellIsActive \"Create Tcl project\"");
		execute("FindControl Radio \"Use a project specific interpreter:\" | Select");
		execute("FindControl -label \"Project name:\" | SetText TclProject005");
		execute("FindControl Button \"Finish\" | Click");
		execute("WaitShellIsActive \"Open Associated Perspective?\"");
		execute("FindControl Button \"Yes\" | Click");
		// TODO assert Project have alternative Interpreter Library
		assertProjectItemExist("TclProject005");
		deleteProject("TclProject005", true);
		clearInterpreters();
	}

	/**
	 * Create a Tcl project with default undefined interpreter. (DLTK-506)
	 * 
	 * @throws Exception
	 * 
	 */
	public void testCreateTclProject006() throws Exception {
		createProject("TclProject006");
		assertProjectItemExist("TclProject006");
		execute("FindControl Tree -parent [FindView \"Script Explorer\"]"
				+ " | FindControl Tree TclProject006 | GetTreeItem \"TclProject006/Default System Library (unbound)\"");
		deleteProject("TclProject006", true);
	}

	/**
	 * Close a Tcl project. (DLTK-507)
	 * 
	 * @throws Exception
	 * 
	 */
	public void testCloseTclProject() throws Exception {
		createProject("TclProject007");
		execute("FindControl Tree -parent [FindView \"Script Explorer\"]"
				+ " | GetTreeItem TclProject007 | ContextMenu \"Close Project\"");
		assertProjectItemNotExist("TclProject007");
	}

	// /**
	// * Open a Tcl project. (DLTK-508)
	// *
	// */
	// public void testOpenTclProject() {
	// initProject(false);
	//
	// new ProjectOperations(bot).openProject(PROJECT_NAME);
	//
	// IProject project = helper.getProject(PROJECT_NAME);
	// assertTrue(ErrorMessages.Project_errOpen, project.isOpen());
	// }
	//
	/**
	 * Delete Tcl project. (DLTK-509)
	 * 
	 * @throws Exception
	 * 
	 */
	public void testDeleteProject() throws Exception {
		createProject("TclProject008");
		assertProjectItemExist("TclProject008");
		deleteProject("TclProject008", true);
	}

	/**
	 * Delete a Tcl project without project content deletion. (DLTK-626)
	 * 
	 * @throws Exception
	 */
	public void testDeleteProjectByContextMenu001() throws Exception {
		createProject("TclProject009");
		assertProjectItemExist("TclProject009");
		deleteProject("TclProject009", true);
	}

	/**
	 * Delete a Tcl project with project content. (DLTK-627)
	 * 
	 * @throws Exception
	 */
	public void testDeleteProjectByContextMenu002() throws Exception {
		createProject("TclProject010");
		assertProjectItemExist("TclProject010");
		deleteProject("TclProject010", true);
	}
}
