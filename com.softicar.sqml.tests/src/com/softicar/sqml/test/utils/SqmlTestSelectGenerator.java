package com.softicar.sqml.test.utils;

import com.softicar.platform.common.code.java.compiler.RuntimeCompiler;
import com.softicar.platform.common.code.java.compiler.RuntimeCompilerException;
import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.common.core.logging.Log;
import com.softicar.platform.common.core.utils.CastUtils;
import com.softicar.platform.db.runtime.query.IDbQuery;
import com.softicar.sqml.generator.preferences.SqmlDefaultGeneratorPreferencesProvider;
import com.softicar.sqml.generator.query.SqmlQueryGenerator;
import com.softicar.sqml.generator.query.SqmlQueryInterfaceGenerator;
import com.softicar.sqml.generator.table.clazz.SqmlTableClassGenerator;
import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.tables.ISqmlTable;

public class SqmlTestSelectGenerator {

	private final ISqmlQuery query;

	public SqmlTestSelectGenerator(ISqmlQuery query) {

		this.query = query;
	}

	public Class<IDbQuery<?>> createRuntimeQueryClass() {

		JavaClassName queryClassName = SqmlQueryGenerator.getInterfaceName(query);
		String code = new SqmlQueryInterfaceGenerator(new SqmlDefaultGeneratorPreferencesProvider()).generateCode(query);
		try (RuntimeCompiler compiler = new RuntimeCompiler()) {
			compiler.addSourceCode(queryClassName, code);

			// add referenced tables to compiler
			for (ISqmlTable table: query.getSelect().findReferencedTables()) {
				String generatedCode = new SqmlTableClassGenerator(new SqmlDefaultGeneratorPreferencesProvider()).generateCode(table);
				compiler.addSourceCode(table.getClassName(), generatedCode);
			}

			try {
				return CastUtils.cast(compiler.compile().get(queryClassName));
			} catch (RuntimeCompilerException exception) {
				Log.finfo(code);
				throw exception;
			}
		}
	}
}
