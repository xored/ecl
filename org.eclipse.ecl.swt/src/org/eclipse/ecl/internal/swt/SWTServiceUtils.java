package org.eclipse.ecl.internal.swt;

import java.util.StringTokenizer;

import net.sf.swtbot.eclipse.finder.SWTEclipseBot;
import net.sf.swtbot.eclipse.finder.widgets.SWTBotCommand;
import net.sf.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor;
import net.sf.swtbot.eclipse.finder.widgets.SWTBotView;
import net.sf.swtbot.utils.SWTUtils;
import net.sf.swtbot.widgets.AbstractSWTBot;
import net.sf.swtbot.widgets.SWTBotButton;
import net.sf.swtbot.widgets.SWTBotCheckBox;
import net.sf.swtbot.widgets.SWTBotMenu;
import net.sf.swtbot.widgets.SWTBotRadio;

import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IViewReference;

public class SWTServiceUtils {
	public static Object bot(Object o) {
		if (o instanceof AbstractSWTBot) {
			return o;
		} else if (o instanceof SWTBotCommand) {
			return o;
		} else if (o instanceof SWTBotView) {
			return o;
		} else if (o instanceof SWTBotEclipseEditor) {
			return o;
		} else if (o instanceof Button) {
			return bot((Button) o);
		} else if (o instanceof MenuItem) {
			return bot((MenuItem) o);
		} else if (o instanceof Widget) {
			return bot((Widget) o);
		} else if (o instanceof org.eclipse.core.commands.Command) {
			return bot((org.eclipse.core.commands.Command) o);
		} else if (o instanceof IViewReference) {
			return bot((IViewReference) o);
		} else if (o instanceof IEditorReference) {
			return bot((IEditorReference) o);
		}
		return null;
	}

	public static AbstractSWTBot<? extends Widget> bot(Widget widget) {
		try {
			String className = "net.sf.swtbot.widgets.SWTBot"
					+ widget.getClass().getSimpleName();
			return (AbstractSWTBot<? extends Widget>) Class.forName(className)
					.getConstructor(widget.getClass()).newInstance(widget);
		} catch (Exception e) {
			return null;
		}
	}

	public static AbstractSWTBot<? extends Widget> bot(Button widget) {
		if (SWTUtils.hasStyle(widget, SWT.PUSH)) {
			return new SWTBotButton(widget);
		} else if (SWTUtils.hasStyle(widget, SWT.CHECK)) {
			return new SWTBotCheckBox(widget);
		} else if (SWTUtils.hasStyle(widget, SWT.RADIO)) {
			return new SWTBotRadio(widget);
		} else {
			return null;
		}
	}

	public static AbstractSWTBot<? extends Widget> bot(MenuItem menu) {
		return new SWTBotMenu(menu);
	}

	public static SWTBotCommand bot(org.eclipse.core.commands.Command command) {
		return new SWTBotCommand(command);
	}

	public static SWTBotView bot(IViewReference view) {
		return new SWTBotView(view, new SWTEclipseBot());
	}

	public static SWTBotEclipseEditor bot(IEditorReference editor) {
		return new SWTBotEclipseEditor(editor, new SWTEclipseBot());
	}

	public static interface ItemFinder {
		AbstractSWTBot first(String text) throws Exception;

		AbstractSWTBot next(AbstractSWTBot prev, String text) throws Exception;
	}

	public static AbstractSWTBot findItemByPath(ItemFinder finder,
			String menuPath) throws Exception {
		String itemName = menuPath;
		String subItemPath = null;
		if (itemName.contains("/")) {
			subItemPath = itemName.substring(itemName.indexOf("/") + 1,
					itemName.length());
			itemName = itemName.substring(0, itemName.indexOf("/"));
		}
		AbstractSWTBot item = finder.first(itemName);
		if (subItemPath != null) {
			StringTokenizer tokenizer = new StringTokenizer(subItemPath, "/");
			while (tokenizer.hasMoreTokens()) {
				item = finder.next(item, tokenizer.nextToken());
				if (item == null)
					break;
			}
		}
		return item;
	}

	public static Object invoke(Object target, String method) throws Exception {
		return invoke(target, method, null);
	}

	public static Object invoke(Object target, String method, Object attr)
			throws Exception {
		Object result = null;
		if (attr == null) {
			result = target.getClass().getMethod(method).invoke(target);
		} else {
			try {
				result = target.getClass().getMethod(method, attr.getClass())
						.invoke(target, attr);
			} catch (NoSuchMethodException e) {
				try {
					result = target.getClass().getMethod(method,
							CoreUtils.getPrimitiveType(attr)).invoke(target,
							attr);
				} catch (Exception e3) {
					throw e;
				}
			}
		}
		return result;
	}
}
