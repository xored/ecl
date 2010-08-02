/**
 * <copyright>
 * </copyright>
 *
 * $Id: AddCVSLocations.java,v 1.1 2010/08/02 09:24:04 andrey Exp $
 */
package org.eclipse.ecl.cc.ccvs;

import org.eclipse.ecl.core.Command;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add CVS Locations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.cc.ccvs.AddCVSLocations#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.cc.ccvs.CvsPackage#getAddCVSLocations()
 * @model
 * @generated
 */
public interface AddCVSLocations extends Command {
    /**
     * Returns the value of the '<em><b>Input</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.ecl.cc.ccvs.CVSLocation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input</em>' containment reference list.
     * @see org.eclipse.ecl.cc.ccvs.CvsPackage#getAddCVSLocations_Input()
     * @model containment="true"
     * @generated
     */
    EList<CVSLocation> getInput();

} // AddCVSLocations
