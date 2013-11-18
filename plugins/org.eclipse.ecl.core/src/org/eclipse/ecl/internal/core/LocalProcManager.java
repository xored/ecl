package org.eclipse.ecl.internal.core;

import static java.lang.String.format;
import static org.eclipse.ecl.core.util.EclCommandNameConvention.toScriptletName;
import static org.eclipse.ecl.internal.core.CorePlugin.err;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.core.CorePackage;
import org.eclipse.ecl.core.CreateObject;
import org.eclipse.ecl.core.Declaration;
import org.eclipse.ecl.core.Import;
import org.eclipse.ecl.core.Proc;
import org.eclipse.ecl.core.ProcInstance;
import org.eclipse.ecl.core.Val;
import org.eclipse.ecl.runtime.CoreUtils;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class LocalProcManager {
	private EPackage epackage;
	private Map<String, Proc> declarations = new LinkedHashMap<String, Proc>();
	private Map<String, Import> imports = new LinkedHashMap<String, Import>();

	protected EPackage getPackage() {
		if (epackage == null) {
			epackage = EcoreFactory.eINSTANCE.createEPackage();
			String randomName = UUID.randomUUID().toString();
			epackage.setName(randomName);
			epackage.setNsPrefix(randomName);
			epackage.setNsURI(randomName);
		}
		return epackage;
	}

	public synchronized Iterable<Proc> declarations() {
		return declarations.values();
	}

	public synchronized Iterable<Import> imports() {
		return imports.values();
	}

	public synchronized void addImport(Import imp) throws CoreException {
		EPackage pkg = getPackage();
		String importClassName = importClassName(imp);
		verifyNoImport(importClassName, pkg);

		EClass objectClass = resolveImport(imp);
		if (objectClass == null) {
			throw new CoreException(err(format("Can't find import %s::%s", imp.getPackage(), imp.getName())));
		}

		EClass commandClass = EcoreFactory.eINSTANCE.createEClass();
		commandClass.setName(importClassName);
		commandClass.getESuperTypes().add(CorePackage.Literals.CREATE_OBJECT);
		for (EStructuralFeature feature : objectClass.getEAllStructuralFeatures()) {
			EStructuralFeature featureCopy = EcoreUtil.copy(feature);
			commandClass.getEStructuralFeatures().add(featureCopy);
		}

		pkg.getEClassifiers().add(commandClass);
		imports.put(importClassName, imp);
	}

	public CreateObject createCreateObject(String className) {
		Import imp = imports.get(className);
		if (imp == null) {
			return null;
		}

		EPackage pkg = getPackage();
		EClass createCommandClass = (EClass) pkg.getEClassifier(className);
		CreateObject createCommand = (CreateObject) pkg.getEFactoryInstance().create(createCommandClass);
		createCommand.eSet(CorePackage.Literals.CREATE_OBJECT__TYPE, imp);

		return createCommand;
	}

	public synchronized void declare(Proc proc) throws CoreException {
		verifyInputParamsCount(proc);

		EPackage pkg = getPackage();
		verifyNoSuchProc(proc, pkg);

		EClass eclass = EcoreFactory.eINSTANCE.createEClass();
		eclass.getESuperTypes().add(CorePackage.Literals.PROC_INSTANCE);
		String scriptletName = toScriptletName(proc.getName());
		eclass.setName(scriptletName);

		for (Declaration decl : proc.getVals()) {
			if (!(decl instanceof Val)) {
				continue; // TODO: pipe support
			}

			Val val = (Val) decl;
			EReference reference = EcoreFactory.eINSTANCE.createEReference();
			reference.setName(val.getName());
			reference.setEType(EcorePackage.Literals.EOBJECT);
			reference.setContainment(true);
			if (val.isInput()) {
				EAnnotation inputAnn = EcoreFactory.eINSTANCE
						.createEAnnotation();
				inputAnn.setSource(CoreUtils.INPUT_ANN);
				reference.getEAnnotations().add(inputAnn);
			}

			eclass.getEStructuralFeatures().add(reference);
		}

		pkg.getEClassifiers().add(eclass);

		declarations.put(scriptletName, proc);
	}

	public ProcInstance createCommand(String className) {
		Proc proc = declarations.get(className);
		if (proc == null) {
			return null;
		}

		EPackage pkg = getPackage();
		EClass commandClass = (EClass) pkg.getEClassifier(className);
		ProcInstance command = (ProcInstance) pkg.getEFactoryInstance().create(
				commandClass);

		command.eSet(CorePackage.Literals.PROC_INSTANCE__DEFINITION, proc);

		for (Declaration decl : proc.getVals()) {
			if (!(decl instanceof Val)) {
				continue; // TODO: pipe support
			}

			Val val = (Val) decl;
			if (val.getValue() != null) {
				command.eSet(commandClass.getEStructuralFeature(val.getName()),
						EcoreUtil.copy(val.getValue()));
			}
		}

		return command;
	}

	private static void verifyNoImport(String importClassName, EPackage pkg) throws CoreException {
		if (pkg.getEClassifier(importClassName) != null) {
			throw new CoreException(err(format("import '%s' already exists, use -as param")));
		}
	}

	private static void verifyNoSuchProc(Proc proc, EPackage pkg)
			throws CoreException {
		if (pkg.getEClassifier(toScriptletName(proc.getName())) != null) {
			throw new CoreException(err(format(
					"proc '%s' already declared", proc.getName())));
		}
	}

	private static void verifyInputParamsCount(Proc proc) throws CoreException {
		int inputValCount = 0;
		for (Declaration declaration : proc.getVals()) {
			if (declaration instanceof Val && ((Val) declaration).isInput()) {
				inputValCount++;
			}
		}
		if (inputValCount > 1) {
			throw new CoreException(
					err("Only one parameter can be initialized from input"));
		}
	}

	private static String importClassName(Import imp) {
		return imp.getAs() == null ? imp.getName() : toScriptletName(imp.getAs());
	}

	public static EClass resolveImport(Import imp) {
		EPackage pkg = EPackage.Registry.INSTANCE.getEPackage(imp.getPackage());
		if (pkg == null) {
			return null;
		}

		EClassifier result = pkg.getEClassifier(imp.getName());

		if (!(result instanceof EClass)) {
			return null;
		}
		return (EClass) result;
	}
}
