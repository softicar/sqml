package com.softicar.sqml.generator.table.clazz;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.sqml.generator.common.ISqmlFileSystemAccess;
import java.util.Map;
import java.util.TreeMap;

class SqmlBufferedFileSystemAccess implements ISqmlFileSystemAccess {

	private final Map<JavaClassName, String> contentMap;
	private final ISqmlFileSystemAccess fileSystemAccess;

	public SqmlBufferedFileSystemAccess() {

		this(null);
	}

	public SqmlBufferedFileSystemAccess(ISqmlFileSystemAccess fileSystemAccess) {

		this.contentMap = new TreeMap<>();
		this.fileSystemAccess = fileSystemAccess;
	}

	public String getContent(JavaClassName className) {

		return contentMap.get(className);
	}

	@Override
	public void writeFile(JavaClassName className, String content) {

		this.contentMap.put(className, content);
	}

	@Override
	public String readFile(JavaClassName className) {

		String content = contentMap.get(className);
		if (content != null) {
			return content;
		} else if (fileSystemAccess != null) {
			return fileSystemAccess.readFile(className);
		} else {
			return null;
		}
	}

	@Override
	public boolean existsFile(JavaClassName className) {

		String content = contentMap.get(className);
		if (content != null) {
			return true;
		} else if (fileSystemAccess != null) {
			return fileSystemAccess.existsFile(className);
		} else {
			return false;
		}
	}
}
