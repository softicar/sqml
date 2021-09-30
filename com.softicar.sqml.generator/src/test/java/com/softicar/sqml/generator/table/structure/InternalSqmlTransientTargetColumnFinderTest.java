package com.softicar.sqml.generator.table.structure;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import org.junit.Test;

public class InternalSqmlTransientTargetColumnFinderTest extends AbstractSqmlColumnStructureTest {

	@Test
	public void testWithNonFkColumn() {

		ISqmlTableColumn startColumn = createIntegerColumn("StartColumn");

		ISqmlTableColumn foundColumn = new InternalSqmlTransientTargetColumnFinder(startColumn).findTargetColumn();

		assertSame(startColumn, foundColumn);
	}

	@Test
	public void testWithFkColumn() {

		ISqmlTableColumn foreignTablePkColumn = createIntegerColumn("ForeignTablePkColumn");
		ISqmlTable foreignTable = createTableWithPkColumn("ForeignTable", foreignTablePkColumn);
		ISqmlTableColumn startColumn = createFkColumn("StartColumn", foreignTable);

		ISqmlTableColumn foundColumn = new InternalSqmlTransientTargetColumnFinder(startColumn).findTargetColumn();

		assertSame(foreignTablePkColumn, foundColumn);
	}

	@Test
	public void testWithFkFkColumn() {

		ISqmlTableColumn firstTablePkColumn = createIntegerColumn("FirstTablePkColumn");
		ISqmlTable firstTable = createTableWithPkColumn("FirstTable", firstTablePkColumn);
		ISqmlTableColumn secondTablePkColumn = createFkColumn("SecondTablePkColumn", firstTable);
		ISqmlTable secondTable = createTableWithPkColumn("SecondTable", secondTablePkColumn);
		ISqmlTableColumn startColumn = createFkColumn("StartColumn", secondTable);

		ISqmlTableColumn foundColumn = new InternalSqmlTransientTargetColumnFinder(startColumn).findTargetColumn();

		assertSame(firstTablePkColumn, foundColumn);
	}
}
