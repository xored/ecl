/*******************************************************************************
 * Copyright (c) 2008 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Andrey Platov)
 *******************************************************************************/

package com.xored.espace.core;

import org.eclipse.emf.ecore.EObject;

/**
 * ESpace is JavaSpace-alike API and programming model implemented focused on
 * EMF project.
 * 
 * @author Andrey Platov
 */
public interface ESpace {

	/**
	 * Read any matching entry from the space, blocking until one exists.
	 * 
	 * @param template
	 *            The template used for matching. Matching is done against
	 *            template with default attribute values being wildcards
	 *            ("match anything") other fields being values, which will be
	 *            matched on equality.
	 * @param timeout
	 *            How long the client is willing to wait for a proper matching
	 *            entry.
	 * @return
	 * @throws InterruptedException 
	 */
	EObject read(EObject template, long timeout) throws InterruptedException;

	/**
	 * Take a matching entry from the space, waiting until one exists.
	 * 
	 * @param template
	 *            The template used for matching. Matching is done against
	 *            template with default attribute values being wildcards
	 *            ("match anything") other fields being values, which will be
	 *            matched on equality.
	 * @param timeout
	 *            How long the client is willing to wait for a proper matching
	 *            entry.
	 * @return
	 * @throws InterruptedException
	 */
	EObject take(EObject template, long timeout) throws InterruptedException;

	/**
	 * Write a new object into the space.
	 * 
	 * @param object
	 * @throws InterruptedException
	 */
	void write(EObject object) throws InterruptedException;
	
}
