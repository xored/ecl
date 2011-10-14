/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.platform.commands;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.platform.commands.SortBy#getField <em>Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.platform.commands.CommandsPackage#getSortBy()
 * @model
 * @generated
 */
public interface SortBy extends Command {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' attribute.
	 * @see #setField(String)
	 * @see org.eclipse.ecl.platform.commands.CommandsPackage#getSortBy_Field()
	 * @model
	 * @generated
	 */
	String getField();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.platform.commands.SortBy#getField <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' attribute.
	 * @see #getField()
	 * @generated
	 */
	void setField(String value);

} // SortBy
