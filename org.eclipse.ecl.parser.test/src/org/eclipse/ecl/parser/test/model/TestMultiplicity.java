/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestMultiplicity.java,v 1.2 2010/10/05 05:07:09 alena Exp $
 */
package org.eclipse.ecl.parser.test.model;

import org.eclipse.ecl.core.Command;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.parser.test.model.TestMultiplicity#getA1 <em>A1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.parser.test.model.ParserTestModelPackage#getTestMultiplicity()
 * @model
 * @generated
 */
public interface TestMultiplicity extends Command {
	/**
	 * Returns the value of the '<em><b>A1</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A1</em>' attribute list.
	 * @see org.eclipse.ecl.parser.test.model.ParserTestModelPackage#getTestMultiplicity_A1()
	 * @model
	 * @generated
	 */
	EList<String> getA1();

} // TestMultiplicity
