/*
 * Create a folder (DLTK-517)<br>
 * <br>
 * 1. Open New Folder dialog (File->New->Folder)<br>
 * 2. Enter folder path with use path separator<br>
 * 3. Finish<br>
 * 
 */
OpenPerspective Tcl
CreateProject TclProject103 [GetPluginPath org.eclipse.dltk.tcl.ui.tests.ecl | Concat "workspace/ProjectContent"]
WaitForJob AUTO_BUILD
GetMenu "File/New/Folder" | Click
WaitShellIsActive "New Folder"
FindControls Tree | GetItem TclProject103 | Select
GetEditbox "Folder name:" | SetText Folder1/abc
GetButton Finish | Click
WaitShellCloses "New Folder"
GetView "Script Explorer" | FindControls Tree | GetItem "TclProject103/Folder1/abc" | Length | AssertEquals 1
DeleteProject TclProject103