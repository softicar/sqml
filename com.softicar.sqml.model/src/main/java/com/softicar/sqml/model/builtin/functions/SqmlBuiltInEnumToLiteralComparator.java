package com.softicar.sqml.model.builtin.functions;

import com.softicar.platform.db.sql.token.SqlSymbol;
import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.builtin.types.SqmlBuiltInEnumType;
import com.softicar.sqml.model.types.ISqmlEnum;
import com.softicar.sqml.model.types.ISqmlType;

public class SqmlBuiltInEnumToLiteralComparator extends AbstractBuiltInComparison {

	public SqmlBuiltInEnumToLiteralComparator(SqlSymbol operator) {

		super(operator, SqmlBuiltInEnumType.get(), SqmlBuiltInTypes.getStringType());
	}

	@Override
	protected int getArgumentConversionCount(ISqmlType leftType, ISqmlType rightType) {

		if (leftType instanceof ISqmlEnum) {
			ISqmlEnum sqmlEnum = (ISqmlEnum) leftType;
			if (rightType.is(sqmlEnum.getLiteralValueType())) {
				return 0;
			} else {
				return Integer.MAX_VALUE;
			}
		} else {
			return Integer.MAX_VALUE;
		}
	}
}
