/**
 * <copyright>
 * </copyright>
 *
 * $Id: AssertNullImpl.java,v 1.1 2010/08/02 09:24:20 andrey Exp $
 */
package org.eclipse.ecl.stdlib.impl;

import org.eclipse.ecl.core.impl.CommandImpl;

import org.eclipse.ecl.stdlib.AssertNull;
import org.eclipse.ecl.stdlib.StandartLibraryPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assert Null</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AssertNullImpl extends CommandImpl implements AssertNull {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertNullImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandartLibraryPackage.Literals.ASSERT_NULL;
	}

} //AssertNullImpl
