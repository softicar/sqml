package com.softicar.sqml.test.utils;

import com.softicar.sqml.model.validation.ISqmlIssue;
import com.softicar.sqml.model.validation.ISqmlIssueType;
import com.softicar.sqml.model.validation.SqmlIssueType;
import com.softicar.sqml.test.parser.SqmlTestParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;

abstract class AbstractSqmlObjectTest<O, T extends AbstractSqmlObjectTest<O, T>> {

	private final List<String> lines;
	private final String filename;
	private final SqmlTestParser parser;
	private O object;
	private SqmlIssues issues;

	public AbstractSqmlObjectTest(String filename, SqmlTestParser parser) {

		this(filename, parser, null);
	}

	public AbstractSqmlObjectTest(String filename, SqmlTestParser parser, O object) {

		this.filename = filename;
		this.lines = new ArrayList<>();
		this.parser = parser;
		this.object = object;
		this.issues = null;
	}

	public T add() {

		return add("");
	}

	public T add(String line) {

		this.lines.add(line);
		return getThis();
	}

	public T addAll(String...lines) {

		this.lines.addAll(Arrays.asList(lines));
		return getThis();
	}

	public List<String> getLines() {

		return lines;
	}

	// -------------------- Issue Assert -------------------- //

	public T assertIssue(Class<? extends ISqmlIssue> issueClass, int expectedLine) {

		return assertIssue(new SqmlIssueType(issueClass), expectedLine);
	}

	public T assertIssue(ISqmlIssueType expectedIssue, int expectedLine) {

		if (getIssues().contains(expectedIssue, expectedLine)) {
			getIssues().approveIssue(expectedIssue, expectedLine);
		} else {
			String message = String
				.format(//
					"Failed to find expected issue %s in line %d.\n%s",
					expectedIssue,
					expectedLine,
					getIssues().getIssueReport());
			Assert.fail(message);
		}

		return getThis();
	}

	public T assertNoIssues() {

		if (!getIssues().isEmpty()) {
			Assert.fail("Expected to find no issues but found this:\n" + getIssues().getIssueReport());
		}

		return getThis();
	}

	public T assertNoMoreIssues() {

		if (!getIssues().getUnapprovedIssues().isEmpty()) {
			Assert.fail("Expected to find no more issues but found this:\n" + getIssues().getIssueReport());
		}

		return getThis();
	}

	protected SqmlTestParser getParser() {

		return parser;
	}

	protected O getObject() {

		parse();
		assertNoMoreIssues();

		return object;
	}

	private SqmlIssues getIssues() {

		parse();

		return issues;
	}

	private void parse() {

		if (this.object == null) {
			this.object = parseObject(lines, filename);
		}

		if (this.issues == null) {
			this.issues = new SqmlIssues(parser.getIssues());
		}
	}

	// -------------------- Abstract -------------------- //

	protected abstract O parseObject(List<String> lines, String filename);

	protected abstract T getThis();
}
