/**
 * <copyright>
 * </copyright>
 *
 * $Id: AssertNotEquals.java,v 1.1 2010/08/02 09:24:20 andrey Exp $
 */
package org.eclipse.ecl.stdlib;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert Not Equals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.stdlib.AssertNotEquals#getExpected <em>Expected</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.stdlib.StandartLibraryPackage#getAssertNotEquals()
 * @model
 * @generated
 */
public interface AssertNotEquals extends Command {
	/**
	 * Returns the value of the '<em><b>Expected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected</em>' attribute.
	 * @see #setExpected(String)
	 * @see org.eclipse.ecl.stdlib.StandartLibraryPackage#getAssertNotEquals_Expected()
	 * @model
	 * @generated
	 */
	String getExpected();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.stdlib.AssertNotEquals#getExpected <em>Expected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected</em>' attribute.
	 * @see #getExpected()
	 * @generated
	 */
	void setExpected(String value);

} // AssertNotEquals
