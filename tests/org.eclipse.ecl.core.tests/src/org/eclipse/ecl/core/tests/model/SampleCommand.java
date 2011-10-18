/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.core.tests.model;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sample Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.core.tests.model.SampleCommand#getHello <em>Hello</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.core.tests.model.ModelPackage#getSampleCommand()
 * @model
 * @generated
 */
public interface SampleCommand extends Command {
	/**
	 * Returns the value of the '<em><b>Hello</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hello</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hello</em>' attribute.
	 * @see #setHello(String)
	 * @see org.eclipse.ecl.core.tests.model.ModelPackage#getSampleCommand_Hello()
	 * @model
	 * @generated
	 */
	String getHello();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.tests.model.SampleCommand#getHello <em>Hello</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hello</em>' attribute.
	 * @see #getHello()
	 * @generated
	 */
	void setHello(String value);

} // SampleCommand
