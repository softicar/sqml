package com.softicar.sqml.ui.highlighting;

import com.softicar.sqml.model.expressions.SqmlStaticVariableReference;
import com.softicar.sqml.model.functions.SqmlFunctionCall;
import com.softicar.sqml.model.types.SqmlTypeReference;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class SqmlHighlightingConfigurator {

	private final IHighlightingConfigurationAcceptor acceptor;

	public static final String SQML_FUNCTION_CALL = SqmlFunctionCall.class.getCanonicalName();
	public static final String SQML_STATIC_VARIABLE_REFERENCE = SqmlStaticVariableReference.class.getCanonicalName();
	public static final String SQML_BUILT_IN_TYPE = SqmlTypeReference.class.getCanonicalName() + ".builtInType";

	public SqmlHighlightingConfigurator(IHighlightingConfigurationAcceptor acceptor) {

		this.acceptor = acceptor;
	}

	public void configure() {

		add(SQML_FUNCTION_CALL, "Sqml Function Call", 139, 105, 20, SWT.ITALIC);
		add(SQML_STATIC_VARIABLE_REFERENCE, "Sqml Static Variable Reference", 0, 96, 0, SWT.ITALIC);
		add(SQML_BUILT_IN_TYPE, "Sqml Built-in Type", 165, 42, 42, SWT.ITALIC);
	}

	private void add(String id, String name, int red, int green, int blue, int fontStyle) {

		TextStyle textStyle = createTextStyle(red, green, blue, fontStyle);
		acceptor.acceptDefaultHighlighting(id, name, textStyle);
	}

	private TextStyle createTextStyle(int red, int green, int blue, int fontStyle) {

		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(red, green, blue));
		textStyle.setStyle(fontStyle);
		return textStyle;
	}
}
