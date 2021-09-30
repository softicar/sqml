package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.ISqmlModelElement;
import java.util.ArrayList;
import java.util.List;

public class SqmlPaths {

	public static List<ISqmlModelElement> getAllTargets(ISqmlPath path) {

		List<ISqmlModelElement> targets = new ArrayList<>();
		addTargets(targets, path);
		return targets;
	}

	private static void addTargets(List<ISqmlModelElement> targets, ISqmlPath path) {

		ISqmlPath parent = path.getParent();
		if (parent != null) {
			addTargets(targets, parent);
		}

		targets.add(path.getTarget());
	}
}
