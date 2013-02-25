/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.filesystem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.ecl.filesystem.FilesystemPackage
 * @generated
 */
public interface FilesystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FilesystemFactory eINSTANCE = org.eclipse.ecl.filesystem.impl.FilesystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Copy File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copy File</em>'.
	 * @generated
	 */
	CopyFile createCopyFile();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FilesystemPackage getFilesystemPackage();

} //FilesystemFactory
