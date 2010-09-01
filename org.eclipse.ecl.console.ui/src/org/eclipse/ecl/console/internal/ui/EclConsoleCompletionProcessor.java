package org.eclipse.ecl.console.internal.ui;

import java.io.IOException;
import java.util.List;

import org.eclipse.dltk.console.IScriptConsoleShell;
import org.eclipse.dltk.console.ScriptConsoleCompletionProposal;
import org.eclipse.dltk.console.ui.IScriptConsoleViewer;
import org.eclipse.dltk.console.ui.ScriptConsoleCompletionProcessor;
import org.eclipse.dltk.ui.DLTKPluginImages;
import org.eclipse.ecl.console.ui.EclConsoleUiPlugin;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.TextPresentation;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationPresenter;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.swt.graphics.Image;

public class EclConsoleCompletionProcessor extends
		ScriptConsoleCompletionProcessor {

	protected static class Validator implements IContextInformationValidator,
			IContextInformationPresenter {

		protected int installOffset;

		public boolean isContextInformationValid(int offset) {
			return Math.abs(installOffset - offset) < 5;
		}

		public void install(IContextInformation info, ITextViewer viewer,
				int offset) {
			installOffset = offset;
		}

		public boolean updatePresentation(int documentPosition,
				TextPresentation presentation) {
			return false;
		}
	}

	protected IProposalDecorator decorator = new IProposalDecorator() {
		public String formatProposal(ScriptConsoleCompletionProposal c) {
			return c.getDisplay();
		}

		public Image getImage(ScriptConsoleCompletionProposal c) {
			String type = c.getType();
			if (type.equals("CommandName")) {
				return DLTKPluginImages.get(DLTKPluginImages.IMG_METHOD_PUBLIC);
			}
			if (type.equals("ParamName")) {
				return DLTKPluginImages.get(DLTKPluginImages.IMG_FIELD_PUBLIC);
			}
			return null;
		}
	};

	private IContextInformationValidator validator;

	public EclConsoleCompletionProcessor(IScriptConsoleShell interpreterShell) {
		super(interpreterShell);
	}

	@Override
	public char[] getCompletionProposalAutoActivationCharacters() {
		return new char[] { '-' };
	}

	@Override
	protected ICompletionProposal[] computeCompletionProposalsImpl(
			IScriptConsoleViewer viewer, int offset) {
		try {
			String commandLine = viewer.getCommandLine();
			int cursorPosition = offset - viewer.getCommandLineOffset();
			List<?> list = getInterpreterShell().getCompletions(commandLine,
					cursorPosition);
			List<?> proposals = createProposalsFromString(list, offset,
					decorator);
			return proposals.toArray(new ICompletionProposal[proposals.size()]);
		} catch (IOException e) {
			EclConsoleUiPlugin.logErr(e.getMessage(), e);
			return new ICompletionProposal[] {};
		}
	}

	@Override
	protected IContextInformation[] computeContextInformationImpl(
			ITextViewer viewer, int offset) {
		return null;
	}

	public IContextInformationValidator getContextInformationValidator() {
		if (validator == null) {
			validator = new Validator();
		}
		return validator;
	}

}
