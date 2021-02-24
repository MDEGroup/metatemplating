/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.metaTemplating.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.metaTemplating.MetaPh;
import org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage;
import org.xtext.example.mydsl.metaTemplating.SubQuery;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.impl.SubQueryImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.impl.SubQueryImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubQueryImpl extends MinimalEObjectImpl.Container implements SubQuery
{
  /**
   * The default value of the '{@link #getItem() <em>Item</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItem()
   * @generated
   * @ordered
   */
  protected static final String ITEM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getItem() <em>Item</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItem()
   * @generated
   * @ordered
   */
  protected String item = ITEM_EDEFAULT;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected MetaPh ref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubQueryImpl()
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
    return MetaTemplatingPackage.Literals.SUB_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getItem()
  {
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setItem(String newItem)
  {
    String oldItem = item;
    item = newItem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetaTemplatingPackage.SUB_QUERY__ITEM, oldItem, item));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MetaPh getRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRef(MetaPh newRef, NotificationChain msgs)
  {
    MetaPh oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaTemplatingPackage.SUB_QUERY__REF, oldRef, newRef);
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
  public void setRef(MetaPh newRef)
  {
    if (newRef != ref)
    {
      NotificationChain msgs = null;
      if (ref != null)
        msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaTemplatingPackage.SUB_QUERY__REF, null, msgs);
      if (newRef != null)
        msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetaTemplatingPackage.SUB_QUERY__REF, null, msgs);
      msgs = basicSetRef(newRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetaTemplatingPackage.SUB_QUERY__REF, newRef, newRef));
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
      case MetaTemplatingPackage.SUB_QUERY__REF:
        return basicSetRef(null, msgs);
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
      case MetaTemplatingPackage.SUB_QUERY__ITEM:
        return getItem();
      case MetaTemplatingPackage.SUB_QUERY__REF:
        return getRef();
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
      case MetaTemplatingPackage.SUB_QUERY__ITEM:
        setItem((String)newValue);
        return;
      case MetaTemplatingPackage.SUB_QUERY__REF:
        setRef((MetaPh)newValue);
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
      case MetaTemplatingPackage.SUB_QUERY__ITEM:
        setItem(ITEM_EDEFAULT);
        return;
      case MetaTemplatingPackage.SUB_QUERY__REF:
        setRef((MetaPh)null);
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
      case MetaTemplatingPackage.SUB_QUERY__ITEM:
        return ITEM_EDEFAULT == null ? item != null : !ITEM_EDEFAULT.equals(item);
      case MetaTemplatingPackage.SUB_QUERY__REF:
        return ref != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (item: ");
    result.append(item);
    result.append(')');
    return result.toString();
  }

} //SubQueryImpl
