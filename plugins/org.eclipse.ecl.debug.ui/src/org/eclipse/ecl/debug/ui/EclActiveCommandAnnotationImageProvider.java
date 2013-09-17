/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.ecl.debug.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.texteditor.IAnnotationImageProvider;

public class EclActiveCommandAnnotationImageProvider implements IAnnotationImageProvider {

	public Image getManagedImage(Annotation annotation) {
		return null;
	}

	public String getImageDescriptorId(Annotation annotation) {
		return null;
	}
	public ImageDescriptor getImageDescriptor(String imageDescritporId) {
		return null;
	}
	
}
