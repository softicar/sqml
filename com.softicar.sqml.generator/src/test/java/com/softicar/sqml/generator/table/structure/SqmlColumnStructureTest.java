package com.softicar.sqml.generator.table.structure;

import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import org.junit.Test;
import org.mockito.Mockito;

public class SqmlColumnStructureTest extends AbstractSqmlColumnStructureTest {

	@Test
	public void testBitsWithForeignKeyColumn() {

		ISqmlTableColumn foreignTablePkColumn = createIntegerColumn("ForeignTablePkColumn");
		ISqmlTable foreignTable = createTableWithPkColumn("ForeignTable", foreignTablePkColumn);
		ISqmlTableColumn testColumn = createFkColumn("TestColumn", foreignTable);

		Mockito.when(foreignTablePkColumn.getBits()).thenReturn(8);
		SqmlColumnStructure columnStructure = new SqmlColumnStructure(Mockito.mock(IDbTableStructure.class), testColumn);

		assertEquals(8, columnStructure.getBits());
	}

	@Test
	public void testUnsignedWithForeignKeyColumn() {

		ISqmlTableColumn foreignTablePkColumn = createIntegerColumn("ForeignTablePkColumn");
		ISqmlTable foreignTable = createTableWithPkColumn("ForeignTable", foreignTablePkColumn);
		ISqmlTableColumn testColumn = createFkColumn("TestColumn", foreignTable);

		Mockito.when(foreignTablePkColumn.isUnsigned()).thenReturn(true);
		SqmlColumnStructure columnStructure = new SqmlColumnStructure(Mockito.mock(IDbTableStructure.class), testColumn);

		assertTrue(columnStructure.isUnsigned());
	}
}
