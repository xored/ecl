package org.eclipse.ecl.internal.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;

public class EMFStreamPipe implements IPipe {

	private final InputStream in;
	private final OutputStream out;

	public EMFStreamPipe(InputStream in, OutputStream out) {
		this.in = in;
		this.out = out;
	}

	public IPipe close(IStatus status) throws CoreException {
		try {
			// TODO
			// ProcessStatus ps = CoreFactory.eINSTANCE.createProcessStatus();
			// ps.setCode(status.getCode());
			// ps.setMessage(status.getMessage());
			// ps.setPluginId(status.getPlugin());
			// ps.setSeverity(status.getSeverity());
			// write(ps);
			in.close();
			out.close();
		} catch (IOException e) {
			throw new CoreException(new Status(IStatus.ERROR,
					CorePlugin.PLUGIN_ID, e.getMessage(), e));
		}
		return this;
	}

	public Object take(long timeout) throws CoreException {
		Resource r = new BinaryResourceImpl();
		try {
			r.load(in, null);
			return r.getContents().get(0);
		} catch (IOException e) {
			throw new CoreException(new Status(IStatus.ERROR,
					CorePlugin.PLUGIN_ID, e.getMessage(), e));
		}
	}

	public IPipe write(Object object) throws CoreException {
		Resource r = new BinaryResourceImpl();
		r.getContents().add((EObject) object);
		try {
			r.save(out, null);
		} catch (IOException e) {
			throw new CoreException(new Status(IStatus.ERROR,
					CorePlugin.PLUGIN_ID, e.getMessage(), e));
		}
		return this;
	}

}
