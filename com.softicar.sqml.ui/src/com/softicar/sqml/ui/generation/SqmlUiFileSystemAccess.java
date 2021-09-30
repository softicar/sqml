package com.softicar.sqml.ui.generation;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.common.core.utils.DevNull;
import com.softicar.platform.common.io.reader.InputStreamReaderFactory;
import com.softicar.platform.common.io.reader.ManagedReader;
import com.softicar.platform.common.string.charset.Charsets;
import com.softicar.sqml.generator.common.ISqmlFileSystemAccess;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.xtext.util.StringInputStream;

public class SqmlUiFileSystemAccess implements ISqmlFileSystemAccess {

	private final IFolder sourceFolder;
	private final String fileExtension;

	public SqmlUiFileSystemAccess(IFolder sourceFolder, String fileExtension) {

		this.sourceFolder = sourceFolder;
		this.fileExtension = fileExtension;
	}

	@Override
	public void writeFile(JavaClassName className, String content) {

		IFile file = getFile(className);
		ensureFolderExists(file.getParent());
		try {
			if (file.exists()) {
				if (isContentDifferent(file, getInputStream(content))) {
					file.setContents(getInputStream(content), true, true, null);
				} else {
					file.touch(null);
				}
			} else {
				file.create(getInputStream(content), true, null);
			}

//			file.setDerived(true, null);
		} catch (CoreException exception) {
			throw new RuntimeException(exception);
		}
	}

	private boolean isContentDifferent(IFile file, InputStream newContent) {

		try (BufferedInputStream oldContent = new BufferedInputStream(file.getContents())) {
			int newByte = newContent.read();
			int oldByte = oldContent.read();
			while (newByte != -1 && oldByte != -1 && newByte == oldByte) {
				newByte = newContent.read();
				oldByte = oldContent.read();
			}
			return newByte != oldByte;
		} catch (IOException | CoreException exception) {
			DevNull.swallow(exception);
			return true;
		}
	}

	private StringInputStream getInputStream(String content) {

		try {
			return new StringInputStream(content, Charsets.UTF8.name());
		} catch (UnsupportedEncodingException exception) {
			throw new RuntimeException(exception);
		}
	}

	private void ensureFolderExists(IContainer container) {

		if (!container.exists()) {
			ensureFolderExists(container.getParent());
			if (container instanceof IFolder) {
				createFolder((IFolder) container);
			}
		}
	}

	private void createFolder(IFolder folder) {

		try {
			folder.create(true, true, null);
		} catch (CoreException exception) {
			throw new RuntimeException(exception);
		}
	}

	@Override
	public String readFile(JavaClassName className) {

		IFile file = getFile(className);
		if (file.exists()) {
			try (InputStreamReader reader = InputStreamReaderFactory.readUtf8(file.getContents())) {
				return new ManagedReader(reader).readAll();
			} catch (CoreException | IOException exception) {
				throw new RuntimeException(exception);
			}
		} else {
			return null;
		}
	}

	private IFile getFile(JavaClassName className) {

		return sourceFolder.getFile(className.getCanonicalName("/") + "." + fileExtension);
	}
}
