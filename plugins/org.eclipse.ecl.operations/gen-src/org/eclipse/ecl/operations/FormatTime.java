/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.operations;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Format Time</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.operations.FormatTime#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.operations.OperationsPackage#getFormatTime()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Reads timestamp value (as a number of milliseconds since January, 1, 1970) from input pipe and formats according to given format string. Format string is the same as used in <code>java.text.SimpleDateFormat</code>.' returns='String representation of given time'"
 * @generated
 */
public interface FormatTime extends Command {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see org.eclipse.ecl.operations.OperationsPackage#getFormatTime_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.operations.FormatTime#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

} // FormatTime
