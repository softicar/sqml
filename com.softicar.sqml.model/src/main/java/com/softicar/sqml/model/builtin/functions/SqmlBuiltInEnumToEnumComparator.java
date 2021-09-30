package com.softicar.sqml.model.builtin.functions;

import com.softicar.platform.db.sql.token.SqlSymbol;
import com.softicar.sqml.model.builtin.types.SqmlBuiltInEnumType;
import com.softicar.sqml.model.types.ISqmlEnum;
import com.softicar.sqml.model.types.ISqmlType;

public class SqmlBuiltInEnumToEnumComparator extends AbstractBuiltInComparison {

	public SqmlBuiltInEnumToEnumComparator(SqlSymbol operator) {

		super(operator, SqmlBuiltInEnumType.get(), SqmlBuiltInEnumType.get());
	}

	@Override
	protected int getArgumentConversionCount(ISqmlType leftType, ISqmlType rightType) {

		if (leftType instanceof ISqmlEnum && rightType.is(leftType)) {
			return 0;
		} else {
			return Integer.MAX_VALUE;
		}
	}
}
