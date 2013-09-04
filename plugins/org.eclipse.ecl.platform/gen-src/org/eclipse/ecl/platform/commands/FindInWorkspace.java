/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.platform.commands;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Find In Workspace</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.ecl.platform.commands.FindInWorkspace#getPath <em>Path
 * </em>}</li>
 * <li>{@link org.eclipse.ecl.platform.commands.FindInWorkspace#isAll <em>All
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.ecl.platform.commands.CommandsPackage#getFindInWorkspace()
 * @model annotation=
 *        "http://www.eclipse.org/ecl/docs description='Perform regex search per segment. Returns list of matched paths.' returns='list of matched paths' example='find-in-workspace \"project/dir1.\052/dir2/file.*.txt\"' recorded='false'"
 * @generated
 */
public interface FindInWorkspace extends Command {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute. The default
	 * value is <code>""</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.eclipse.ecl.platform.commands.CommandsPackage#getFindInWorkspace_Path()
	 * @model default="" required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.ecl.platform.commands.FindInWorkspace#getPath
	 * <em>Path</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>All</b></em>' attribute. The default
	 * value is <code>"false"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>All</em>' attribute.
	 * @see #setAll(boolean)
	 * @see org.eclipse.ecl.platform.commands.CommandsPackage#getFindInWorkspace_All()
	 * @model default="false"
	 * @generated
	 */
	boolean isAll();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.ecl.platform.commands.FindInWorkspace#isAll
	 * <em>All</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>All</em>' attribute.
	 * @see #isAll()
	 * @generated
	 */
	void setAll(boolean value);

} // FindInWorkspace
