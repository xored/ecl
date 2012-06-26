/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.data.commands.util;

import org.eclipse.ecl.core.Command;

import org.eclipse.ecl.data.commands.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.ecl.data.commands.CommandsPackage
 * @generated
 */
public class CommandsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommandsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandsSwitch() {
		if (modelPackage == null) {
			modelPackage = CommandsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CommandsPackage.READ_CSV_FILE: {
				ReadCsvFile readCsvFile = (ReadCsvFile)theEObject;
				T result = caseReadCsvFile(readCsvFile);
				if (result == null) result = caseCommand(readCsvFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.PRINT: {
				Print print = (Print)theEObject;
				T result = casePrint(print);
				if (result == null) result = caseCommand(print);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.WRITE_CSV_FILE: {
				WriteCsvFile writeCsvFile = (WriteCsvFile)theEObject;
				T result = caseWriteCsvFile(writeCsvFile);
				if (result == null) result = caseCommand(writeCsvFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.EXCLUDE_COLUMNS: {
				ExcludeColumns excludeColumns = (ExcludeColumns)theEObject;
				T result = caseExcludeColumns(excludeColumns);
				if (result == null) result = caseCommand(excludeColumns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.SELECT_COLUMNS: {
				SelectColumns selectColumns = (SelectColumns)theEObject;
				T result = caseSelectColumns(selectColumns);
				if (result == null) result = caseCommand(selectColumns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.ASSERT_TABLES_MATCH: {
				AssertTablesMatch assertTablesMatch = (AssertTablesMatch)theEObject;
				T result = caseAssertTablesMatch(assertTablesMatch);
				if (result == null) result = caseCommand(assertTablesMatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.WRITE_LINES: {
				WriteLines writeLines = (WriteLines)theEObject;
				T result = caseWriteLines(writeLines);
				if (result == null) result = caseCommand(writeLines);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.READ_LINES: {
				ReadLines readLines = (ReadLines)theEObject;
				T result = caseReadLines(readLines);
				if (result == null) result = caseCommand(readLines);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Csv File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Csv File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadCsvFile(ReadCsvFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Print</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Print</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrint(Print object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Csv File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Csv File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteCsvFile(WriteCsvFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclude Columns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclude Columns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcludeColumns(ExcludeColumns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Columns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Columns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectColumns(SelectColumns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assert Tables Match</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assert Tables Match</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertTablesMatch(AssertTablesMatch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Lines</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Lines</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteLines(WriteLines object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Lines</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Lines</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadLines(ReadLines object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommand(Command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CommandsSwitch
