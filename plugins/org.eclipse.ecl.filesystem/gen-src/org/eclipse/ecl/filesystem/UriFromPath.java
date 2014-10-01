/**
 */
package org.eclipse.ecl.filesystem;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uri From Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.filesystem.UriFromPath#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.filesystem.FilesystemPackage#getUriFromPath()
 * @model annotation="http://www.eclipse.org/ecl/docs returns='URI string. Platform independent (can be used on every OS).' example='get-file [uri-from-path \"C:\\windows\"] | get exists'"
 * @generated
 */
public interface UriFromPath extends Command {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.eclipse.ecl.filesystem.FilesystemPackage#getUriFromPath_Path()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/ecl/docs description='Platform-dependednt filesystem path.' example='C:\\windows\\system32'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.filesystem.UriFromPath#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // UriFromPath
