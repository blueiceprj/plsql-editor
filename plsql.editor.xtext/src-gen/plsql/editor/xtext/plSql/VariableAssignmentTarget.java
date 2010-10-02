/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Assignment Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.VariableAssignmentTarget#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getVariableAssignmentTarget()
 * @model
 * @generated
 */
public interface VariableAssignmentTarget extends AssignmentTarget
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(VariableRef)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getVariableAssignmentTarget_Variable()
   * @model containment="true"
   * @generated
   */
  VariableRef getVariable();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.VariableAssignmentTarget#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableRef value);

} // VariableAssignmentTarget
