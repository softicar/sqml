package com.softicar.sqml.generator.table.clazz;

import com.softicar.sqml.generator.common.ISqmlFileSystemAccess;
import com.softicar.sqml.model.tables.ISqmlTable;

public interface ISqmlTableClassGenerator {

	String generateCode(ISqmlTable table);

	void generateFile(ISqmlTable table, ISqmlFileSystemAccess fileSystemAccess);

	void extractCustomBaseClass(ISqmlTable table, ISqmlFileSystemAccess fileSystemAccess);

	void extractCustomTableClass(ISqmlTable table, ISqmlFileSystemAccess fileSystemAccess);

	void extractGeneratedBaseClass(ISqmlTable table, ISqmlFileSystemAccess fileSystemAccess);
}
