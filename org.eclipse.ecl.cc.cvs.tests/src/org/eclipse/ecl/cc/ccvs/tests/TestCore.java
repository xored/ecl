package org.eclipse.ecl.cc.ccvs.tests;

import junit.framework.TestCase;

import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.cc.ccvs.AddCVSLocations;
import org.eclipse.ecl.cc.ccvs.CVSConnectionType;
import org.eclipse.ecl.cc.ccvs.CVSLocation;
import org.eclipse.ecl.cc.ccvs.CvsFactory;
import org.eclipse.ecl.cc.ccvs.GetCVSLocations;
import org.eclipse.ecl.runtime.EclRuntime;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;
import org.eclipse.team.internal.ccvs.core.ICVSRepositoryLocation;
import org.eclipse.team.internal.ccvs.core.util.KnownRepositories;

@SuppressWarnings("restriction")
public class TestCore extends TestCase {

    private static final String REPOSITORY_STRING = ":extssh:komaz@cvs.xored.com:/cvsroot/xored";

    public void testGetCVSLocations() throws Exception {
        KnownRepositories knownRepositories = KnownRepositories.getInstance();
        ICVSRepositoryLocation location = knownRepositories.getRepository(REPOSITORY_STRING);
        knownRepositories.addRepository(location, false);

        ISession session = EclRuntime.createSession();

        GetCVSLocations command = CvsFactory.eINSTANCE.createGetCVSLocations();
        IProcess process = session.execute(command);

        assertEquals(Status.OK_STATUS, process.waitFor());

        Object o = process.getOutput().take(ISession.DEFAULT_TAKE_TIMEOUT);
        assertTrue(o instanceof CVSLocation);

        CVSLocation l = (CVSLocation) o;
        assertEquals(location.getHost(), l.getHost());
        assertEquals(location.getRootDirectory(), l.getPath());
        assertEquals(location.getPort(), l.getPort());
        assertEquals(location.getUsername(), l.getUser());
        assertEquals(location.getMethod().getName(), l.getConnectionType().getLiteral());
    }

    public void testAddCVSLocations() throws Exception {
        ISession session = EclRuntime.createSession();
        CVSLocation location = CvsFactory.eINSTANCE.createCVSLocation();
        location.setHost("cvs.xored.com");
        location.setPath("/cvsroot/xored");
        location.setPort(23423);
        location.setUser("userAddLocations");
        location.setConnectionType(CVSConnectionType.get("pserver"));

        IPipe pipe = session.createPipe();

        AddCVSLocations command = CvsFactory.eINSTANCE.createAddCVSLocations();

        IProcess process = session.execute(command, pipe, null);
        pipe.write(location);
        pipe.close();

        assertEquals(Status.OK_STATUS, process.waitFor());

        KnownRepositories repositories = KnownRepositories.getInstance();
        boolean found = false;
        for (ICVSRepositoryLocation l : repositories.getRepositories()) {
            if (l.getUsername().equals("userAddLocations")) {
                found = true;
                assertEquals(location.getHost(), l.getHost());
                assertEquals(location.getPath(), l.getRootDirectory());
                assertEquals(location.getPort(), l.getPort());
                assertEquals(location.getConnectionType().getLiteral(), l.getMethod().getName());
            }
        }

        assertTrue(found);
    }
}
