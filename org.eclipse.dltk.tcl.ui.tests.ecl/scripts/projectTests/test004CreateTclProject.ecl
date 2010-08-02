/**
 * Create a Tcl project with default undefined interpreter. (DLTK-506)
 * 
 */

OpenPerspective Tcl
GetMenu "File/New/Tcl Project" | Click
WaitShellIsActive "Create Tcl project"
GetEditbox "Project name:" | SetText TclProject004
GetButton "Finish" | Click
WaitShellCloses "Create Tcl project"
IsProjectExist TclProject004 | AssertTrue
AssertNoInterpreters TclProject004
DeleteProject TclProject004