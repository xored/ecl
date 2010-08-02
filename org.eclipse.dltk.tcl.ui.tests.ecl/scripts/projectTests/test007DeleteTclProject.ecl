/**
 * Open a Tcl project. (DLTK-507)
 * 
 */

OpenPerspective Tcl
CreateProject TclProject007
IsProjectExist TclProject007 | AssertTrue
GetView "Script Explorer" | GetTree | GetTreeItem TclProject007 | Select
GetMenu "Edit/Delete" | Click
WaitShellIsActive "Delete Resources"
GetButton OK | Click
WaitShellCloses "Delete Resources"