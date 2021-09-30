package com.softicar.sqml.generator.sqml;

import com.softicar.platform.db.core.table.DbTableName;
import com.softicar.sqml.generator.common.ISqmlFileSystemAccess;
import java.util.Collection;

/**
 * Configuration for the generation of a set of SQML files.
 *
 * @see SqmlFilesGenerator
 * @author Oliver Richers
 */
public interface ISqmlFilesGeneratorConfig {

	/**
	 * Returns the file system access to read and write the generated files.
	 *
	 * @return file system access (never null)
	 */
	ISqmlFileSystemAccess getFileSystemAccess();

	/**
	 * Returns the names of all tables covered by this configuration.
	 *
	 * @return table names of all mapped tables (never null)
	 */
	Collection<DbTableName> getAllTableNames();

	/**
	 * Returns the generation configuration for the given database table.
	 *
	 * @param tableName
	 *            the physical database table name
	 * @return the generation configuration
	 */
	ISqmlFileGeneratorConfig getConfig(DbTableName tableName);
}
