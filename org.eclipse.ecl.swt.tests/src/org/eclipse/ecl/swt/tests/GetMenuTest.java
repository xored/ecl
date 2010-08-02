package org.eclipse.ecl.swt.tests;

import java.util.List;

import net.sf.swtbot.SWTBot;
import net.sf.swtbot.finder.AbstractSWTTestCase;

public class GetMenuTest extends AbstractSWTTestCase {

	public void testFindAllMenu() throws Exception {
		List<Object> findControls = TestUtils.execute("FindMenu");
		assertEquals(207, findControls.size());
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		new SWTBot().tabItem("Button").activate();
	}
}
