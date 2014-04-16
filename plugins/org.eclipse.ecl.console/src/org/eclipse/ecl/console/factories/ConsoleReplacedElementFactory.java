package org.eclipse.ecl.console.factories;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.ecl.console.EclConsolePlugin;
import org.eclipse.swt.widgets.Control;
import org.w3c.dom.Element;
import org.xhtmlrenderer.extend.ReplacedElement;
import org.xhtmlrenderer.extend.UserAgentCallback;
import org.xhtmlrenderer.layout.LayoutContext;
import org.xhtmlrenderer.render.BlockBox;
import org.xhtmlrenderer.simple.xhtml.swt.SWTFormControl;
import org.xhtmlrenderer.simple.xhtml.swt.SWTXhtmlReplacedElementFactory;
import org.xhtmlrenderer.swt.BasicRenderer;
import org.xhtmlrenderer.swt.FormControlReplacementElement;

/**
 * 
 */
public class ConsoleReplacedElementFactory extends
		SWTXhtmlReplacedElementFactory {

	public static final String TAG_CONSOLE = "console-element";

	private BasicRenderer parent;

	ISWTControlFactory swtControlFactory;

	private Map<Element, ReplacedElement> controls = null;

	public ConsoleReplacedElementFactory(BasicRenderer parent) {
		super(parent);
		this.parent = parent;
		controls = new HashMap<Element, ReplacedElement>();
		swtControlFactory = EclConsolePlugin.getDefault()
				.getSWTControlFactory();
	}

	@Override
	public ReplacedElement createReplacedElement(LayoutContext c, BlockBox box,
			UserAgentCallback uac, int cssWidth, int cssHeight) {

		ReplacedElement result = super.createReplacedElement(c, box, uac,
				cssWidth, cssHeight);

		if (result == null && !c.isPrint()
				&& isConsoleElement(box.getElement())) {
			result = getConsoleReplacedElement(c, box, uac, cssWidth, cssHeight);
		}
		return result;
	}

	protected boolean isConsoleElement(Element element) {
		return (element != null)
				&& TAG_CONSOLE.equalsIgnoreCase(element.getTagName());
	}

	protected ReplacedElement getConsoleReplacedElement(LayoutContext c,
			BlockBox box, UserAgentCallback uac, int cssWidth, int cssHeight) {
		Element element = box.getElement();
		ReplacedElement result = controls.get(element);
		if (result == null) {
			result = createConsoleReplacedElement(c, box, uac, cssWidth,
					cssHeight);
			controls.put(element, result);
		}
		if (result != null) {
			updateReplacedElement(result, c, box, uac, cssWidth, cssHeight);
		}
		return result;
	}

	protected ReplacedElement createConsoleReplacedElement(LayoutContext c,
			BlockBox box, UserAgentCallback uac, int cssWidth, int cssHeight) {
		SWTFormControl swtControl = createSWTFormControl(box.getElement());
		return (swtControl == null) ? null : new FormControlReplacementElement(
				swtControl);
	}

	protected SWTFormControl createSWTFormControl(Element element) {
		return new ConsoleSWTFormControl(createSWTControl(element));
	}

	protected void updateReplacedElement(ReplacedElement element,
			LayoutContext c, BlockBox box, UserAgentCallback uac, int cssWidth,
			int cssHeight) {

		if (element instanceof FormControlReplacementElement) {
			((FormControlReplacementElement) element).calculateSize(c, box
					.getStyle(), cssWidth, cssHeight);
		}
	}

	@Override
	public void remove(Element e) {
		super.remove(e);
		ReplacedElement replacedElement = controls.remove(e);
		dispose(replacedElement);
	}

	@Override
	public void reset() {
		super.reset();
		for (Iterator<ReplacedElement> iter = controls.values().iterator(); iter
				.hasNext();) {
			ReplacedElement replacedElement = iter.next();
			dispose(replacedElement);
		}
		controls.clear();
	}

	protected void dispose(ReplacedElement element) {
		SWTFormControl control = getSWTFormControl(element);
		if (control != null) {
			control.dispose();
		}
	}

	protected SWTFormControl getSWTFormControl(ReplacedElement element) {
		if (!(element instanceof FormControlReplacementElement)) {
			return null;
		}
		return ((FormControlReplacementElement) element).getControl();
	}

	protected Control createSWTControl(Element element) {
		return swtControlFactory.create(parent, element);
	}
}