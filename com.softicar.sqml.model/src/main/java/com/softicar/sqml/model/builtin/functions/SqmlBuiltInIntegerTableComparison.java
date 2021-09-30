package com.softicar.sqml.model.builtin.functions;

import com.softicar.platform.db.sql.token.SqlSymbol;
import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.builtin.types.SqmlBuiltInTableType;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.types.ISqmlType;

public class SqmlBuiltInIntegerTableComparison extends AbstractBuiltInComparison {

	public SqmlBuiltInIntegerTableComparison(SqlSymbol operator) {

		super(operator, SqmlBuiltInTypes.getIntegerType(), SqmlBuiltInTableType.get());
	}

	@Override
	protected int getArgumentConversionCount(ISqmlType leftType, ISqmlType rightType) {

		if (rightType instanceof ISqmlTable && leftType.is(SqmlBuiltInTypes.getIntegerType())) {
			return 0;
		} else {
			return Integer.MAX_VALUE;
		}
	}
}
