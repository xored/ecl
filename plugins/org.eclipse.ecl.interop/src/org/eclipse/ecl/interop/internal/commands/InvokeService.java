package org.eclipse.ecl.interop.internal.commands;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.interop.commands.Invoke;
import org.eclipse.ecl.interop.internal.EclInteropPlugin;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.swt.widgets.Widget;

public class InvokeService implements ICommandService {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public IStatus service(Command command, IProcess context) throws CoreException {
		
		final Invoke cmd = (Invoke) command;
		
		final Object object = cmd.getObject();
		if (object == null) return error("Null invocation target.");
		
		final Class class_ = object.getClass();
		final String name = cmd.getName();
		if (name == null || name.length() == 0) return error("Empty method name.");
		
		final Object[] args = cmd.getArgs().toArray();

		// --
		
		if (class_.isArray()) return processArrayMethod(object, name, args,
				context.getOutput()); 

		// --
		
		Object result = null;		
		try {
			final Method method = matchMethod(class_, name, args);
			if (method == null) return error("Method not found.");
			
			if (object instanceof Widget) {
				Widget widget = (Widget) object;
				
				// no reason to go into generics here, everything is just Object
				RunnableFuture future = new FutureTask(new Callable() {
					public Object call() throws Exception {
						return method.invoke(object, args);
					}
				});
				
				widget.getDisplay().syncExec(future);
				result = future.get();
			} else result = method.invoke(object, args);
			
		} catch (Exception e) {
			return error(
					String.format(
							"%s: %s", e.getClass().getName(),
							e.getMessage()
					)
			);
		}

		if (result != null) context.getOutput().write(result);
		return Status.OK_STATUS;
	}
	
	private static IStatus processArrayMethod(Object array, String name,
			Object[] args, IPipe out) throws CoreException {
		if (name.equals("get")) {
			if (args.length != 1) return error("Invalid number of arguments.");
			if (args[0].getClass() != Integer.class && args[0].getClass() != int.class)
				return error("Invalid index type.");
			
			Object result = Array.get(array, (Integer) args[0]);
			if (result != null) out.write(result);

			return Status.OK_STATUS;
		} else if (name.equals("set")) {
			if (args.length != 2) return error("Invalid number of arguments.");
			if (args[0].getClass() != Integer.class && args[0].getClass() != int.class)
				return error("Invalid index type.");
			
			Array.set(array, (Integer) args[0], args[1]);
			
			return Status.OK_STATUS;
		} else if (name.equals("length")) {
			if (args.length != 0) return error("Invalid number of arguments.");
			
			out.write(Array.getLength(array));
			return Status.OK_STATUS;
		} else return error("Unknown array pseudo-method name.");
	}
	
	private static Status error(String message) {
		return new Status(Status.ERROR, EclInteropPlugin.PLUGIN_ID, message);
	}
	
	/* TODO:
	 * 
	 *   1. Null handling.
	 *   2. Proper overloading resolution.
	 *   
	 *   Standard says we must select the most "specific" method.
	 *   
	 *   3. What will happen if arrays passed?
	 *   
	 *   Useful reading:
	 *   http://geekexplains.blogspot.com/2009/06/choosing-most-specific-method-tricky.html
	 */
	@SuppressWarnings({ "rawtypes" })
	private static Method matchMethod(Class class_, String name, Object[] args) {
		final Method[] methods = class_.getMethods();
		
		for (Method m : methods) {
			if (!m.getName().equals(name)) continue;

			final Class[] paramTypes = m.getParameterTypes();
			if (paramTypes.length != args.length) continue;

			boolean done = true;
			for (int i = 0; i < paramTypes.length; ++i) {
				final Class argType = args[i].getClass();
				final Class paramType = paramTypes[i];
				
				if (!isAssignableFrom(paramType, argType)) {
					done = false;
					break;
				}
			}
			
			if (done) return m;
		}
		
		return null;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static boolean isAssignableFrom(Class to, Class from) {
		if (to.isAssignableFrom(from)) return true;
		if (to.isPrimitive() && isPrimitiveAssignableFrom(to, from)) return true;
		
		return false;
	}
	
	@SuppressWarnings("rawtypes")
	private static boolean isPrimitiveAssignableFrom(Class to, Class from) {
		// assumes that there is only one Class instance for every type-class
		
		if (to == Boolean.TYPE && from == Boolean.class) return true;
		if (to == Character.TYPE && from == Character.class) return true;
		if (to == Byte.TYPE && from == Byte.class) return true;
		if (to == Short.TYPE && from == Short.class) return true;
		if (to == Integer.TYPE && from == Integer.class) return true;
		if (to == Long.TYPE && from == Long.class) return true;
		if (to == Float.TYPE && from == Float.class) return true;
		if (to == Double.TYPE && from == Double.class) return true;
		
		return false;
	}
}
