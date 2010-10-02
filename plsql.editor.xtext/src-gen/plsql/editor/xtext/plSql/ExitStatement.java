/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exit Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.ExitStatement#getLabelName <em>Label Name</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.ExitStatement#getWhenExpression <em>When Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getExitStatement()
 * @model
 * @generated
 */
public interface ExitStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Label Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label Name</em>' attribute.
   * @see #setLabelName(String)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getExitStatement_LabelName()
   * @model
   * @generated
   */
  String getLabelName();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.ExitStatement#getLabelName <em>Label Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Name</em>' attribute.
   * @see #getLabelName()
   * @generated
   */
  void setLabelName(String value);

  /**
   * Returns the value of the '<em><b>When Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When Expression</em>' containment reference.
   * @see #setWhenExpression(Expression)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getExitStatement_WhenExpression()
   * @model containment="true"
   * @generated
   */
  Expression getWhenExpression();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.ExitStatement#getWhenExpression <em>When Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When Expression</em>' containment reference.
   * @see #getWhenExpression()
   * @generated
   */
  void setWhenExpression(Expression value);

} // ExitStatement
