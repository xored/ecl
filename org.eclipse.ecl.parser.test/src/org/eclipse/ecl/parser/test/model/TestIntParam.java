/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestIntParam.java,v 1.1 2010/08/02 09:24:06 andrey Exp $
 */
package org.eclipse.ecl.parser.test.model;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Int Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.parser.test.model.TestIntParam#getArg <em>Arg</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.parser.test.model.ParserTestModelPackage#getTestIntParam()
 * @model
 * @generated
 */
public interface TestIntParam extends Command {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(int)
	 * @see org.eclipse.ecl.parser.test.model.ParserTestModelPackage#getTestIntParam_Arg()
	 * @model
	 * @generated
	 */
	int getArg();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.parser.test.model.TestIntParam#getArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' attribute.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(int value);

} // TestIntParam
