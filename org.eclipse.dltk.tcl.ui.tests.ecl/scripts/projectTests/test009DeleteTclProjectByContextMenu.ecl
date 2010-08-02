/**
 * Open a Tcl project. (DLTK-507)
 * 
 */

OpenPerspective Tcl
CreateProject TclProject009
IsProjectExist TclProject009 | AssertTrue
GetView "Script Explorer" | GetTree | GetTreeItem TclProject009 | ContextMenu "Delete" | Click
WaitShellIsActive "Delete Resources"
GetCheckbox "Delete project contents on disk (cannot be undone)" | Select
GetButton OK | Click
WaitShellCloses "Delete Resources"