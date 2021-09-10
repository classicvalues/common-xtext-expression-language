/**
 * generated by Xtext 2.25.0
 */
package com.intuit.dsl.expression.impl;

import com.intuit.dsl.expression.CollectionFunction;
import com.intuit.dsl.expression.CollectionFunctionCall;
import com.intuit.dsl.expression.Expression;
import com.intuit.dsl.expression.ExpressionPackage;
import com.intuit.dsl.expression.Key;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.intuit.dsl.expression.impl.CollectionFunctionImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link com.intuit.dsl.expression.impl.CollectionFunctionImpl#getRefexp <em>Refexp</em>}</li>
 *   <li>{@link com.intuit.dsl.expression.impl.CollectionFunctionImpl#getResultKey <em>Result Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionFunctionImpl extends FunctionImpl implements CollectionFunction
{
  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected CollectionFunctionCall function;

  /**
   * The cached value of the '{@link #getRefexp() <em>Refexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefexp()
   * @generated
   * @ordered
   */
  protected Expression refexp;

  /**
   * The cached value of the '{@link #getResultKey() <em>Result Key</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultKey()
   * @generated
   * @ordered
   */
  protected EList<Key> resultKey;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CollectionFunctionImpl()
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
    return ExpressionPackage.Literals.COLLECTION_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CollectionFunctionCall getFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunction(CollectionFunctionCall newFunction, NotificationChain msgs)
  {
    CollectionFunctionCall oldFunction = function;
    function = newFunction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.COLLECTION_FUNCTION__FUNCTION, oldFunction, newFunction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFunction(CollectionFunctionCall newFunction)
  {
    if (newFunction != function)
    {
      NotificationChain msgs = null;
      if (function != null)
        msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.COLLECTION_FUNCTION__FUNCTION, null, msgs);
      if (newFunction != null)
        msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.COLLECTION_FUNCTION__FUNCTION, null, msgs);
      msgs = basicSetFunction(newFunction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.COLLECTION_FUNCTION__FUNCTION, newFunction, newFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getRefexp()
  {
    return refexp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefexp(Expression newRefexp, NotificationChain msgs)
  {
    Expression oldRefexp = refexp;
    refexp = newRefexp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.COLLECTION_FUNCTION__REFEXP, oldRefexp, newRefexp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRefexp(Expression newRefexp)
  {
    if (newRefexp != refexp)
    {
      NotificationChain msgs = null;
      if (refexp != null)
        msgs = ((InternalEObject)refexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.COLLECTION_FUNCTION__REFEXP, null, msgs);
      if (newRefexp != null)
        msgs = ((InternalEObject)newRefexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.COLLECTION_FUNCTION__REFEXP, null, msgs);
      msgs = basicSetRefexp(newRefexp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.COLLECTION_FUNCTION__REFEXP, newRefexp, newRefexp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Key> getResultKey()
  {
    if (resultKey == null)
    {
      resultKey = new EObjectContainmentEList<Key>(Key.class, this, ExpressionPackage.COLLECTION_FUNCTION__RESULT_KEY);
    }
    return resultKey;
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
      case ExpressionPackage.COLLECTION_FUNCTION__FUNCTION:
        return basicSetFunction(null, msgs);
      case ExpressionPackage.COLLECTION_FUNCTION__REFEXP:
        return basicSetRefexp(null, msgs);
      case ExpressionPackage.COLLECTION_FUNCTION__RESULT_KEY:
        return ((InternalEList<?>)getResultKey()).basicRemove(otherEnd, msgs);
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
      case ExpressionPackage.COLLECTION_FUNCTION__FUNCTION:
        return getFunction();
      case ExpressionPackage.COLLECTION_FUNCTION__REFEXP:
        return getRefexp();
      case ExpressionPackage.COLLECTION_FUNCTION__RESULT_KEY:
        return getResultKey();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExpressionPackage.COLLECTION_FUNCTION__FUNCTION:
        setFunction((CollectionFunctionCall)newValue);
        return;
      case ExpressionPackage.COLLECTION_FUNCTION__REFEXP:
        setRefexp((Expression)newValue);
        return;
      case ExpressionPackage.COLLECTION_FUNCTION__RESULT_KEY:
        getResultKey().clear();
        getResultKey().addAll((Collection<? extends Key>)newValue);
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
      case ExpressionPackage.COLLECTION_FUNCTION__FUNCTION:
        setFunction((CollectionFunctionCall)null);
        return;
      case ExpressionPackage.COLLECTION_FUNCTION__REFEXP:
        setRefexp((Expression)null);
        return;
      case ExpressionPackage.COLLECTION_FUNCTION__RESULT_KEY:
        getResultKey().clear();
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
      case ExpressionPackage.COLLECTION_FUNCTION__FUNCTION:
        return function != null;
      case ExpressionPackage.COLLECTION_FUNCTION__REFEXP:
        return refexp != null;
      case ExpressionPackage.COLLECTION_FUNCTION__RESULT_KEY:
        return resultKey != null && !resultKey.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CollectionFunctionImpl