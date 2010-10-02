/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.LoopStatement#getStatements <em>Statements</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.LoopStatement#getEndLabel <em>End Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getLoopStatement()
 * @model
 * @generated
 */
public interface LoopStatement extends Statement
{
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
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getLoopStatement_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

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
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getLoopStatement_EndLabel()
   * @model
   * @generated
   */
  String getEndLabel();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.LoopStatement#getEndLabel <em>End Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Label</em>' attribute.
   * @see #getEndLabel()
   * @generated
   */
  void setEndLabel(String value);

} // LoopStatement
