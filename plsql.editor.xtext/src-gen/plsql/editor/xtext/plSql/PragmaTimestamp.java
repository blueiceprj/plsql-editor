/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pragma Timestamp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.PragmaTimestamp#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getPragmaTimestamp()
 * @model
 * @generated
 */
public interface PragmaTimestamp extends Pragma
{
  /**
   * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timestamp</em>' attribute.
   * @see #setTimestamp(String)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getPragmaTimestamp_Timestamp()
   * @model
   * @generated
   */
  String getTimestamp();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.PragmaTimestamp#getTimestamp <em>Timestamp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timestamp</em>' attribute.
   * @see #getTimestamp()
   * @generated
   */
  void setTimestamp(String value);

} // PragmaTimestamp
