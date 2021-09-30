package com.softicar.sqml.test.generator.sqml;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.sqml.generator.common.ISqmlFileSystemAccess;
import java.util.Map;
import java.util.TreeMap;

public class TestFileSystemAccess implements ISqmlFileSystemAccess {

	private final Map<JavaClassName, String> qualifiedNameToContent = new TreeMap<>();

	@Override
	public void writeFile(JavaClassName className, String content) {

		qualifiedNameToContent.put(className, content);
	}

	@Override
	public String readFile(JavaClassName className) {

		return qualifiedNameToContent.get(className);
	}
}
