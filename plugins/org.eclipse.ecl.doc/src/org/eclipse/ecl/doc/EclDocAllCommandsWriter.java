package org.eclipse.ecl.doc;

import java.io.IOException;

import org.eclipse.ecl.internal.doc.FileUtil;

public class EclDocAllCommandsWriter {

	public void write(EclDocWriter w) throws IOException {
		w.open("html").attr("lang", "en");
		{
			w.open("head");
			{
				w.tag("title", "ECL Documentation");
				w.open("style");
				{
					w.text(FileUtil.readFileAsString("css/all-commands.css"));
				}
				w.close();
			}
			w.close();

			w.open("body");
			{
				w.anchor("top");
				w.tag("h2", "Commands");
				w.open("ul");
				{
					for (EclDocCommand c : EclDocCommand.getAllPublicCommands()) {
						w.open("li");
						{
							w.open("a")
									.attr("href",
											String.format("#%s", c.getName()))
									.text(c.getName()).close();
						}
						w.close();
					}
				}
				w.close();

				for (EclDocCommand c : EclDocCommand.getAllPublicCommands()) {
					w.open("h3").attr("id", c.getName()).text(c.getName())
							.close();
					c.writeEclDoc(w);
					w.open("hr").close();
				}
			}
			w.close();
		}
		w.close();
	}
}
