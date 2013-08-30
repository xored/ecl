/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.debug.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Event Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.ecl.debug.model.ModelPackage#getEventType()
 * @model
 * @generated
 */
public enum EventType implements Enumerator {
	/**
	 * The '<em><b>Suspend</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPEND_VALUE
	 * @generated
	 * @ordered
	 */
	SUSPEND(0, "Suspend", "Suspend"),

	/**
	 * The '<em><b>Resume</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESUME_VALUE
	 * @generated
	 * @ordered
	 */
	RESUME(1, "Resume", "Resume"),

	/**
	 * The '<em><b>Step</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEP_VALUE
	 * @generated
	 * @ordered
	 */
	STEP(2, "Step", "Step"),

	/**
	 * The '<em><b>Step Over</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEP_OVER_VALUE
	 * @generated
	 * @ordered
	 */
	STEP_OVER(3, "StepOver", "StepOver"),

	/**
	 * The '<em><b>Breakpoint Add</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREAKPOINT_ADD_VALUE
	 * @generated
	 * @ordered
	 */
	BREAKPOINT_ADD(4, "BreakpointAdd", "BreakpointAdd"),

	/**
	 * The '<em><b>Breakpoint Remove</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREAKPOINT_REMOVE_VALUE
	 * @generated
	 * @ordered
	 */
	BREAKPOINT_REMOVE(5, "BreakpointRemove", "BreakpointRemove"),

	/**
	 * The '<em><b>Skip All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SKIP_ALL_VALUE
	 * @generated
	 * @ordered
	 */
	SKIP_ALL(6, "SkipAll", "SkipAll"),

	/**
	 * The '<em><b>Started</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARTED_VALUE
	 * @generated
	 * @ordered
	 */
	STARTED(7, "Started", "Started"),

	/**
	 * The '<em><b>Suspended</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPENDED_VALUE
	 * @generated
	 * @ordered
	 */
	SUSPENDED(8, "Suspended", "Suspended"),

	/**
	 * The '<em><b>Step Ended</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEP_ENDED_VALUE
	 * @generated
	 * @ordered
	 */
	STEP_ENDED(9, "StepEnded", "StepEnded"),

	/**
	 * The '<em><b>Breakpoint Hit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREAKPOINT_HIT_VALUE
	 * @generated
	 * @ordered
	 */
	BREAKPOINT_HIT(10, "BreakpointHit", "BreakpointHit"),

	/**
	 * The '<em><b>Resumed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESUMED_VALUE
	 * @generated
	 * @ordered
	 */
	RESUMED(11, "Resumed", "Resumed");

	/**
	 * The '<em><b>Suspend</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Suspend</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUSPEND
	 * @model name="Suspend"
	 * @generated
	 * @ordered
	 */
	public static final int SUSPEND_VALUE = 0;

	/**
	 * The '<em><b>Resume</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Resume</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESUME
	 * @model name="Resume"
	 * @generated
	 * @ordered
	 */
	public static final int RESUME_VALUE = 1;

	/**
	 * The '<em><b>Step</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Step</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STEP
	 * @model name="Step"
	 * @generated
	 * @ordered
	 */
	public static final int STEP_VALUE = 2;

	/**
	 * The '<em><b>Step Over</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Step Over</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STEP_OVER
	 * @model name="StepOver"
	 * @generated
	 * @ordered
	 */
	public static final int STEP_OVER_VALUE = 3;

	/**
	 * The '<em><b>Breakpoint Add</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Breakpoint Add</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BREAKPOINT_ADD
	 * @model name="BreakpointAdd"
	 * @generated
	 * @ordered
	 */
	public static final int BREAKPOINT_ADD_VALUE = 4;

	/**
	 * The '<em><b>Breakpoint Remove</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Breakpoint Remove</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BREAKPOINT_REMOVE
	 * @model name="BreakpointRemove"
	 * @generated
	 * @ordered
	 */
	public static final int BREAKPOINT_REMOVE_VALUE = 5;

	/**
	 * The '<em><b>Skip All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Skip All</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SKIP_ALL
	 * @model name="SkipAll"
	 * @generated
	 * @ordered
	 */
	public static final int SKIP_ALL_VALUE = 6;

	/**
	 * The '<em><b>Started</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Started</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STARTED
	 * @model name="Started"
	 * @generated
	 * @ordered
	 */
	public static final int STARTED_VALUE = 7;

	/**
	 * The '<em><b>Suspended</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Suspended</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUSPENDED
	 * @model name="Suspended"
	 * @generated
	 * @ordered
	 */
	public static final int SUSPENDED_VALUE = 8;

	/**
	 * The '<em><b>Step Ended</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Step Ended</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STEP_ENDED
	 * @model name="StepEnded"
	 * @generated
	 * @ordered
	 */
	public static final int STEP_ENDED_VALUE = 9;

	/**
	 * The '<em><b>Breakpoint Hit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Breakpoint Hit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BREAKPOINT_HIT
	 * @model name="BreakpointHit"
	 * @generated
	 * @ordered
	 */
	public static final int BREAKPOINT_HIT_VALUE = 10;

	/**
	 * The '<em><b>Resumed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Resumed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESUMED
	 * @model name="Resumed"
	 * @generated
	 * @ordered
	 */
	public static final int RESUMED_VALUE = 11;

	/**
	 * An array of all the '<em><b>Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EventType[] VALUES_ARRAY =
		new EventType[] {
			SUSPEND,
			RESUME,
			STEP,
			STEP_OVER,
			BREAKPOINT_ADD,
			BREAKPOINT_REMOVE,
			SKIP_ALL,
			STARTED,
			SUSPENDED,
			STEP_ENDED,
			BREAKPOINT_HIT,
			RESUMED,
		};

	/**
	 * A public read-only list of all the '<em><b>Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EventType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Event Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EventType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EventType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EventType get(int value) {
		switch (value) {
			case SUSPEND_VALUE: return SUSPEND;
			case RESUME_VALUE: return RESUME;
			case STEP_VALUE: return STEP;
			case STEP_OVER_VALUE: return STEP_OVER;
			case BREAKPOINT_ADD_VALUE: return BREAKPOINT_ADD;
			case BREAKPOINT_REMOVE_VALUE: return BREAKPOINT_REMOVE;
			case SKIP_ALL_VALUE: return SKIP_ALL;
			case STARTED_VALUE: return STARTED;
			case SUSPENDED_VALUE: return SUSPENDED;
			case STEP_ENDED_VALUE: return STEP_ENDED;
			case BREAKPOINT_HIT_VALUE: return BREAKPOINT_HIT;
			case RESUMED_VALUE: return RESUMED;
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
	private EventType(int value, String name, String literal) {
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
	
} //EventType
