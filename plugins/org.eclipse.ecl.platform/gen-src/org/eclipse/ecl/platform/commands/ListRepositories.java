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
 * A representation of the model object '<em><b>List Repositories</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.ecl.platform.commands.CommandsPackage#getListRepositories()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Returns list of p2 repositories.' returns='List of p2 repositories' example='list-repositories | foreach [val item] {\n\tif [$item | get name | equals \"download cache\"]{\n\t\t$item | get isArtifact | equals true | verify-true\n\t}\n}\n'"
 * @generated
 */
public interface ListRepositories extends Command {
} // ListRepositories
