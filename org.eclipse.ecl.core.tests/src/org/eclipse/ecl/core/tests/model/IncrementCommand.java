/**
 * <copyright>
 * </copyright>
 *
 * $Id: IncrementCommand.java,v 1.1 2010/08/02 09:24:08 andrey Exp $
 */
package org.eclipse.ecl.core.tests.model;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Increment Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.core.tests.model.IncrementCommand#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.core.tests.model.ModelPackage#getIncrementCommand()
 * @model
 * @generated
 */
public interface IncrementCommand extends Command {

	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see #setVal(Integer)
	 * @see org.eclipse.ecl.core.tests.model.ModelPackage#getIncrementCommand_Val()
	 * @model
	 * @generated
	 */
	Integer getVal();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.tests.model.IncrementCommand#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(Integer value);
} // IncrementCommand
