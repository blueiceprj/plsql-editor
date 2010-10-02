/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raise Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.RaiseStatement#getExceptionName <em>Exception Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getRaiseStatement()
 * @model
 * @generated
 */
public interface RaiseStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Exception Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception Name</em>' attribute.
   * @see #setExceptionName(String)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getRaiseStatement_ExceptionName()
   * @model
   * @generated
   */
  String getExceptionName();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.RaiseStatement#getExceptionName <em>Exception Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception Name</em>' attribute.
   * @see #getExceptionName()
   * @generated
   */
  void setExceptionName(String value);

} // RaiseStatement
