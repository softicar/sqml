package com.softicar.sqml.model.builtin.functions;

import com.softicar.platform.db.sql.token.SqlSymbol;
import com.softicar.sqml.model.builtin.types.SqmlBuiltInTableType;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.types.ISqmlType;

public class SqmlBuiltInTableTableComparison extends AbstractBuiltInComparison {

	public SqmlBuiltInTableTableComparison(SqlSymbol operator) {

		super(operator, SqmlBuiltInTableType.get(), SqmlBuiltInTableType.get());
	}

	@Override
	protected int getArgumentConversionCount(ISqmlType leftType, ISqmlType rightType) {

		if (leftType instanceof ISqmlTable && rightType.is(leftType)) {
			return 0;
		} else {
			return Integer.MAX_VALUE;
		}
	}
}
