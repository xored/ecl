package org.eclipse.ecl.platform.internal.ui.commands;

import static org.eclipse.ecl.platform.ui.PlatformUIPlugin.createError;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.platform.ui.commands.SaveScreenshot;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.PlatformUI;

public class SaveScreenshotService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		SaveScreenshot saveScreenshot = (SaveScreenshot) command;
		if (saveScreenshot.getOut()==null) {
			return createError("No output specified");
		}
		File output = new File(saveScreenshot.getOut());
		if (output.exists() && !output.isFile()) {
			return createError("File %s exists and is a directory",
					output.getAbsolutePath());
		}

		File parent = output.getParentFile();
		if (parent.exists() && !parent.isDirectory()) {
			return createError("File %s exists and not a directory",
					parent.getAbsolutePath());
		}

		if (!parent.exists() && !parent.mkdirs()) {
			return createError("Cannot create directory %s",
					parent.getAbsolutePath());
		}

		Object input = context.getInput().take(10000);
		if (!isValidInput(input)) {
			return createError(
					"Expected control or tree/table item, but got %s from input pipe",
					input);
		}

		return writeData(
				output,
				takeScreenshot(input, formatFromExt(ext(output), SWT.IMAGE_PNG)));
	}

	private static IStatus writeData(File file, byte[] data) {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(file);
			out.write(data);
			out.close();
			return Status.OK_STATUS;
		} catch (IOException e) {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e1) {
				}
			}
			return createError(e, "Error saving screenshot: %s", e.getMessage());
		}
	}

	private static Map<String, Integer> exts = new HashMap<String, Integer>();
	static {
		exts.put(".png", SWT.IMAGE_PNG);
		exts.put(".jpg", SWT.IMAGE_JPEG);
		exts.put(".bmp", SWT.IMAGE_BMP);
	}

	private static int formatFromExt(String ext, int def) {
		ext = ext.toLowerCase();
		return exts.containsKey(ext) ? exts.get(ext) : def;
	}

	private static String ext(File file) {
		String name = file.getName();
		int lastDot = name.lastIndexOf('.');
		if (lastDot == -1) {
			return "";
		}
		return name.substring(lastDot);
	}

	private static boolean isValidInput(Object input) {
		return input instanceof Control || input instanceof TreeItem
				|| input instanceof TableItem;
	}

	private static Rectangle getScreenBounds(Object input) {
		Object parent = getParent(input);
		Point location = parent == null ? new Point(0, 0)
				: topLeft(getScreenBounds(parent));
		return shift(getBounds(input), location);
	}

	private static Rectangle getBounds(Object input) {
		if (input instanceof Control) {
			((Control) input).getLocation();
			return ((Control) input).getBounds();
		}
		if (input instanceof TreeItem) {
			return ((TreeItem) input).getBounds();
		}
		if (input instanceof TableItem) {
			return ((TableItem) input).getBounds();
		}
		throw new IllegalArgumentException(input.getClass().toString());
	}

	private static Point topLeft(Rectangle bounds) {
		return new Point(bounds.x, bounds.y);
	}

	private static Object getParent(Object input) {
		if (input instanceof Shell) {
			return null;
		}
		if (input instanceof Control) {
			return ((Control) input).getParent();
		}
		if (input instanceof TreeItem) {
			return ((TreeItem) input).getParent();
		}
		if (input instanceof TableItem) {
			return ((TableItem) input).getParent();
		}
		throw new IllegalArgumentException(input.getClass().toString());
	}

	public static Shell getShell(Object input) {
		if (input instanceof Control) {
			return ((Control) input).getShell();
		}
		if (input instanceof TreeItem) {
			return ((TreeItem) input).getParent().getShell();
		}
		if (input instanceof TableItem) {
			return ((TableItem) input).getParent().getShell();
		}
		throw new IllegalArgumentException(input.getClass().toString());
	}

	private static Rectangle shift(Rectangle rect, Point distance) {
		return new Rectangle(rect.x + distance.x, rect.y + distance.y,
				rect.width, rect.height);
	}

	private byte[] takeScreenshot(final Object input, final int format) {
		final Display display = PlatformUI.getWorkbench().getDisplay();
		final AtomicReference<byte[]> result = new AtomicReference<byte[]>();
		display.syncExec(new Runnable() {
			public void run() {
				Shell shell = getShell(input);
				if (shell != null) {
					shell.forceActive();
					display.readAndDispatch();
				}
				Rectangle displayBounds = display.getBounds();
				Rectangle bounds = getScreenBounds(input);
				Rectangle screenshotBounds = displayBounds.intersection(bounds);
				Image image = new Image(display, screenshotBounds.width,
						screenshotBounds.height);
				GC gc = new GC(display);
				gc.copyArea(image, screenshotBounds.x, screenshotBounds.y);
				gc.dispose();

				ByteArrayOutputStream out = new ByteArrayOutputStream();
				ImageLoader imageLoader = new ImageLoader();
				imageLoader.data = new ImageData[] { image.getImageData() };
				imageLoader.save(out, format);
				image.dispose();
				result.set(out.toByteArray());
			}
		});
		return result.get();
	}
}
