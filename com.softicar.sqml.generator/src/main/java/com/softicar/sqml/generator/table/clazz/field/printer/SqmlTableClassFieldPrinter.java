package com.softicar.sqml.generator.table.clazz.field.printer;

import com.softicar.platform.common.code.java.JavaClass;
import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.db.runtime.field.DbIntegerField;
import com.softicar.platform.db.runtime.field.DbLongField;
import com.softicar.platform.db.runtime.field.IDbField;
import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.platform.db.structure.column.IDbColumnStructure;
import com.softicar.platform.db.structure.foreign.key.DbForeignKeyAction;
import com.softicar.platform.db.structure.foreign.key.IDbForeignKeyStructure;
import com.softicar.sqml.generator.table.clazz.field.definition.ISqmlTableClassFieldDefinition;
import com.softicar.sqml.generator.table.clazz.field.utils.SqmlTableClassFieldDeclarationBuilder;
import com.softicar.sqml.generator.table.clazz.field.utils.SqmlTableClassFieldNameDeterminer;
import com.softicar.sqml.generator.table.clazz.printer.SqmlTableClassPrinter;
import java.util.Optional;

class SqmlTableClassFieldPrinter implements ISqmlTableClassFieldPrinter {

	protected final SqmlTableClassPrinter classPrinter;
	protected final ISqmlTableClassFieldDefinition fieldDefinition;
	protected final SqmlTableClassFieldNameDeterminer nameDeterminer;
	protected final IDbColumnStructure column;

	public SqmlTableClassFieldPrinter(SqmlTableClassPrinter classPrinter, ISqmlTableClassFieldDefinition fieldDefinition) {

		this.classPrinter = classPrinter;
		this.fieldDefinition = fieldDefinition;
		this.nameDeterminer = new SqmlTableClassFieldNameDeterminer(classPrinter.getConfig(), fieldDefinition);
		this.column = fieldDefinition.getColumn();
	}

	@Override
	public IDbColumnStructure getColumnStructure() {

		return column;
	}

	@Override
	public SqmlTableClassFieldNameDeterminer getNameDeterminer() {

		return nameDeterminer;
	}

	// -------------------------------- interface -------------------------------- //

	@Override
	public ISqmlTableClassFieldDefinition getFieldDefinition() {

		return fieldDefinition;
	}

	@Override
	public String getEnumClassName() {

		throw new UnsupportedOperationException();
	}

	@Override
	public void printEnumClass() {

		// nothing to do by default
	}

	@Override
	public final void printGetFunction() {

		var config = classPrinter.getConfig();
		var valueClassSimpleName = fieldDefinition.getValueClass().getSimpleName();

		if (fieldDefinition.isIdField()) {
			return;
		} else if (fieldDefinition.isBaseField()) {
			classPrinter.beginMethod("public final %s %s()", valueClassSimpleName, nameDeterminer.getGetFunctionName());
			classPrinter.println("return pk();");
			classPrinter.endBlock();
			return;
		}

		if (fieldDefinition.isForeignObjectField() && config.isGenerateGetIdMethods()) {
			classPrinter.beginMethod("public final Integer %sID()", nameDeterminer.getGetFunctionName());
			classPrinter.println("return getValueId(%s);", nameDeterminer.getStaticFinalName());
			classPrinter.endBlock();
		}

		if (fieldDefinition.getColumn().isNullable()) {
			if (config.isGenerateNullableGetter()) {
				classPrinter.beginMethod("public final %s %s%s()", valueClassSimpleName, nameDeterminer.getGetFunctionName(), config.getNullableGetterSuffix());
				classPrinter.println("return getValue(%s);", nameDeterminer.getStaticFinalName());
				classPrinter.endBlock();
			}

			if (config.isGenerateOptionalGetter()) {
				var returnType = "Optional<%s>".formatted(valueClassSimpleName);
				classPrinter.addImport(Optional.class);
				classPrinter.beginMethod("public final %s %s%s()", returnType, nameDeterminer.getGetFunctionName(), config.getOptionalGetterSuffix());
				classPrinter.println("return getValueAsOptional(%s);", nameDeterminer.getStaticFinalName());
				classPrinter.endBlock();
			}

			if (config.isGenerateThrowingGetter()) {
				classPrinter.beginMethod("public final %s %s%s()", valueClassSimpleName, nameDeterminer.getGetFunctionName(), config.getThrowingGetterSuffix());
				classPrinter.println("return getValueOrThrow(%s);", nameDeterminer.getStaticFinalName());
				classPrinter.endBlock();
			}
		} else {
			classPrinter.beginMethod("public final %s %s()", valueClassSimpleName, nameDeterminer.getGetFunctionName());
			classPrinter.println("return getValue(%s);", nameDeterminer.getStaticFinalName());
			classPrinter.endBlock();
		}
	}

