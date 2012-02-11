/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.platform.commands.impl;

import org.eclipse.ecl.platform.commands.*;

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
			CommandsFactory theCommandsFactory = (CommandsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/ecl/platform/commands.ecore"); 
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
			case CommandsPackage.LIST_PLUGINS: return createListPlugins();
			case CommandsPackage.LIST_FEATURES: return createListFeatures();
			case CommandsPackage.LIST_REPOSITORIES: return createListRepositories();
			case CommandsPackage.ADD_REPOSITORY: return createAddRepository();
			case CommandsPackage.REMOVE_REPOSITORY: return createRemoveRepository();
			case CommandsPackage.UPDATE_FEATURE: return createUpdateFeature();
			case CommandsPackage.UPDATE_ALL: return createUpdateAll();
			case CommandsPackage.PRINT: return createPrint();
			case CommandsPackage.SORT_BY: return createSortBy();
			case CommandsPackage.LIST_INSTALL_UNITS: return createListInstallUnits();
			case CommandsPackage.GET_LOG: return createGetLog();
			case CommandsPackage.LOG: return createLog();
			case CommandsPackage.ECHO: return createEcho();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListPlugins createListPlugins() {
		ListPluginsImpl listPlugins = new ListPluginsImpl();
		return listPlugins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListFeatures createListFeatures() {
		ListFeaturesImpl listFeatures = new ListFeaturesImpl();
		return listFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListRepositories createListRepositories() {
		ListRepositoriesImpl listRepositories = new ListRepositoriesImpl();
		return listRepositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddRepository createAddRepository() {
		AddRepositoryImpl addRepository = new AddRepositoryImpl();
		return addRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveRepository createRemoveRepository() {
		RemoveRepositoryImpl removeRepository = new RemoveRepositoryImpl();
		return removeRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateFeature createUpdateFeature() {
		UpdateFeatureImpl updateFeature = new UpdateFeatureImpl();
		return updateFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateAll createUpdateAll() {
		UpdateAllImpl updateAll = new UpdateAllImpl();
		return updateAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Print createPrint() {
		PrintImpl print = new PrintImpl();
		return print;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortBy createSortBy() {
		SortByImpl sortBy = new SortByImpl();
		return sortBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListInstallUnits createListInstallUnits() {
		ListInstallUnitsImpl listInstallUnits = new ListInstallUnitsImpl();
		return listInstallUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetLog createGetLog() {
		GetLogImpl getLog = new GetLogImpl();
		return getLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Log createLog() {
		LogImpl log = new LogImpl();
		return log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Echo createEcho() {
		EchoImpl echo = new EchoImpl();
		return echo;
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
