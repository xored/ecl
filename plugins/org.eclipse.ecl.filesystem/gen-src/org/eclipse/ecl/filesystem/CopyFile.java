/**
 */
package org.eclipse.ecl.filesystem;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copy File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.filesystem.CopyFile#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.ecl.filesystem.CopyFile#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.ecl.filesystem.CopyFile#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.filesystem.FilesystemPackage#getCopyFile()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Copies <code>source</code> file or directory into <code>destination</code> directory, optionally giving it a new <code>name</code>.' returns='Nothing.' example='copy-file -source \"/Users/Ulik_MacAir/aut-Q7-1.3.12-B2/Project/t.test\" \n-destination \"/Users/Ulik_MacAir/aut-Q7-1.3.12-B2/Project/Folder\" -name \"Clone.test\"'"
 * @generated
 */
public interface CopyFile extends Command {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.eclipse.ecl.filesystem.FilesystemPackage#getCopyFile_Source()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/ecl/docs description='Source file or directory.'"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.filesystem.CopyFile#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' attribute.
	 * @see #setDestination(String)
	 * @see org.eclipse.ecl.filesystem.FilesystemPackage#getCopyFile_Destination()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/ecl/docs description='Destination directory under which the <code>source</code> file or directory will be stored.'"
	 * @generated
	 */
	String getDestination();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.filesystem.CopyFile#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.ecl.filesystem.FilesystemPackage#getCopyFile_Name()
	 * @model annotation="http://www.eclipse.org/ecl/docs description='New name for the <code>source</code> file or directory.'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.filesystem.CopyFile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CopyFile
