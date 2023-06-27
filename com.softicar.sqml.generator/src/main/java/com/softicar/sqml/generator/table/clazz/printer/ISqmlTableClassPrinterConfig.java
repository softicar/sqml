package com.softicar.sqml.generator.table.clazz.printer;

import com.softicar.platform.common.code.title.TitleFromIdentifierDeterminer;
import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.db.core.table.DbTableName;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.sqml.generator.common.SqmlImportOverrides;
import com.softicar.sqml.generator.table.clazz.version.SqmlTableClassVersion;
import java.util.Collection;
import java.util.Optional;

/**
 * Implement this interface to configure the {@link SqmlTableClassPrinter}.
 *
 * @author Oliver Richers
 */
public interface ISqmlTableClassPrinterConfig {

	/**
	 * Returns the name of the class that shall be generated for the given
	 * table.
	 *
	 * @param tableName
	 *            the name of the database table
	 * @return the name of the class to generate or null if this table is not
	 *         covered by this configuration
	 */
	JavaClassName getClassName(DbTableName tableName);

	/**
	 * Returns the table structure of the given database table.
	 *
	 * @param tableName
	 *            the name of the database table
	 * @return the structure of the table or null if the table is not configured
	 */
	IDbTableStructure getTableStructure(DbTableName tableName);

	/**
	 * Writes the given content into the specified class file.
	 * <p>
	 * This method also creates all necessary parent folders of the class file
	 * if necessary.
	 *
	 * @param className
	 *            name of the class to write
	 * @param content
	 *            the content to write
	 */
	void writeClassFile(JavaClassName className, String content);

	/**
	 * Reads the content of the specified class file.
	 *
	 * @param className
	 *            name of the class to read
	 * @return the content of the class file or null if no matching file exists
	 */
	String readClassFile(JavaClassName className);

	/**
	 * Checks if a matching class file exists
	 *
	 * @param className
	 *            name of the class to check
	 * @return true if a class file exists, false otherwise
	 */
	boolean classFileExists(JavaClassName className);

	/**
	 * Enables the extraction of a custom base class from the generated file.
	 * <p>
	 * If a custom base class already exists, the return value of this method
	 * has no effect.
	 *
	 * @return whether to extract a custom base class or not
	 */
	default boolean isExtractCustomBaseClass() {

		return false;
	}

	/**
	 * Enables the extraction of a generated base class.
	 * <p>
	 * By default, this method returns <i>false</i> and only a single class is
	 * generated. If this method returns <i>true</i>, the generated code will be
	 * written to a base class with name suffix <i>Generated</i> and a stub
	 * class will be created, derived from the generated class. This derived
	 * class can then be customized.
	 * <p>
	 * If a generated base class already exists, the return value of this method
	 * has no effect.
	 *
	 * @return whether to extract a custom base class or not
	 */
	default boolean isExtractGeneratedBaseClass() {

		return false;
	}

	/**
	 * Enables the extraction of a custom table class.
	 * <p>
	 * By default, this method returns <i>false</i> and no custom table class is
	 * generated. If this method returns <i>true</i>, a custom table class with
	 * the suffix 'Table' will be generated if none exists yet.
	 *
	 * @return whether to extract a custom table class or not
	 */
	default boolean isExtractCustomTableClass() {

		return false;
	}

	/**
	 * Checks if warnings should be suppressed in generated classes.
	 *
	 * @return <i>true</i> if warnings should be suppressed; <i>false</i>
	 *         otherwise
	 */
	default boolean isGenerateSuppressWarnings() {

		return false;
	}

	/**
	 * Checks if a static <i>get(Integer id)</i> method shall be generated.
	 *
	 * @return <i>true</i> to generate the method; <i>false</i> otherwise
	 */
	boolean isGenerateGetByIdMethod();

	/**
	 * Checks if <i>get...ID</i> methods for foreign key fields shall be
	 * generated.
	 *
	 * @return <i>true</i> to generate the methods; <i>false</i> otherwise
	 */
	boolean isGenerateGetIdMethods();

	/**
	 * Determines if a <i>null</i>-returning getter method is generated for a
	 * nullable field.
	 *
	 * @return <i>true</i> to generate; <i>false</i> to not generate
	 */
	boolean isGenerateNullableGetter();

	/**
	 * Defines the suffix for the <i>null</i>-returning getter method.
	 *
	 * @return the suffix (never <i>null</i>)
	 */
	String getNullableGetterSuffix();

	/**
	 * Determines if a {@link Optional}-returning getter method is generated for
	 * a nullable field.
	 *
	 * @return <i>true</i> to generate; <i>false</i> to not generate
	 */
	boolean isGenerateOptionalGetter();

	/**
	 * Defines the suffix for the {@link Optional}-returning getter method.
	 *
	 * @return the suffix (never <i>null</i>)
	 */
	String getOptionalGetterSuffix();

	/**
	 * Determines if a throwing getter method is generated for a nullable field.
	 * <p>
	 * The getter method throws an exception if the field value is <i>null</i>.
	 *
	 * @return <i>true</i> to generate; <i>false</i> to not generate
	 */
	boolean isGenerateThrowingGetter();

	/**
	 * Defines the suffix for the throwing getter method.
	 *
	 * @return the suffix (never <i>null</i>)
	 */
	String getThrowingGetterSuffix();

	/**
	 * Returns the optional annotation class to annotate all generated classes.
	 *
	 * @return the optional full class path of the annotation class
	 */
	Optional<JavaClassName> getAnnotationForGeneratedClasses();

	/**
	 * Returns the I18n class to use for field and table titles.
	 *
	 * @return the optional I18n class
	 */
	Optional<JavaClassName> getI18nClass();

	/**
	 * Returns a collection of employed table class name prefixes.
	 * <p>
	 * The proper definition of table class name prefixes is important for the
	 * correct computation of table singular title and plural title. Titles are
	 * computed using {@link TitleFromIdentifierDeterminer}.
	 *
	 * @return all employed table class name prefixes (never null)
	 */
	Collection<String> getTableClassNamePrefixes();

	/**
	 * Returns the table class version to generate.
	 *
	 * @return the table class version (never null)
	 */
	SqmlTableClassVersion getVersion();

	/**
	 * Prefix for generated methods for loading by unique key.
	 *
	 * @return the prefix, e.g. 'loadBy'
	 */
	String getPrefixForGeneratedLoadByMethods();

	/**
	 * A prefix to use for all class fields.
	 *
	 * @return the class field prefix, e.g. 'm_' or ''
	 */
	String getPrefixForClassFields();

	/**
	 * Returns the {@link SqmlImportOverrides} instance to use.
	 *
	 * @return the {@link SqmlImportOverrides} (never <i>null</i>)
	 */
	SqmlImportOverrides getImportOverrides();
}
