/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeleteProject.java,v 1.1 2010/08/02 09:24:09 andrey Exp $
 */
package org.eclipse.dltk.tcl.ui.tests.ecl.dltktest;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DeleteProject#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DLTKTestPackage#getDeleteProject()
 * @model
 * @generated
 */
public interface DeleteProject extends Command {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DLTKTestPackage#getDeleteProject_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DeleteProject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DeleteProject
