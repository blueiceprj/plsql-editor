/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.StatementBody#getStatements <em>Statements</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.StatementBody#getEndName <em>End Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getStatementBody()
 * @model
 * @generated
 */
public interface StatementBody extends EObject
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
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getStatementBody_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

  /**
   * Returns the value of the '<em><b>End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Name</em>' attribute.
   * @see #setEndName(String)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getStatementBody_EndName()
   * @model
   * @generated
   */
  String getEndName();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.StatementBody#getEndName <em>End Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Name</em>' attribute.
   * @see #getEndName()
   * @generated
   */
  void setEndName(String value);

} // StatementBody
