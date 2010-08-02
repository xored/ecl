package org.eclipse.ecl.core.model;

import java.net.URI;
import java.util.List;

public interface IModel {

	String getSchema();

	Any getParent(Any parent);
	
	List<Any> getChildren(Any object);

	Ref getReference(Any object);
	
	Any resolve(Ref ref);
}
