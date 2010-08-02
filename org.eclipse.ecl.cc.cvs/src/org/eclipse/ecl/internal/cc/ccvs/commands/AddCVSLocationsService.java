package org.eclipse.ecl.internal.cc.ccvs.commands;

import static org.eclipse.team.internal.ccvs.core.ICVSRepositoryLocation.USE_DEFAULT_PORT;
import static org.eclipse.team.internal.ccvs.core.connection.CVSRepositoryLocation.COLON;
import static org.eclipse.team.internal.ccvs.core.connection.CVSRepositoryLocation.HOST_SEPARATOR;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.cc.ccvs.CVSLocation;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.internal.cc.ccvs.CvsPlugin;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;
import org.eclipse.team.internal.ccvs.core.util.KnownRepositories;

@SuppressWarnings("restriction")
public class AddCVSLocationsService implements ICommandService {

    private static final String INVALID_OBJECT_TYPE = "Invalid object type. Expected org.eclipse.cc.ccvs.CVSLocation";

    public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
        Object location;
        while ((location = context.getInput().take(ISession.DEFAULT_TAKE_TIMEOUT)) != null) {
            if (!(location instanceof CVSLocation)) {
                return new Status(IStatus.ERROR, CvsPlugin.PLUGIN_ID, INVALID_OBJECT_TYPE);
            }
            CVSLocation cvsLocation = (CVSLocation) location;
            StringBuilder sb = new StringBuilder();
            sb.append(COLON);
            sb.append(cvsLocation.getConnectionType().getLiteral());
            sb.append(COLON);
            if (cvsLocation.getUser().length() > 0) {
                sb.append(cvsLocation.getUser());
                sb.append(HOST_SEPARATOR);
            }
            sb.append(cvsLocation.getHost());
            if (cvsLocation.getPort() != USE_DEFAULT_PORT) {
                sb.append(COLON);
                sb.append(cvsLocation.getPort());
            }
            sb.append(cvsLocation.getPath());

            KnownRepositories repositories = KnownRepositories.getInstance();
            repositories.addRepository(repositories.getRepository(sb.toString()), false);
        }
        return Status.OK_STATUS;
    }

}
