package com.softicar.sqml.generator.table.clazz.key;

import com.softicar.platform.common.code.java.JavaClass;
import com.softicar.platform.common.container.tuple.Tuple2;
import com.softicar.platform.common.container.tuple.Tuple3;
import com.softicar.platform.common.container.tuple.Tuple4;
import com.softicar.platform.common.core.exceptions.SofticarException;
import com.softicar.platform.db.structure.column.IDbColumnStructure;
import com.softicar.platform.db.structure.key.IDbKeyStructure;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.sqml.generator.common.SqmlJavaCodePrinter;
import com.softicar.sqml.generator.table.clazz.printer.ISqmlTableClassPrinterSettings;
import java.util.List;
import java.util.stream.Collectors;

public class SqmlTableClassKeyTypeDeterminer {

	private final SqmlJavaCodePrinter printer;
	private final ISqmlTableClassPrinterSettings settings;
	private final IDbTableStructure tableStructure;

	public SqmlTableClassKeyTypeDeterminer(SqmlJavaCodePrinter printer, ISqmlTableClassPrinterSettings settings) {

		this.printer = printer;
		this.settings = settings;
		this.tableStructure = settings.getTableStructure();
	}

	public String getAndImportType() {

		if (tableStructure.getIdColumn().isPresent()) {
			return Integer.class.getSimpleName();
		} else {
			return tableStructure//
				.getPrimaryKey()
				.map(this::getAndImportPrimaryKeyType)
				.orElseThrow(() -> new SofticarException("The table %s is missing a primary key.", settings.getTableName()));
		}
	}

	private String getAndImportPrimaryKeyType(IDbKeyStructure primaryKey) {

		List<IDbColumnStructure> columns = primaryKey.getColumns();
		switch (columns.size()) {
		case 1:
			return getAndImportType(primaryKey.getColumns().get(0));
		case 2:
			return getAndImportTupleType(Tuple2.class, primaryKey);
		case 3:
			return getAndImportTupleType(Tuple3.class, primaryKey);
		case 4:
			return getAndImportTupleType(Tuple4.class, primaryKey);
		default:
			throw new SofticarException("Primary keys with %s columns not yet supported.", columns.size());
		}
	}

	private String getAndImportTupleType(Class<?> tupleClass, IDbKeyStructure primaryKey) {

		printer.addImport(tupleClass);
		String tupleElementTypes = primaryKey//
			.getColumns()
			.stream()
			.map(column -> getAndImportType(column))
			.collect(Collectors.joining(", "));
		return String.format("%s<%s>", tupleClass.getSimpleName(), tupleElementTypes);
	}

	private String getAndImportType(IDbColumnStructure column) {

		JavaClass valueClass = settings//
			.getFieldPrinter(column)
			.getFieldDefinition()
			.getValueClass();
		printer.addImport(valueClass);
		return valueClass.getSimpleName();
	}
}
