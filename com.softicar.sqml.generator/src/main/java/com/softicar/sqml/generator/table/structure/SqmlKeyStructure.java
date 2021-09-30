package com.softicar.sqml.generator.table.structure;

import com.softicar.platform.db.structure.key.DbKeyStructure;
import com.softicar.platform.db.structure.key.DbKeyType;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.sqml.model.tables.ISqmlTableKey;
import com.softicar.sqml.model.tables.SqmlUniqueKey;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

class SqmlKeyStructure extends DbKeyStructure {

	public SqmlKeyStructure(IDbTableStructure tableStructure, ISqmlTableKey key) {

		super(tableStructure);

		setName(determineName(key));
		setType(determineType(key));
		addColumnNames(determineColumnNames(key));
	}

	private static String determineName(ISqmlTableKey key) {

		return Optional.ofNullable(key.getName()).orElse(key.getImplicitName());
	}

	private static DbKeyType determineType(ISqmlTableKey key) {

		return key instanceof SqmlUniqueKey? DbKeyType.UNIQUE : DbKeyType.INDEX;
	}

	private static Collection<String> determineColumnNames(ISqmlTableKey key) {

		return key//
			.getColumns()
			.stream()
			.map(column -> column.getPhysicalName())
			.collect(Collectors.toList());
	}
}
