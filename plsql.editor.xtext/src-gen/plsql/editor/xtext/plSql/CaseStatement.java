/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.CaseStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.CaseStatement#getWhenBranches <em>When Branches</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.CaseStatement#getElseBranch <em>Else Branch</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.CaseStatement#getEndLabel <em>End Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getCaseStatement()
 * @model
 * @generated
 */
public interface CaseStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getCaseStatement_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.CaseStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>When Branches</b></em>' containment reference list.
   * The list contents are of type {@link plsql.editor.xtext.plSql.CaseStatementWhenBranch}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When Branches</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When Branches</em>' containment reference list.
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getCaseStatement_WhenBranches()
   * @model containment="true"
   * @generated
   */
  EList<CaseStatementWhenBranch> getWhenBranches();

  /**
   * Returns the value of the '<em><b>Else Branch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Branch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Branch</em>' containment reference.
   * @see #setElseBranch(CaseStatementElseBranch)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getCaseStatement_ElseBranch()
   * @model containment="true"
   * @generated
   */
  CaseStatementElseBranch getElseBranch();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.CaseStatement#getElseBranch <em>Else Branch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Branch</em>' containment reference.
   * @see #getElseBranch()
   * @generated
   */
  void setElseBranch(CaseStatementElseBranch value);

  /**
   * Returns the value of the '<em><b>End Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Label</em>' attribute.
   * @see #setEndLabel(String)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getCaseStatement_EndLabel()
   * @model
   * @generated
   */
  String getEndLabel();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.CaseStatement#getEndLabel <em>End Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Label</em>' attribute.
   * @see #getEndLabel()
   * @generated
   */
  void setEndLabel(String value);

} // CaseStatement
