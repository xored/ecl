package org.eclipse.ecl.core.util;

import java.util.HashMap;
import java.util.Map;

public class EclTypeNameConvention {

	private static final Map<String, String> enameToName = new HashMap<String, String>();
	static {
		enameToName.put("EInt", "Integer");
		enameToName.put("EIntegerObject", "Integer");
		enameToName.put("EBooleanObject", "Boolean");

	}

	public static String toTypeName(String ename) {
		String result = enameToName.get(ename);
		if (result != null)
			return result;

		if (ename.length() > 1 && ename.charAt(0) == 'E'
				&& Character.isUpperCase(ename.charAt(1)))
			return ename.substring(1);

		return ename;
	}

}
