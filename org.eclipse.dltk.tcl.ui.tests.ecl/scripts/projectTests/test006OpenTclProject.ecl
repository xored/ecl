/**
 * Open a Tcl project. (DLTK-507)
 * 
 */

OpenPerspective Tcl
CreateProject TclProject006
CloseProject TclProject006
IsProjectExist TclProject006 | AssertTrue
GetView "Script Explorer" | GetTree | GetTreeItem TclProject006 | ContextMenu "Open Project" | Click
IsProjectOpen TclProject006 | AssertTrue
DeleteProject TclProject006