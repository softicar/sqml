package com.softicar.sqml.test.parser;

import com.softicar.platform.common.core.exceptions.SofticarIOException;
import com.softicar.platform.common.io.StreamUtils;
import com.softicar.platform.common.io.classpath.file.IClasspathFile;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

class SqmlRuntimeLanguageFile {

	private final String filename;
	private final byte[] content;

	public SqmlRuntimeLanguageFile(IClasspathFile classpathFile) {

		this.filename = classpathFile.getName();

		try (InputStream inputStream = classpathFile.getInputStream()) {
			this.content = StreamUtils.toByteArray(inputStream);
		} catch (IOException exception) {
			throw new SofticarIOException(exception);
		}
	}

	public String getFilename() {

		return filename;
	}

	public ByteArrayInputStream getInputStream() {

		return new ByteArrayInputStream(content);
	}
}
