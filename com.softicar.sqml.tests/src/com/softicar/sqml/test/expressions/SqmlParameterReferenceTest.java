package com.softicar.sqml.test.expressions;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.selects.ISqmlSelect;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlParameterReferenceTest extends AbstractSqmlTest {

	@Test
	public void testTypeOfCollectionParameters() {

		ISqmlSelect select = createQueryTest()
			.add("Integer[] collection")
			.add("List<Integer> list")
			.add("Set<Integer> set")
			.add("SELECT $collection AS collection")
			.add("SELECT $list AS list")
			.add("SELECT $set AS set")
			.getSelect();

		ISqmlType collectionType = SqmlBuiltInTypes.getListType().parameterize(SqmlBuiltInTypes.getIntegerType());
		assertTrue(select.getColumn("collection").getSqmlType().is(collectionType));

		ISqmlType listType = SqmlBuiltInTypes.getListType().parameterize(SqmlBuiltInTypes.getIntegerType());
		assertTrue(select.getColumn("list").getSqmlType().is(listType));

		ISqmlType setType = SqmlBuiltInTypes.getSetType().parameterize(SqmlBuiltInTypes.getIntegerType());
		assertTrue(select.getColumn("set").getSqmlType().is(setType));
	}
}
