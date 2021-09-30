package com.softicar.sqml.generator.sqml;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.platform.db.core.table.DbTableName;
import com.softicar.sqml.generator.common.ISqmlFileSystemAccess;
import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferences;
import com.softicar.sqml.generator.table.clazz.version.SqmlTableClassVersion;

/**
 * Configuration for the generation of an SQML file.
 * <p>
 * This interface specifies the configuration for the generation of a single
 * SQML table file. Instances of this interface are usually obtained from an
 * instance of {@link ISqmlFilesGeneratorConfig}, which specifies the generation
 * configuration for a set of database tables.
 *
 * @see SqmlFileGenerator
 * @author Oliver Richers
 */
public interface ISqmlFileGeneratorConfig {

	/**
	 * Returns the file system access to read and write the generated files.
	 *
	 * @return file system access (never null)
	 */
	ISqmlFileSystemAccess getFileSystemAccess();

	/**
	 * Returns the physical name of the database table, for which to generate
	 * the SQML file.
	 *
	 * @return the table name (never null)
	 */
	DbTableName getTableName();

	/**
	 * Returns the canonical class name of the table.
	 * <p>
	 * This class name determines the name of the SQML file to be generated and
	 * its path.
	 *
	 * @return the class name of the table (never null)
	 */
	JavaClassName getClassName();

	/**
	 * Returns the physical table structure of the table.
	 *
	 * @return the table structure (never null)
	 */
	IDbTableStructure getTableStructure();

	/**
	 * Returns the table structure for the given table.
	 *
	 * @return the table structure (never null)
	 */
	IDbTableStructure getTableStructure(DbTableName tableName);

	/**
	 * Returns the class name of a foreign table for the given physical table
	 * name.
	 * <p>
	 * If the table, for which the SQML file is generated, refers to another
	 * table via foreign key constraints, the generator needs to know the class
	 * name of the referenced table. If the referenced table is not mapped to
	 * SQML, this method will return null.
	 *
	 * @param targetTableName
	 *            the physical table name of the referenced table
	 * @return the class name of the table with the given physical table name,
	 *         or null if now mapping exists for that table
	 */
	JavaClassName getForeignClassName(DbTableName targetTableName);

	/**
	 * Returns the generator preferences for the table.
	 *
	 * @return generator preferences (never null)
	 */
	ISqmlGeneratorPreferences getGeneratorPreferences();

	/**
	 * Returns the table class version to generate.
	 *
	 * @return the table class version (never null)
	 */
	default SqmlTableClassVersion getTableClassVersion() {

		return getGeneratorPreferences().getGeneratedTableCodeVersion();
	}
}