	@Override
	public final void printSetFunction() {

		if (fieldDefinition.isIdField()) {
			return;
		}

		classPrinter
			.beginMethod(//
				"public final %s %s(%s value)",
				classPrinter.getSimpleClassName(),
				nameDeterminer.getSetFunctionName(),
				fieldDefinition.getValueClass().getSimpleName());
		classPrinter.println("return setValue(%s, value);", nameDeterminer.getStaticFinalName());
		classPrinter.endBlock();
	}

	@Override
	public final void printStaticFinal(int index) {

		classPrinter.addImport(fieldDefinition.getValueClass());

		SqmlTableClassFieldDeclarationBuilder fieldDeclaration = new SqmlTableClassFieldDeclarationBuilder()
			.append(//
				"public static final %s %s = %s",
				getFieldType(),
				nameDeterminer.getStaticFinalName(),
				classPrinter.getTableBuilderConstant());
		appendAddField(fieldDeclaration);
		appendSetTitle(fieldDeclaration);
		appendSetNullable(fieldDeclaration);
		appendSetDefault(fieldDeclaration);

		appendSetBits(fieldDeclaration);
		appendSetForeignKeyActions(fieldDeclaration);
		appendSetCharacterSet(fieldDeclaration);
		appendSetCollation(fieldDeclaration);
		appendSetForeignKeyName(fieldDeclaration);
		appendSetLengthBits(fieldDeclaration);
		appendSetMaximumLength(fieldDeclaration);
		appendSetSize(fieldDeclaration);
		appendSetUnsigned(fieldDeclaration);
		appendSetOnUpdateNow(fieldDeclaration);
		appendSetTimestamp(fieldDeclaration);

		appendSetComment(fieldDeclaration);
		classPrinter.println(fieldDeclaration.append(";").toString());
	}

	// -------------------------------- protected -------------------------------- //

	protected JavaClass getFieldClass() {

		String packageName = IDbField.class.getPackage().getName();
		return new JavaClass(new JavaClassName(packageName + ".IDb" + fieldDefinition.getValueClass().getSimpleName() + "Field"));
	}

	protected String getFieldType() {

		JavaClass fieldClass = getFieldClass();
		classPrinter.addImport(fieldClass);
		return String.format("%s<%s>", fieldClass.getSimpleName(), classPrinter.getSimpleClassName());
	}

	protected String getCreateFieldFunctionNameSuffix() {

		return String.format("%sField", fieldDefinition.getValueClass().getSimpleName());
	}

	protected String getFieldFactoryParameters() {

		return "";
	}

	// -------------------------------- private -------------------------------- //

	private void appendAddField(SqmlTableClassFieldDeclarationBuilder fieldDeclaration) {

		fieldDeclaration
			.append(//
				".add%s(\"%s\", o->o.%s, (o,v)->o.%s=v%s)",
				getCreateFieldFunctionNameSuffix(),
				column.getNameOrThrow(),
				nameDeterminer.getMemberName(),
				nameDeterminer.getMemberName(),
				getFieldFactoryParameters());
	}

	private void appendSetTitle(SqmlTableClassFieldDeclarationBuilder declaration) {

		new SqmlTableClassFieldSetTitleAppender(classPrinter, column, declaration).append();
	}

