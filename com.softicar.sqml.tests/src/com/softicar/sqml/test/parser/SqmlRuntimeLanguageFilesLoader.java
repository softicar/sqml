package com.softicar.sqml.test.parser;

import com.softicar.platform.common.core.java.classpath.finder.JavaClasspathFinder;
import com.softicar.platform.common.io.classpath.ClasspathFileFetcher;
import com.softicar.platform.db.sqml.builtin.DbSqmlBuiltInFunctionsAnchorClass;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;

class SqmlRuntimeLanguageFilesLoader<R> {

	private static final String EXTENSION = ".sqml";
	private static final Package PACKAGE = DbSqmlBuiltInFunctionsAnchorClass.class.getPackage();
	private final Function<SqmlRuntimeLanguageFile, R> resourceLoader;

	public SqmlRuntimeLanguageFilesLoader(Function<SqmlRuntimeLanguageFile, R> resourceLoader) {

		this.resourceLoader = resourceLoader;
	}

	public Collection<R> loadAll() {

		return Cache.FILES.stream().map(resourceLoader).collect(Collectors.toList());
	}

	private static class Cache {

		private static final Collection<SqmlRuntimeLanguageFile> FILES = loadFiles();

		private static Collection<SqmlRuntimeLanguageFile> loadFiles() {

			Collection<File> classpathEntries = new JavaClasspathFinder()//
				.setIgnoreJarFiles(false)
				.findAll();

			return new ClasspathFileFetcher(classpathEntries)//
				.setExtensionFilter(Collections.singleton(EXTENSION))
				.setPackageFilter(PACKAGE)
				.getClasspathFiles()
				.stream()
				.map(SqmlRuntimeLanguageFile::new)
				.collect(Collectors.toList());
		}
	}
}
