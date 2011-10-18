package org.eclipse.ecl.platform.util;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ecl.platform.internal.PlatformPlugin;
import org.eclipse.ecl.platform.objects.InstallUnit;
import org.eclipse.ecl.platform.objects.ObjectsFactory;
import org.eclipse.ecl.platform.objects.Repository;
import org.eclipse.ecl.platform.objects.UpdateResult;
import org.eclipse.equinox.p2.engine.IProfile;
import org.eclipse.equinox.p2.engine.IProfileRegistry;
import org.eclipse.equinox.p2.engine.query.UserVisibleRootQuery;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.operations.ProfileModificationJob;
import org.eclipse.equinox.p2.operations.ProvisioningJob;
import org.eclipse.equinox.p2.operations.ProvisioningSession;
import org.eclipse.equinox.p2.operations.Update;
import org.eclipse.equinox.p2.operations.UpdateOperation;
import org.eclipse.equinox.p2.query.IQuery;
import org.eclipse.equinox.p2.query.IQueryResult;
import org.eclipse.equinox.p2.repository.IRepository;
import org.eclipse.equinox.p2.repository.IRepositoryManager;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepositoryManager;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager;

//@SuppressWarnings("restriction")
public class EclPlatformUtil {
	public static InstallUnit[] getInstallUnits() {
		IProfile profile = PlatformPlugin.getProfileRegistry().getProfile(
				IProfileRegistry.SELF);
		if (profile == null)
			return new InstallUnit[0];
		IQuery<IInstallableUnit> query = new UserVisibleRootQuery();
		IQueryResult<IInstallableUnit> queryResult = profile.query(query, null);

		List<InstallUnit> result = new ArrayList<InstallUnit>();
		for (IInstallableUnit unit : queryResult.toSet()) {
			result.add(convertUnit(unit));
		}
		return result.toArray(new InstallUnit[result.size()]);
	}

	private static InstallUnit convertUnit(IInstallableUnit unit) {
		InstallUnit result = ObjectsFactory.eINSTANCE.createInstallUnit();
		result.setId(unit.getId());
		result.setName(unit.getProperty(IInstallableUnit.PROP_NAME));
		result.setVersion(unit.getVersion().toString());
		return result;
	}

	public static void addRepository(URI uri, String nick) {
		addRepo(PlatformPlugin.getMetadataMgr(), uri, nick);
		addRepo(PlatformPlugin.getArtifactMgr(), uri, nick);
	}

	public static void removeRepository(URI uri) {
		PlatformPlugin.getArtifactMgr().removeRepository(uri);
		PlatformPlugin.getMetadataMgr().removeRepository(uri);
	}

	private static void addRepo(IRepositoryManager<?> mgr, URI uri, String name) {
		mgr.addRepository(uri);
		if (name != null) {
			mgr.setRepositoryProperty(uri, IRepository.PROP_NICKNAME, name);
		}
	}

	public static Repository[] listRepositories() {
		List<Repository> result = new ArrayList<Repository>();
		IMetadataRepositoryManager metadataManager = PlatformPlugin
				.getMetadataMgr();
		IArtifactRepositoryManager artifactManager = PlatformPlugin
				.getArtifactMgr();

		Set<URI> allUris = new HashSet<URI>();
		int flags = IRepositoryManager.REPOSITORIES_ALL;
		allUris.addAll(Arrays.asList(metadataManager
				.getKnownRepositories(flags)));
		allUris.addAll(Arrays.asList(artifactManager
				.getKnownRepositories(flags)));

		for (URI uri : allUris) {
			Repository site = ObjectsFactory.eINSTANCE.createRepository();
			site.setLocation(uri.toString());
			site.setIsMetadata(metadataManager.contains(uri));
			site.setIsArtifact(artifactManager.contains(uri));
			String nickname = metadataManager.getRepositoryProperty(uri,
					IRepository.PROP_NICKNAME);
			if (nickname == null) {
				nickname = artifactManager.getRepositoryProperty(uri,
						IRepository.PROP_NICKNAME);
			}
			if (nickname == null) {
				nickname = artifactManager.getRepositoryProperty(uri,
						IRepository.PROP_NAME);
			}
			if (nickname == null) {
				nickname = metadataManager.getRepositoryProperty(uri,
						IRepository.PROP_NAME);
			}
			if (nickname != null) {
				site.setName(nickname);
			}
			result.add(site);
		}
		return result.toArray(new Repository[result.size()]);
	}

	/**
	 * Utility method - searches for the repository with the same name, and if
	 * found, replaces it, otherwise just
	 * 
	 * @param uri
	 * @param nick
	 */
	public static void replaceReposotory(URI uri, String nick) {
		for (Repository repo : listRepositories()) {
			if (nick.equals(repo.getName())) {
				removeRepository(URI.create(repo.getLocation()));
			}
		}
		addRepository(uri, nick);
	}

	/**
	 * Updates current installation
	 * 
	 * @throws CoreException
	 */
	public static UpdateResult[] update() throws CoreException {
		cleanOldProfiles();
		List<UpdateResult> result = new ArrayList<UpdateResult>();
		ProvisioningSession session = PlatformPlugin
				.createProvisioningSession();
		// the default update operation looks for updates to the currently
		// running profile, using the default profile root marker. To change
		// which installable units are being updated, use the more detailed
		// constructors.
		UpdateOperation operation = new UpdateOperation(session);
		IStatus status = operation.resolveModal(new NullProgressMonitor());
		if (status.getCode() == UpdateOperation.STATUS_NOTHING_TO_UPDATE) {
			return new UpdateResult[0];
		}
		if (!status.isOK())
			throw new CoreException(status);

		for (Update u : operation.getSelectedUpdates()) {
			UpdateResult resultChild = ObjectsFactory.eINSTANCE
					.createUpdateResult();
			resultChild.setId(u.replacement.getId());
			resultChild.setFrom(u.toUpdate.getVersion().toString());
			resultChild.setTo(u.replacement.getVersion().toString());
			result.add(resultChild);
		}

		ProvisioningJob job = operation.getProvisioningJob(null);
		if (job instanceof ProfileModificationJob) {
			((ProfileModificationJob) job)
					.setRestartPolicy(ProvisioningJob.RESTART_ONLY);
		}

		if (job == null) {
			return new UpdateResult[0];
		}
		status = job.runModal(new NullProgressMonitor());
		if (!status.isOK()) {
			throw new CoreException(status);
		}
		return result.toArray(new UpdateResult[result.size()]);
	}

	public static void cleanOldProfiles() throws CoreException {
		// IProvisioningAgent agent = PlatformPlugin.getProvisioningAgent();
		// IProfileRegistry registry = PlatformPlugin.getProfileRegistry();
		// List<String> profilesToRemove = new ArrayList<String>();
		// IProfile self = registry.getProfile(IProfileRegistry.SELF);
		// String selfId = self.getProfileId();
		//
		// for (IProfile profile : registry.getProfiles()) {
		// System.out.println("found profile " + profile.getProfileId() + " "
		// + new Date(profile.getTimestamp()).toString());
		// }
		// for (String profileId : profilesToRemove) {
		// registry.removeProfile(profileId);
		// }
		//
		// long[] selfTimestamps = registry.listProfileTimestamps(selfId);
		// // removing all timestamps except for current
		// for (int i = 0; i < selfTimestamps.length - 1; i++) {
		// registry.removeProfile(selfId, selfTimestamps[i]);
		// }
	}
}
