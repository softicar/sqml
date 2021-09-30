package com.softicar.sqml.ui.refactor.move;

import com.google.inject.Inject;
import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.common.core.logging.Log;
import com.softicar.sqml.generator.query.SqmlQueryGenerator;
import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.ui.utils.SqmlEclipeWorkspace;
import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.xtext.builder.EclipseOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

public class SqmlMoveAssociatedFilesChecker {

	private static final String DEFAULT_OUTPUT = "DEFAULT_OUTPUT";
	private final EclipseOutputConfigurationProvider outputConfigurationProvider;

	@Inject
	public SqmlMoveAssociatedFilesChecker(EclipseOutputConfigurationProvider outputConfigurationProvider) {

		this.outputConfigurationProvider = outputConfigurationProvider;
	}

	public void check(SqmlMoveContext context, RefactoringStatus status) {

		for (SqmlFileMoveContext fileMoveContext: context.getFileMoveContexts()) {
			for (IFile file: getAssociatedFiles(fileMoveContext)) {
				if (file.exists() && !context.containsFile(file)) {
					Log.finfo("file '%s' exists? %s", file.getProjectRelativePath(), file.exists());
					status.addError(String.format("Associated file not moved: %s", file.getProjectRelativePath()));
				}
			}
		}
	}

	private Collection<IFile> getAssociatedFiles(SqmlFileMoveContext fileMoveContext) {

		IFile sourceFile = fileMoveContext.getSourceFile();
		IFolder outputFolder = getGenerationOutputFolder(sourceFile);
		Collection<IFile> associatedFiles = new ArrayList<>();

		for (ISqmlQuery query: fileMoveContext.getSqmlFile().getQueries()) {
			// add generated class file for query
			JavaClassName generatedClassName = SqmlQueryGenerator.getInterfaceName(query);
			associatedFiles.add(outputFolder.getFile(generatedClassName.getCanonicalName("/") + ".java"));
		}

		for (ISqmlTable table: fileMoveContext.getSqmlFile().getTables()) {
			// add generated class file for table
			JavaClassName generatedClassName = table.getClassName();
			associatedFiles.add(outputFolder.getFile(generatedClassName.getCanonicalName("/") + ".java"));

			// add base class file for table
			JavaClassName baseClassName = new JavaClassName(generatedClassName.getPackageName(), "Abstract" + generatedClassName.getSimpleName());
			associatedFiles.add(outputFolder.getFile(baseClassName.getCanonicalName("/") + ".java"));
		}

		return associatedFiles;
	}

	private IFolder getGenerationOutputFolder(IFile sourceFile) {

		OutputConfiguration outputConfiguration = getOutputConfiguration(sourceFile);
		IFolder sourceFolder = SqmlEclipeWorkspace.getSourceFolderOrThrow(sourceFile);
		String outputDirectory = outputConfiguration.getOutputDirectory(sourceFolder.getProjectRelativePath().toString());
		return sourceFile.getProject().getFolder(outputDirectory);

	}

	private OutputConfiguration getOutputConfiguration(IFile sourceFile) {

		for (OutputConfiguration outputConfiguration: outputConfigurationProvider.getOutputConfigurations(sourceFile.getProject())) {
			if (outputConfiguration.getName().equals(DEFAULT_OUTPUT)) {
				return outputConfiguration;
			}
		}
		throw new RuntimeException("Failed to find output configuration.");
	}
}
