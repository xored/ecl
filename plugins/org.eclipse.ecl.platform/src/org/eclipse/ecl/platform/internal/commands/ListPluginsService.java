package org.eclipse.ecl.platform.internal.commands;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.platform.commands.ListPlugins;
import org.eclipse.ecl.platform.internal.PlatformPlugin;
import org.eclipse.ecl.platform.objects.ObjectsFactory;
import org.eclipse.ecl.platform.objects.Plugin;
import org.eclipse.ecl.platform.objects.PluginState;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.emf.common.util.EList;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.osgi.service.resolver.BundleSpecification;
import org.eclipse.osgi.service.resolver.ImportPackageSpecification;
import org.eclipse.osgi.service.resolver.PlatformAdmin;
import org.eclipse.osgi.service.resolver.State;
import org.osgi.framework.Bundle;

public class ListPluginsService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		ListPlugins cmd = (ListPlugins) command;
		boolean includeDeps = cmd.isIncludeDependencies();
		State platformState = includeDeps ? Platform.getPlatformAdmin().getState() : null;		
		
		for (Bundle bundle : PlatformPlugin.getDefault().getBundles()) {
			Plugin plugin = ObjectsFactory.eINSTANCE.createPlugin();
			plugin.setId(bundle.getSymbolicName());
			plugin.setVersion(bundle.getVersion().toString());
			plugin.setName(bundle.getHeaders().get("Bundle-Name"));
			PluginState state = pluginStateLookup.get(bundle.getState());
			if (state != null) {
				plugin.setState(state);
			}
			
			if (includeDeps) {
				platformState = Platform.getPlatformAdmin().getState();
				BundleDescription bundleDesc = platformState.getBundle(bundle.getBundleId());
				
				ImportPackageSpecification[] imports = bundleDesc.getImportPackages();
				EList<String> eimports = plugin.getImportedPackages();
				for (ImportPackageSpecification p : imports) {
					eimports.add(p.getName());
				}
				
				BundleSpecification[] required = bundleDesc.getRequiredBundles();
				EList<String> erequired = plugin.getRequiredBundles();
				for (BundleSpecification b : required) {
					erequired.add(b.getName());
				}
			}
			
			context.getOutput().write(plugin);
		}
		context.getOutput().close(Status.OK_STATUS);
		return Status.OK_STATUS;
	}

	private static final Map<Integer, PluginState> pluginStateLookup = new HashMap<Integer, PluginState>();
	static {
		pluginStateLookup.put(Bundle.UNINSTALLED, PluginState.UNINSTALLED);
		pluginStateLookup.put(Bundle.INSTALLED, PluginState.INSTALLED);
		pluginStateLookup.put(Bundle.RESOLVED, PluginState.RESOLVED);
		pluginStateLookup.put(Bundle.STARTING, PluginState.STARTING);
		pluginStateLookup.put(Bundle.STOPPING, PluginState.STOPPING);
		pluginStateLookup.put(Bundle.ACTIVE, PluginState.ACTIVE);
	}

}
