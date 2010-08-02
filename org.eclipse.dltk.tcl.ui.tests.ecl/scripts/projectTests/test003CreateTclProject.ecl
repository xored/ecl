/**
 * Create a Tcl project using a project specific interpreter. (DLTK-505)<br>
 *<br>
 * Predefined conditions:<br>
 * 1. System contain two interpreters<br>
 * 2. Tcl perspective is opened<br>
 * <br>
 * Actions:<br>
 * 1. Open "Create Tcl project" dialog<br>
 * 2. Select "Use a project specific interpreter" radio and select
 * alternative interpreter in combo<br>
 * 3. Enter project name and press "Finish" button<br>
 * 4. Press "OK"<br>
 * <br>
 * Expect:<br>
 * 1. Created Tcl project<br>
 * 2. Project have alternative Interpreter Library<br>
 * 
 */

OpenPerspective Tcl
AddInterpreter Tcl tclsh8.5 /usr/bin/tclsh8.5
AddInterpreter Tcl tclsh /usr/bin/tclsh
GetMenu "File/New/Tcl Project" | Click
WaitShellIsActive "Create Tcl project"
GetEditbox "Project name:" | SetText TclProject003
FindControls Radio "Use a project specific interpreter: " | Click
FindControls Combo -index 1 | Select tclsh8.5
GetButton "Finish" | Click
WaitShellCloses "Create Tcl project"
IsProjectExist TclProject003 | AssertTrue
AssertInterpreter TclProject003 tclsh8.5
DeleteProject TclProject003
RemoveAllInterpreters Tcl