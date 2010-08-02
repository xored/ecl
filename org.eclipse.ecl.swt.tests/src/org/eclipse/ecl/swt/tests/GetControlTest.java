package org.eclipse.ecl.swt.tests;

import java.util.List;

import net.sf.swtbot.SWTBot;
import net.sf.swtbot.finder.AbstractSWTTestCase;
import net.sf.swtbot.widgets.SWTBotButton;
import net.sf.swtbot.widgets.SWTBotShell;
import net.sf.swtbot.widgets.SWTBotTabItem;
import net.sf.swtbot.widgets.SWTBotText;

import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class GetControlTest extends AbstractSWTTestCase {

	public void testFindsAllTabItem() throws Exception {
		List<Object> tabItems = TestUtils.execute("GetControl TabItem");
		assertEquals(24, tabItems.size());
	}

	public void testFindsAShell() throws Exception {
		List<Object> shells = TestUtils
				.execute("GetControl -text \"SWT Controls\"");
		assertFalse(shells.isEmpty());
		assertEquals(1, shells.size());
		assertEquals(controlShell, ((SWTBotShell) shells.get(0)).widget);
	}

	public void testFindsATabItem() throws Exception {
		List<Object> tabItems = TestUtils
				.execute("GetControl -text Dialog -type TabItem");

		final TabItem items[] = new TabItem[] { null };
		display.syncExec(new Runnable() {
			public void run() {
				items[0] = ((TabFolder) controlShell.getChildren()[0])
						.getItems()[5];
			}
		});

		assertEquals(1, tabItems.size());
		assertEquals(items[0], ((SWTBotTabItem) tabItems.get(0)).widget);
	}

	public void testFindsText() throws Exception {
		List<Object> textBoxes = TestUtils.execute("GetControl -text Text");
		assertEquals(1, textBoxes.size());
	}

	public void testFindsTwoButtons() throws Exception {
		List<Object> buttons = TestUtils.execute("GetControl Button One");
		assertEquals(2, buttons.size());
		assertText("One", (SWTBotButton) buttons.get(0));
		assertText("One", (SWTBotButton) buttons.get(1));
	}

	public void testFindsAllCheckBox() throws Exception {
		List<Object> checkbox = TestUtils.execute("GetControl CheckBox");
		assertEquals(11, checkbox.size());
	}

	public void testFindsAllRadio() throws Exception {
		List<Object> radio = TestUtils.execute("GetControl Radio");
		assertEquals(14, radio.size());
	}

	public void testFindsTextBoxWithLabel() throws Exception {
		clipboardExampleShell.forceFocus();
		List<Object> findControls = TestUtils
				.execute("GetControl -label {HTMLTransfer:}");
		assertEquals(2, findControls.size());
		assertText("<b>Hello World</b>", (SWTBotText) findControls.get(0));
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		new SWTBot().tabItem("Button").activate();
	}
}
