package com.softicar.sqml.scoping;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.softicar.sqml.model.utils.scoping.AbstractSqmlScope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.function.Function;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

/**
 * A {@link Stack} of {@link IScope}.
 * <p>
 * The scope elements of all scopes a concatenated, stating for the top of the
 * stack.
 *
 * @author Oliver Richers
 */
public class SqmlScopeStack extends AbstractSqmlScope {

	private final Stack<IScope> stack = new Stack<>();

	public void push(IScope scope) {

		stack.push(scope);
	}

	public IScope pop() {

		return stack.pop();
	}

	@Override
	public Iterable<IEObjectDescription> getElements(QualifiedName name) {

		return getElements(scope -> scope.getElements(name));
	}

	@Override
	public Iterable<IEObjectDescription> getElements(EObject object) {

		return getElements(scope -> scope.getElements(object));
	}

	public Iterable<IEObjectDescription> getElements(Function<IScope, Iterable<IEObjectDescription>> descriptionGetter) {

		// iterate over reversed stack of scopes
		for (IScope scope: Lists.reverse(stack)) {
			Iterable<IEObjectDescription> elements = descriptionGetter.apply(scope);
			if (!Iterables.isEmpty(elements)) {
				// return as soon as a match is found
				return elements;
			}
		}
		return Collections.emptyList();
	}

	@Override
	public Iterable<IEObjectDescription> getAllElements() {

		List<Iterable<IEObjectDescription>> elementIterables = new ArrayList<>();
		for (IScope scope: Lists.reverse(stack)) {
			elementIterables.add(scope.getAllElements());
		}
		return Iterables.concat(elementIterables);
	}
}
