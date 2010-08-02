package org.eclipse.dltk.tcl.ui.tests.ecl.internal.dltktest;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.DLTKLanguageManager;
import org.eclipse.dltk.core.IDLTKLanguageToolkit;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.launching.ScriptRuntime;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

public class DLTKTestUtils {
	public static final String PLUGIN_ID = "org.eclipse.dltk.tcl.ui.tests.ecl";

	public static IProject getProject(String name) {
		if (name == null)
			return null;
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(name);
		return project;
	}

	public static IInterpreterInstall getInterpreter(String projectName)
			throws Exception {
		IProject project = DLTKTestUtils.getProject(projectName);
		if (project == null)
			throw new Exception("Project \"" + projectName + "\" is not found");
		IScriptProject tclProject = DLTKCore.create(project);
		IInterpreterInstall interpreter = ScriptRuntime
				.getInterpreterInstall(tclProject);
		return interpreter;
	}

	public static String getPerspectiveId(final String name) {
		if (name == null)
			return null;
		IConfigurationElement[] configs = Platform.getExtensionRegistry()
				.getConfigurationElementsFor("org.eclipse.ui.perspectives");
		for (IConfigurationElement config : configs) {
			if (name.equals(config.getAttribute("name"))) {
				return config.getAttribute("id");
			}
		}
		return null;
	}

	public static String getNatureId(final String name) {
		if (name == null)
			return null;
		for (IDLTKLanguageToolkit toolkit : DLTKLanguageManager
				.getLanguageToolkits()) {
			if (name.equals(toolkit.getLanguageName())) {
				return toolkit.getNatureId();
			}
		}
		return null;
	}

	public static IViewReference findViewWithId(String id) {
		if (id == null)
			return null;
		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		IViewReference[] references = page.getViewReferences();
		for (IViewReference reference : references) {
			if (id.equals(reference.getId())) {
				return reference;
			}
		}
		return null;
	}
}
