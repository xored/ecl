package org.eclipse.ecl.platform.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IBundleGroup;
import org.eclipse.core.runtime.IBundleGroupProvider;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.platform.objects.Feature;
import org.eclipse.ecl.platform.objects.ObjectsFactory;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class ListFeaturesService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		for(IBundleGroupProvider provider : Platform.getBundleGroupProviders()) {
			for(IBundleGroup group : provider.getBundleGroups()) {
				Feature feature = ObjectsFactory.eINSTANCE.createFeature();
				feature.setId(group.getIdentifier());
				feature.setVersion(group.getVersion());
				feature.setProvider(group.getProviderName());
				feature.setName(group.getName());
				context.getOutput().write(feature);
			}
		}
		context.getOutput().close(Status.OK_STATUS);
		return Status.OK_STATUS;
	}
	
}
