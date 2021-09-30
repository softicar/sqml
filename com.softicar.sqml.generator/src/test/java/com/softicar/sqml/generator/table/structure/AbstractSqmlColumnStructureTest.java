package com.softicar.sqml.generator.table.structure;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.types.ISqmlTypeReference;
import java.util.Collections;
import java.util.Optional;
import org.junit.Assert;
import org.mockito.Mockito;

class AbstractSqmlColumnStructureTest extends Assert {

	protected ISqmlTable createTableWithPkColumn(String name, ISqmlTableColumn pkColumn) {

		ISqmlTable table = Mockito.mock(ISqmlTable.class, name);
		Mockito.when(table.getPrimarKeyColumn()).thenReturn(pkColumn);
		Mockito.when(table.getPrimarKeyColumns()).thenAnswer(dummy -> Collections.singletonList(pkColumn));
		return table;
	}

	protected ISqmlTableColumn createIntegerColumn(String name) {

		ISqmlTableColumn column = Mockito.mock(ISqmlTableColumn.class, name);
		Mockito.when(column.getForeignKeyTargetTable()).thenReturn(Optional.empty());
		Mockito.when(column.getTypeReference()).thenAnswer(dummy -> createIntegerTypeReference());
		return column;
	}

	protected ISqmlTableColumn createFkColumn(String name, ISqmlTable foreignTable) {

		ISqmlTableColumn tableColumn = Mockito.mock(ISqmlTableColumn.class, name);
		Mockito.when(tableColumn.getForeignKeyTargetTable()).thenReturn(Optional.of(foreignTable));
		Mockito.when(tableColumn.getTypeReference()).thenAnswer(dummy -> createTableTypeReference(foreignTable));
		return tableColumn;
	}

	protected ISqmlTypeReference createIntegerTypeReference() {

		ISqmlTypeReference typeReference = Mockito.mock(ISqmlTypeReference.class);
		Mockito.when(typeReference.getSqmlType()).thenReturn(SqmlBuiltInTypes.getIntegerType());
		return typeReference;
	}

	protected ISqmlTypeReference createTableTypeReference(ISqmlTable table) {

		ISqmlTypeReference typeReference = Mockito.mock(ISqmlTypeReference.class);
		Mockito.when(typeReference.getSqmlType()).thenReturn(table);
		return typeReference;
	}
}
