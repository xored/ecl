/**
 * <copyright>
 * </copyright>
 *
 * $Id: WaitTableHasRows.java,v 1.1 2010/08/02 09:24:16 andrey Exp $
 */
package org.eclipse.ecl.swt;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wait Table Has Rows</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.swt.WaitTableHasRows#getRows <em>Rows</em>}</li>
 *   <li>{@link org.eclipse.ecl.swt.WaitTableHasRows#getTimeout <em>Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.swt.SwtPackage#getWaitTableHasRows()
 * @model
 * @generated
 */
public interface WaitTableHasRows extends Command {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' attribute.
	 * @see #setRows(int)
	 * @see org.eclipse.ecl.swt.SwtPackage#getWaitTableHasRows_Rows()
	 * @model required="true"
	 * @generated
	 */
	int getRows();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.swt.WaitTableHasRows#getRows <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows</em>' attribute.
	 * @see #getRows()
	 * @generated
	 */
	void setRows(int value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * The default value is <code>"5000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(long)
	 * @see org.eclipse.ecl.swt.SwtPackage#getWaitTableHasRows_Timeout()
	 * @model default="5000"
	 * @generated
	 */
	long getTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.swt.WaitTableHasRows#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(long value);

} // WaitTableHasRows
