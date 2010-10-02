/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.ProcedureDefinition#getParameters <em>Parameters</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.ProcedureDefinition#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getProcedureDefinition()
 * @model
 * @generated
 */
public interface ProcedureDefinition extends Item, NameDeclaration
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference.
   * @see #setParameters(ParameterSequence)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getProcedureDefinition_Parameters()
   * @model containment="true"
   * @generated
   */
  ParameterSequence getParameters();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.ProcedureDefinition#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(ParameterSequence value);

  /**
   * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Implementation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implementation</em>' containment reference.
   * @see #setImplementation(ProcedureImplementation)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getProcedureDefinition_Implementation()
   * @model containment="true"
   * @generated
   */
  ProcedureImplementation getImplementation();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.ProcedureDefinition#getImplementation <em>Implementation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Implementation</em>' containment reference.
   * @see #getImplementation()
   * @generated
   */
  void setImplementation(ProcedureImplementation value);

} // ProcedureDefinition
