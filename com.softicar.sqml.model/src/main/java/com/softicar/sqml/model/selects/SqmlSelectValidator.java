package com.softicar.sqml.model.selects;

import com.softicar.platform.common.container.map.list.ListTreeMap;
import com.softicar.sqml.model.selects.validation.SqmlIssueDuplicatedSelectColumnName;
import com.softicar.sqml.model.selects.validation.SqmlIssueDuplicatedVariableName;
import com.softicar.sqml.model.selects.validation.SqmlIssueLateDistincts;
import com.softicar.sqml.model.selects.validation.SqmlIssueMultipleDistincts;
import com.softicar.sqml.model.selects.validation.SqmlIssueMultipleFromClauses;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class SqmlSelectValidator {

	private final ISqmlSelect select;
	private final ISqmlIssueAcceptor acceptor;
	private final List<? extends ISqmlSelectClause> allSelectClauses;
	private final List<ISqmlSelectClause> distictSelectClauses;

	public SqmlSelectValidator(ISqmlSelect select, ISqmlIssueAcceptor acceptor) {

		this.select = select;
		this.acceptor = acceptor;
		this.allSelectClauses = select.getAllSelectClauses();
		this.distictSelectClauses = new ArrayList<>();
		for (ISqmlSelectClause selectClause: allSelectClauses) {
			if (selectClause.isDistinct()) {
				distictSelectClauses.add(selectClause);
			}
		}
	}

	public void validate() {

		prohibitDuplicatedColumnNames();
		prohibitDuplicatedVariableNames();
		prohibitLateDistinctClause();
		prohibitMultipleDistinctClauses();
		prohibitMultipleFromClauses();
	}

	private void prohibitDuplicatedColumnNames() {

		ListTreeMap<String, ISqmlSelectColumn> columnMap = new ListTreeMap<>();
		for (ISqmlSelectColumn column: select.getColumns()) {
			columnMap.addToList(column.getName().toUpperCase(), column);
		}
		for (Entry<String, List<ISqmlSelectColumn>> entry: columnMap.entrySet()) {
			List<ISqmlSelectColumn> columns = entry.getValue();
			if (columns.size() > 1) {
				for (ISqmlSelectColumn column: columns) {
					acceptor.accept(new SqmlIssueDuplicatedSelectColumnName(column));
				}
			}
		}
	}

	private void prohibitDuplicatedVariableNames() {

		ListTreeMap<String, ISqmlVariable> variableMap = new ListTreeMap<>();
		for (ISqmlVariable variable: select.getVariables()) {
			variableMap.addToList(variable.getName().toUpperCase(), variable);
		}
		for (Entry<String, List<ISqmlVariable>> entry: variableMap.entrySet()) {
			List<ISqmlVariable> variables = entry.getValue();
			if (variables.size() > 1) {
				for (ISqmlVariable variable: variables) {
					acceptor.accept(new SqmlIssueDuplicatedVariableName(variable));
				}
			}
		}
	}

	private void prohibitLateDistinctClause() {

		if (!allSelectClauses.isEmpty()) {
			ISqmlSelectClause firstSelectClause = allSelectClauses.get(0);
			for (ISqmlSelectClause selectClause: distictSelectClauses) {
				if (selectClause != firstSelectClause) {
					acceptor.accept(new SqmlIssueLateDistincts(selectClause));
				}
			}
		}
	}

	private void prohibitMultipleDistinctClauses() {

		if (distictSelectClauses.size() > 1) {
			for (ISqmlSelectClause selectClause: distictSelectClauses) {
				acceptor.accept(new SqmlIssueMultipleDistincts(selectClause));
			}
		}
	}

	private void prohibitMultipleFromClauses() {

		List<? extends ISqmlFromClause> fromClauses = select.getFromClauses();
		if (fromClauses.size() > 1) {
			for (ISqmlFromClause fromClause: fromClauses) {
				acceptor.accept(new SqmlIssueMultipleFromClauses(fromClause));
			}
		}
	}
}
