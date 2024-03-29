/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.ReturnStatement#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getReturnStatement()
 * @model
 * @generated
 */
public interface ReturnStatement extends Statement
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
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getReturnStatement_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.ReturnStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // ReturnStatement
