package com.softicar.sqml.generator.table.clazz.field.definition;

import com.softicar.platform.common.code.java.JavaClass;
import com.softicar.platform.common.code.java.WordFragment;
import com.softicar.platform.db.runtime.logic.IDbObjectTable;
import com.softicar.platform.db.runtime.table.IDbTable;
import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.platform.db.structure.column.IDbColumnStructure;
import java.util.List;
import java.util.Optional;

/**
 * Describes the mapping of a database field into Java.
 *
 * @author Oliver Richers
 */
public interface ISqmlTableClassFieldDefinition {

	/**
	 * Returns the word fragments of the logical field name.
	 *
	 * @return the field word fragments (never null)
	 */
	List<WordFragment> getNameFragments();

	/**
	 * Returns the value class of this field.
	 *
	 * @return the value class (never null)
	 */
	JavaClass getValueClass();

	/**
	 * Returns the SQL type of this field.
	 *
	 * @return the SQL field type (never null)
	 */
	SqlFieldType getFieldType();

	/**
	 * Returns the {@link IDbColumnStructure} of this field.
	 *
	 * @return the column structure (never null)
	 */
	IDbColumnStructure getColumn();

	/**
	 * Returns true if this is the exclusive PK field of the table.
	 * <p>
	 * A PK field is a field that represents the primary key of its table. For
	 * tables with a multi-field primary key, this method will always return
	 * false.
	 *
	 * @return if this is the PK field; false otherwise
	 */
	boolean isExclusivePkField();

	/**
	 * Returns true if this is an ID field.
	 * <p>
	 * An ID field is an auto-incrementing field, representing the primary key
	 * of the table.
	 * <p>
	 * This method implies {@link #isExclusivePkField()}.
	 *
	 * @return if this is an ID field; false otherwise
	 */
	boolean isIdField();

	/**
	 * Returns true if this is a base field.
	 * <p>
	 * A base field is a field with an FK to another {@link IDbTable}. It must
	 * be the exclusive primary key field of its table and must be marked
	 * explicitly as base field.
	 * <p>
	 * This method implies {@link #isForeignRowField()} and
	 * {@link #isExclusivePkField()}.
	 *
	 * @return if this is a base field; false otherwise
	 */
	boolean isBaseField();

	/**
	 * Returns true if this is a field with an FK to another {@link IDbTable}.
	 *
	 * @return true if this is an FK field; false otherwise
	 */
	boolean isForeignRowField();

	/**
	 * Returns true if this is a field with an FK to an {@link IDbObjectTable}.
	 * <p>
	 * This method implies {@link #isForeignRowField()}.
	 *
	 * @return true if this is an FK field; false otherwise
	 */
	boolean isForeignObjectField();

	/**
	 * Returns the {@link ISqmlTableClassFieldDefinition} of the target field.
	 * <p>
	 * The returned optional will be empty if this is not an FK field.
	 *
	 * @return the target field definition
	 */
	Optional<ISqmlTableClassFieldDefinition> getForeignKeyTargetFieldDefinition();
}
