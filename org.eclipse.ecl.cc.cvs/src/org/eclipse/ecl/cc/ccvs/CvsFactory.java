/**
 * <copyright>
 * </copyright>
 *
 * $Id: CvsFactory.java,v 1.1 2010/08/02 09:24:04 andrey Exp $
 */
package org.eclipse.ecl.cc.ccvs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.ecl.cc.ccvs.CvsPackage
 * @generated
 */
public interface CvsFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CvsFactory eINSTANCE = org.eclipse.ecl.cc.ccvs.impl.CvsFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Get CVS Locations</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Get CVS Locations</em>'.
     * @generated
     */
    GetCVSLocations createGetCVSLocations();

    /**
     * Returns a new object of class '<em>CVS Location</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>CVS Location</em>'.
     * @generated
     */
    CVSLocation createCVSLocation();

    /**
     * Returns a new object of class '<em>Add CVS Locations</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Add CVS Locations</em>'.
     * @generated
     */
    AddCVSLocations createAddCVSLocations();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    CvsPackage getCvsPackage();

} //CvsFactory
