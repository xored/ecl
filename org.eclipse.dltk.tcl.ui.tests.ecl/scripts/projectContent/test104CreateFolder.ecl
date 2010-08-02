/*
 * Create folder by context menu (DLTK-604) <br>
 * <br>
 * Predefined conditions:<br>
 * 1. Exist Tcl project with not source folder<br>
 * <br>
 * Actions:<br>
 * 1. Select parent folder in Script explorer<br>
 * 2. Open New Folder dialog (PopupMenu->New->Folder)<br>
 * 3. Enter folder name<br>
 * 4. Finish<br>
 * <br>
 * Expected:<br>
 * 1. New folder exist in parent folder<br>
 * 
 */
OpenPerspective Tcl
CreateProject TclProject104 [GetPluginPath org.eclipse.dltk.tcl.ui.tests.ecl | Concat "workspace/ProjectContent"]
WaitForJob AUTO_BUILD
GetView "Script Explorer" | FindControls Tree | GetItem "TclProject104/Folder1" | ContextMenu New/Folder | Click
WaitShellIsActive "New Folder"
GetEditbox "Folder name:" | SetText abc
GetButton Finish | Click
WaitShellCloses "New Folder"
GetView "Script Explorer" | FindControls Tree | GetItem "TclProject104/Folder1/abc" | Length | AssertEquals 1
DeleteProject TclProject104