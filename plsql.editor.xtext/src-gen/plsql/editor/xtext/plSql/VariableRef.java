/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.VariableRef#isIsHostRef <em>Is Host Ref</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.VariableRef#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getVariableRef()
 * @model
 * @generated
 */
public interface VariableRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Is Host Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Host Ref</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Host Ref</em>' attribute.
   * @see #setIsHostRef(boolean)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getVariableRef_IsHostRef()
   * @model
   * @generated
   */
  boolean isIsHostRef();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.VariableRef#isIsHostRef <em>Is Host Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Host Ref</em>' attribute.
   * @see #isIsHostRef()
   * @generated
   */
  void setIsHostRef(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(QualifiedName)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getVariableRef_Name()
   * @model containment="true"
   * @generated
   */
  QualifiedName getName();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.VariableRef#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(QualifiedName value);

} // VariableRef
