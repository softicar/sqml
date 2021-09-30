package com.softicar.sqml.test.queries;

import com.softicar.platform.common.container.tuple.Tuple2;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.junit.Test;

public class SqmlQueryInterfaceGeneratorTest extends AbstractSqmlTest {

	@Test
	public void testTrivialQuery() {

		createQueryTest()//
			.addAll("SELECT 1 AS one")
			.assertJava("package com.example;")
			.assertJava("")
			.assertJava("public interface IQuery extends IDbQuery<IQuery.IRow> {")
			.assertJava("    IDbQueryColumn<IRow, Integer> ONE_COLUMN = new DbQueryColumn<>(IRow::getOne, \"one\", SqlValueTypes.INTEGER);")
			.assertJava("    IFactory FACTORY = new Implementation.Factory();")
			.assertJava("    interface IRow extends IDbQueryRow<IRow> {")
			.assertJava("    }")
			.assertJava("    interface IFactory extends IDbQueryFactory<IRow> {")
			.assertJava("        IQuery createQuery();")
			.assertJava("    }")
			.assertJava("    class Implementation {")
			.assertJava("        private static class Factory implements IFactory {")
			.assertJava("            public Factory() {")
			.assertJava("                this.columns.add(ONE_COLUMN);")
			.assertJava("            }")
			.assertJava("        }")
			.assertJava("        private static class Query extends AbstractDbQuery<IRow> implements IQuery {")
			.assertJava("        private static class Row extends AbstractDbQueryRow<IRow> implements IRow {")
			.assertJava("    }")
			.assertJava("}");
	}

	@Test
	public void testColumnTitles() {

		createQueryTest()//
			.add("SELECT 1 AS one TITLE 'This is one'")
			.assertJava(
				new StringBuilder()
					.append("IDbQueryColumn<IRow, Integer> ONE_COLUMN = ")
					.append("new DbQueryColumn<>(IRow::getOne, \"one\", SqlValueTypes.INTEGER, TestI18n.THIS_IS_ONE);")
					.toString());
	}

	@Test
	public void testColumnTitlesOnSubColumns() {

		SqmlTestCases.loadDeliveryTestCase(parser);

		createQueryTest()//
			.add("SELECT d.supplier TITLE 'The Supplier'")
			.add("FROM Delivery d")
			.assertJava(
				new StringBuilder()
					.append("IDbQueryTableColumn<IRow, Supplier> SUPPLIER_COLUMN = ")
					.append("new DbQueryTableStubColumn<>(IRow::getSupplier, \"supplier\", Supplier.TABLE, TestI18n.THE_SUPPLIER);")
					.toString());
	}

	@Test
	public void testOptionalParameters() {

		createQueryTest()//
			.add("OPTIONAL Boolean flag")
			.add("SELECT 1 AS one")
			.add("WHERE $flag")
			.assertNoIssues()
			.assertJava("IQuery setFlag(Boolean flag);")

			// assert that query can be created directly
			.assertJava("interface IFactory extends IDbQueryFactory<IRow> {")
			.assertJava("    IQuery createQuery();")
			.assertJava("}")

			// assert that query has a setter
			.assertJava("private static class Query extends AbstractDbQuery<IRow> implements IQuery {")
			.assertJava("    @Override")
			.assertJava("    public IQuery setFlag(Boolean flag) {")
			.assertJava("        this.parameters.flag = flag;")
			.assertJava("        return this;")
			.assertJava("    }")
			.assertJava("}");
	}

