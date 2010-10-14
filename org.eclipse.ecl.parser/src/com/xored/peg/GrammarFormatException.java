/*
 * GrammarFormatException.java
 *
 * Created on September 15, 2006, 4:10 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.xored.peg;

/**
 * This class is a simple extension of a RuntimeException to flag format
 * exceptions in a Grammar description.
 * 
 * @author Edgar A. Duenez-Guzman
 */
public class GrammarFormatException extends RuntimeException {

	private static final long serialVersionUID = 2524195791659026188L;

	/**
	 * Creates a new instance of GrammarFormatException with th specified
	 * message.
	 * 
	 * @param msg
	 *            The message used in this Exception.
	 */
	public GrammarFormatException(String msg) {
		super(msg);
	}
}
