package com.softicar.sqml.model.selects;

import com.softicar.platform.db.sql.token.SqlKeyword;
import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.ISqmlTabular;
import com.softicar.sqml.model.generation.ISqlBuilderBuilder;
import com.softicar.sqml.model.generation.ISqmlSelectGenerator;
import com.softicar.sqml.model.selects.validation.SqmlIssueTableVariableNameNotLowerCamelCase;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

/**
 * Represents the declaration of a select variable referring to a table.
 * <p>
 * TODO: rename to ISqmlTableVariableDeclaration or ISqmlTableAliasDeclaration
 * <p>
 * For example:
 *
 * <pre>
 * FROM Foo AS foo
 * </pre>
 *
 * Here <i>Foo AS foo</i> is the {@link ISqmlTableVariable}.
 *
 * @author Oliver Richers
 */
public interface ISqmlTableVariable extends ISqmlVariable, ISqmlValidatable {

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default void generateSql(ISqmlSelectGenerator generator) {

		ISqlBuilderBuilder builder = generator.getBuilder();
		builder.addIdentifier(getTable());
		builder.addToken(SqlKeyword.AS);
		builder.addIdentifier(this);
	}

	@Override
	default ISqmlType getSqmlType() {

		return getTable();
	}

	@Override
	default ISqmlTabular getTabular() {

		return getTable();
	}

	@Override
	default void validate(ISqmlValidationContext context) {

		String name = getName();
		if (name != null && !name.isEmpty()) {
			// test for lower-camel-case
			if (!Character.isLowerCase(name.charAt(0))) {
				context.accept(new SqmlIssueTableVariableNameNotLowerCamelCase(this));
			}
		}
	}

	ISqmlTable getTable();
}
