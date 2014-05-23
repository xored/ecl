/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.operations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Minus</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.ecl.operations.OperationsPackage#getMinus()
 * @model annotation="http://www.eclipse.org/ecl/docs description='<p>returns <code>left - right</code></p>\n<p>Before performing an operation, arguments are converted to the widest type according to the following rules:</p>\n<ol>\n  <li><code>string</code> arguments converted to <code>long</code></li>\n  <li><code>boolean</code> arguments converted to <code>long</code> (1 for <code>true</code> and 0 for <code>false</code>)</li>\n  <li>If one of arguments is <code>double</code>, converts the other one to <code>double</code></li>\n  <li>If one of arguments is <code>float</code>, converts the other one to <code>float</code></li>\n  <li>If one of arguments is <code>long</code>, converts the other one to <code>long</code></li>\n  <li>Otherwise (in case of <code>byte</code>, <code>char</code>, or <code>short</code>) converts both arguments to <code>int</code></li>\n</ol>\n' example='minus 8 5 | equals 3 | verify-true'"
 * @generated
 */
public interface Minus extends BinaryOp {
} // Minus
