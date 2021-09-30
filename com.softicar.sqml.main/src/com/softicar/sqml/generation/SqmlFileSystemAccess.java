package com.softicar.sqml.generation;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.common.core.utils.DevNull;
import com.softicar.sqml.generator.common.ISqmlFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccessExtension3;

public class SqmlFileSystemAccess implements ISqmlFileSystemAccess {

	private final IFileSystemAccess fileSystemAccess;
	private final String fileExtension;

	public SqmlFileSystemAccess(IFileSystemAccess fileSystemAccess, String fileExtension) {

		this.fileSystemAccess = fileSystemAccess;
		this.fileExtension = fileExtension;
	}

	@Override
	public void writeFile(JavaClassName className, String content) {

		String filename = getFilename(className);
		fileSystemAccess.generateFile(filename, content);
	}

	@Override
	public String readFile(JavaClassName className) {

		if (fileSystemAccess instanceof IFileSystemAccessExtension3) {
			IFileSystemAccessExtension3 fileSystemAccess = (IFileSystemAccessExtension3) this.fileSystemAccess;
			String filename = getFilename(className);
			try {
				return fileSystemAccess.readTextFile(filename).toString();
			} catch (RuntimeException exception) {
				DevNull.swallow(exception);
				return null;
			}
		} else {
			throw new IllegalStateException(String.format(//
					"Class '%s' does not implement interface '%s'.",
					fileSystemAccess.getClass().getCanonicalName(),
					IFileSystemAccessExtension3.class.getCanonicalName()));
		}
	}

	private String getFilename(JavaClassName className) {

		String fileName = className.getCanonicalName("/") + "." + fileExtension;
		return fileName;
	}
}
