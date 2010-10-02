/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.Package#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.Package#getInvokerRights <em>Invoker Rights</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.Package#getItems <em>Items</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.Package#getEndName <em>End Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends CompilationUnit, NameDeclaration
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
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getPackage_SchemaName()
   * @model
   * @generated
   */
  String getSchemaName();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.Package#getSchemaName <em>Schema Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schema Name</em>' attribute.
   * @see #getSchemaName()
   * @generated
   */
  void setSchemaName(String value);

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
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getPackage_InvokerRights()
   * @model containment="true"
   * @generated
   */
  ProcedureInvokerRightsClause getInvokerRights();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.Package#getInvokerRights <em>Invoker Rights</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Invoker Rights</em>' containment reference.
   * @see #getInvokerRights()
   * @generated
   */
  void setInvokerRights(ProcedureInvokerRightsClause value);

  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link plsql.editor.xtext.plSql.Item}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getPackage_Items()
   * @model containment="true"
   * @generated
   */
  EList<Item> getItems();

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
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getPackage_EndName()
   * @model
   * @generated
   */
  String getEndName();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.Package#getEndName <em>End Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Name</em>' attribute.
   * @see #getEndName()
   * @generated
   */
  void setEndName(String value);

} // Package
