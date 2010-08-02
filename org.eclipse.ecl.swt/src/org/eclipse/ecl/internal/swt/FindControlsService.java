package org.eclipse.ecl.internal.swt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.swtbot.SWTBot;
import net.sf.swtbot.matcher.WidgetMatcherFactory;
import net.sf.swtbot.wait.Conditions;
import net.sf.swtbot.wait.WaitForWidget;
import net.sf.swtbot.wait.WaitForWidgetInParent;
import net.sf.swtbot.widgets.WidgetNotFoundException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;
import org.eclipse.ecl.swt.FindControls;
import org.eclipse.ecl.swt.SwtPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Widget;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

public class FindControlsService extends AbstractSWTService {

	private static final Map<String, Matcher<?>> typeMatchers = new HashMap<String, Matcher<?>>();
	static {
		typeMatchers.put("Button", Matchers.allOf(Matchers
				.instanceOf(Button.class), WidgetMatcherFactory.withStyle(
				SWT.PUSH, "SWT.PUSH")));
		typeMatchers.put("CheckBox", Matchers.allOf(Matchers
				.instanceOf(Button.class), WidgetMatcherFactory.withStyle(
				SWT.CHECK, "SWT.CHECK")));
		typeMatchers.put("Radio", Matchers.allOf(Matchers
				.instanceOf(Button.class), WidgetMatcherFactory.withStyle(
				SWT.RADIO, "SWT.RADIO")));
	}

	public IStatus doService(final Command command, final IProcess context)
			throws Exception {
		final FindControls fc = (FindControls) command;

		try {
			final List<? extends Widget> results;
			final Matcher<?> matcher = getMatchers(fc);
			Object input = context.getInput().take(
					ISession.DEFAULT_TAKE_TIMEOUT);

			if (input == null) {
				WaitForWidget waitForWidget = Conditions.waitForWidget(matcher);
				new SWTBot().waitUntilWidgetAppears(waitForWidget);
				results = waitForWidget.getWidgets();
			} else {
				try {
					final Widget parent = (Widget) input;
					WaitForWidgetInParent waitForWidget;

					waitForWidget = Conditions.waitForWidget(matcher, parent);
					new SWTBot().waitUntilWidgetAppears(waitForWidget);
					results = waitForWidget.getWidgets();
				} catch (ClassCastException e) {
					return new Status(Status.ERROR, PLUGIN_ID, ServiceMessages
							.format(ServiceMessages.Service_Invalid_result,
									new String[] { "Widget",
											input.getClass().getSimpleName() }));
				}
			}

			if (results.isEmpty()) {
				return new Status(Status.ERROR, PLUGIN_ID,
						"Cannot found the control");
			}
			if (fc.getIndex() == -1) {
				for (Object result : results) {
					context.getOutput().write(result);
				}
			} else {
				context.getOutput().write(results.get(fc.getIndex()));
			}
		} catch (ClassNotFoundException e) {
			return new Status(Status.ERROR, PLUGIN_ID,
					"Cannot found the control");
		} catch (WidgetNotFoundException e) {
			return new Status(Status.ERROR, PLUGIN_ID,
					"Cannot found the control");
		} catch (IndexOutOfBoundsException e) {
			return new Status(Status.ERROR, PLUGIN_ID, "Index out of bounds");
		}
		return Status.OK_STATUS;
	}

	private Matcher<?> getMatchers(FindControls fc)
			throws ClassNotFoundException {
		List<Matcher<?>> matchers = new ArrayList<Matcher<?>>();
		if (fc.eIsSet(SwtPackage.eINSTANCE.getFindControls_Type())) {
			if (typeMatchers.containsKey(fc.getType())) {
				matchers.add(typeMatchers.get(fc.getType()));
			} else {
				String className = "org.eclipse.swt.widgets." + fc.getType();
				matchers.add(WidgetMatcherFactory
						.widgetOfType((Class<? extends Widget>) Class
								.forName(className)));
			}
		}
		if (fc.eIsSet(SwtPackage.eINSTANCE.getFindControls_Text())) {
			matchers.add(WidgetMatcherFactory.withMnemonic(fc.getText()));
		}
		if (fc.eIsSet(SwtPackage.eINSTANCE.getFindControls_Label())) {
			matchers.add(WidgetMatcherFactory.withLabel(fc.getLabel()));
		}
		return matchers.size() == 0 ? Matchers.anything() : Matchers
				.allOf(matchers);
	}
}
