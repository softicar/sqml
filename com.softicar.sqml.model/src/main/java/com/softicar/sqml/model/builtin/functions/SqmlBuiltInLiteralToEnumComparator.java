package com.softicar.sqml.model.builtin.functions;

import com.softicar.platform.db.sql.token.SqlSymbol;
import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.builtin.types.SqmlBuiltInEnumType;
import com.softicar.sqml.model.types.ISqmlEnum;
import com.softicar.sqml.model.types.ISqmlType;

public class SqmlBuiltInLiteralToEnumComparator extends AbstractBuiltInComparison {

	public SqmlBuiltInLiteralToEnumComparator(SqlSymbol operator) {

		super(operator, SqmlBuiltInTypes.getStringType(), SqmlBuiltInEnumType.get());
	}

	@Override
	protected int getArgumentConversionCount(ISqmlType leftType, ISqmlType rightType) {

		if (rightType instanceof ISqmlEnum) {
			ISqmlEnum sqmlEnum = (ISqmlEnum) rightType;
			if (leftType.is(sqmlEnum.getLiteralValueType())) {
				return 0;
			} else {
				return Integer.MAX_VALUE;
			}
		} else {
			return Integer.MAX_VALUE;
		}
	}
}
