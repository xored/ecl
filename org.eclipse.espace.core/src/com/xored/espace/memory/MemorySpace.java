/*******************************************************************************
 * Copyright (c) 2008 xored software, Inc.
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: xored software, Inc. - initial API and Implementation (Andrey
 * Platov)
 *******************************************************************************/

package com.xored.espace.memory;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import com.xored.espace.core.ESpace;

public class MemorySpace implements ESpace {

	private List<EObject> space = new ArrayList<EObject>();

	private synchronized EObject waitForSuitableObject(long timeout)
			throws InterruptedException {
		List<EObject> contents = space;
		if (timeout == 0) {
			if (contents.size() > 0) {
				return contents.get(0);
			} else {
				return null;
			}
		}
		long start = System.currentTimeMillis();
		while (contents.size() == 0) {
			wait(timeout);
			long end = System.currentTimeMillis();
			// Timeout
			if (end - start > timeout) {
				if (contents.size() == 0) {
					return null;
				}
			}
		}
		return contents.get(0);
	}

	public EObject read(EObject template, long timeout)
			throws InterruptedException {
		return waitForSuitableObject(timeout);
	}

	public synchronized EObject take(EObject template, long timeout)
			throws InterruptedException {
		EObject result = waitForSuitableObject(timeout);
		space.remove(result);
		return result;
	}

	public synchronized void write(EObject object) throws InterruptedException {
		space.add(object);
		notify();
	}
}
