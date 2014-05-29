package org.eclipse.ecl.filesystem.internal.commands;

import static java.util.Arrays.asList;
import static org.eclipse.ecl.filesystem.EclFilesystemPlugin.createError;
import static org.eclipse.ecl.runtime.BoxedValues.unbox;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.Get;
import org.eclipse.ecl.dispatch.IScriptletExtension;
import org.eclipse.ecl.filesystem.File;
import org.eclipse.ecl.filesystem.FilesystemFactory;
import org.eclipse.ecl.runtime.SingleCommandService;

public class GetFromFileService extends SingleCommandService<Get> implements IScriptletExtension {

	public GetFromFileService() {
		super(Get.class);
	}

	private final static Set<String> SUPPORTED_KEYS = Collections.unmodifiableSet(new HashSet<String>(asList("exists", "children", "name", "isDirectory")));
	
	@Override
	public boolean canHandle(Command command) {
		if (!(command instanceof Get))
			return false;
		Get get = (Get) command;
		if (!(get.getInput() instanceof File))
			return false;
		return SUPPORTED_KEYS.contains(unbox(get.getKey()));
	}

	@Override
	protected Object serviceTyped(Get command) throws InterruptedException,
			CoreException {
		String key = (String) unbox(command.getKey());
		String uriString = ((File)command.getInput()).getUri();
		URI input = URI.create(uriString);
		if (key.equals("exists"))
			return handleExists(input);
		if (key.equals("children")) {
			try {
				return handleChildren(input);
			} catch (MalformedURLException e) {
				throw new CoreException(createError("Can't create child URI", e));
			}
		}
		if (key.equals("name"))
			return handleName(input);
		if (key.equals("isDirectory"))
			return handleIsDirectory(input);
		String message = "Wrong key: " + key;
		throw new CoreException(createError(message));
	}


	private boolean handleIsDirectory(URI input) {
		return URIUtil.toFile(input).isDirectory();
	}

	private List<File> handleChildren(URI input) throws MalformedURLException {
		java.io.File[] files = URIUtil.toFile(input).listFiles();
		if (files == null)
			return Collections.emptyList(); 
		ArrayList<File> rv = new ArrayList<File>();
		for (java.io.File child: files) {
			File item = FilesystemFactory.eINSTANCE.createFile();
			item.setUri(child.toURI().toURL().toExternalForm());
			rv.add(item);
		}
		return rv;
	}

	private Object handleName(URI uri) {
		return URIUtil.lastSegment(uri);
	}

	private boolean handleExists(URI input) {
		return URIUtil.toFile(input).exists();
	}

}