	@Test
	public void testMandatoryCollectionParameter() {

		parser.loadLanguagePackage();
		SqmlTestCases.loadDeliveryTestCase(parser);

		createQueryTest()//
			.add("Integer[] deliveryIds")
			.add("String number")
			.add("SELECT d.* FROM Delivery d")
			.add("WHERE d.id IN $deliveryIds")
			.add("WHERE d.number = $number")
			.assertJava("import %s;", ArrayList.class.getCanonicalName())
			.assertJava("import %s;", Collection.class.getCanonicalName())
			.assertJava("import %s;", List.class.getCanonicalName())
			.assertJava("interface IDeliveryIdsSetter {")
			.assertJava("    INumberSetter setDeliveryIds(Integer... deliveryIds);")
			.assertJava("    INumberSetter setDeliveryIds(Collection<? extends Integer> deliveryIds);")
			.assertJava("}")
			.assertJava("class Implementation {")
			.assertJava("    private static class Factory implements IFactory {")
			.assertJava("        public IDeliveryIdsSetter createQuery() {")
			.assertJava("    }")

			// assert collection is array list by default
			.assertJava("    private static class Parameters {")
			.assertJava("        private List<Integer> deliveryIds = new ArrayList<>();")
			.assertJava("    }")

			.assertJava("    public class DeliveryIdsSetter implements IDeliveryIdsSetter {")
			.assertJava("        public final INumberSetter setDeliveryIds(Integer... deliveryIds) {")
			.assertJava("            return this.setDeliveryIds(Arrays.asList(deliveryIds));")
			.assertJava("        }")
			.assertJava("        public final INumberSetter setDeliveryIds(Collection<? extends Integer> deliveryIds) {")
			.assertJava("            Query.this.parameters.deliveryIds.addAll(deliveryIds);")
			.assertJava("            return Query.this.new NumberSetter();")
			.assertJava("        }")
			.assertJava("    }")
			.assertJava("}");
	}

	@Test
	public void testOptionalCollectionParameter() {

		createQueryTest()//
			.add("OPTIONAL Integer[] values")
			.add("SELECT 1 AS one")
			.add("#IF $values IS NOT EMPTY { WHERE 1 IN $values }")
			.assertNoIssues()
			.assertJava("import %s;", ArrayList.class.getCanonicalName())
			.assertJava("import %s;", Collection.class.getCanonicalName())
			.assertJava("IQuery addValues(Integer...values);")
			.assertJava("IQuery addValues(Collection<? extends Integer> values);")

			// assert that query can be created directly
			.assertJava("interface IFactory extends IDbQueryFactory<IRow> {")
			.assertJava("    IQuery createQuery();")
			.assertJava("}")

			// assert that query has a setter
			.assertJava("private static class Query extends AbstractDbQuery<IRow> implements IQuery {")
			.assertJava("    @Override")
			.assertJava("    @SafeVarargs")
			.assertJava("    public final IQuery addValues(Integer...values) {")
			.assertJava("        return this.addValues(Arrays.asList(values));")
			.assertJava("    }")
			.assertJava("    public final IQuery addValues(Collection<? extends Integer> values) {")
			.assertJava("        this.parameters.values.addAll(values);")
			.assertJava("        return this;")
			.assertJava("    }")
			.assertJava("}");
	}

	@Test
	public void testMandatoryListParameter() {

		createQueryTest()//
			.add("List<Integer> values")
			.add("SELECT 1 AS x")
			.add("WHERE 1 IN $values")
			.assertNoIssues()
			.assertJava("import %s;", ArrayList.class.getCanonicalName())
			.assertJava("import %s;", List.class.getCanonicalName())
			.assertJava("    IQuery setValues(Integer... values);")
			.assertJava("    IQuery setValues(Collection<? extends Integer> values);")
			.assertJava("    private List<Integer> values = new ArrayList<>();")
			.assertJava("    public final IQuery setValues(Integer... values) {")
			.assertJava("    public final IQuery setValues(Collection<? extends Integer> values) {");
	}

	@Test
	public void testOptionalListParameter() {

		createQueryTest()//
			.add("OPTIONAL List<Integer> values")
			.add("SELECT 1 AS x")
			.add("WHERE 1 IN $values")
			.assertNoIssues()
			.assertJava("import %s;", ArrayList.class.getCanonicalName())
			.assertJava("import %s;", List.class.getCanonicalName())
			.assertJava("    IQuery addValues(Integer...values);")
			.assertJava("    IQuery addValues(Collection<? extends Integer> values);")
			.assertJava("    private List<Integer> values = new ArrayList<>();")
			.assertJava("    public final IQuery addValues(Integer...values) {")
			.assertJava("    public final IQuery addValues(Collection<? extends Integer> values) {");
	}

