package org.eclipse.ecl.console;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.runtime.ISession;

public interface IEclProvider {
	
	public interface IEclProviderCallback {
		public void connected(ISession session);
		
		public void failed(CoreException exception);
	}
	
	public void connect(IEclProviderCallback callback);
	
	public void disconnect();
	
}
