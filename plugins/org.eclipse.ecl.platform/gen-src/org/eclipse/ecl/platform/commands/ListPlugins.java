/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.platform.commands;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Plugins</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.platform.commands.ListPlugins#isIncludeDependencies <em>Include Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.platform.commands.CommandsPackage#getListPlugins()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Returns list of all plugins.' returns='Lists all available plugins. ' example='list-plugins | foreach [val item]  {\n\n\tif [$item | get name | matches \"Q7 ECL.*\"]{\n    \t\t$item | get name | log\n\t}\n}'"
 * @generated
 */
public interface ListPlugins extends Command {
	/**
	 * Returns the value of the '<em><b>Include Dependencies</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Dependencies</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Dependencies</em>' attribute.
	 * @see #setIncludeDependencies(boolean)
	 * @see org.eclipse.ecl.platform.commands.CommandsPackage#getListPlugins_IncludeDependencies()
	 * @model default="false"
	 *        annotation="http://www.eclipse.org/ecl/docs description='When true, returned plugins includes information about imported packages and bundle dependencies.'"
	 * @generated
	 */
	boolean isIncludeDependencies();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.platform.commands.ListPlugins#isIncludeDependencies <em>Include Dependencies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Dependencies</em>' attribute.
	 * @see #isIncludeDependencies()
	 * @generated
	 */
	void setIncludeDependencies(boolean value);

} // ListPlugins
