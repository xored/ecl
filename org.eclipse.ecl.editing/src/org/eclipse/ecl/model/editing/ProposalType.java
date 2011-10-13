/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     xored software, Inc - initial API and implementation
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProposalType.java,v 1.1 2010/09/01 05:56:00 alena Exp $
 */
package org.eclipse.ecl.model.editing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Proposal Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.ecl.model.editing.EditingPackage#getProposalType()
 * @model
 * @generated
 */
public enum ProposalType implements Enumerator {
	/**
	 * The '<em><b>Command Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMAND_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	COMMAND_NAME(0, "CommandName", "CommandName"),

	/**
	 * The '<em><b>Param Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAM_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	PARAM_NAME(1, "ParamName", "ParamName");

	/**
	 * The '<em><b>Command Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Command Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMAND_NAME
	 * @model name="CommandName"
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND_NAME_VALUE = 0;

	/**
	 * The '<em><b>Param Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Param Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARAM_NAME
	 * @model name="ParamName"
	 * @generated
	 * @ordered
	 */
	public static final int PARAM_NAME_VALUE = 1;

	/**
	 * An array of all the '<em><b>Proposal Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProposalType[] VALUES_ARRAY =
		new ProposalType[] {
			COMMAND_NAME,
			PARAM_NAME,
		};

	/**
	 * A public read-only list of all the '<em><b>Proposal Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProposalType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Proposal Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProposalType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProposalType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Proposal Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProposalType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProposalType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Proposal Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProposalType get(int value) {
		switch (value) {
			case COMMAND_NAME_VALUE: return COMMAND_NAME;
			case PARAM_NAME_VALUE: return PARAM_NAME;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProposalType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ProposalType
