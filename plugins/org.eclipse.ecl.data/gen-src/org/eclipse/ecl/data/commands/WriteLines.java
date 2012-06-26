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
 * A representation of the model object '<em><b>Write Lines</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.data.commands.WriteLines#getUri <em>Uri</em>}</li>
 *   <li>{@link org.eclipse.ecl.data.commands.WriteLines#isAppend <em>Append</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.data.commands.CommandsPackage#getWriteLines()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Reads objects from input pipe and writes them into file line-by-line as strings'"
 * @generated
 */
public interface WriteLines extends Command {
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
	 * @see org.eclipse.ecl.data.commands.CommandsPackage#getWriteLines_Uri()
	 * @model annotation="http://www.eclipse.org/ecl/docs description='URI to write lines to. Currently supported schemes are workspace:/ for files in workspace and file:/ for files on local file system'"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.data.commands.WriteLines#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Append</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Append</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Append</em>' attribute.
	 * @see #setAppend(boolean)
	 * @see org.eclipse.ecl.data.commands.CommandsPackage#getWriteLines_Append()
	 * @model default="false"
	 *        annotation="http://www.eclipse.org/ecl/docs description='Whether to append given lines into file. Default value is false'"
	 * @generated
	 */
	boolean isAppend();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.data.commands.WriteLines#isAppend <em>Append</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Append</em>' attribute.
	 * @see #isAppend()
	 * @generated
	 */
	void setAppend(boolean value);

} // WriteLines