	@Test
	public void testMandatorySetParameter() {

		createQueryTest()//
			.add("Set<Integer> values")
			.add("SELECT 1 AS x")
			.add("WHERE 1 IN $values")
			.assertNoIssues()
			.assertJava("import %s;", Set.class.getCanonicalName())
			.assertJava("import %s;", TreeSet.class.getCanonicalName())
			.assertJava("    IQuery setValues(Integer... values);")
			.assertJava("    IQuery setValues(Collection<? extends Integer> values);")
			.assertJava("    private Set<Integer> values = new TreeSet<>();")
			.assertJava("    public final IQuery setValues(Integer... values) {")
			.assertJava("        return this.setValues(Arrays.asList(values));")
			.assertJava("    }")
			.assertJava("    public final IQuery setValues(Collection<? extends Integer> values) {");
	}

	@Test
	public void testOptionalSetParameter() {

		createQueryTest()//
			.add("OPTIONAL Set<Integer> values")
			.add("SELECT 1 AS x")
			.add("WHERE 1 IN $values")
			.assertNoIssues()
			.assertJava("import %s;", Set.class.getCanonicalName())
			.assertJava("import %s;", TreeSet.class.getCanonicalName())
			.assertJava("    IQuery addValues(Integer...values);")
			.assertJava("    IQuery addValues(Collection<? extends Integer> values);")
			.assertJava("    private Set<Integer> values = new TreeSet<>();")
			.assertJava("    public final IQuery addValues(Integer...values) {")
			.assertJava("        return this.addValues(Arrays.asList(values));")
			.assertJava("    }")
			.assertJava("    public final IQuery addValues(Collection<? extends Integer> values) {");
	}

	@Test
	public void testTupleCollectionParameter() {

		createQueryTest()//
			.add("Tuple<String, Integer>[] tuples")
			.add("SELECT 1 AS one")
			.add("WHERE ('foo', 1) IN $tuples")
			.assertJava("import %s;", Tuple2.class.getCanonicalName())
			.assertJava("import %s;", ArrayList.class.getCanonicalName())
			.assertJava("import %s;", Collection.class.getCanonicalName())

			// setter interface
			.assertJava("interface ITuplesSetter {")
			.assertJava("    @SuppressWarnings(\"unchecked\")")
			.assertJava("    IQuery setTuples(Tuple2<String, Integer>... tuples);")
			.assertJava("    IQuery setTuples(Collection<? extends Tuple2<String, Integer>> tuples);")
			.assertJava("}")

			// parameters class
			.assertJava("private static class Parameters {")
			.assertJava("    private List<Tuple2<String, Integer>> tuples = new ArrayList<>();")
			.assertJava("}")

			// setter class
			.assertJava("public class TuplesSetter implements ITuplesSetter {")
			.assertJava("    @SafeVarargs")
			.assertJava("    public final IQuery setTuples(Tuple2<String, Integer>... tuples) {")
			.assertJava("    public final IQuery setTuples(Collection<? extends Tuple2<String, Integer>> tuples) {")
			.assertJava("}");
	}

	@Test
	public void testTupleParameter() {

		createQueryTest()//
			.add("Tuple<String, Integer> tuple")
			.add("SELECT 1 AS one")
			.add("WHERE ('foo', 1) = $tuple")
			.assertNoIssues()

			// setter interface
			.assertJava("interface ITupleSetter {")
			.assertJava("    IQuery setTuple(Tuple2<String, Integer> tuple);")
			.assertJava("}")

			// parameters class
			.assertJava("private static class Parameters {")
			.assertJava("    private Tuple2<String, Integer> tuple;")
			.assertJava("}")

			// setter class
			.assertJava("public class TupleSetter implements ITupleSetter {")
			.assertJava("    public final IQuery setTuple(Tuple2<String, Integer> tuple) {")
			.assertJava("        Query.this.parameters.tuple = tuple;")
			.assertJava("    }")
			.assertJava("}");
	}

