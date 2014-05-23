/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.platform.ui.commands;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Working Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.platform.ui.commands.CreateWorkingSet#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.ecl.platform.ui.commands.CreateWorkingSet#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.platform.ui.commands.CommandsPackage#getCreateWorkingSet()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Creates working set with a given name.' returns='Nothing' example='create-working-set \"MyWorkingSet\"'"
 * @generated
 */
public interface CreateWorkingSet extends Command {
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
	 * @see org.eclipse.ecl.platform.ui.commands.CommandsPackage#getCreateWorkingSet_Name()
	 * @model annotation="http://www.eclipse.org/ecl/docs description='Working set name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.platform.ui.commands.CreateWorkingSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"org.eclipse.ui.resourceWorkingSetPage"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.ecl.platform.ui.commands.CommandsPackage#getCreateWorkingSet_Type()
	 * @model default="org.eclipse.ui.resourceWorkingSetPage"
	 *        annotation="http://www.eclipse.org/ecl/docs description='Working set type id. Default value is <code>org.eclipse.ui.resourceWorkingSetPage</code>, which corresponds to Resource Working Set. The short name <code>java</code> can be used to identify type <code>org.eclipse.jdt.ui.JavaWorkingSetPage</code>'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.platform.ui.commands.CreateWorkingSet#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // CreateWorkingSet
