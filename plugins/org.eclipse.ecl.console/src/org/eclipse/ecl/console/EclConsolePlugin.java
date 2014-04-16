package org.eclipse.ecl.console;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.console.factories.CompositeSWTControlFactory;
import org.eclipse.ecl.console.factories.ISWTControlFactory;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class EclConsolePlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.ecl.console";

	// The shared instance
	private static EclConsolePlugin plugin;

	private static final String SWT_CTRL_FACTORY_EXTENSION_POINT_NAME = PLUGIN_ID + ".swtControlFactory";
	private static ISWTControlFactory swtControlFactory;

	/**
	 * The constructor
	 */
	public EclConsolePlugin() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		swtControlFactory = createSWTControlFactory();
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static EclConsolePlugin getDefault() {
		return plugin;
	}

	public ISWTControlFactory getSWTControlFactory() {
		return swtControlFactory;
	}

	protected ISWTControlFactory createSWTControlFactory() {
		CompositeSWTControlFactory resultFactory = new CompositeSWTControlFactory();

		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint extensionPoint = registry
				.getExtensionPoint(SWT_CTRL_FACTORY_EXTENSION_POINT_NAME);
		IExtension[] extensions = extensionPoint.getExtensions();
		for (int index = 0; index < extensions.length; index++) {
			IExtension extension = extensions[index];
			Bundle bundle = Platform.getBundle(extension.getContributor()
					.getName());

			IConfigurationElement[] elements = extension
					.getConfigurationElements();
			for (int factoryIndex = 0; factoryIndex < elements.length; factoryIndex++) {
				ISWTControlFactory factory = createSWTControlFactory(bundle,
						elements[factoryIndex]);
				if (factory != null) {
					resultFactory.register(factory);
				}
			}
		}

		return resultFactory;
	}

	protected ISWTControlFactory createSWTControlFactory(Bundle bundle,
			IConfigurationElement element) {
		try {
			String className = element.getAttribute("class");
			Class<?> instanceClass = bundle.loadClass(className);
			return (ISWTControlFactory) instanceClass.newInstance();
		} catch (Throwable th) {
			String message = "Can't create SWT Control factory.";
			IStatus status = new Status(IStatus.ERROR, PLUGIN_ID, message, th);
			getLog().log(status);
			return null;
		}
	}
}