	private void appendSetNullable(SqmlTableClassFieldDeclarationBuilder declaration) {

		if (column.isNullable()) {
			declaration.append(".setNullable()");
		}
	}

	private void appendSetDefault(SqmlTableClassFieldDeclarationBuilder declaration) {

		switch (column.getDefaultType()) {
		case NONE:
			break;
		case NULL:
			appendSetDefaultNull(declaration);
			break;
		case NORMAL:
			appendSetDefaultNormal(declaration);
			break;
		case CURRENT_TIMESTAMP:
			appendSetDefaultCurrentTimestamp(declaration);
			break;
		}
	}

	private void appendSetDefaultNull(SqmlTableClassFieldDeclarationBuilder declaration) {

		declaration.append(".setDefault(null)");
	}

	private void appendSetDefaultNormal(SqmlTableClassFieldDeclarationBuilder declaration) {

		declaration.append(".setDefault(%s)", new SqmlTableClassFieldDefaultValueCodePrinter(this, classPrinter).getCode());
	}

	private void appendSetDefaultCurrentTimestamp(SqmlTableClassFieldDeclarationBuilder declaration) {

		if (isDayField()) {
			declaration.append(".setDefaultToday()");
		} else if (isDayTimeField()) {
			declaration.append(".setDefaultNow()");
		}
	}

	private void appendSetForeignKeyActions(SqmlTableClassFieldDeclarationBuilder declaration) {

		column.getForeignKeyStructure().ifPresent(foreignKeyStructure -> appendSetForeignKeyActions(declaration, foreignKeyStructure));
	}

	private void appendSetForeignKeyActions(SqmlTableClassFieldDeclarationBuilder declaration, IDbForeignKeyStructure foreignKeyStructure) {

		DbForeignKeyAction onDeleteAction = foreignKeyStructure.getOnDeleteAction();
		DbForeignKeyAction onUpdateAction = foreignKeyStructure.getOnUpdateAction();

		if (isDefault(onDeleteAction) && isDefault(onUpdateAction)) {
			// nothing to do
		} else if (isCascadeOrDefault(onDeleteAction) && isCascadeOrDefault(onUpdateAction)) {
			appendSetCascade(declaration, onDeleteAction.isCascade(), onUpdateAction.isCascade());
		} else {
			appendSetForeignKeyAction(declaration, "Delete", onDeleteAction);
			appendSetForeignKeyAction(declaration, "Update", onUpdateAction);
		}
	}

	private boolean isCascadeOrDefault(DbForeignKeyAction foreignKeyAction) {

		return foreignKeyAction.isCascade() || isDefault(foreignKeyAction);
	}

	private boolean isDefault(DbForeignKeyAction foreignKeyAction) {

		return foreignKeyAction == DbForeignKeyAction.getDefault();
	}

	private void appendSetCascade(SqmlTableClassFieldDeclarationBuilder declaration, boolean onDeleteCascase, boolean onUpdateCascase) {

		declaration.append(".setCascade(%s, %s)", onDeleteCascase, onUpdateCascase);
	}

	private void appendSetForeignKeyAction(SqmlTableClassFieldDeclarationBuilder declaration, String trigger, DbForeignKeyAction action) {

		if (action != DbForeignKeyAction.getDefault()) {
			classPrinter.addImport(DbForeignKeyAction.class);
			declaration.append(".setOn%s(%s.%s)", trigger, DbForeignKeyAction.class.getSimpleName(), action.name());
		}
	}

	private void appendSetCharacterSet(SqmlTableClassFieldDeclarationBuilder declaration) {

		if (isStringField() || isEnumField()) {
			String characterSet = column.getCharacterSet();
			if (characterSet != null) {
				declaration.append(".setCharacterSet(\"%s\")", characterSet);
			}
		}
	}

	private void appendSetCollation(SqmlTableClassFieldDeclarationBuilder declaration) {

		if (isStringField() || isEnumField()) {
			String collation = column.getCollation();
			if (collation != null) {
				declaration.append(".setCollation(\"%s\")", collation);
			}
		}
	}

