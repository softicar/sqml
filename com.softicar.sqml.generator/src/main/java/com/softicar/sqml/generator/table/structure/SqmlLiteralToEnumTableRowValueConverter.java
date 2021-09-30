package com.softicar.sqml.generator.table.structure;

import com.softicar.platform.db.structure.enums.IDbEnumTableRowValue;
import com.softicar.platform.db.structure.enums.value.DbEnumTableRowBigDecimalValue;
import com.softicar.platform.db.structure.enums.value.DbEnumTableRowBooleanValue;
import com.softicar.platform.db.structure.enums.value.DbEnumTableRowDoubleValue;
import com.softicar.platform.db.structure.enums.value.DbEnumTableRowFloatValue;
import com.softicar.platform.db.structure.enums.value.DbEnumTableRowIntegerValue;
import com.softicar.platform.db.structure.enums.value.DbEnumTableRowLongValue;
import com.softicar.platform.db.structure.enums.value.DbEnumTableRowStringValue;
import com.softicar.sqml.model.literals.ISqmlBooleanLiteral;
import com.softicar.sqml.model.literals.ISqmlDecimalLiteral;
import com.softicar.sqml.model.literals.ISqmlDoubleLiteral;
import com.softicar.sqml.model.literals.ISqmlFloatLiteral;
import com.softicar.sqml.model.literals.ISqmlIntegerLiteral;
import com.softicar.sqml.model.literals.ISqmlLiteralConverter;
import com.softicar.sqml.model.literals.ISqmlLongLiteral;
import com.softicar.sqml.model.literals.ISqmlStringLiteral;

public class SqmlLiteralToEnumTableRowValueConverter implements ISqmlLiteralConverter<IDbEnumTableRowValue> {

	@Override
	public IDbEnumTableRowValue convertBoolean(ISqmlBooleanLiteral literal) {

		return new DbEnumTableRowBooleanValue(literal.getValue());
	}

	@Override
	public IDbEnumTableRowValue convertDecimal(ISqmlDecimalLiteral literal) {

		return new DbEnumTableRowBigDecimalValue(literal.getValue());
	}

	@Override
	public IDbEnumTableRowValue convertDouble(ISqmlDoubleLiteral literal) {

		return new DbEnumTableRowDoubleValue(literal.getValue().doubleValue());
	}

	@Override
	public IDbEnumTableRowValue convertFloat(ISqmlFloatLiteral literal) {

		return new DbEnumTableRowFloatValue(literal.getValue().floatValue());
	}

	@Override
	public IDbEnumTableRowValue convertInteger(ISqmlIntegerLiteral literal) {

		return new DbEnumTableRowIntegerValue(literal.getValue());
	}

	@Override
	public IDbEnumTableRowValue convertLong(ISqmlLongLiteral literal) {

		return new DbEnumTableRowLongValue(literal.getValue());
	}

	@Override
	public IDbEnumTableRowValue convertString(ISqmlStringLiteral literal) {

		return new DbEnumTableRowStringValue(literal.getValue());
	}
}
