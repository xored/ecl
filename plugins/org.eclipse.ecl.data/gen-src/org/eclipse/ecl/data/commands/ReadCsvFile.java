/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.data.commands;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Csv File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.data.commands.ReadCsvFile#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.data.commands.CommandsPackage#getReadCsvFile()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Parses given csv file. Fails if file is not found or format is invalid.\nLearn more about <a href = \"http://xored.freshdesk.com/solution/articles/78219-assert-the-whole-table\">Asserting the whole table contents.</a>' returns='<code>Table</code> EMF Object. ' example='with [get-window Preferences] {\n\tget-tree | select \"Java/Installed JREs\"\n\tget-table | get-table-data | eq [read-csv-file \"workspace:/assertData/table.csv\"] | \n\t\tassert-true \"Data in table does not match input file\" \n\tget-button OK | click\n}\n\n//Let\'s say we need to write ErrorLog info to csv file \'table.csv\'.\n//ECL script should look like this:\n \nget-view \"Error Log\" | get-tree | expand-all\nget-view \"Error Log\" | get-tree | get-table-data | write-csv-file \"workspace:/MyProject/AssertData/table.csv\n \n//Note: \n//<a href=\"#expand-all\">Expand-all</a>command may be useful in case of hierarchical tree - otherwise non-expanded levels won\'t be written.  \n//You should have MyProject/AssertData on your workspace (you may do it easily with a workspace context) to let you csv file to be created there. \n \n//In case you want to specify which columns/rows should be written you may use \n//<a href=\"#select-columns\">select-columns</a>/<a href=\"#exclude-columns\">exclude-columns</a> and <a href=\"#select-rows\">select-rows</a>/<a href=\"#exclude-rows\">exclude-rows</a> commands:\n \nget-view \"Error Log\" | get-tree | get-table-data | select-columns \"Message\" | write-csv-file \"workspace:/MyProject/AssertData/table.csv\" \nget-view \"Error Log\" | get-tree | get-table-data | exclude-columns \"Message\" \"Plug-in\" | write-csv-file \"workspace:/MyProject/AssertData/table.csv\"\nget-view \"Error Log\" | get-tree | get-table-data | select-rows -column \"Message\"  -value \"Execution of early startup handlers completed.\" | write-csv-file \"workspace:/MyProject/AssertData/table.csv\"\n \n//To compare table data to already written csv file you may use <a href=\"#read-csv-file\">read-csv-file</a> command:\n \nget-view \"Error Log\" | get-tree | get-table-data | select-columns \"Plug-in\" | eq [read-csv-file \"workspace:/MyProject/AssertData/table.csv\"] | assert-true \"Data in table does not match input file\" '"
 * @generated
 */
public interface ReadCsvFile extends Command {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.eclipse.ecl.data.commands.CommandsPackage#getReadCsvFile_Uri()
	 * @model annotation="http://www.eclipse.org/ecl/docs description='URI to a file to read. Currently supported schemes are workspace:/ for files in workspace and file:/ for files on local file system'"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.data.commands.ReadCsvFile#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // ReadCsvFile
