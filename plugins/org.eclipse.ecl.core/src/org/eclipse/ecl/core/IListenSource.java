package org.eclipse.ecl.core;

import java.util.List;

public interface IListenSource {

	Object begin();

	List<Object> finish(Object data);

}
