/**
 * Close a Tcl project. (DLTK-507)
 * 
 */

OpenPerspective Tcl
GetMenu "File/New/Tcl Project" | Click
WaitShellIsActive "Create Tcl project"
GetEditbox "Project name:" | SetText TclProject005
GetButton "Finish" | Click
GetView "Script Explorer" | GetTree | GetItem TclProject005
IsProjectExist TclProject005 | AssertTrue
GetView "Script Explorer" | GetTree | GetTreeItem TclProject005 | ContextMenu "Close Project" | Click
IsProjectOpen TclProject005 | AssertFalse
DeleteProject TclProject005