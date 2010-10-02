/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Loop Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.ForLoopStatement#getIndexVariable <em>Index Variable</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.ForLoopStatement#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.ForLoopStatement#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see plsql.editor.xtext.plSql.PlSqlPackage#getForLoopStatement()
 * @model
 * @generated
 */
public interface ForLoopStatement extends LoopStatement
{
  /**
   * Returns the value of the '<em><b>Index Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index Variable</em>' containment reference.
   * @see #setIndexVariable(LoopVariableDeclaration)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getForLoopStatement_IndexVariable()
   * @model containment="true"
   * @generated
   */
  LoopVariableDeclaration getIndexVariable();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.ForLoopStatement#getIndexVariable <em>Index Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index Variable</em>' containment reference.
   * @see #getIndexVariable()
   * @generated
   */
  void setIndexVariable(LoopVariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower Bound</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower Bound</em>' containment reference.
   * @see #setLowerBound(Expression)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getForLoopStatement_LowerBound()
   * @model containment="true"
   * @generated
   */
  Expression getLowerBound();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.ForLoopStatement#getLowerBound <em>Lower Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower Bound</em>' containment reference.
   * @see #getLowerBound()
   * @generated
   */
  void setLowerBound(Expression value);

  /**
   * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper Bound</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper Bound</em>' containment reference.
   * @see #setUpperBound(Expression)
   * @see plsql.editor.xtext.plSql.PlSqlPackage#getForLoopStatement_UpperBound()
   * @model containment="true"
   * @generated
   */
  Expression getUpperBound();

  /**
   * Sets the value of the '{@link plsql.editor.xtext.plSql.ForLoopStatement#getUpperBound <em>Upper Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper Bound</em>' containment reference.
   * @see #getUpperBound()
   * @generated
   */
  void setUpperBound(Expression value);

} // ForLoopStatement
