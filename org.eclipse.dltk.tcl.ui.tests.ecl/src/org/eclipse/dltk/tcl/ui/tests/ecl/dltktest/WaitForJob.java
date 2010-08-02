/**
 * <copyright>
 * </copyright>
 *
 * $Id: WaitForJob.java,v 1.1 2010/08/02 09:24:09 andrey Exp $
 */
package org.eclipse.dltk.tcl.ui.tests.ecl.dltktest;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wait For Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.WaitForJob#getFamily <em>Family</em>}</li>
 *   <li>{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.WaitForJob#getTimeout <em>Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DLTKTestPackage#getWaitForJob()
 * @model
 * @generated
 */
public interface WaitForJob extends Command {
	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see #setFamily(String)
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DLTKTestPackage#getWaitForJob_Family()
	 * @model required="true"
	 * @generated
	 */
	String getFamily();

	/**
	 * Sets the value of the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.WaitForJob#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(String value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(int)
	 * @see org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DLTKTestPackage#getWaitForJob_Timeout()
	 * @model default="-1"
	 * @generated
	 */
	int getTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.WaitForJob#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(int value);

} // WaitForJob
