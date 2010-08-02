package org.eclipse.dltk.tcl.ui.tests.ecl.internal.dltktest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.CreateProject;
import org.eclipse.dltk.tcl.ui.tests.ecl.dltktest.DLTKTestPackage;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class CreateProjectService implements ICommandService {
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		CreateProject cp = (CreateProject) command;
		try {
			String name = cp.getName();
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IWorkspaceRoot root = workspace.getRoot();
			if (cp.eIsSet(DLTKTestPackage.eINSTANCE.getCreateProject_Source())) {
				String source = cp.getSource();
				String target = root.getLocation().toString() + File.separator
						+ name;
				File sourceFile = new File(source);
				File targetFile = new File(target);
				if (!sourceFile.exists()) {
					return new Status(IStatus.ERROR, DLTKTestUtils.PLUGIN_ID,
							"File \"" + source + "\" is not found");
				}
				copyDir(sourceFile, targetFile);
			}
			final IProject project = root.getProject(name);
			IWorkspaceRunnable create = new IWorkspaceRunnable() {
				public void run(IProgressMonitor monitor) throws CoreException {
					project.create(null);
					project.open(null);
				}
			};

			workspace.run(create, null);
			DLTKCore.create(project);
			return Status.OK_STATUS;
		} catch (IOException e) {
			return new Status(IStatus.ERROR, DLTKTestUtils.PLUGIN_ID, e
					.getMessage(), e);
		}

	}

	protected void copyDir(File source, File target) throws IOException {
		if (!target.exists()) {
			target.mkdirs();
		}
		File[] files = source.listFiles();
		if (files == null)
			return;
		for (int i = 0; i < files.length; i++) {
			File sourceChild = files[i];
			String name = sourceChild.getName();
			if (name.equals("CVS") || name.equals(".svn"))
				continue;
			File targetChild = new File(target, name);
			if (sourceChild.isDirectory()) {
				copyDir(sourceChild, targetChild);
			} else {
				copyFile(sourceChild, targetChild);
			}
		}
	}

	public void copyFile(File src, File dest) throws IOException {
		InputStream in = null;
		OutputStream out = null;
		byte[] buffer = new byte[12 * 1024];
		int read;

		try {
			in = new FileInputStream(src);

			try {
				out = new FileOutputStream(dest);

				while ((read = in.read(buffer)) != -1) {
					out.write(buffer, 0, read);
				}
			} finally {
				if (out != null) {
					out.close();
				}
			}
		} finally {
			if (in != null) {
				in.close();
			}
		}
	}
}
