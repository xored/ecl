package org.eclipse.ecl.swt.dltk.tests;

import static org.eclipse.ecl.swt.dltk.tests.TestUtils.execute;
import junit.framework.ComparisonFailure;
import junit.framework.TestCase;

public class AbstractDltkTest extends TestCase {

	public void openJavaPerspective() throws Exception {
		execute("FindMenu \"Window/Open Perspective/Other...\" | Click");
		execute("WaitShellIsActive \"Open Perspective\"");
		execute("FindControl Table | Select \"Java (default)\"");
		execute("FindControl Button OK | Click");
		execute("WaitShellCloses \"Open Perspective\"");
	}

	public void openTclPerspective() throws Exception {
		execute("FindMenu \"Window/Open Perspective/Other...\" | Click");
		execute("WaitShellIsActive \"Open Perspective\"");
		execute("FindControl Table | Select \"Tcl\"");
		execute("FindControl Button OK | Click");
		execute("WaitShellCloses \"Open Perspective\"");
	}

	public void createProject(String name) throws Exception {
		execute("FindMenu \"File/New/Project...\" | Click");
		execute("WaitShellIsActive \"New Project\"");
		execute("FindControl Tree | GetTreeItem \"Tcl/Tcl Project\" | Select");
		execute("FindControl Button \"Next >\" | Click");
		execute("WaitShellIsActive \"Create Tcl project\"");
		execute("FindControl -label \"Project name:\" | SetText \"" + name
				+ "\"");
		execute("FindControl Button \"Finish\" | Click");
		execute("WaitShellIsActive \"Open Associated Perspective?\"");
		execute("FindControl Button \"Yes\" | Click");
		execute("WaitShellCloses \"Open Associated Perspective?\"");
	}

	public void deleteProject(String name, boolean deleteContent)
			throws Exception {
		execute("FindControl Tree -parent [FindView \"Script Explorer\"] | GetTreeItem \""
				+ name + "\" | Select");
		execute("FindMenu \"Edit/Delete\" | Click");
		execute("WaitShellIsActive \"Delete Resources\"");
		if (deleteContent) {
			execute("FindControl CheckBox \"Delete project contents on disk (cannot be undone)\" | Select");
		}
		execute("FindControl Button OK | Click");
		execute("WaitShellCloses \"Delete Resources\"");
	}

	public void deleteProjectByContextMenu(String name, boolean deleteContent)
			throws Exception {
		execute("FindControl Tree -parent [FindView \"Script Explorer\"] | GetTreeItem \""
				+ name + "\" | ContextMenu Delete | Click");
		execute("WaitShellIsActive \"Delete Resources\"");
		if (deleteContent) {
			execute("FindControl CheckBox \"Delete project contents on disk (cannot be undone)\" | Select");
		}
		execute("FindControl Button OK | Click");
		execute("WaitShellCloses \"Delete Resources\"");
	}

	public void initDefInterpreter() throws Exception {
		execute("FindMenu \"Window/Preferences\" | Click");
		execute("WaitShellIsActive Preferences");
		execute("FindControl Tree | GetTreeItem \"Tcl/Interpreters\" | Select");
		execute("FindControl Button Add... | Click");
		execute("WaitShellIsActive \"Add interpreter\"");
		execute("FindControl Text -label \"Interpreter name:\" | SetText tclsh");
		execute("FindControl Text -label \"Interpreter executable:\" | SetText \"/usr/bin/tclsh\"");
		execute("FindControl Button OK | Click");
		execute("WaitShellCloses \"Add interpreter\"");
		execute("FindControl Button OK | Click");
		execute("WaitShellCloses Preferences");
	}

	public void initDefAndAltInterpreters() throws Exception {
		execute("FindMenu \"Window/Preferences\" | Click");
		execute("WaitShellIsActive Preferences");
		execute("FindControl Tree | GetTreeItem \"Tcl/Interpreters\" | Select");

		execute("FindControl Button Add... | Click");
		execute("WaitShellIsActive \"Add interpreter\"");
		execute("FindControl Text -label \"Interpreter name:\" | SetText tclsh");
		execute("FindControl Text -label \"Interpreter executable:\" | SetText \"/usr/bin/tclsh\"");
		execute("FindControl Button OK | Click");
		execute("WaitShellCloses \"Add interpreter\"");

		execute("FindControl Button Add... | Click");
		execute("WaitShellIsActive \"Add interpreter\"");
		execute("FindControl Text -label \"Interpreter name:\" | SetText tclsh8.5");
		execute("FindControl Text -label \"Interpreter executable:\" | SetText \"/usr/bin/tclsh8.5\"");
		execute("FindControl Button OK | Click");
		execute("WaitShellCloses \"Add interpreter\"");

		execute("FindControl Button OK | Click");
		execute("WaitShellCloses Preferences");
	}

