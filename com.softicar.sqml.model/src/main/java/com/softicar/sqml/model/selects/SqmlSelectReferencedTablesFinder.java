package com.softicar.sqml.model.selects;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.utils.SqmlModelTreeWalker;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

class SqmlSelectReferencedTablesFinder extends SqmlModelTreeWalker {

	private final Map<JavaClassName, ISqmlTable> tables = new TreeMap<>();

	public Collection<ISqmlTable> find(ISqmlSelect selectStatement) {

		tables.clear();
		visit(selectStatement);
		return tables.values();
	}

	@Override
	public void visit(ISqmlTable table) {

		super.visit(table);

		tables.put(table.getClassName(), table);
	}
}
