/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.platform.ui.commands;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Save Screenshot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.platform.ui.commands.SaveScreenshot#getOut <em>Out</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.platform.ui.commands.CommandsPackage#getSaveScreenshot()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Saves the screenshot.' returns='Nothing' example='get-eclipse-window | get-object | save-screenshot [substitute-variables \"${workspace_loc}/images/actual.png\"]'"
 * @generated
 */
public interface SaveScreenshot extends Command {
	/**
	 * Returns the value of the '<em><b>Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' attribute.
	 * @see #setOut(String)
	 * @see org.eclipse.ecl.platform.ui.commands.CommandsPackage#getSaveScreenshot_Out()
	 * @model
	 * @generated
	 */
	String getOut();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.platform.ui.commands.SaveScreenshot#getOut <em>Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out</em>' attribute.
	 * @see #getOut()
	 * @generated
	 */
	void setOut(String value);

} // SaveScreenshot
