/*
 * Create a folder (DLTK-517)<br>
 * <br>
 * 1. Open New Folder dialog (File->New->Folder)<br>
 * 2. Select parent folder in tree in dialog<br>
 * 3. Enter folder name<br>
 * 4. Finish<br>
 */
OpenPerspective Tcl
CreateProject TclProject102 [GetPluginPath org.eclipse.dltk.tcl.ui.tests.ecl | Concat "workspace/ProjectContent"]
WaitForJob AUTO_BUILD
GetMenu "File/New/Folder" | Click
WaitShellIsActive "New Folder"
FindControls Tree | GetItem TclProject102/Folder1 | Select
GetEditbox "Folder name:" | SetText abc
GetButton Finish | Click
WaitShellCloses "New Folder"
GetView "Script Explorer" | FindControls Tree | GetItem "TclProject102/Folder1/abc" | Length | AssertEquals 1
DeleteProject TclProject102