package com.softicar.sqml.test.utils;

import com.softicar.platform.common.string.Imploder;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.test.parser.SqmlTestParser;
import java.util.List;

public class SqmlFileTest extends AbstractSqmlObjectTest<ISqmlFile, SqmlFileTest> {

	public SqmlFileTest(String filename, SqmlTestParser parser) {

		super(filename, parser);
	}

	public ISqmlFile getFile() {

		return getObject();
	}

	@Override
	public ISqmlFile parseObject(List<String> lines, String filename) {

		return getParser().parse(Imploder.implode(lines, "\n"), filename);
	}

	@Override
	protected SqmlFileTest getThis() {

		return this;
	}
}
