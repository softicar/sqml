package com.softicar.sqml.test.utils;

import static org.junit.Assert.assertEquals;
import com.softicar.platform.common.core.exceptions.SofticarDeveloperException;
import com.softicar.platform.common.core.utils.CastUtils;
import com.softicar.platform.common.core.utils.ReflectionUtils;
import com.softicar.platform.common.string.Imploder;
import com.softicar.platform.db.runtime.logic.IDbObjectTable;
import com.softicar.platform.db.runtime.query.IDbQuery;
import com.softicar.platform.db.runtime.query.builder.IDbQuerySqlBuilder;
import com.softicar.platform.db.runtime.select.DbSqlFormatter;
import com.softicar.platform.db.runtime.select.IDbSqlSelect;
import com.softicar.platform.db.runtime.table.row.IDbTableRow;
import com.softicar.sqml.generator.query.SqmlQueryFactoryGenerator;
import com.softicar.sqml.generator.query.SqmlQueryInterfaceGenerator;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.selects.ISqmlSelect;
import com.softicar.sqml.test.parser.SqmlTestParser;
import com.softicar.sqml.test.preferences.SqmlTestGeneratorPreferencesProvider;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SqmlQueryTest extends AbstractSqmlGenerationTest<ISqmlQuery, SqmlQueryTest> {

	public SqmlQueryTest(SqmlTestParser parser) {

		super("Query.sqml", parser);
	}

	public SqmlQueryTest(SqmlTestParser parser, ISqmlQuery query) {

		super(query.getName() + ".sqml", parser, query);
	}

	public Class<IDbQuery<?>> createRuntimeQueryClass() {

		return new SqmlTestSelectGenerator(getQuery()).createRuntimeQueryClass();
	}

	public IDbQuery<?> createRuntimeQuery(Object...arguments) {

		try {
			// generate query class
			Class<IDbQuery<?>> queryClass = createRuntimeQueryClass();

			// create query object
			Object queryFactory = queryClass.getField(SqmlQueryFactoryGenerator.FACTORY_CONTANT).get(null);
			Method createQueryMethod = queryFactory.getClass().getMethod("createQuery");
			createQueryMethod.setAccessible(true);
			Object query = createQueryMethod.invoke(queryFactory);

			// set parameters
			int n = arguments.length;
			for (int i = 0; i < n; ++i) {
				query = invokeSetterMethod(query, arguments[i]);
			}

			return (IDbQuery<?>) query;
		} catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException exception) {
			throw new RuntimeException(exception);
		}
	}

	public IDbQuerySqlBuilder createSqlBuilder(Object...arguments) {

		return createRuntimeQuery(arguments).createSqlBuilder();
	}

	public SqmlQueryTest assertGeneratedSelect(String expectedSql, Object...arguments) {

		IDbSqlSelect select = createRuntimeQuery(arguments).createSelect();
		assertEquals(expectedSql, new DbSqlFormatter(select).setExpandParameters(true).format());
		return this;
	}

	private Object invokeSetterMethod(Object query, Object value) throws IllegalAccessException, NoSuchFieldException {

		for (Method method: query.getClass().getDeclaredMethods()) {
			if (method.getName().startsWith("set") && method.getParameterTypes().length == 1) {
				Class<?> parameterClass = method.getParameterTypes()[0];
				if (value == null || parameterClass.isInstance(value)) {
					return ReflectionUtils.invokeMethod(method, query, value);
				} else if (value instanceof Integer && IDbTableRow.class.isAssignableFrom(parameterClass)) {
					Object table = parameterClass.getField("TABLE").get(null);
					Object row = ((IDbObjectTable<?>) table).getStub((Integer) value);
					return ReflectionUtils.invokeMethod(method, query, row);
				} else if (isListOf(value, Integer.class) && isArrayOfTableRows(parameterClass)) {
					IDbObjectTable<?> table = (IDbObjectTable<?>) parameterClass.getComponentType().getField("TABLE").get(null);
					Collection<?> collection = (Collection<?>) value;
					Object array = Array.newInstance(parameterClass.getComponentType(), collection.size());
					int i = 0;
					for (Object id: collection) {
						Array.set(array, i, table.getStub((Integer) id));
						++i;
					}
					return ReflectionUtils.invokeMethod(method, query, array);
				} else if (value instanceof String && parameterClass.isEnum()) {
					Object enumerator = parseEnumeratorName(parameterClass, (String) value);
					return ReflectionUtils.invokeMethod(method, query, enumerator);
				} else if (isArrayOfEnum(parameterClass) && isListOf(value, String.class)) {
					List<?> parameters = (List<?>) value;
					Object[] enumerators = (Object[]) Array.newInstance(parameterClass.getComponentType(), parameters.size());
					for (int i = 0; i < parameters.size(); i++) {
						enumerators[i] = parseEnumeratorName(parameterClass.getComponentType(), (String) parameters.get(i));
					}
					return ReflectionUtils.invokeMethod(method, query, (Object) enumerators);
				}
			}
		}
		throw new SofticarDeveloperException(//
			"Failed to find a method in '%s' to set value of type %s.",
			query.getClass().getSimpleName(),
			value.getClass().getSimpleName());
	}

	private static Object parseEnumeratorName(Class<?> enumClass, String name) {

		return Enum.valueOf(CastUtils.cast(enumClass), name);
	}

	private static boolean isListOf(Object candidate, Class<?> elementType) {

		if (candidate instanceof List) {
			return ((List<?>) candidate)//
				.stream()
				.map(element -> elementType.isInstance(element))
				.collect(Collectors.reducing(true, (a, b) -> a && b));
		} else {
			return false;
		}
	}

	private static boolean isArrayOfEnum(Class<?> classToCheck) {

		return classToCheck.isArray() && classToCheck.getComponentType().isEnum();
	}

	private boolean isArrayOfTableRows(Class<?> theClass) {

		return theClass.isArray() && IDbTableRow.class.isAssignableFrom(theClass.getComponentType());
	}

	public ISqmlQuery getQuery() {

		return getObject();
	}

	public ISqmlSelect getSelect() {

		return getQuery().getSelect();
	}

	// -------------------- Abstract -------------------- //

	@Override
	public ISqmlQuery parseObject(List<String> lines, String filename) {

		List<String> all = new ArrayList<>();
		all.add("PACKAGE com.example");
		all.add("QUERY Query {");
		all.addAll(lines);
		all.add("}");
		ISqmlFile file = getParser().parse(Imploder.implode(all, "\n"), filename);
		return (ISqmlQuery) file.getElements().get(0);
	}

	@Override
	protected SqmlQueryTest getThis() {

		return this;
	}

	@Override
	protected List<String> generateJava() {

		String java = new SqmlQueryInterfaceGenerator(new SqmlTestGeneratorPreferencesProvider()).generateCode(getQuery());
		return Arrays.asList(java.split("\n"));
	}
}
