/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.metaTemplating.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.metaTemplating.Filter;
import org.xtext.example.mydsl.metaTemplating.Instructions;
import org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage;
import org.xtext.example.mydsl.metaTemplating.Query;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.impl.FilterImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.impl.FilterImpl#getTruebody <em>Truebody</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.impl.FilterImpl#getFalsebody <em>Falsebody</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterImpl extends MinimalEObjectImpl.Container implements Filter
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Query condition;

  /**
   * The cached value of the '{@link #getTruebody() <em>Truebody</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTruebody()
   * @generated
   * @ordered
   */
  protected EList<Instructions> truebody;

  /**
   * The cached value of the '{@link #getFalsebody() <em>Falsebody</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalsebody()
   * @generated
   * @ordered
   */
  protected EList<Instructions> falsebody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FilterImpl()
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
    return MetaTemplatingPackage.Literals.FILTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Query getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Query newCondition, NotificationChain msgs)
  {
    Query oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaTemplatingPackage.FILTER__CONDITION, oldCondition, newCondition);
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
  public void setCondition(Query newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaTemplatingPackage.FILTER__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetaTemplatingPackage.FILTER__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetaTemplatingPackage.FILTER__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Instructions> getTruebody()
  {
    if (truebody == null)
    {
      truebody = new EObjectContainmentEList<Instructions>(Instructions.class, this, MetaTemplatingPackage.FILTER__TRUEBODY);
    }
    return truebody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Instructions> getFalsebody()
  {
    if (falsebody == null)
    {
      falsebody = new EObjectContainmentEList<Instructions>(Instructions.class, this, MetaTemplatingPackage.FILTER__FALSEBODY);
    }
    return falsebody;
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
      case MetaTemplatingPackage.FILTER__CONDITION:
        return basicSetCondition(null, msgs);
      case MetaTemplatingPackage.FILTER__TRUEBODY:
        return ((InternalEList<?>)getTruebody()).basicRemove(otherEnd, msgs);
      case MetaTemplatingPackage.FILTER__FALSEBODY:
        return ((InternalEList<?>)getFalsebody()).basicRemove(otherEnd, msgs);
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
      case MetaTemplatingPackage.FILTER__CONDITION:
        return getCondition();
      case MetaTemplatingPackage.FILTER__TRUEBODY:
        return getTruebody();
      case MetaTemplatingPackage.FILTER__FALSEBODY:
        return getFalsebody();
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
      case MetaTemplatingPackage.FILTER__CONDITION:
        setCondition((Query)newValue);
        return;
      case MetaTemplatingPackage.FILTER__TRUEBODY:
        getTruebody().clear();
        getTruebody().addAll((Collection<? extends Instructions>)newValue);
        return;
      case MetaTemplatingPackage.FILTER__FALSEBODY:
        getFalsebody().clear();
        getFalsebody().addAll((Collection<? extends Instructions>)newValue);
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
      case MetaTemplatingPackage.FILTER__CONDITION:
        setCondition((Query)null);
        return;
      case MetaTemplatingPackage.FILTER__TRUEBODY:
        getTruebody().clear();
        return;
      case MetaTemplatingPackage.FILTER__FALSEBODY:
        getFalsebody().clear();
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
      case MetaTemplatingPackage.FILTER__CONDITION:
        return condition != null;
      case MetaTemplatingPackage.FILTER__TRUEBODY:
        return truebody != null && !truebody.isEmpty();
      case MetaTemplatingPackage.FILTER__FALSEBODY:
        return falsebody != null && !falsebody.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FilterImpl