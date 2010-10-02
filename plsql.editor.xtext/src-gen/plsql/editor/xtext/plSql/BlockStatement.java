/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.BlockStatement#getDeclareSection <em>Declare Section</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.BlockStatement#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getBlockStatement()
 * @model
 * @generated
 */
public interface BlockStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Declare Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declare Section</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declare Section</em>' containment reference.
   * @see #setDeclareSection(DeclareSection)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getBlockStatement_DeclareSection()
   * @model containment="true"
   * @generated
   */
  DeclareSection getDeclareSection();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.BlockStatement#getDeclareSection <em>Declare Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declare Section</em>' containment reference.
   * @see #getDeclareSection()
   * @generated
   */
  void setDeclareSection(DeclareSection value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(StatementBody)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getBlockStatement_Body()
   * @model containment="true"
   * @generated
   */
  StatementBody getBody();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.BlockStatement#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(StatementBody value);

} // BlockStatement
