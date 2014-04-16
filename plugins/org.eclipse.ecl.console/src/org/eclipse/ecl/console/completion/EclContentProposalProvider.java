package org.eclipse.ecl.console.completion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.fieldassist.ContentProposal;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalProvider;

public class EclContentProposalProvider implements IContentProposalProvider {
	private final Map<String, List<String>> args = new HashMap<String, List<String>>();
	private final List<String> names = new ArrayList<String>();
	
	public EclContentProposalProvider() {
		this(Collections.<EClass>emptyList());
	}
	
	public EclContentProposalProvider(final List<EClass> classes) {
		swap(classes);
	}
	
	public void swap(final List<EClass> values) {
		names.clear();
		args.clear();
		
		for (final EClass clazz : values) {
			args.put(getCommandName(clazz), getCommandArgs(clazz));
			names.add(getCommandName(clazz));
		}
	}

	@Override
	public IContentProposal[] getProposals(final String contents, final int position) {
		final String command = getCommandAtPosition(contents, position);
		
		if (command != null) {
			return getArgsProposals(command, contents, position);
		}
		
		return getCommandsProposals(contents, position);
	}
	
	private IContentProposal[] getCommandsProposals(final String contents, final int position) {
		final int start = findWordStartPosition(contents, position);
		final int end = findWordEndPosition(contents, position);
		
		final String prefix = contents.substring(start, position);
		final List<IContentProposal> proposals = new ArrayList<IContentProposal>();
		
		for (final String name : names) {
			if (isSuggestionValid(name, prefix)) {
				final String content = contents.substring(0, start) + name + contents.substring(end);
				final int cursor = start + name.length();
				
				proposals.add(new ContentProposal(content, name, null, cursor));
			}
		}
		
		final IContentProposal[] result = new IContentProposal[proposals.size()];
		
		Arrays.sort(proposals.toArray(result), new Comparator<IContentProposal>() {
			@Override
			public int compare(final IContentProposal first, final IContentProposal second) {
				return first.getLabel().compareToIgnoreCase(second.getLabel());
			}
		});
		
		return result;
	}
	
	private IContentProposal[] getArgsProposals(final String command, final String contents, final int position) {
		return new IContentProposal[0];
	}
	
	private boolean isSuggestionValid(final String suggestion, final String query) {
		return suggestion.toLowerCase().startsWith(query.toLowerCase());
	}
	
	private String getCommandAtPosition(final String contents, final int position) {
		return null;
	}
	
	private int findWordStartPosition(final String contents, final int position) {
		for (int i = position - 1; i >= 0; i--) {
			if (!Character.isJavaIdentifierStart(contents.charAt(i)) && contents.charAt(i) != '-') {
				return i + 1;
			}
		}
		
		return 0;
	}
	
	private int findWordEndPosition(final String contents, final int position) {
		for (int i = position; i < contents.length(); i++) {
			if (!Character.isJavaIdentifierPart(contents.charAt(i)) && contents.charAt(i) != '-') {
				return i;
			}
		}
		return contents.length();
	}
	
	private String getCommandName(final EClass clazz) {
		return CoreUtils.getScriptletNameByClass(clazz);
	}
	
	private List<String> getCommandArgs(final EClass clazz) {
		final List<String> result = new ArrayList<String>();
		
		for (final EAttribute attribute : clazz.getEAttributes()) {
			result.add(attribute.getName());
		}
		
		for (final EReference reference : clazz.getEReferences()) {
			result.add(reference.getName());
		}
		
		return result;
	}
}
