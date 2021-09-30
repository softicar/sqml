package com.softicar.sqml.generator.table.clazz.field.definition;

import com.softicar.platform.common.code.java.IdentifierNames;
import com.softicar.platform.common.code.java.JavaClass;
import com.softicar.platform.common.code.java.WordFragment;
import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.platform.db.structure.column.IDbColumnStructure;
import com.softicar.platform.db.structure.foreign.key.IDbForeignKeyStructure;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.sqml.generator.table.clazz.printer.ISqmlTableClassPrinterConfig;
import java.util.List;
import java.util.Optional;

public final class SqmlTableClassFieldDefinition implements ISqmlTableClassFieldDefinition {

	private final ISqmlTableClassPrinterConfig config;
	private final IDbColumnStructure column;
	private final Optional<IDbTableStructure> foreignKeyTargetTable;
	private final List<WordFragment> nameFragments;
	private final JavaClass valueClass;

	public SqmlTableClassFieldDefinition(ISqmlTableClassPrinterConfig config, IDbColumnStructure column) {

		this.config = config;
		this.column = column;
		this.foreignKeyTargetTable = determineForeignKeyTargetTable();
		this.nameFragments = determineNameFragments();
		this.valueClass = determineValueClass();
	}

	@Override
	public IDbColumnStructure getColumn() {

		return column;
	}

	@Override
	public SqlFieldType getFieldType() {

		return column.getFieldType();
	}

	@Override
	public List<WordFragment> getNameFragments() {

		return nameFragments;
	}

	@Override
	public JavaClass getValueClass() {

		return valueClass;
	}

	@Override
	public boolean isExclusivePkField() {

		return column//
			.getTableStructure()
			.getPkColumn()
			.map(pkColumn -> column == pkColumn)
			.orElse(false);
	}

	@Override
	public boolean isIdField() {

		return isExclusivePkField() && column.isAutoIncrement();
	}

	@Override
	public boolean isBaseField() {

		return isExclusivePkField() && column.isBaseColumn() && isForeignRowField();
	}

	@Override
	public boolean isForeignRowField() {

		return foreignKeyTargetTable.isPresent();
	}

	@Override
	public boolean isForeignObjectField() {

		return foreignKeyTargetTable//
			.map(table -> table.getIdColumn().isPresent())
			.orElse(false);
	}

	@Override
	public Optional<ISqmlTableClassFieldDefinition> getForeignKeyTargetFieldDefinition() {

		return foreignKeyTargetTable//
			.flatMap(targetTable -> targetTable.getPkColumn())
			.map(targetColumn -> new SqmlTableClassFieldDefinition(config, targetColumn));
	}

	// ------------------------------ private ------------------------------ //

	private IDbTableStructure getForeignKeyTargetTable(IDbForeignKeyStructure foreignKeyStructure) {

		return config.getTableStructure(foreignKeyStructure.getForeignTableName());
	}

	private Optional<IDbTableStructure> determineForeignKeyTargetTable() {

		Optional<IDbForeignKeyStructure> foreignKeyStructure = column.getForeignKeyStructure();
		if (foreignKeyStructure.isPresent()) {
			// ensure that the foreign key points to the primary key of the target table
			// and that the target table is known to the code generation configuration
			IDbTableStructure targetTable = getForeignKeyTargetTable(foreignKeyStructure.get());
			if (targetTable != null) {
				Optional<IDbColumnStructure> foreignPkColumn = targetTable.getPkColumn();
				JavaClassName foreignClassName = config.getClassName(targetTable.getTableName());
				String foreignColumnName = foreignKeyStructure.get().getForeignColumnName(column.getNameOrThrow());
				if (foreignPkColumn.isPresent() && foreignClassName != null && foreignPkColumn.get().getNameOrThrow().equalsIgnoreCase(foreignColumnName)) {
					return Optional.of(targetTable);
				}
			}
		}
		return Optional.empty();
	}

	private JavaClass determineValueClass() {

		if (foreignKeyTargetTable.isPresent()) {
			return getForeignClass(foreignKeyTargetTable.get());
		}

		if (column.getFieldType() == SqlFieldType.ENUM) {
			return new JavaClass(new JavaClassName(getUpperCamelName(nameFragments)));
		} else {
			return column.getFieldType().getJavaClass();
		}
	}

	private JavaClass getForeignClass(IDbTableStructure targetTable) {

		JavaClassName foreignClassName = config.getClassName(targetTable.getTableName());
		JavaClass valueClass = new JavaClass(foreignClassName);
		return valueClass;
	}

	private List<WordFragment> determineNameFragments() {

		if (isIdField()) {
			return WordFragment.parse("id");
		} else {
			return WordFragment.parse(column.getLogicalName());
		}
	}

	private static String getUpperCamelName(List<WordFragment> nameFragments) {

		return IdentifierNames.Type.UPPER_CAMEL.get(nameFragments);
	}
}
