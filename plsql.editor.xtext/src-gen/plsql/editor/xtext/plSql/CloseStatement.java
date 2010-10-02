/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Close Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.CloseStatement#getCursor <em>Cursor</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getCloseStatement()
 * @model
 * @generated
 */
public interface CloseStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Cursor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cursor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cursor</em>' containment reference.
   * @see #setCursor(VariableRef)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getCloseStatement_Cursor()
   * @model containment="true"
   * @generated
   */
  VariableRef getCursor();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.CloseStatement#getCursor <em>Cursor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cursor</em>' containment reference.
   * @see #getCursor()
   * @generated
   */
  void setCursor(VariableRef value);

} // CloseStatement
