package org.eclipse.ecl.core.tests;

import org.eclipse.ecl.runtime.EclRuntime;
import org.eclipse.ecl.runtime.ISession;

public class LocalCoreTest extends AbstractCoreTest {

	@Override
	protected ISession createSession() {
		return EclRuntime.createSession();
	}

}
