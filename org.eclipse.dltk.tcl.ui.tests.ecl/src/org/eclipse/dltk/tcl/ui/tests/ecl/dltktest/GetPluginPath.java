/**
 * <copyright>
 * </copyright>
 *
 * $Id: GetPluginPath.java,v 1.1 2010/08/02 09:24:09 andrey Exp $
 */
package org.eclipse.dltk.tcl.ui.tests.ecl.dltktest;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Plugin Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.GetPluginPath#getPlugin <em>Plugin</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DLTKTestPackage#getGetPluginPath()
 * @model
 * @generated
 */
public interface GetPluginPath extends Command {
	/**
	 * Returns the value of the '<em><b>Plugin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin</em>' attribute.
	 * @see #setPlugin(String)
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DLTKTestPackage#getGetPluginPath_Plugin()
	 * @model required="true"
	 * @generated
	 */
	String getPlugin();

	/**
	 * Sets the value of the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.GetPluginPath#getPlugin <em>Plugin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin</em>' attribute.
	 * @see #getPlugin()
	 * @generated
	 */
	void setPlugin(String value);

} // GetPluginPath
