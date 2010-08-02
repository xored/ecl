/**
 * <copyright>
 * </copyright>
 *
 * $Id: Concat.java,v 1.1 2010/08/02 09:24:20 andrey Exp $
 */
package org.eclipse.ecl.stdlib;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.stdlib.Concat#getString <em>String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.stdlib.StandartLibraryPackage#getConcat()
 * @model
 * @generated
 */
public interface Concat extends Command {
	/**
	 * Returns the value of the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' attribute.
	 * @see #setString(String)
	 * @see org.eclipse.ecl.stdlib.StandartLibraryPackage#getConcat_String()
	 * @model required="true"
	 * @generated
	 */
	String getString();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.stdlib.Concat#getString <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' attribute.
	 * @see #getString()
	 * @generated
	 */
	void setString(String value);

} // Concat
