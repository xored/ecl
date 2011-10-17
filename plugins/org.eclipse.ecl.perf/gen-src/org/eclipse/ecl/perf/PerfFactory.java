/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     xored software, Inc - initial API and implementation
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.perf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.ecl.perf.PerfPackage
 * @generated
 */
public interface PerfFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PerfFactory eINSTANCE = org.eclipse.ecl.perf.impl.PerfFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Counter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Counter</em>'.
	 * @generated
	 */
	PerfCounter createPerfCounter();

	/**
	 * Returns a new object of class '<em>Start Time Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Time Measure</em>'.
	 * @generated
	 */
	StartTimeMeasure createStartTimeMeasure();

	/**
	 * Returns a new object of class '<em>Stop Time Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Time Measure</em>'.
	 * @generated
	 */
	StopTimeMeasure createStopTimeMeasure();

	/**
	 * Returns a new object of class '<em>Measure Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Time</em>'.
	 * @generated
	 */
	MeasureTime createMeasureTime();

	/**
	 * Returns a new object of class '<em>Constrain Max</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constrain Max</em>'.
	 * @generated
	 */
	ConstrainMax createConstrainMax();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PerfPackage getPerfPackage();

} //PerfFactory
