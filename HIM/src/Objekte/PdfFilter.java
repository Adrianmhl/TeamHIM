package Objekte;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class PdfFilter extends FileFilter {

	private static final String extension = ".pdf";

	public boolean accept(File file) {

		boolean hasValidExt = false;

		if (file.isDirectory()) {
			hasValidExt = false;
		}
		if (extension.equalsIgnoreCase(getExtension(file))) {
			hasValidExt = true;
		}
		return hasValidExt;
	}

	public String getDescription() {
		return "*" + extension;
	}

	public static String getExtension(File file) {
		String extension = null;
		String fileName = file.getName();
		int i = fileName.lastIndexOf('.');
		if (i > 0 && i < fileName.length() - 1) {
			extension = fileName.substring(i + 1).toLowerCase();
		}
		return "." + extension;
	}

}
