/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParserTestModelSwitch.java,v 1.1 2010/08/02 09:24:07 andrey Exp $
 */
package org.eclipse.ecl.parser.test.model.util;

import java.util.List;

import org.eclipse.ecl.core.Command;

import org.eclipse.ecl.parser.test.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see org.eclipse.ecl.parser.test.model.ParserTestModelPackage
 * @generated
 */
public class ParserTestModelSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ParserTestModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParserTestModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ParserTestModelPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ParserTestModelPackage.TEST_EMPTY: {
				TestEmpty testEmpty = (TestEmpty)theEObject;
				T result = caseTestEmpty(testEmpty);
				if (result == null) result = caseCommand(testEmpty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParserTestModelPackage.TEST_COMMAND_PARAM: {
				TestCommandParam testCommandParam = (TestCommandParam)theEObject;
				T result = caseTestCommandParam(testCommandParam);
				if (result == null) result = caseCommand(testCommandParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParserTestModelPackage.TEST_UNKNOWN_PARAM: {
				TestUnknownParam testUnknownParam = (TestUnknownParam)theEObject;
				T result = caseTestUnknownParam(testUnknownParam);
				if (result == null) result = caseCommand(testUnknownParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParserTestModelPackage.TEST_INT_PARAM: {
				TestIntParam testIntParam = (TestIntParam)theEObject;
				T result = caseTestIntParam(testIntParam);
				if (result == null) result = caseCommand(testIntParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParserTestModelPackage.TEST_BOOL_PARAM: {
				TestBoolParam testBoolParam = (TestBoolParam)theEObject;
				T result = caseTestBoolParam(testBoolParam);
				if (result == null) result = caseCommand(testBoolParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParserTestModelPackage.TEST_OPTIONAL_PARAMS: {
				TestOptionalParams testOptionalParams = (TestOptionalParams)theEObject;
				T result = caseTestOptionalParams(testOptionalParams);
				if (result == null) result = caseCommand(testOptionalParams);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParserTestModelPackage.TEST_PARAM_COLLISION: {
				TestParamCollision testParamCollision = (TestParamCollision)theEObject;
				T result = caseTestParamCollision(testParamCollision);
				if (result == null) result = caseCommand(testParamCollision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParserTestModelPackage.TEST_MULTIPLICITY: {
				TestMultiplicity testMultiplicity = (TestMultiplicity)theEObject;
				T result = caseTestMultiplicity(testMultiplicity);
				if (result == null) result = caseCommand(testMultiplicity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Empty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Empty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestEmpty(TestEmpty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Command Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Command Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestCommandParam(TestCommandParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Unknown Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Unknown Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestUnknownParam(TestUnknownParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Int Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Int Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestIntParam(TestIntParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Bool Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Bool Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestBoolParam(TestBoolParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Optional Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Optional Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestOptionalParams(TestOptionalParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Param Collision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Param Collision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestParamCollision(TestParamCollision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Multiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Multiplicity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestMultiplicity(TestMultiplicity object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //ParserTestModelSwitch
