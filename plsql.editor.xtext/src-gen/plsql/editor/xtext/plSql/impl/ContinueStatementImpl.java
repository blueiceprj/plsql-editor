/**
 * <copyright>
 * </copyright>
 *
 */
package plsql.editor.xtext.plSql.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import plsql.editor.xtext.plSql.ContinueStatement;
import plsql.editor.xtext.plSql.Expression;
import plsql.editor.xtext.plSql.PlSqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continue Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link plsql.editor.xtext.plSql.impl.ContinueStatementImpl#getLabelName <em>Label Name</em>}</li>
 *   <li>{@link plsql.editor.xtext.plSql.impl.ContinueStatementImpl#getWhenExpression <em>When Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContinueStatementImpl extends StatementImpl implements ContinueStatement
{
  /**
   * The default value of the '{@link #getLabelName() <em>Label Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelName()
   * @generated
   * @ordered
   */
  protected static final String LABEL_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabelName() <em>Label Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelName()
   * @generated
   * @ordered
   */
  protected String labelName = LABEL_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getWhenExpression() <em>When Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhenExpression()
   * @generated
   * @ordered
   */
  protected Expression whenExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContinueStatementImpl()
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
    return PlSqlPackage.Literals.CONTINUE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabelName()
  {
    return labelName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabelName(String newLabelName)
  {
    String oldLabelName = labelName;
    labelName = newLabelName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.CONTINUE_STATEMENT__LABEL_NAME, oldLabelName, labelName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getWhenExpression()
  {
    return whenExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhenExpression(Expression newWhenExpression, NotificationChain msgs)
  {
    Expression oldWhenExpression = whenExpression;
    whenExpression = newWhenExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlSqlPackage.CONTINUE_STATEMENT__WHEN_EXPRESSION, oldWhenExpression, newWhenExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhenExpression(Expression newWhenExpression)
  {
    if (newWhenExpression != whenExpression)
    {
      NotificationChain msgs = null;
      if (whenExpression != null)
        msgs = ((InternalEObject)whenExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.CONTINUE_STATEMENT__WHEN_EXPRESSION, null, msgs);
      if (newWhenExpression != null)
        msgs = ((InternalEObject)newWhenExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlSqlPackage.CONTINUE_STATEMENT__WHEN_EXPRESSION, null, msgs);
      msgs = basicSetWhenExpression(newWhenExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlSqlPackage.CONTINUE_STATEMENT__WHEN_EXPRESSION, newWhenExpression, newWhenExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PlSqlPackage.CONTINUE_STATEMENT__WHEN_EXPRESSION:
        return basicSetWhenExpression(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case PlSqlPackage.CONTINUE_STATEMENT__LABEL_NAME:
        return getLabelName();
      case PlSqlPackage.CONTINUE_STATEMENT__WHEN_EXPRESSION:
        return getWhenExpression();
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
      case PlSqlPackage.CONTINUE_STATEMENT__LABEL_NAME:
        setLabelName((String)newValue);
        return;
      case PlSqlPackage.CONTINUE_STATEMENT__WHEN_EXPRESSION:
        setWhenExpression((Expression)newValue);
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
      case PlSqlPackage.CONTINUE_STATEMENT__LABEL_NAME:
        setLabelName(LABEL_NAME_EDEFAULT);
        return;
      case PlSqlPackage.CONTINUE_STATEMENT__WHEN_EXPRESSION:
        setWhenExpression((Expression)null);
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
      case PlSqlPackage.CONTINUE_STATEMENT__LABEL_NAME:
        return LABEL_NAME_EDEFAULT == null ? labelName != null : !LABEL_NAME_EDEFAULT.equals(labelName);
      case PlSqlPackage.CONTINUE_STATEMENT__WHEN_EXPRESSION:
        return whenExpression != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (labelName: ");
    result.append(labelName);
    result.append(')');
    return result.toString();
  }

} //ContinueStatementImpl
