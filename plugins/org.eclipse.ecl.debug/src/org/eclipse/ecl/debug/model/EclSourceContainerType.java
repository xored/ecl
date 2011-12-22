/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Yuri Strot)
 *******************************************************************************/
package org.eclipse.ecl.debug.model;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.sourcelookup.ISourceContainer;
import org.eclipse.debug.core.sourcelookup.containers.AbstractSourceContainerTypeDelegate;
import org.eclipse.ecl.debug.EclDebugConstants;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class EclSourceContainerType extends AbstractSourceContainerTypeDelegate {

	public static final String ID = EclDebugConstants.PLUGIN_ID
			+ ".containerType.workspace";

	public ISourceContainer createSourceContainer(String memento)
			throws CoreException {
		Node node = parseDocument(memento);
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			Element element = (Element) node;
			if ("ecl".equals(element.getNodeName())) { //$NON-NLS-1$
				return new EclSourceContainer();
			}
			abort("Unable to restore ECL source lookup entry - expecting ecl element.",
					null);
		}
		abort("Unable to restore ECL source lookup entry - invalid memento.",
				null);
		return null;
	}

	public String getMemento(ISourceContainer container) throws CoreException {
		Document document = newDocument();
		Element element = document.createElement("ecl"); //$NON-NLS-1$
		document.appendChild(element);
		return serializeDocument(document);
	}
}