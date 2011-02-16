/*******************************************************************************
 * Copyright (c) 2008 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Andrey Platov)
 *******************************************************************************/

package org.eclipse.ecl.internal.core;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.runtime.IEMFConverter;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;

@SuppressWarnings("unchecked")
public enum EMFConverterManager implements IEMFConverter<Object, EObject> {
	INSTANCE;

	private final static String EXTPT = "org.eclipse.ecl.core.emfConverters";
	private final static String CLASS_ATTR = "class";

	private Map<Class<?>, IEMFConverter<?, ?>> byJavaClass;
	private Map<EClass, IEMFConverter<?, ?>> byEClass;

	private EMFConverterManager() {
		byJavaClass = new HashMap<Class<?>, IEMFConverter<?, ?>>();
		byEClass = new HashMap<EClass, IEMFConverter<?, ?>>();
		IConfigurationElement[] configs = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(EXTPT);
		for (IConfigurationElement config : configs) {
			try {
				Object object = config.createExecutableExtension(CLASS_ATTR);
				if (object instanceof IEMFConverter) {
					IEMFConverter<?, ?> converter = (IEMFConverter<?, ?>) object;

					Class<?> javaClass = converter.getJavaClass();
					byJavaClass.put(javaClass, converter);
					EClass eClass = converter.getEClass();
					byEClass.put(eClass, converter);
				}
			} catch (CoreException e) {
				CorePlugin.getDefault().getLog().log(e.getStatus());
			}
		}
	}

	public EObject toEObject(Object object) throws CoreException {
		@SuppressWarnings("rawtypes")
		IEMFConverter serializer = byJavaClass.get(object.getClass());
		if (serializer == null) {
			throw new CoreException(new Status(IStatus.ERROR,
					CorePlugin.PLUGIN_ID,
					"Serialization is not supported for instances of: "
							+ object.getClass().getName()));
		}
		return serializer.toEObject(object);
	}

	public Object fromEObject(EObject eObject) throws CoreException {
		@SuppressWarnings("rawtypes")
		IEMFConverter deserializer = byEClass.get(eObject.eClass());
		if (deserializer == null) {
			throw new CoreException(new Status(IStatus.ERROR,
					CorePlugin.PLUGIN_ID,
					"Deserialization is not supported for instances of: "
							+ eObject.eClass().getName()));
		}
		return deserializer.fromEObject(eObject);
	}

	public Class<Object> getJavaClass() {
		return Object.class;
	}

	public EClass getEClass() {
		return EcorePackage.Literals.EOBJECT;
	}
}
