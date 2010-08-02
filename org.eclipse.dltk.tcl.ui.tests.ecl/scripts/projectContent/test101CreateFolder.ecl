/*
 * Create a folder (DLTK-517).<br>
 * <br>
 * 1. Select parent folder in Script explorer<br>
 * 2. Open New Folder dialog (File->New->Folder)<br>
 * 3. Enter folder name<br>
 * 4. Finish<br>
 * 
 */
OpenPerspective Tcl
CreateProject TclProject101 [GetPluginPath org.eclipse.dltk.tcl.ui.tests.ecl | Concat "workspace/ProjectContent"]
WaitForJob AUTO_BUILD
GetView "Script Explorer" | FindControls Tree | GetItem TclProject101/Folder1 | Select
GetMenu "File/New/Folder" | Click
WaitShellIsActive "New Folder"
GetEditbox "Folder name:" | SetText abc
GetButton Finish | Click
WaitShellCloses "New Folder"
GetView "Script Explorer" | FindControls Tree | GetItem "TclProject101/Folder1/abc" | Length | AssertEquals 1
DeleteProject TclProject101