package org.eclipse.ecl.stdlib.tests;

import java.util.List;

import junit.framework.TestCase;

public class LengthTest extends TestCase {

	public void testGet_001() throws Exception {
		List<Object> list = TestUtils.exec("Length", new Object[] { 0, 1, 2 });
		assertEquals(1, list.size());
		assertEquals(3, ((Integer) list.get(0)).intValue());
	}

	public void testGet_002() throws Exception {
		List<Object> list = TestUtils.exec("Length", new Object[] {});
		assertEquals(1, list.size());
		assertEquals(0, ((Integer) list.get(0)).intValue());
	}

}
