package com.softicar.sqml.scoping.providers;

import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlTabular;
import com.softicar.sqml.model.expressions.ExpressionsPackage;
import com.softicar.sqml.model.expressions.ISqmlPath;
import com.softicar.sqml.model.selects.ISqmlHavingClause;
import com.softicar.sqml.model.selects.ISqmlOrderByClause;
import com.softicar.sqml.model.selects.ISqmlSelect;
import com.softicar.sqml.model.selects.ISqmlSelectColumn;
import com.softicar.sqml.model.selects.ISqmlVariable;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.types.ISqmlEnum;
import com.softicar.sqml.model.utils.SqmlNavigation;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

public class SqmlPathScopeProvider extends AbstractSqmlReferenceScopeProvider {

	@Override
	public EReference getReference() {

		return ExpressionsPackage.eINSTANCE.getSqmlPath_Target();
	}

	@Override
	public IScope getScope(EObject context) {

		ISqmlTable contextTable = SqmlNavigation.find(ISqmlTable.class, context);
		ISqmlSelect contextSelect = SqmlNavigation.find(ISqmlSelect.class, context);
		ISqmlModelElement parentTarget = getParentTarget(context);

		if (contextSelect != null) {
			if (parentTarget == null) {
				// root reference
				IScope importScope = getImportScope(context, getReference());
				IScope variableScope = Scopes.scopeFor(findVariables(contextSelect), importScope);
				if (isInHavingClause(contextSelect, context) || isInOrderByClause(contextSelect, context)) {
					return Scopes.scopeFor(findSelectColumns(contextSelect), variableScope);
				} else {
					return variableScope;
				}
			} else if (parentTarget instanceof ISqmlTable) {
				// table definition reference
				ISqmlTable table = (ISqmlTable) parentTarget;
				return Scopes.scopeFor(table.getEnums());
			} else if (parentTarget instanceof ISqmlEnum) {
				// enum definition reference
				ISqmlEnum sqmlEnum = (ISqmlEnum) parentTarget;
				return Scopes.scopeFor(sqmlEnum.getEnumerators());
			} else if (parentTarget instanceof ISqmlVariable) {
				// variable reference
				ISqmlVariable variable = (ISqmlVariable) parentTarget;
				return getVariableReferenceScope(variable);
			} else if (parentTarget instanceof ISqmlTableColumn) {
				// table column reference
				ISqmlTableColumn tableColumn = (ISqmlTableColumn) parentTarget;
				return getTableColumnReferenceScope(tableColumn);
			} else {
				return IScope.NULLSCOPE;
			}
		} else if (contextTable != null) {
			if (parentTarget == null) {
				return Scopes.scopeFor(contextTable.getEnums());
			} else if (parentTarget instanceof ISqmlEnum) {
				ISqmlEnum sqmlEnum = (ISqmlEnum) parentTarget;
				return Scopes.scopeFor(sqmlEnum.getEnumerators());
			} else {
				return IScope.NULLSCOPE;
			}
		} else {
			return IScope.NULLSCOPE;
		}
	}

	private boolean isInHavingClause(ISqmlSelect contextSelect, EObject context) {

		ISqmlHavingClause havingClause = SqmlNavigation.find(ISqmlHavingClause.class, context);
		return havingClause != null && SqmlNavigation.find(ISqmlSelect.class, havingClause) == contextSelect;
	}

	private boolean isInOrderByClause(ISqmlSelect contextSelect, EObject context) {

		ISqmlOrderByClause orderByClause = SqmlNavigation.find(ISqmlOrderByClause.class, context);
		return orderByClause != null && SqmlNavigation.find(ISqmlSelect.class, orderByClause) == contextSelect;
	}

	private ISqmlModelElement getParentTarget(EObject context) {

		if (context instanceof ISqmlPath) {
			ISqmlPath path = (ISqmlPath) context;
			return path.getParent() != null? path.getParent().getTarget() : null;
		} else {
			return null;
		}
	}

	private IScope getVariableReferenceScope(ISqmlVariable variable) {

		ISqmlTabular tabular = variable.getTabular();
		if (tabular != null) {
			return Scopes.scopeFor(tabular.getColumns());
		} else {
			return IScope.NULLSCOPE;
		}
	}

	private IScope getTableColumnReferenceScope(ISqmlTableColumn tableColumn) {

		if (tableColumn.getSqmlType() instanceof ISqmlTable) {
			ISqmlTable targetTable = (ISqmlTable) tableColumn.getSqmlType();
			List<ISqmlTableColumn> primarKeyColumns = targetTable.getPrimarKeyColumns();
			if (primarKeyColumns.size() == 1) {
				return Scopes.scopeFor(primarKeyColumns);
			} else {
				return IScope.NULLSCOPE;
			}
		} else {
			return IScope.NULLSCOPE;
		}
	}

	private static List<ISqmlVariable> findVariables(ISqmlSelect select) {

		// TODO: add better support for references between sub-selects
		List<ISqmlVariable> variables = new ArrayList<>();
		for (ISqmlVariable variable: select.getVariables()) {
			addIfValid(variables, variable);
		}
		return variables;
	}

	private static void addIfValid(List<ISqmlVariable> variables, ISqmlVariable variable) {

		if (variable != null && variable.getName() != null) {
			variables.add(variable);
		}
	}

	private static List<ISqmlSelectColumn> findSelectColumns(ISqmlSelect select) {

		List<ISqmlSelectColumn> columns = new ArrayList<>();
		for (ISqmlSelectColumn column: select.getColumns()) {
			addIfValid(columns, column);
		}
		return columns;
	}

	private static void addIfValid(List<ISqmlSelectColumn> columns, ISqmlSelectColumn column) {

		if (column != null && column.getName() != null) {
			columns.add(column);
		}
	}
}
