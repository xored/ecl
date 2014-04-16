package org.eclipse.ecl.console.factories;

import org.eclipse.ecl.console.Console;
import org.eclipse.ecl.console.view.View;
import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.ScrollBar;
import org.eclipse.swt.widgets.Text;
import org.w3c.dom.Element;
import org.xhtmlrenderer.event.DocumentListener;
import org.xhtmlrenderer.swt.BasicRenderer;

public class SWTControlFactory implements ISWTControlFactory {

	private static final String PROMT = "promt";
	
	private final Console console = Console.getInstance();
	private ContentProposalAdapter proposals;

	@Override
	public Control create(Composite parent, Element element) {
		String type = element.getAttribute("type");
		if (PROMT.equalsIgnoreCase(type)) {
			return createPromt(parent, element);
		}
		return null;
	}

	protected Control createPromt(Composite parent, Element element) {
		Text result = new Text(parent, SWT.NONE);
		initFont(result);

		BasicRenderer renderer = (BasicRenderer) parent;
		DocumentListener docListener = new RendererDocumentListener(result, renderer);
		KeyListener keyListener = new PromtKeyListener();
		ModifyListener modifyListener = new PromtModifyListener();
		
		renderer.addDocumentListener(docListener);
		result.addKeyListener(keyListener);
		result.addModifyListener(modifyListener);
		result.addDisposeListener(new PromtDisposeListener(result, renderer, modifyListener, keyListener, docListener));
		
		proposals = new ContentProposalAdapter(result, new TextContentAdapter(), console.getContentProposalProvider(), createKeyStroke("Ctrl+Space"), null);
		proposals.setProposalAcceptanceStyle(ContentProposalAdapter.PROPOSAL_REPLACE);

		return result;
	}

	protected void initFont(Text ctrl) {
		Font mainFont = JFaceResources.getFontRegistry().get(View.MAIN_FONT_ID);
		ctrl.setFont(mainFont);
		Color mainFgColor = JFaceResources.getColorRegistry().get(
				View.MAIN_FG_COLOR_ID);
		ctrl.setForeground(mainFgColor);
		Color mainBgColor = JFaceResources.getColorRegistry().get(
				View.MAIN_BG_COLOR_ID);
		ctrl.setBackground(mainBgColor);
		// ctrl.setBackground(new Color(null, 255, 180, 180));
	}

	protected void sendMessage(String message) {
		console.send(message);
	}
	
	private static KeyStroke createKeyStroke(final String string) {
		try {
			return KeyStroke.getInstance(string);
		} catch (final ParseException exception) {
			return null;
		}
	}

	// ///////////////////////////////////////////////////////////////////////
	//
	// Promt modify listener
	//
	// ///////////////////////////////////////////////////////////////////////
	class PromtModifyListener implements ModifyListener {
		@Override
		public void modifyText(ModifyEvent e) {
		}
	}

	// ///////////////////////////////////////////////////////////////////////
	//
	// Promt key listener
	//
	// ///////////////////////////////////////////////////////////////////////
	class PromtKeyListener extends KeyAdapter {
		class ParseData {
			int script;
		}

		@Override
		public void keyPressed(KeyEvent e) {
			Text ctrl = (Text) e.getSource();
			switch (e.keyCode) {
			case SWT.ARROW_UP:
				setCommand(ctrl, console.getPrevCommand());
				break;
			case SWT.ARROW_DOWN:
				setCommand(ctrl, console.getNextCommand());
				break;
			case SWT.CR:
				ParseData data = parse(ctrl.getText());
				if (data.script > 0) {
					// doResize(ctrl);
				} else if (!proposals.isProposalPopupOpen()) {
					doSend(ctrl);
				}
				break;
			// Don't set e.doit in false
			default:
				return;
			}

			e.doit = false;
			return;

		}

		protected void setCommand(Text ctrl, String cmd) {
			ctrl.setText(cmd);
			ctrl.setSelection(cmd.length());
		}

		protected ParseData parse(String text) {
			ParseData result = new ParseData();
			for (int index = 0; index < text.length(); index++) {
				char symbol = text.charAt(index);
				if (symbol == '{') {
					result.script++;
				} else if (symbol == '}') {
					result.script--;
				}
			}
			return result;
		}

		protected void doSend(Text ctrl) {
			sendMessage(ctrl.getText());
			// In process of invoke <code>sendMessage(...)</code>,
			// <code>ctrl</code> can disposed from other thread.
			try {
				ctrl.setText("");
			} catch (SWTException swtEx) {
				if (swtEx.code != SWT.ERROR_WIDGET_DISPOSED) {
					throw new RuntimeException(swtEx);
				}
			}
		}
	}

	// ///////////////////////////////////////////////////////////////////////
	//
	// Promt dispose listener
	//
	// ///////////////////////////////////////////////////////////////////////
	class PromtDisposeListener implements DisposeListener {

		private Text ctrl;
		private BasicRenderer renderer;
		private ModifyListener modifyListener;
		private KeyListener keyListener;
		private DocumentListener docListener;

		public PromtDisposeListener(Text ctrl, BasicRenderer renderer,
				ModifyListener modifyListener, KeyListener keyListener,
				DocumentListener docListener) {
			super();
			this.ctrl = ctrl;
			this.renderer = renderer;
			this.keyListener = keyListener;
			this.docListener = docListener;
			this.modifyListener = modifyListener;
		}

		@Override
		public void widgetDisposed(DisposeEvent e) {
			ctrl.removeModifyListener(modifyListener);
			ctrl.removeKeyListener(keyListener);
			renderer.removeDocumentListener(docListener);
		}
	}

	// ///////////////////////////////////////////////////////////////////////
	//
	// Renderer document listener
	//
	// ///////////////////////////////////////////////////////////////////////
	class RendererDocumentListener implements DocumentListener {

		private Text ctrl;
		private BasicRenderer renderer;

		public RendererDocumentListener(Text ctrl, BasicRenderer renderer) {
			super();
			this.ctrl = ctrl;
			this.renderer = renderer;
		}

		@Override
		public void documentLoaded() {
			ctrl.setFocus();
			ScrollBar scroll = renderer.getVerticalBar();
			if (scroll.isVisible()) {
				Point size = renderer.getScreenSize();
				renderer.setOrigin(new Point(0, scroll.getMaximum() - size.y));
			}
		}

		@Override
		public void documentStarted() {
		}

		@Override
		public void onLayoutException(Throwable t) {
		}

		@Override
		public void onRenderException(Throwable t) {
		}
	}
}
