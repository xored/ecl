package org.eclipse.ecl.stdlib.util;

import org.eclipse.ecl.core.util.ScriptletFactory;
import org.eclipse.ecl.stdlib.AssertEquals;
import org.eclipse.ecl.stdlib.AssertFalse;
import org.eclipse.ecl.stdlib.AssertNotEquals;
import org.eclipse.ecl.stdlib.AssertNotNull;
import org.eclipse.ecl.stdlib.AssertNull;
import org.eclipse.ecl.stdlib.AssertTrue;
import org.eclipse.ecl.stdlib.Property;
import org.eclipse.ecl.stdlib.StandartLibraryFactory;

public class StandartLibraryScriptletFactory extends ScriptletFactory {

	public static StandartLibraryFactory factory = StandartLibraryFactory.eINSTANCE;

	public static Property property(String name, Integer index) {
		Property cmd = factory.createProperty();
		cmd.setName(name);
		cmd.setIndex(index);
		return cmd;
	}
	public static Property property(String name) {
		return property(name, null);
	}

	public static AssertEquals assertEquals(String expected) {
		AssertEquals cmd = factory.createAssertEquals();
		cmd.setExpected(expected);
		return cmd;
	}

	public static AssertNotEquals assertNotEquals(String expected) {
		AssertNotEquals cmd = factory.createAssertNotEquals();
		cmd.setExpected(expected);
		return cmd;
	}

	public static AssertTrue assertTrue() {
		return factory.createAssertTrue();
	}

	public static AssertFalse assertFalse() {
		return factory.createAssertFalse();
	}

	public static AssertNull assertNull() {
		return factory.createAssertNull();
	}

	public static AssertNotNull assertNotNull() {
		return factory.createAssertNotNull();
	}
}