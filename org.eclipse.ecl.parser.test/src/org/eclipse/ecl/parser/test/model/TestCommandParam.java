/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestCommandParam.java,v 1.1 2010/08/02 09:24:06 andrey Exp $
 */
package org.eclipse.ecl.parser.test.model;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Command Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.parser.test.model.TestCommandParam#getArg <em>Arg</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.parser.test.model.ParserTestModelPackage#getTestCommandParam()
 * @model
 * @generated
 */
public interface TestCommandParam extends Command {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' reference.
	 * @see #setArg(Command)
	 * @see org.eclipse.ecl.parser.test.model.ParserTestModelPackage#getTestCommandParam_Arg()
	 * @model
	 * @generated
	 */
	Command getArg();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.parser.test.model.TestCommandParam#getArg <em>Arg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' reference.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(Command value);

} // TestCommandParam
