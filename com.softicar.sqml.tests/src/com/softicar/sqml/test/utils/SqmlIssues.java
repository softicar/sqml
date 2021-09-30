package com.softicar.sqml.test.utils;

import com.softicar.platform.common.container.map.list.ListTreeMap;
import com.softicar.platform.common.container.map.set.SetMap;
import com.softicar.platform.common.string.Imploder;
import com.softicar.sqml.model.validation.ISqmlIssueType;
import com.softicar.sqml.model.validation.SqmlIssueType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import org.eclipse.xtext.validation.Issue;

public class SqmlIssues {

	private int size = 0;
	private final SetMap<ISqmlIssueType, Integer> approvedIssues;
	private final SetMap<ISqmlIssueType, Integer> issueTypeToLines;
	private final SetMap<Integer, ISqmlIssueType> lineToIssueTypes;
	private final ListTreeMap<Integer, Issue> lineToIssues;

	public SqmlIssues(Iterable<Issue> issues) {

		this.approvedIssues = new SetMap<>();
		this.issueTypeToLines = new SetMap<>();
		this.lineToIssueTypes = new SetMap<>();
		this.lineToIssues = new ListTreeMap<>();

		for (Issue issue: issues) {
			if (issue.getLineNumber() == null) {
				throw new IllegalArgumentException(String.format("Issue without line number: %s", issue.getMessage()));
			}

			ISqmlIssueType foundIssueType = new SqmlIssueType(issue);
			issueTypeToLines.addToSet(foundIssueType, issue.getLineNumber());
			lineToIssueTypes.addToSet(issue.getLineNumber(), foundIssueType);
			lineToIssues.addToList(issue.getLineNumber(), issue);
			++size;
		}
	}

	public void approveIssue(ISqmlIssueType IssueType, int lineNumber) {

		approvedIssues.addToSet(IssueType, lineNumber);
	}

	public ListTreeMap<Integer, Issue> getUnapprovedIssues() {

		ListTreeMap<Integer, Issue> unapprovedIssues = new ListTreeMap<>();
		for (Entry<Integer, List<Issue>> entry: lineToIssues.entrySet()) {
			int lineNumber = entry.getKey();
			for (Issue issue: entry.getValue()) {
				ISqmlIssueType issueType = new SqmlIssueType(issue);
				if (!isApproved(issueType, lineNumber)) {
					unapprovedIssues.addToList(lineNumber, issue);
				}
			}
		}
		return unapprovedIssues;
	}

	public boolean isApproved(ISqmlIssueType issueType, int lineNumber) {

		return approvedIssues.getSet(issueType).contains(lineNumber);
	}

	public boolean contains(ISqmlIssueType issueType, int lineNumber) {

		return issueTypeToLines.getSet(issueType).contains(lineNumber);
	}

	public int size() {

		return size;
	}

	public boolean isEmpty() {

		return size == 0;
	}

	public Set<ISqmlIssueType> getIssueTypesInLine(int lineNumber) {

		return lineToIssueTypes.getSet(lineNumber);
	}

	public String getIssueReport() {

		ListTreeMap<Integer, Issue> unapprovedIssues = getUnapprovedIssues();

		if (isEmpty()) {
			return "No issues found at all.";
		} else if (unapprovedIssues.isEmpty()) {
			return "No unapproved issues found.";
		} else {
			List<String> report = new ArrayList<>();
			for (Entry<Integer, List<Issue>> entry: unapprovedIssues.entrySet()) {
				int lineNumber = entry.getKey();
				List<Issue> issuesInLine = entry.getValue();
				for (Issue issue: issuesInLine) {
					report.add(String.format("Line %d: %s: %s:", lineNumber, issue.getCode(), issue.getMessage()));
				}
			}
			return Imploder.implode(report, "\n");
		}
	}
}
