/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.IfStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.IfStatement#getStatements <em>Statements</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.IfStatement#getElsifBranches <em>Elsif Branches</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.IfStatement#getElseBranch <em>Else Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends Statement
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
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getIfStatement_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.IfStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

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
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getIfStatement_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

  /**
   * Returns the value of the '<em><b>Elsif Branches</b></em>' containment reference list.
   * The list contents are of type {@link plsql.editor.xtext.plSql.IfStatementElsifBranch}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elsif Branches</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elsif Branches</em>' containment reference list.
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getIfStatement_ElsifBranches()
   * @model containment="true"
   * @generated
   */
  EList<IfStatementElsifBranch> getElsifBranches();

  /**
   * Returns the value of the '<em><b>Else Branch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Branch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Branch</em>' containment reference.
   * @see #setElseBranch(IfStatementElseBranch)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getIfStatement_ElseBranch()
   * @model containment="true"
   * @generated
   */
  IfStatementElseBranch getElseBranch();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.IfStatement#getElseBranch <em>Else Branch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Branch</em>' containment reference.
   * @see #getElseBranch()
   * @generated
   */
  void setElseBranch(IfStatementElseBranch value);

} // IfStatement
