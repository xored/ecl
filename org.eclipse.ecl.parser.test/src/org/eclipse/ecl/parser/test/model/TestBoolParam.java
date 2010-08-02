/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestBoolParam.java,v 1.1 2010/08/02 09:24:06 andrey Exp $
 */
package org.eclipse.ecl.parser.test.model;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Bool Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.parser.test.model.TestBoolParam#isArg <em>Arg</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.parser.test.model.ParserTestModelPackage#getTestBoolParam()
 * @model
 * @generated
 */
public interface TestBoolParam extends Command {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(boolean)
	 * @see org.eclipse.ecl.parser.test.model.ParserTestModelPackage#getTestBoolParam_Arg()
	 * @model
	 * @generated
	 */
	boolean isArg();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.parser.test.model.TestBoolParam#isArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' attribute.
	 * @see #isArg()
	 * @generated
	 */
	void setArg(boolean value);

} // TestBoolParam
