/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.Function#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.Function#getParameters <em>Parameters</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.Function#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.Function#getFunctionClauses <em>Function Clauses</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.Function#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends CompilationUnit, NameDeclaration
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
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getFunction_SchemaName()
   * @model
   * @generated
   */
  String getSchemaName();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.Function#getSchemaName <em>Schema Name</em>}' attribute.
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
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getFunction_Parameters()
   * @model containment="true"
   * @generated
   */
  ParameterSequence getParameters();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.Function#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(ParameterSequence value);

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' attribute.
   * @see #setReturnType(String)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getFunction_ReturnType()
   * @model
   * @generated
   */
  String getReturnType();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.Function#getReturnType <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' attribute.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(String value);

  /**
   * Returns the value of the '<em><b>Function Clauses</b></em>' containment reference list.
   * The list contents are of type {@link plsql.editor.xtext.plSql.FunctionClause}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Clauses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Clauses</em>' containment reference list.
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getFunction_FunctionClauses()
   * @model containment="true"
   * @generated
   */
  EList<FunctionClause> getFunctionClauses();

  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference.
   * @see #setContent(FunctionContent)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getFunction_Content()
   * @model containment="true"
   * @generated
   */
  FunctionContent getContent();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.Function#getContent <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' containment reference.
   * @see #getContent()
   * @generated
   */
  void setContent(FunctionContent value);

} // Function
