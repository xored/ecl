/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestMultiplicityImpl.java,v 1.1 2010/08/02 09:24:06 andrey Exp $
 */
package org.eclipse.ecl.parser.test.model.impl;

import java.util.Collection;

import org.eclipse.ecl.core.impl.CommandImpl;

import org.eclipse.ecl.parser.test.model.ParserTestModelPackage;
import org.eclipse.ecl.parser.test.model.TestMultiplicity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ecl.parser.test.model.impl.TestMultiplicityImpl#getA1 <em>A1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestMultiplicityImpl extends CommandImpl implements TestMultiplicity {
	/**
	 * The cached value of the '{@link #getA1() <em>A1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA1()
	 * @generated
	 * @ordered
	 */
	protected EList<String> a1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestMultiplicityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParserTestModelPackage.Literals.TEST_MULTIPLICITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getA1() {
		if (a1 == null) {
			a1 = new EDataTypeUniqueEList<String>(String.class, this, ParserTestModelPackage.TEST_MULTIPLICITY__A1);
		}
		return a1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParserTestModelPackage.TEST_MULTIPLICITY__A1:
				return getA1();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ParserTestModelPackage.TEST_MULTIPLICITY__A1:
				getA1().clear();
				getA1().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ParserTestModelPackage.TEST_MULTIPLICITY__A1:
				getA1().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ParserTestModelPackage.TEST_MULTIPLICITY__A1:
				return a1 != null && !a1.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (a1: ");
		result.append(a1);
		result.append(')');
		return result.toString();
	}

} //TestMultiplicityImpl
