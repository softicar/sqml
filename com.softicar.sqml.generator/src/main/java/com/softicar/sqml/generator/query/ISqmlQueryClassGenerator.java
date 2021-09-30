package com.softicar.sqml.generator.query;

import com.softicar.sqml.generator.common.ISqmlFileSystemAccess;
import com.softicar.sqml.model.queries.ISqmlQuery;

public interface ISqmlQueryClassGenerator {

	String generateCode(ISqmlQuery query);

	void generateFile(ISqmlQuery query, ISqmlFileSystemAccess fileSystemAccess);
}
