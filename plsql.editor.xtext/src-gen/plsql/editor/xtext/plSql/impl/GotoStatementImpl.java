/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import plsql.editor.xtext.plSql.GotoStatement;
import plsql.editor.xtext.plSql.Label;
import plsql.editor.xtext.plSql.PlSqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goto Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.impl.GotoStatementImpl#getLabelName <em>Label Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GotoStatementImpl extends StatementImpl implements GotoStatement
{
  /**
   * The cached value of the '{@link #getLabelName() <em>Label Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelName()
   * @generated
   * @ordered
   */
  protected Label labelName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GotoStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PlSqlPackage.Literals.GOTO_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label getLabelName()
  {
    if (labelName != null && labelName.eIsProxy())
    {
      InternalEObject oldLabelName = (InternalEObject)labelName;
      labelName = (Label)eResolveProxy(oldLabelName);
      if (labelName != oldLabelName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlSqlPackage.GOTO_STATEMENT__LABEL_NAME, oldLabelName, labelName));
      }
    }
    return labelName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label basicGetLabelName()
  {
    return labelName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabelName(Label newLabelName)
  {
    Label oldLabelName = labelName;
    labelName = newLabelName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.GOTO_STATEMENT__LABEL_NAME, oldLabelName, labelName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PlSqlPackage.GOTO_STATEMENT__LABEL_NAME:
        if (resolve) return getLabelName();
        return basicGetLabelName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PlSqlPackage.GOTO_STATEMENT__LABEL_NAME:
        setLabelName((Label)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PlSqlPackage.GOTO_STATEMENT__LABEL_NAME:
        setLabelName((Label)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PlSqlPackage.GOTO_STATEMENT__LABEL_NAME:
        return labelName != null;
    }
    return super.eIsSet(featureID);
  }

} //GotoStatementImpl