	private void appendSetForeignKeyName(SqmlTableClassFieldDeclarationBuilder declaration) {

		column.getForeignKeyStructure().ifPresent(constraint -> appendSetForeignKeyName(declaration, constraint));
	}

	private void appendSetForeignKeyName(SqmlTableClassFieldDeclarationBuilder declaration, IDbForeignKeyStructure foreignKeyStructure) {

		String foreignKeyName = foreignKeyStructure.getNameOrThrow();
		if (!foreignKeyName.equals(column.getNameOrThrow())) {
			declaration.append(".setForeignKeyName(\"%s\")", foreignKeyName);
		}
	}

	private void appendSetSize(SqmlTableClassFieldDeclarationBuilder declaration) {

		if (isBigDecimalField()) {
			declaration.append(".setSize(%s, %s)", column.getPrecision(), column.getScale());
		}
	}

	private void appendSetMaximumLength(SqmlTableClassFieldDeclarationBuilder declaration) {

		if (isByteArrayField() || isStringField()) {
			if (column.getMaxLength() > 0) {
				declaration.append(".setMaximumLength(%s)", column.getMaxLength());
			}
		}
	}

	private void appendSetLengthBits(SqmlTableClassFieldDeclarationBuilder declaration) {

		if (isByteArrayField() || isStringField()) {
			if (column.getLengthBits() > 0) {
				declaration.append(".setLengthBits(%s)", column.getLengthBits());
			}
		}
	}

	private void appendSetBits(SqmlTableClassFieldDeclarationBuilder declaration) {

		if (!fieldDefinition.isForeignRowField()) {
			if (isIntegerField()) {
				if (column.getBits() != DbIntegerField.DEFAULT_BITS) {
					declaration.append(".setBits(%s)", column.getBits());
				}
			}
			if (isLongField()) {
				if (column.getBits() != DbLongField.DEFAULT_BITS) {
					declaration.append(".setBits(%s)", column.getBits());
				}
			}
		}
	}

	private void appendSetUnsigned(SqmlTableClassFieldDeclarationBuilder declaration) {

		if ((isIntegerField() || isLongField()) && !fieldDefinition.isForeignRowField()) {
			if (column.isUnsigned()) {
				declaration.append(".setUnsigned()");
			}
		}
	}

	private void appendSetOnUpdateNow(SqmlTableClassFieldDeclarationBuilder declaration) {

		if (isDayTimeField() && fieldDefinition.getColumn().isOnUpdateNow()) {
			declaration.append(".setOnUpdateNow()");
		}
	}

	private void appendSetTimestamp(SqmlTableClassFieldDeclarationBuilder declaration) {

		if (isDayTimeField() && fieldDefinition.getColumn().isTimestamp()) {
			declaration.append(".setTimestamp()");
		}
	}

	private void appendSetComment(SqmlTableClassFieldDeclarationBuilder declaration) {

		String comment = column.getComment();
		if (comment != null && !comment.isEmpty()) {
			comment = getEscapedStringLiteral(comment);
			declaration.append(".setComment(\"%s\")", comment);
		}
	}

	private static String getEscapedStringLiteral(String text) {

		return text.replace("\\", "\\\\").replace("\"", "\\\"");
	}

	// ------------------------------ convenience methods ------------------------------ //

	private boolean isBigDecimalField() {

		return isType(SqlFieldType.BIG_DECIMAL);
	}

	private boolean isByteArrayField() {

		return isType(SqlFieldType.BYTE_ARRAY);
	}

	private boolean isDayField() {

		return isType(SqlFieldType.DAY);
	}

	private boolean isDayTimeField() {

		return isType(SqlFieldType.DAY_TIME);
	}

	private boolean isEnumField() {

		return isType(SqlFieldType.ENUM);
	}

	private boolean isIntegerField() {

		return isType(SqlFieldType.INTEGER);
	}

	private boolean isLongField() {

		return isType(SqlFieldType.LONG);
	}

	private boolean isStringField() {

		return isType(SqlFieldType.STRING);
	}

	private boolean isType(SqlFieldType type) {

		return column.getFieldType() == type;
	}
}
