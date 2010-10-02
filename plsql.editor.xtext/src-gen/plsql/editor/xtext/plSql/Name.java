/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.Name#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getName_()
 * @model
 * @generated
 */
public interface Name extends EObject
{
  /**
   * Returns the value of the '<em><b>Declaration</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration</em>' reference.
   * @see #setDeclaration(NameDeclaration)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getName_Declaration()
   * @model
   * @generated
   */
  NameDeclaration getDeclaration();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.Name#getDeclaration <em>Declaration</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaration</em>' reference.
   * @see #getDeclaration()
   * @generated
   */
  void setDeclaration(NameDeclaration value);

} // Name
