/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.operations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.ecl.operations.OperationsPackage#getInt()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Converts its argument to int.' returns='Returns integer value or fails if value cannot be converted. <code>true</code> is converted to <code>1</code> and <code>false</code> is converted to <code>0</code>.' example='//verifies that the number of Stops it less then 3\nget-view \"Execution View\" | get-label -after [get-label \"Stops:\"] | get-text | int | lt 3 | verify-true'"
 * @generated
 */
public interface Int extends Convert {
} // Int
