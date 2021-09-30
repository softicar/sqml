package com.softicar.sqml.test.types;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.types.validation.SqmlIssueUnresolvedTypeReference;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlTypeReferenceTest extends AbstractSqmlTest {

	@Test
	public void testIntegerTypeReference() {

		ISqmlQuery query = createQueryTest()//
			.add("Integer value")
			.add("SELECT $value AS x")
			.getQuery();

		assertEquals(1, query.getParameters().size());
		ISqmlType actualType = query.getParameters().get(0).getSqmlType();
		ISqmlType expectedType = SqmlBuiltInTypes.getIntegerType();
		assertTrue(actualType.is(expectedType));
	}

	@Test
	public void testIntegerCollectionTypeReference() {

		ISqmlQuery query = createQueryTest()//
			.add("Integer[] value")
			.add("SELECT $value AS x")
			.getQuery();

		assertEquals(1, query.getParameters().size());
		ISqmlType actualType = query.getParameters().get(0).getSqmlType();
		ISqmlType expectedType = SqmlBuiltInTypes.getListType().parameterize(SqmlBuiltInTypes.getIntegerType());
		assertTrue(actualType.is(expectedType));
	}

	@Test
	public void testTupleCollectionTypeReference() {

		ISqmlQuery query = createQueryTest()//
			.add("Tuple<Integer, String>[] value")
			.add("SELECT $value AS x")
			.getQuery();

		assertEquals(1, query.getParameters().size());
		ISqmlType actualType = query.getParameters().get(0).getSqmlType();
		ISqmlType expectedType = SqmlBuiltInTypes
			.getListType()
			.parameterize(SqmlBuiltInTypes.getTupleType().parameterize(SqmlBuiltInTypes.getIntegerType(), SqmlBuiltInTypes.getStringType()));
		assertTrue(actualType.is(expectedType));
	}

	@Test
	public void testUnresolvedTypeReference() {

		createFileTest("Foo.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("TABLE Foo 'db.foo'")
			.add("    unknownType id")
			.add("END")
			.assertIssue(SqmlIssueUnresolvedTypeReference.class, 4);
	}
}
