/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestOptionalParams.java,v 1.1 2010/08/02 09:24:06 andrey Exp $
 */
package org.eclipse.ecl.parser.test.model;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Optional Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.parser.test.model.TestOptionalParams#getA1 <em>A1</em>}</li>
 *   <li>{@link org.eclipse.ecl.parser.test.model.TestOptionalParams#getA2 <em>A2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.parser.test.model.ParserTestModelPackage#getTestOptionalParams()
 * @model
 * @generated
 */
public interface TestOptionalParams extends Command {
	/**
	 * Returns the value of the '<em><b>A1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A1</em>' attribute.
	 * @see #setA1(String)
	 * @see org.eclipse.ecl.parser.test.model.ParserTestModelPackage#getTestOptionalParams_A1()
	 * @model required="true"
	 * @generated
	 */
	String getA1();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.parser.test.model.TestOptionalParams#getA1 <em>A1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A1</em>' attribute.
	 * @see #getA1()
	 * @generated
	 */
	void setA1(String value);

	/**
	 * Returns the value of the '<em><b>A2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A2</em>' attribute.
	 * @see #setA2(String)
	 * @see org.eclipse.ecl.parser.test.model.ParserTestModelPackage#getTestOptionalParams_A2()
	 * @model
	 * @generated
	 */
	String getA2();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.parser.test.model.TestOptionalParams#getA2 <em>A2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A2</em>' attribute.
	 * @see #getA2()
	 * @generated
	 */
	void setA2(String value);

} // TestOptionalParams
