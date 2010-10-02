/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fetch Statement Bulk Into Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.FetchStatementBulkIntoClause#getLimitExpression <em>Limit Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getFetchStatementBulkIntoClause()
 * @model
 * @generated
 */
public interface FetchStatementBulkIntoClause extends FetchStatementIntoClause
{
  /**
   * Returns the value of the '<em><b>Limit Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Limit Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Limit Expression</em>' containment reference.
   * @see #setLimitExpression(Expression)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getFetchStatementBulkIntoClause_LimitExpression()
   * @model containment="true"
   * @generated
   */
  Expression getLimitExpression();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.FetchStatementBulkIntoClause#getLimitExpression <em>Limit Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limit Expression</em>' containment reference.
   * @see #getLimitExpression()
   * @generated
   */
  void setLimitExpression(Expression value);

} // FetchStatementBulkIntoClause
