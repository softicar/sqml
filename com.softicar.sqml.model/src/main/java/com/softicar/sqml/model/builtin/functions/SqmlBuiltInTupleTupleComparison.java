package com.softicar.sqml.model.builtin.functions;

import com.softicar.platform.db.sql.token.SqlSymbol;
import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.types.ISqmlType;

public class SqmlBuiltInTupleTupleComparison extends AbstractBuiltInComparison {

	public SqmlBuiltInTupleTupleComparison(SqlSymbol operator) {

		super(operator, SqmlBuiltInTypes.getTupleType(), SqmlBuiltInTypes.getTupleType());
	}

	@Override
	protected int getArgumentConversionCount(ISqmlType leftType, ISqmlType rightType) {

		if (leftType.isTuple() && rightType.is(leftType)) {
			return 0;
		} else {
			return Integer.MAX_VALUE;
		}
	}
}
