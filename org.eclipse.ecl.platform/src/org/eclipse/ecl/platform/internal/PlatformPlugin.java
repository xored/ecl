package org.eclipse.ecl.platform.internal;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.engine.IProfileRegistry;
import org.eclipse.equinox.p2.operations.ProvisioningSession;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepositoryManager;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager;
import org.eclipse.pde.internal.core.PDECore;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

@SuppressWarnings("restriction")
public class PlatformPlugin extends Plugin {
	public static final String PLUGIN_ID = "org.eclipse.ecl.platform";

	private static PlatformPlugin plugin;

	public static PlatformPlugin getDefault() {
		return plugin;
	}

	private BundleContext bundleContext;

	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		bundleContext = context;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		bundleContext = null;
		super.stop(context);
	}

	public Bundle[] getBundles() {
		return bundleContext == null ? new Bundle[0] : bundleContext
				.getBundles();
	}

	public static IStatus err(String message, Throwable t) {
		return new Status(IStatus.ERROR, PLUGIN_ID, message, t);
	}

	public static IProvisioningAgent getProvisioningAgent() {
		return (IProvisioningAgent) PDECore.getDefault().acquireService(
				IProvisioningAgent.SERVICE_NAME);
	}

	public static IMetadataRepositoryManager getMetadataMgr() {
		return (IMetadataRepositoryManager) getProvisioningAgent().getService(
				IMetadataRepositoryManager.SERVICE_NAME);
	}

	public static IArtifactRepositoryManager getArtifactMgr() {
		return (IArtifactRepositoryManager) getProvisioningAgent().getService(
				IArtifactRepositoryManager.SERVICE_NAME);
	}

	public static ProvisioningSession createProvisioningSession() {
		return new ProvisioningSession(getProvisioningAgent());
	}

	public static IProfileRegistry getProfileRegistry() {
		return (IProfileRegistry) getProvisioningAgent().getService(
				IProfileRegistry.SERVICE_NAME);
	}
}