	@Test
	public void testForeignColumnReferences() {

		createTableTest("Container", "db.containers")//
			.add("PK Integer id = SERIAL")
			.add("String text")
			.assertNoIssues();
		createTableTest("Item", "db.items")//
			.add("PK Integer id = SERIAL")
			.add("Blob hash")
			.add("Container container")
			.assertNoIssues();

		ISqmlFile file = createFileTest("Query.sqml")
			.add("PACKAGE com.example")
			.add()
			.add("QUERY Query {")
			.add("    SELECT i.id, i.container, i.hash")
			.add("    FROM Item AS i")
			.add("}")
			.getFile();

		createQueryTest(file.getQuery("Query"))//
			.assertJava("public interface IQuery extends IDbQuery<IQuery.IRow> {")
			.assertJava("    IDbQueryColumn<IRow, Integer> ID_COLUMN = new DbQueryColumn<>(IRow::getId, \"id\", SqlValueTypes.INTEGER);")
			.assertJava(
				"    IDbQueryTableColumn<IRow, Container> CONTAINER_COLUMN = new DbQueryTableStubColumn<>(IRow::getContainer, \"container\", Container.TABLE);")
			.assertJava("    IDbQueryColumn<IRow, byte[]> HASH_COLUMN = new DbQueryColumn<>(IRow::getHash, \"hash\", SqlValueTypes.BYTE_ARRAY);")
			.assertJava()
			.assertJava("    private static class Row extends AbstractDbQueryRow<IRow> implements IRow {")
			.assertJava("        private final Integer id;")
			.assertJava("        private final Container container;")
			.assertJava("        private final byte[] hash;")
			.assertJava()
			.assertJava("    private Row(IQuery query, IDbSqlSelect select, DbResultSet resultSet) {")
			.assertJava("        this.id = ID_COLUMN.loadValue(select, resultSet);")
			.assertJava("        this.container = CONTAINER_COLUMN.loadValue(select, resultSet);")
			.assertJava("        this.hash = HASH_COLUMN.loadValue(select, resultSet);");
	}

	@Test
	public void testTableReferences() {

		createTableTest("Container", "db.containers")//
			.add("PK Integer id = SERIAL")
			.add("String name")
			.assertNoIssues();
		createTableTest("Item", "db.items")//
			.add("PK Integer id = SERIAL")
			.add("Container container")
			.assertNoIssues();

		ISqmlFile file = createFileTest("Query.sqml")//
			.add("PACKAGE com.example")
			.add()
			.add("QUERY Query {")
			.add("    SELECT c.*, i.container")
			.add("    FROM Item i")
			.add("    JOIN i.container c")
			.add("}")
			.getFile();

		createQueryTest(file.getQuery("Query"))//
			.assertJava("public interface IQuery extends IDbQuery<IQuery.IRow> {")
			.assertJava("    IDbQueryTableColumn<IRow, Container> C_COLUMN = new DbQueryTableColumn<>(IRow::getC, \"c\", Container.TABLE);")
			.assertJava(
				"    IDbQueryTableColumn<IRow, Container> CONTAINER_COLUMN = new DbQueryTableStubColumn<>(IRow::getContainer, \"container\", Container.TABLE);")
			.assertJava()
			.assertJava("    private static class Row extends AbstractDbQueryRow<IRow> implements IRow {")
			.assertJava("        private final Container c;")
			.assertJava("        private final Container container;")
			.assertJava()
			.assertJava("        private Row(IQuery query, IDbSqlSelect select, DbResultSet resultSet) {")
			.assertJava("            this.c = C_COLUMN.loadValue(select, resultSet);")
			.assertJava("            this.container = CONTAINER_COLUMN.loadValue(select, resultSet);");
	}
}
