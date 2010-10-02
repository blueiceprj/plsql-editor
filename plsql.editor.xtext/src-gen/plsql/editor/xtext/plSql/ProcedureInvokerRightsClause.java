/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Invoker Rights Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.ProcedureInvokerRightsClause#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getProcedureInvokerRightsClause()
 * @model
 * @generated
 */
public interface ProcedureInvokerRightsClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Right</b></em>' attribute.
   * The literals are from the enumeration {@link plsql.editor.xtext.plSql.InvokerRight}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' attribute.
   * @see plsql.editor.xtext.plSql.InvokerRight
   * @see #setRight(InvokerRight)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getProcedureInvokerRightsClause_Right()
   * @model
   * @generated
   */
  InvokerRight getRight();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.ProcedureInvokerRightsClause#getRight <em>Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' attribute.
   * @see plsql.editor.xtext.plSql.InvokerRight
   * @see #getRight()
   * @generated
   */
  void setRight(InvokerRight value);

} // ProcedureInvokerRightsClause
