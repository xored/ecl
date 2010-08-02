/**
 * <copyright>
 * </copyright>
 *
 * $Id: AssertNotNullImpl.java,v 1.1 2010/08/02 09:24:20 andrey Exp $
 */
package org.eclipse.ecl.stdlib.impl;

import org.eclipse.ecl.core.impl.CommandImpl;

import org.eclipse.ecl.stdlib.AssertNotNull;
import org.eclipse.ecl.stdlib.StandartLibraryPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assert Not Null</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AssertNotNullImpl extends CommandImpl implements AssertNotNull {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertNotNullImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandartLibraryPackage.Literals.ASSERT_NOT_NULL;
	}

} //AssertNotNullImpl
