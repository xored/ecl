package org.eclipse.ecl.console.view;

import org.eclipse.ecl.console.Console;
import org.eclipse.ecl.console.ConsoleUpdateListener;
import org.eclipse.ecl.console.Content;
import org.eclipse.ecl.console.factories.ConsoleReplacedElementFactory;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.xhtmlrenderer.extend.ReplacedElementFactory;
import org.xhtmlrenderer.simple.SWTXHTMLRenderer;
import org.xhtmlrenderer.simple.xhtml.XhtmlNamespaceHandler;
import org.xhtmlrenderer.swt.BasicRenderer;
import org.xhtmlrenderer.swt.NaiveUserAgent;

public class View extends ViewPart {
	public static final String ID = "org.eclipse.ecl.console.html.ui.view";

	public static final String MAIN_FONT_ID = "org.eclipse.ecl.console.html.ui.defaultFont";
	public static final String MAIN_BG_COLOR_ID = "org.eclipse.ecl.console.html.ui.mainBgColor";
	public static final String MAIN_FG_COLOR_ID = "org.eclipse.ecl.console.html.ui.mainFgColor";

	private static final String DOC_HEADER_START = "<div ";
	private static final String DOC_HEADER_END = ">";
	private static final String DOC_FOOTER = "</div>";

	/**
	 * Reserve 768 pixels.
	 */
	private static final int MAX_HEIGHT = 32000;

	private ConsoleUpdateListener listener;

	private SWTXHTMLRenderer renderer;

	public View() {
		super();
	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout());
		renderer = new SWTXHTMLRenderer(parent, SWT.BORDER, new UserAgent(
				parent.getDisplay()));
		renderer.getSharedContext().setReplacedElementFactory(
				createReplacedElementFactory(renderer));

		Console console = Console.getInstance();
		listener = new ConsoleUpdateListener() {
			@Override
			public void update(Console console) {
				renderer.setDocumentFromString(getContent(console), "",
						new XhtmlNamespaceHandler());
				Point size = renderer.computeSize(SWT.DEFAULT, SWT.DEFAULT,
						false);
				if (size.x == 0) {
					return;
				}

				Content content = console.getContent();
				content.mark(size.y);
				size = renderer.computeSize(SWT.DEFAULT, SWT.DEFAULT, true);
				if (size.y > MAX_HEIGHT) {
					content.trim(size.y - MAX_HEIGHT);
					renderer.setDocumentFromString(getContent(console), "",
							new XhtmlNamespaceHandler());
				}
			}
		};
		listener.update(console);
		console.addUpdateListener(listener);
	}

	public String getContent(Console console) {
		StringBuffer content = new StringBuffer();
		content.append(console.getHeader());
		content.append(getDocumentHeader());
		content.append(console.getContent().toString());
		content.append(console.getCommandLine());
		content.append(getDocumentFooter());
		content.append(console.getFooter());

		return content.toString();
	}

	protected String getDocumentHeader() {
		return DOC_HEADER_START + getStyle() + DOC_HEADER_END;
	}

	protected String getStyle() {
		Font mainFont = JFaceResources.getFontRegistry().get(MAIN_FONT_ID);
		FontData mainFontData = mainFont.getFontData()[0];
		Color mainBgColor = JFaceResources.getColorRegistry().get(
				MAIN_BG_COLOR_ID);
		Color mainFgColor = JFaceResources.getColorRegistry().get(
				MAIN_FG_COLOR_ID);

		StringBuffer result = new StringBuffer();
		result.append("style='font-family:");
		result.append(mainFontData.getName());
		if ((mainFontData.getStyle() & SWT.BOLD) != 0) {
			result.append(";font-weight:bold");
		}
		if ((mainFontData.getStyle() & SWT.ITALIC) != 0) {
			result.append(";font-style:italic");
		}
		result.append(";font-size:");
		result.append(mainFontData.getHeight());
		result.append("pt;color:");
		result.append(colorString(mainFgColor));
		result.append(";background:");
		result.append(colorString(mainBgColor));
		result.append("'");

		return result.toString();
	}

	protected String getDocumentFooter() {
		return DOC_FOOTER;
	}

	private String colorString(Color color) {
		String red = byte2HexString(color.getRed());
		String green = byte2HexString(color.getGreen());
		String blue = byte2HexString(color.getBlue());

		return "#" + red + green + blue;
	}

	protected String byte2HexString(int value) {
		String result = Integer.toHexString(value);
		if (result.length() < 2)
			result = "0" + result;
		return result;
	}

	@Override
	public void setFocus() {
		renderer.setFocus();
	}

	public SWTXHTMLRenderer getRenderer() {
		return renderer;
	}

	protected ReplacedElementFactory createReplacedElementFactory(
			BasicRenderer parent) {
		return new ConsoleReplacedElementFactory(parent);
	}

	@Override
	public void dispose() {
		Console.getInstance().removeUpdateListener(listener);
		super.dispose();
	}

	// ///////////////////////////////////////////////////////////////////
	//
	//
	//
	// ///////////////////////////////////////////////////////////////////
	class UserAgent extends NaiveUserAgent {

		public UserAgent(Device device) {
			super(device);
		}

		@Override
		public String resolveURI(String uri) {
			return uri;
		}
	}
}
