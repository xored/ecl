package org.eclipse.ecl.internal.cc.ccvs.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.cc.ccvs.CVSConnectionType;
import org.eclipse.ecl.cc.ccvs.CVSLocation;
import org.eclipse.ecl.cc.ccvs.CvsFactory;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.team.internal.ccvs.core.ICVSRepositoryLocation;
import org.eclipse.team.internal.ccvs.core.util.KnownRepositories;

@SuppressWarnings("restriction")
public class GetCVSLocationsService implements ICommandService {

    public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
        for (ICVSRepositoryLocation location : KnownRepositories.getInstance().getRepositories()) {
            CVSLocation l = CvsFactory.eINSTANCE.createCVSLocation();
            l.setHost(location.getHost());
            l.setPath(location.getRootDirectory());
            l.setPort(location.getPort());
            l.setUser(location.getUsername());
            l.setConnectionType(CVSConnectionType.getByName(location.getMethod().getName()));
            context.getOutput().write(l);
        }

        return Status.OK_STATUS;
    }

}
