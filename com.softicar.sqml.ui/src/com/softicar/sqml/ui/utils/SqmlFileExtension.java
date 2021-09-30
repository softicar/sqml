package com.softicar.sqml.ui.utils;

public class SqmlFileExtension {

	private static final String JAVA_FILE_EXTENSION = ".java";
	private static final String SQML_FILE_EXTENSION = ".sqml";

	public static boolean isJavaFileExtension(String filename) {

		return filename.toLowerCase().endsWith(JAVA_FILE_EXTENSION);
	}

	public static boolean isSqmlFileExtension(String filename) {

		return filename.toLowerCase().endsWith(SQML_FILE_EXTENSION);
	}
}
