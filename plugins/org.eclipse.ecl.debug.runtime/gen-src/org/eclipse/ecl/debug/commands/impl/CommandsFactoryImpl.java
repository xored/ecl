/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.debug.commands.impl;

import java.util.Map;
import org.eclipse.ecl.debug.commands.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommandsFactoryImpl extends EFactoryImpl implements CommandsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommandsFactory init() {
		try {
			CommandsFactory theCommandsFactory = (CommandsFactory)EPackage.Registry.INSTANCE.getEFactory(CommandsPackage.eNS_URI);
			if (theCommandsFactory != null) {
				return theCommandsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommandsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CommandsPackage.START_SERVER: return createStartServer();
			case CommandsPackage.STOP_SERVER: return createStopServer();
			case CommandsPackage.SERVER_INFO: return createServerInfo();
			case CommandsPackage.DEBUG_SCRIPT: return createDebugScript();
			case CommandsPackage.DEBUG_COMMAND: return createDebugCommand();
			case CommandsPackage.PATHS_MAP: return (EObject)createPathsMap();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartServer createStartServer() {
		StartServerImpl startServer = new StartServerImpl();
		return startServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopServer createStopServer() {
		StopServerImpl stopServer = new StopServerImpl();
		return stopServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerInfo createServerInfo() {
		ServerInfoImpl serverInfo = new ServerInfoImpl();
		return serverInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DebugScript createDebugScript() {
		DebugScriptImpl debugScript = new DebugScriptImpl();
		return debugScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DebugCommand createDebugCommand() {
		DebugCommandImpl debugCommand = new DebugCommandImpl();
		return debugCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createPathsMap() {
		PathsMapImpl pathsMap = new PathsMapImpl();
		return pathsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandsPackage getCommandsPackage() {
		return (CommandsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommandsPackage getPackage() {
		return CommandsPackage.eINSTANCE;
	}

} //CommandsFactoryImpl
