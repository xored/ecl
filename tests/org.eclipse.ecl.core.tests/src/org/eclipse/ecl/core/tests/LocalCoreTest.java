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
package org.eclipse.ecl.core.tests;

import org.eclipse.ecl.runtime.EclRuntime;
import org.eclipse.ecl.runtime.ISession;

public class LocalCoreTest extends AbstractCoreTest {

	@Override
	protected ISession createSession() {
		return EclRuntime.createSession();
	}

}
