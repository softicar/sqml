package com.softicar.sqml.model.tables.validation;

import com.softicar.platform.common.container.map.list.ListTreeMap;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.utils.SqmlNavigation;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.resource.Resource;

public class SqmlTableValidator {

	private final ISqmlTable table;
	private final ISqmlValidationContext context;

	public SqmlTableValidator(ISqmlTable table, ISqmlValidationContext context) {

		this.table = table;
		this.context = context;
	}

	public void validate() {

		SqmlIssueMissingPrimaryKey.validate(table, context);
		SqmlIssueMissingSerialColumn.validate(table, context);
		SqmlIssueTooManySerialOrBaseColumns.validate(table, context);
		SqmlIssueTooManyPrimaryKeyFields.validate(table, context);
		SqmlIssueSerialOrBaseColumnNotSinglePrimaryKeyColumn.validate(table, context);
		SqmlIssueDuplicatedPhysicalTable.validate(table, context);

		checkPhysicalTableName();
		checkDuplicatedColumnName();
		checkDuplicatedPhysicalColumnName();
		checkNameMatchesFilename();
		checkEnumTable();
	}

	private void checkPhysicalTableName() {

		String[] parts = table.getPhysicalNameOverride().split("\\.");
		if (parts.length != 2) {
			context.accept(new SqmlIssueInvalidPhysicalTableName(table));
		}
	}

	private void checkDuplicatedColumnName() {

		// fill name map
		ListTreeMap<String, ISqmlTableColumn> nameMap = new ListTreeMap<>();
		for (ISqmlTableColumn column: table.getColumns()) {
			nameMap.addToList(column.getName(), column);
		}

		// check name map
		for (List<ISqmlTableColumn> columnList: nameMap.values()) {
			if (columnList.size() > 1) {
				for (ISqmlTableColumn column: columnList) {
					context.accept(new SqmlIssueDuplicatedTableColumnName(column));
				}
			}
		}
	}

	private void checkDuplicatedPhysicalColumnName() {

		// fill name map
		ListTreeMap<String, ISqmlTableColumn> nameMap = new ListTreeMap<>();
		for (ISqmlTableColumn column: table.getColumns()) {
			nameMap.addToList(column.getPhysicalName().toUpperCase(), column);
		}

		// collect duplicated columns
		List<ISqmlTableColumn> duplicatedColumns = new ArrayList<>();
		for (List<ISqmlTableColumn> columns: nameMap.values()) {
			if (columns.size() > 1) {
				duplicatedColumns.addAll(columns);
			}
		}

		for (ISqmlTableColumn column: duplicatedColumns) {
			if (column.getPhysicalNameOverride() != null) {
				context.accept(new SqmlIssueDuplicatedPhysicalTableColumnName(column));
			} else {
				context.accept(new SqmlIssueDuplicatedImplicitPhysicalTableColumnName(column));
			}
		}
	}

	private void checkNameMatchesFilename() {

		Resource resource = SqmlNavigation.getResource(table);
		String expectedName = resource.getURI().trimFileExtension().lastSegment();
		if (!table.getName().equals(expectedName)) {
			context.accept(new SqmlIssueTableNameMustMatchFilename(table, expectedName));
		}
	}

	private void checkEnumTable() {

		if (table.isEnumTable()) {
			new SqmlEnumTableValidator(table, context).validate();
		}
	}
}
