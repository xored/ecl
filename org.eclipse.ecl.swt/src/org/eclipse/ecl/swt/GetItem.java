/**
 * <copyright>
 * </copyright>
 *
 * $Id: GetItem.java,v 1.1 2010/08/02 09:24:17 andrey Exp $
 */
package org.eclipse.ecl.swt;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.swt.GetItem#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.swt.SwtPackage#getGetItem()
 * @model
 * @generated
 */
public interface GetItem extends Command {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' attribute.
	 * @see #setItem(String)
	 * @see org.eclipse.ecl.swt.SwtPackage#getGetItem_Item()
	 * @model required="true"
	 * @generated
	 */
	String getItem();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.swt.GetItem#getItem <em>Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' attribute.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(String value);

} // GetItem
