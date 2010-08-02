/**
 * Create a Tcl project in workspace with default interpreter with use
 * context menu of Script Explorer view. (DLTK-746)<br>
 *<br>
 * Predefined conditions:<br>
 * 1. System contain Default Tcl interpreter<br>
 * 2. Tcl perspective is opened<br>
 * <br>
 * Actions:<br>
 * 1. Open "Create Tcl project" dizlog using context mebu New->Tcl Project
 * in ScriptExplorer<br>
 * 2. Enter project name and press "Finish" button<br>
 * 3. Press "OK"<br>
 * <br>
 * Expect:<br>
 * 1. Created Tcl project<br>
 * 2. Project have default Interpreter Library<br>
 * 
 */

OpenPerspective Tcl
AddInterpreter Tcl tclsh /usr/bin/tclsh
GetView "Script Explorer" | GetTree | ContextMenu "New/Tcl Project" | Click
WaitShellIsActive "Create Tcl project"
GetEditbox "Project name:" | SetText TclProject002
GetButton "Finish" | Click
WaitShellCloses "Create Tcl project"
IsProjectExist TclProject002 | AssertTrue
AssertInterpreter TclProject002 tclsh
DeleteProject TclProject002
RemoveAllInterpreters Tcl