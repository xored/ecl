/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.platform.commands;

import org.eclipse.ecl.core.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Features</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.ecl.platform.commands.CommandsPackage#getListFeatures()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Returns list of all features.' returns='Lists all available features. ' example='list-features | foreach [val item]  {\n\tif [$item | get id | matches \"com.xored.q7.*\"]{\n    \t\t$item | get name | log\n\t}\n}'"
 * @generated
 */
public interface ListFeatures extends Command {
} // ListFeatures