	public void clearInterpreters() throws Exception {
		execute("FindMenu \"Window/Preferences\" | Click");
		execute("WaitShellIsActive Preferences");
		execute("FindControl Tree | GetTreeItem \"Tcl/Interpreters\" | Select");
		try {
			while (true) {
				execute("FindControl Table | Select 0");
				execute("FindControl Button Remove | Click");
			}
		} catch (ComparisonFailure e) {
		}
		execute("FindControl Button OK | Click");
		execute("WaitShellCloses Preferences");
	}

	public void selectProjectItem(String path) throws Exception {
		execute("FindControl Tree -parent [FindView \"Script Explorer\"] | GetTreeItem \""
				+ path + "\" | Select");
	}

	public void selectTreeItem(String path) throws Exception {
		execute("FindControl Tree | GetTreeItem \"" + path + "\" | Select");
	}

	public void assertProjectItemExist(String path) throws Exception {
		execute("FindControl Tree -parent [FindView \"Script Explorer\"] | GetTreeItem \""
				+ path + "\" | Length | AssertEquals 1");
	}

	public void assertProjectItemNotExist(String path) throws Exception {
		execute("FindControl Tree -parent [FindView \"Script Explorer\"] | GetTreeItem \""
				+ path + "\" | Length | AssertEquals 0");
	}

	public static void createFolder(String path, String folderName)
			throws Exception {
		execute("FindMenu \"File/New/Folder\" | Click");
		execute("WaitShellIsActive \"New Folder\"");
		execute("FindControl Tree | GetTreeItem \"" + path + "\" | Select");
		execute("FindControl Text -label \"Folder name:\" | SetText "
				+ folderName);
		execute("FindControl Button Finish | Click");
		execute("WaitShellCloses \"New Folder\"");
	}

	public static void createFile(String path, String fileName)
			throws Exception {
		execute("FindMenu \"File/New/File\" | Click");
		execute("WaitShellIsActive \"New File\"");
		execute("FindControl Tree | GetTreeItem \"" + path + "\" | Select");
		execute("FindControl Text -label \"File name:\" | SetText " + fileName);
		execute("FindControl Button Finish | Click");
		execute("WaitShellCloses \"New File\"");
	}

	public static void createSourceFolder(String projectName, String folderName)
			throws Exception {
		execute("FindMenu \"File/New/Source Folder\" | Click");
		execute("WaitShellIsActive \"New Source Folder\"");
		execute("FindControl Text -label \"Project name:\" | SetText "
				+ projectName);
		execute("FindControl Text -label \"Folder name:\" | SetText "
				+ folderName);
		execute("FindControl Button Finish | Click");
		execute("WaitShellCloses \"New Source Folder\"");
	}

	public static void createTclPackage(String sourceFolder, String name)
			throws Exception {
		execute("FindMenu \"File/New/Tcl Package\" | Click");
		execute("WaitShellIsActive \"New Script Package\"");
		execute("FindControl Text -label \"Source folder:\" | SetText "
				+ sourceFolder);
		execute("FindControl Text -label \"Name:\" | SetText " + name);
		execute("FindControl Button Finish | Click");
		execute("WaitShellCloses \"New Script Package\"");
	}

	public static void createTclFile(String sourceFolder, String file)
			throws Exception {
		execute("FindMenu \"File/New/Tcl File\" | Click");
		execute("WaitShellIsActive \"New Tcl File\"");
		execute("FindControl Text -label \"Source folder:\" | SetText "
				+ sourceFolder);
		execute("FindControl Text -label \"File:\" | SetText " + file);
		execute("FindControl Button Finish | Click");
		execute("WaitShellCloses \"New Tcl File\"");
	}
}
