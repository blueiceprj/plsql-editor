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
 * A representation of the model object '<em><b>Case Statement Else Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.CaseStatementElseBranch#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getCaseStatementElseBranch()
 * @model
 * @generated
 */
public interface CaseStatementElseBranch extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link plsql.editor.xtext.plSql.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getCaseStatementElseBranch_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // CaseStatementElseBranch
