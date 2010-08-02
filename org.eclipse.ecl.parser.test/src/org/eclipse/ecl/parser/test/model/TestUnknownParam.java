/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestUnknownParam.java,v 1.1 2010/08/02 09:24:06 andrey Exp $
 */
package org.eclipse.ecl.parser.test.model;

import org.eclipse.ecl.core.Command;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Unknown Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.parser.test.model.TestUnknownParam#getArg <em>Arg</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.parser.test.model.ParserTestModelPackage#getTestUnknownParam()
 * @model
 * @generated
 */
public interface TestUnknownParam extends Command {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' reference.
	 * @see #setArg(EObject)
	 * @see org.eclipse.ecl.parser.test.model.ParserTestModelPackage#getTestUnknownParam_Arg()
	 * @model
	 * @generated
	 */
	EObject getArg();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.parser.test.model.TestUnknownParam#getArg <em>Arg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' reference.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(EObject value);

} // TestUnknownParam
