/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     xored software, Inc - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecl.internal.core;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.ConvertedToEMFPipe;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;

public class EMFStreamPipe implements IPipe {

	private final DataInputStream in;
	private final DataOutputStream out;

	public EMFStreamPipe(InputStream in, OutputStream out) {
		this.in = new DataInputStream(in);
		this.out = new DataOutputStream(out);
	}

	public IPipe close(IStatus status) throws CoreException {
		try {
			// Ignore status
			in.close();
			out.close();
		} catch (IOException e) {
			throw new CoreException(new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID, e.getMessage(), e));
		}
		return this;
	}

	public Object take(long timeout) throws CoreException {
		Resource r = new BinaryResourceImpl();
		int size = 0;
		byte[] data = null;
		try {
			size = in.readInt();
			if (size <= 0) {
				throw new IOException("Failed to read from stream");
			}
			data = new byte[size];
			in.readFully(data);
			ByteArrayInputStream bin = new ByteArrayInputStream(data);
			r.load(bin, null);
			EObject eObject = r.getContents().get(0);
			if (eObject instanceof ConvertedToEMFPipe) {
				return EMFConverterManager.INSTANCE.fromEObject(((ConvertedToEMFPipe) eObject).getObject());
			} else {
				return eObject;
			}
		} catch (Throwable e) {
			if (!(e instanceof EOFException)) {
				throw new CoreException(new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID, e.getMessage(), e));
			}
			return new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID, "Connection is not Available", e);
		}
	}

	public IPipe write(Object object) throws CoreException {
		EObject eObject;
		if (object instanceof EObject) {
			eObject = (EObject) object;
		} else {
			ConvertedToEMFPipe converted = CoreFactory.eINSTANCE.createConvertedToEMFPipe();
			converted.setObject(EMFConverterManager.INSTANCE.toEObject(object));
			eObject = converted;
		}
		Resource r = new BinaryResourceImpl();
		r.getContents().add(eObject);
		try {
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			Map<String, Object> options = new HashMap<String, Object>();
			r.save(bout, options);
			out.writeInt(bout.size());
			bout.writeTo(out);
		} catch (Throwable e) {
			if (e instanceof SocketException) {
				if (e.getMessage().contains("Connection reset by peer: socket write error")) {
					throw new CoreException(new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID, e.getMessage() + "  ---- "
							+ object));
				}
			}
			throw new CoreException(new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID,
					e.getMessage() + "  ---- " + object, e));
		}
		return this;
	}
}
