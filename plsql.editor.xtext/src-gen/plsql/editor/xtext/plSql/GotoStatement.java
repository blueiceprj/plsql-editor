/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goto Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.GotoStatement#getLabelName <em>Label Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getGotoStatement()
 * @model
 * @generated
 */
public interface GotoStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Label Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label Name</em>' reference.
   * @see #setLabelName(Label)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getGotoStatement_LabelName()
   * @model
   * @generated
   */
  Label getLabelName();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.GotoStatement#getLabelName <em>Label Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Name</em>' reference.
   * @see #getLabelName()
   * @generated
   */
  void setLabelName(Label value);

} // GotoStatement
