/**
 * Open a Tcl project. (DLTK-507)
 * 
 */

OpenPerspective Tcl
CreateProject TclProject008
IsProjectExist TclProject008 | AssertTrue
GetView "Script Explorer" | GetTree | GetTreeItem TclProject008 | ContextMenu "Delete" | Click
WaitShellIsActive "Delete Resources"
GetButton OK | Click
WaitShellCloses "Delete Resources"