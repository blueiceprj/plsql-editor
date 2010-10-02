/*
 * generated by Xtext
 */
package plsql.editor.xtext.ui.outline;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.transformer.AbstractDeclarativeSemanticModelTransformer;

import plsql.editor.xtext.plSql.Item;
import plsql.editor.xtext.plSql.Procedure;
import plsql.editor.xtext.plSql.ProcedureContent;
import plsql.editor.xtext.plSql.ProcedureImplementation;

/**
 * customization of the default outline structure
 */
public class PlSqlTransformer extends AbstractDeclarativeSemanticModelTransformer {

	@Override
	protected List<EObject> getChildren(EObject semanticNode) {
		return Collections.emptyList();
	}

	protected List<Item> getChildren(Procedure semanticNode) {
		ProcedureContent content = semanticNode.getContent();
		if (content instanceof ProcedureImplementation) {
			ProcedureImplementation impl = (ProcedureImplementation) content;
			if (impl.getDeclareSection() != null) {
				return impl.getDeclareSection().getItems();
			}
		}
		return Collections.emptyList();
	}
}