package org.eclipse.ecl.swt.demo;

import static org.eclipse.ecl.swt.dltk.tests.TestUtils.execute;
import junit.framework.TestCase;

public class DemoTclProject extends TestCase {

	public void testCreateTclProject001() throws Exception {
		execute("GetMenu File/New/Project...");
		execute("GetMenu File/New/Project... | Click");
		execute("WaitShellIsActive \"New Project\"");
		execute("GetTree | GetItem \"Tcl/Tcl Project\" | Select");
		execute("GetButton \"Next >\" | Click");
		execute("WaitShellIsActive \"Create Tcl project\"");
		execute("GetEditbox \"Project name:\"");
		execute("GetEditbox \"Project name:\" | SetText DemoProject");
		execute("GetButton Finish | Click");
		execute("WaitShellIsActive \"Open Associated Perspective?\"");
		execute("GetButton \"Yes\" | Click");
		execute("FindControls Shell \"Open Associated Perspective?\" | WaitShellCloses");
		execute("GetMenu Window/Preferences | Click");
		execute("WaitShellIsActive Preferences");
		execute("GetTree | GetItem Tcl/Interpreters | Select");

		execute("GetButton Add... | Click");
		execute("WaitShellIsActive \"Add interpreter\"");
		execute("GetEditbox \"Interpreter name:\" | SetText tclsh");
		execute("GetEditbox \"Interpreter executable:\" | SetText /usr/bin/tclsh");
		execute("GetButton OK | WaitEnabled");
		execute("GetButton OK | Click");
		execute("FindControls Shell \"Add interpreter\" | WaitShellCloses");

		execute("GetButton OK | Click");
		execute("FindControls Shell Preferences | WaitShellCloses");

		execute("GetView \"Script Explorer\" | GetTree | GetItem DemoProject | ContextMenu \"New/Source Folder\" | Click");
		execute("WaitShellIsActive \"New Source Folder\"");
		execute("GetEditbox \"Folder name:\" | SetText src");
		execute("GetButton Finish | Click");
		execute("FindControls Shell \"New Source Folder\" | WaitShellCloses");

		execute("GetView \"Script Explorer\" | GetTree | GetItem DemoProject/src | ContextMenu \"New/Tcl File\" | Click");
		execute("WaitShellIsActive \"Create Tcl File\"");

		execute("GetEditbox \"File: \" | SetText first");
		execute("GetButton Finish | Click");
		execute("FindControls Shell \"Create Tcl File\" | WaitShellCloses");

		execute("GetEditor first.tcl | TypeText \"puts {hello, ECL!}\"");
		execute("GetEditor first.tcl | ContextMenu Save | Click");
		execute("GetEditor first.tcl | ContextMenu \"Run As/1 Tcl Script\" | Click");
		Thread.sleep(300);
		execute("GetView \"Script Explorer\" | GetTree | GetItem DemoProject | ContextMenu Delete | Click");
		execute("WaitShellIsActive \"Delete Resources\"");
		execute("GetCheckbox \"Delete project contents on disk (cannot be undone)\" | Select");
		execute("GetButton OK | Click");
		execute("FindControls Shell \"Delete Resources\" | WaitShellCloses 3000");
	}
}
