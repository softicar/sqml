package com.softicar.sqml.generator.common;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import java.util.Objects;

public interface ISqmlFileSystemAccess {

	/**
	 * Writes the specified content into the file corresponding to the given
	 * {@link JavaClassName}.
	 *
	 * @param className
	 *            the {@link JavaClassName} representing the file to write
	 * @param content
	 *            the content to write into the file
	 */
	void writeFile(JavaClassName className, String content);

	/**
	 * Same as {@link #writeFile(JavaClassName, String)} but only if the content
	 * of the file would change.
	 *
	 * @param className
	 *            the {@link JavaClassName} representing the file to write
	 * @param content
	 *            the content to write into the file
	 */
	default void writeFileIfNecessary(JavaClassName className, String content) {

		String currentContent = readFile(className);
		if (!Objects.equals(content, currentContent)) {
			writeFile(className, content);
		}
	}

	/**
	 * Returns the content of the file corresponding to the
	 * {@link JavaClassName}.
	 *
	 * @param className
	 *            the {@link JavaClassName} representing the file to read
	 * @return the content of the file, or null if the file does not exists
	 */
	String readFile(JavaClassName className);

	/**
	 * Check whether the file for the given {@link JavaClassName} exists.
	 *
	 * @param className
	 *            the {@link JavaClassName} representing the file to check
	 * @return true if the file exists; false otherwise
	 */
	default boolean existsFile(JavaClassName className) {

		return readFile(className) != null;
	}
}
