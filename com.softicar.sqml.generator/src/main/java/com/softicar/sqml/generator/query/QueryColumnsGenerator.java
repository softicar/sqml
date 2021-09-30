package com.softicar.sqml.generator.query;

import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.selects.ISqmlSelectColumn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QueryColumnsGenerator implements Iterable<SqmlQueryColumnGenerator> {

	private final ISqmlQuery query;
	private final List<SqmlQueryColumnGenerator> columnGenerators;

	public QueryColumnsGenerator(SqmlQueryGenerator generator, ISqmlQuery query) {

		this.query = query;
		this.columnGenerators = new ArrayList<>();

		createColumnGenerators(generator);
	}

	private void createColumnGenerators(SqmlQueryGenerator generator) {

		int logicalIndex = 0;
		for (ISqmlSelectColumn selectColumn: query.getSelect().getColumns()) {
			SqmlQueryColumnGenerator columnGenerator = new SqmlQueryColumnGenerator(generator, selectColumn, logicalIndex);
			columnGenerators.add(columnGenerator);
			logicalIndex += 1;
		}
	}

	@Override
	public Iterator<SqmlQueryColumnGenerator> iterator() {

		return columnGenerators.iterator();
	}

	public int size() {

		return columnGenerators.size();
	}

	public void printColumnConstants() {

		for (SqmlQueryColumnGenerator columnGenerator: columnGenerators) {
			columnGenerator.printConstant();
		}
	}
}
