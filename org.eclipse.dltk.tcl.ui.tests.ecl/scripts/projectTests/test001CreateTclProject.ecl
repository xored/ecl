/*
 * Create a Tcl project in workspace using main menu and switch to Tcl
 * perspective. (DLTK-502)<br>
 * <br>
 * Predefined conditions:<br>
 * 1. Current perspective - not Tcl<br>
 * <br>
 * Actions:<br>
 * 1. Open "New Project" wizard using Project File->New->Project...<br>
 * 2. Select "Tcl/Tcl Project" and press "Next" button<br>
 * 3. Enter project name and press "Finish" button<br>
 * Expect "Open Associated Perspective?" dialog<br>
 * 4. Press "OK"<br>
 * <br>
 * Expect:<br>
 * 1. Created Tcl project<br>
 * 2. Tcl perspective opened<br>
 */
OpenPerspective Java
GetMenu "File/New/Project..." | Click
WaitShellIsActive "New Project"
GetTree | GetTreeItem "Tcl/Tcl Project" | Select
GetButton "Next >" | Click
WaitShellIsActive "Create Tcl project"
GetEditbox "Project name:" | SetText TclProject001
GetButton "Finish" | Click
WaitShellIsActive "Open Associated Perspective?"
GetButton "Yes" | Click
WaitShellCloses "Open Associated Perspective?"
IsProjectExist TclProject001 | AssertTrue
AssertPerspective Tcl
DeleteProject TclProject001