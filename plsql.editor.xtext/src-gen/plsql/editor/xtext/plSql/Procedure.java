/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.Procedure#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.Procedure#getParameters <em>Parameters</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.Procedure#getInvokerRights <em>Invoker Rights</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.Procedure#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getProcedure()
 * @model
 * @generated
 */
public interface Procedure extends CompilationUnit, NameDeclaration
{
  /**
   * Returns the value of the '<em><b>Schema Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schema Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schema Name</em>' attribute.
   * @see #setSchemaName(String)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getProcedure_SchemaName()
   * @model
   * @generated
   */
  String getSchemaName();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.Procedure#getSchemaName <em>Schema Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schema Name</em>' attribute.
   * @see #getSchemaName()
   * @generated
   */
  void setSchemaName(String value);

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
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getProcedure_Parameters()
   * @model containment="true"
   * @generated
   */
  ParameterSequence getParameters();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.Procedure#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(ParameterSequence value);

  /**
   * Returns the value of the '<em><b>Invoker Rights</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invoker Rights</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Invoker Rights</em>' containment reference.
   * @see #setInvokerRights(ProcedureInvokerRightsClause)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getProcedure_InvokerRights()
   * @model containment="true"
   * @generated
   */
  ProcedureInvokerRightsClause getInvokerRights();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.Procedure#getInvokerRights <em>Invoker Rights</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Invoker Rights</em>' containment reference.
   * @see #getInvokerRights()
   * @generated
   */
  void setInvokerRights(ProcedureInvokerRightsClause value);

  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference.
   * @see #setContent(ProcedureContent)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getProcedure_Content()
   * @model containment="true"
   * @generated
   */
  ProcedureContent getContent();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.Procedure#getContent <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' containment reference.
   * @see #getContent()
   * @generated
   */
  void setContent(ProcedureContent value);

} // Procedure
