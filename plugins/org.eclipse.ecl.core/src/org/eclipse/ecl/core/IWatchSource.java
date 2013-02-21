package org.eclipse.ecl.core;

import java.util.List;

public interface IWatchSource {

	Object makeSnapshot();

	List<Object> difference(Object snapshotA, Object snapshotB);

}
