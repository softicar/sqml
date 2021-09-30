package com.softicar.sqml.ui.selection;

import com.google.common.collect.Iterables;
import com.softicar.platform.common.core.utils.CastUtils;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.ui.utils.SqmlUiUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.services.IServiceLocator;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

public class SqmlUiSelection implements Iterable<Object> {

	private final IStructuredSelection structuredSelection;

	public SqmlUiSelection(ExecutionEvent event) {

		this.structuredSelection = getStructuredSelection(event);
	}

	public SqmlUiSelection(IServiceLocator serviceLocator) {

		this.structuredSelection = getStructuredSelection(serviceLocator);
	}

	public SqmlUiSelection(ISelection selection) {

		this.structuredSelection = getStructuredSelection(selection);
	}

	public Object getFirstElement() {

		return structuredSelection != null? structuredSelection.getFirstElement() : null;
	}

	@Override
	public Iterator<Object> iterator() {

		if (structuredSelection != null) {
			Iterator<?> iterator = structuredSelection.iterator();
			return CastUtils.cast(iterator);
		} else {
			return Collections.emptyIterator();
		}
	}

	public <T> T getSingleElementOrNull(Class<T> elementClass) {

		if (Iterables.size(this) == 1) {
			Object object = iterator().next();
			return elementClass.isInstance(object)? elementClass.cast(object) : null;
		} else {
			return null;
		}
	}

	/**
	 * Returns all selected elements implementing the given class.
	 * <p>
	 * If one of the selected elements does not implement the given class, this
	 * will immediately return an empty collection.
	 *
	 * @param elementClass
	 *            the desired class of selected elements
	 * @return the selected elements
	 */
	public <T> Collection<T> getElementsOfType(Class<T> elementClass) {

		Collection<T> elements = new ArrayList<>();
		for (Object element: this) {
			if (elementClass.isInstance(element)) {
				elements.add(elementClass.cast(element));
			} else if (element instanceof IWorkingSet) {
				elements.addAll(getElementsOfType((IWorkingSet) element, elementClass));
			}
		}
		return elements;
	}

	public static <T> Collection<T> getElementsOfType(IWorkingSet workingSet, Class<T> elementClass) {

		return Arrays//
			.asList(workingSet.getElements())
			.stream()
			.filter(elementClass::isInstance)
			.map(elementClass::cast)
			.collect(Collectors.toList());
	}

	public List<IFile> getSelectedFiles() {

		List<IFile> files = new ArrayList<>();
		if (structuredSelection != null) {
			for (Object selectedObject: structuredSelection.toList()) {
				if (selectedObject instanceof IFile) {
					files.add((IFile) selectedObject);
				}
			}
		}
		return files;
	}

	public List<ISqmlFile> getSelectedSqmlFiles(IResourceSetProvider resourceSetProvider) {

		List<ISqmlFile> files = new ArrayList<>();
		ResourceSet resourceSet = resourceSetProvider.get(getProject());
		for (IFile file: getSelectedFiles()) {
			if (file.getFileExtension().equals("sqml")) {
				ISqmlFile sqmlFile = SqmlUiUtils.getSqmlFile(resourceSet, file);
				if (sqmlFile != null) {
					files.add(sqmlFile);
				}
			}
		}
		return files;
	}

	public List<ISqmlTable> getSelectedSqmlTables(IResourceSetProvider resourceSetProvider) {

		List<ISqmlTable> tables = new ArrayList<>();
		for (ISqmlFile sqmlFile: getSelectedSqmlFiles(resourceSetProvider)) {
			for (ISqmlTable table: sqmlFile.getTables()) {
				tables.add(table);
			}
		}
		return tables;
	}

	public IProject getProject() {

		if (structuredSelection != null) {
			Object element = structuredSelection.getFirstElement();
			if (element instanceof IResource) {
				return ((IResource) element).getProject();
			} else if (element instanceof IJavaElement) {
				return ((IJavaElement) element).getJavaProject().getProject();
			}
		}

		return null;
	}

	private static IStructuredSelection getStructuredSelection(ExecutionEvent event) {

		return getStructuredSelection(HandlerUtil.getActiveMenuSelection(event));
	}

	private static IStructuredSelection getStructuredSelection(IServiceLocator serviceLocator) {

		ISelectionService selectionService = serviceLocator.getService(ISelectionService.class);
		return getStructuredSelection(selectionService.getSelection());
	}

	private static IStructuredSelection getStructuredSelection(ISelection selection) {

		return selection instanceof IStructuredSelection? (IStructuredSelection) selection : null;
	}
}
