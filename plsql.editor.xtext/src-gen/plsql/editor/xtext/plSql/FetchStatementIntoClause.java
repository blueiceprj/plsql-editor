/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fetch Statement Into Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.FetchStatementIntoClause#getTargetVariables <em>Target Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getFetchStatementIntoClause()
 * @model
 * @generated
 */
public interface FetchStatementIntoClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Target Variables</b></em>' containment reference list.
   * The list contents are of type {@link plsql.editor.xtext.plSql.VariableRef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Variables</em>' containment reference list.
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getFetchStatementIntoClause_TargetVariables()
   * @model containment="true"
   * @generated
   */
  EList<VariableRef> getTargetVariables();

} // FetchStatementIntoClause
