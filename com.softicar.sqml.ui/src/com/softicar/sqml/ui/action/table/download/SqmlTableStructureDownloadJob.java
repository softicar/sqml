package com.softicar.sqml.ui.action.table.download;

import com.google.inject.Injector;
import com.softicar.platform.db.core.connection.DbConnections;
import com.softicar.platform.db.core.table.DbTableName;
import com.softicar.sqml.generator.common.ISqmlFileSystemAccess;
import com.softicar.sqml.generator.sqml.ISqmlFilesGeneratorConfig;
import com.softicar.sqml.generator.sqml.SqmlFilesGenerator;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.ui.SqmlUiPluginUtils;
import com.softicar.sqml.ui.generation.SqmlUiFileSystemAccess;
import com.softicar.sqml.ui.generation.SqmlUiGeneratorConfig;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class SqmlTableStructureDownloadJob extends Job {

	private static final int TICKS = 100000;
	private final Injector injector;
	private final SqmlTablesCollector tablesCollector;
	private int ticksTodo;

	public SqmlTableStructureDownloadJob(Injector injector, SqmlTablesCollector tablesCollector) {

		super("Updating Sqml Table Files");
		this.injector = injector;
		this.tablesCollector = tablesCollector;
		this.ticksTodo = TICKS;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {

		int ticksTodo = TICKS;
		monitor.beginTask("Updating Sqml Tables", ticksTodo);

		IStatus status = Status.OK_STATUS;
		try {
			Map<IFolder, Set<ISqmlTable>> tables = collectTables(monitor);
			for (Entry<IFolder, Set<ISqmlTable>> entry: tables.entrySet()) {
				ISqmlFilesGeneratorConfig config = loadFilesGeneratorConfig(entry.getKey(), entry.getValue(), monitor);
				generateTables(config, entry.getValue(), monitor);
			}
		} catch (Exception exception) {
			status = new Status(Status.ERROR, SqmlUiPluginUtils.getPluginId(), "Exception while generating Sqml files.", exception);
		}

		DbConnections.closeAll();
		monitor.done();
		return status;
	}

	private Map<IFolder, Set<ISqmlTable>> collectTables(IProgressMonitor monitor) {

		monitor.subTask("Collecting Sqml Table Files");
		return tablesCollector.collectTables(monitor);
	}

	private ISqmlFilesGeneratorConfig loadFilesGeneratorConfig(IFolder sourceFolder, Collection<ISqmlTable> tables, IProgressMonitor monitor) {

		monitor.subTask("Fetching Configuration");
		ISqmlFileSystemAccess fileSystemAccess = new SqmlUiFileSystemAccess(sourceFolder, "sqml");
		ISqmlFilesGeneratorConfig config = new SqmlUiGeneratorConfig(injector, fileSystemAccess, tables);

		final int CONFIG_TICKS = TICKS / 10;
		monitor.worked(CONFIG_TICKS);
		ticksTodo -= CONFIG_TICKS;

		return config;
	}

	private void generateTables(ISqmlFilesGeneratorConfig config, Collection<ISqmlTable> tables, IProgressMonitor monitor) {

		Collection<DbTableName> tableNames = getTableNames(tables);
		if (!tableNames.isEmpty()) {
			SqmlFilesGenerator filesGenerator = new SqmlFilesGenerator(config);
			int ticksPerTable = ticksTodo / tableNames.size();
			for (DbTableName tableName: tableNames) {
				if (monitor.isCanceled()) {
					throw new OperationCanceledException();
				}

				// generator
				monitor.subTask(String.format("Generating %s", config.getConfig(tableName).getClassName()));
				filesGenerator.generate(tableName);

				// update monitor
				int ticks = Math.min(ticksTodo, ticksPerTable);
				monitor.worked(ticks);
				ticksTodo -= ticks;
			}
		}
	}

	private Collection<DbTableName> getTableNames(Collection<ISqmlTable> tables) {

		Set<DbTableName> tableNames = new TreeSet<>();
		for (ISqmlTable table: tables) {
			tableNames.add(table.getDbTableName());
		}
		return tableNames;
	}
}
