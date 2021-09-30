package com.softicar.sqml.model.utils.scoping;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import org.eclipse.xtext.resource.IEObjectDescription;

public class SqmlAliasEObjectDescriptions {

	public static Iterable<IEObjectDescription> filterAndTransform(Iterable<IEObjectDescription> descriptions,
			Predicate<? super IEObjectDescription> predicate) {

		return SqmlAliasEObjectDescriptions.transform(filter(descriptions, predicate));
	}

	public static Iterable<IEObjectDescription> filter(Iterable<IEObjectDescription> descriptions, Predicate<? super IEObjectDescription> predicate) {

		return Iterables.filter(descriptions, predicate);
	}

	public static Iterable<IEObjectDescription> transform(Iterable<IEObjectDescription> descriptions) {

		return Iterables.transform(descriptions, SqmlAliasEObjectDescription::new);
	}
}
