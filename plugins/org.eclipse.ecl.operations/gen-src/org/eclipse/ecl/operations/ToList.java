/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.operations;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To List</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.ecl.operations.OperationsPackage#getToList()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Loads whole input pipe and returns a single EclList object, containing it.' example='emit 1 2 3 | to-list // same as list 1 2 3\nemit 1 2 3 | to-list | to-list // same as list [list 1 2 3]'"
 * @generated
 */
public interface ToList extends Command {
} // ToList
