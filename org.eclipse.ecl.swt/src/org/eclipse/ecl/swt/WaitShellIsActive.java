/**
 * <copyright>
 * </copyright>
 *
 * $Id: WaitShellIsActive.java,v 1.1 2010/08/02 09:24:16 andrey Exp $
 */
package org.eclipse.ecl.swt;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wait Shell Is Active</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.swt.WaitShellIsActive#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.ecl.swt.WaitShellIsActive#getTimeout <em>Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.swt.SwtPackage#getWaitShellIsActive()
 * @model
 * @generated
 */
public interface WaitShellIsActive extends Command {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.eclipse.ecl.swt.SwtPackage#getWaitShellIsActive_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.swt.WaitShellIsActive#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

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
	 * @see org.eclipse.ecl.swt.SwtPackage#getWaitShellIsActive_Timeout()
	 * @model default="5000"
	 * @generated
	 */
	long getTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.swt.WaitShellIsActive#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(long value);

} // WaitShellIsActive
