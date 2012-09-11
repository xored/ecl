package org.eclipse.ecl.doc;

import java.io.IOException;

public interface IEclDocProvider {

	void writeEclDoc(EclDocWriter writer) throws IOException;

}
