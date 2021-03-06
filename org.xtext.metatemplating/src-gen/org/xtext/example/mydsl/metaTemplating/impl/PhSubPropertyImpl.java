/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.metaTemplating.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage;
import org.xtext.example.mydsl.metaTemplating.Parameter;
import org.xtext.example.mydsl.metaTemplating.PhSubProperty;
import org.xtext.example.mydsl.metaTemplating.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ph Sub Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.impl.PhSubPropertyImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.impl.PhSubPropertyImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.impl.PhSubPropertyImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.impl.PhSubPropertyImpl#getMetaProperty <em>Meta Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhSubPropertyImpl extends MinimalEObjectImpl.Container implements PhSubProperty
{
  /**
   * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected static final String METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected String method = METHOD_EDEFAULT;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected Parameter params;

  /**
   * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected static final String PROPERTY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected String property = PROPERTY_EDEFAULT;

  /**
   * The cached value of the '{@link #getMetaProperty() <em>Meta Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetaProperty()
   * @generated
   * @ordered
   */
  protected Property metaProperty;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PhSubPropertyImpl()
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
    return MetaTemplatingPackage.Literals.PH_SUB_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMethod(String newMethod)
  {
    String oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetaTemplatingPackage.PH_SUB_PROPERTY__METHOD, oldMethod, method));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameter getParams()
  {
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParams(Parameter newParams, NotificationChain msgs)
  {
    Parameter oldParams = params;
    params = newParams;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaTemplatingPackage.PH_SUB_PROPERTY__PARAMS, oldParams, newParams);
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
  public void setParams(Parameter newParams)
  {
    if (newParams != params)
    {
      NotificationChain msgs = null;
      if (params != null)
        msgs = ((InternalEObject)params).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaTemplatingPackage.PH_SUB_PROPERTY__PARAMS, null, msgs);
      if (newParams != null)
        msgs = ((InternalEObject)newParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetaTemplatingPackage.PH_SUB_PROPERTY__PARAMS, null, msgs);
      msgs = basicSetParams(newParams, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetaTemplatingPackage.PH_SUB_PROPERTY__PARAMS, newParams, newParams));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProperty(String newProperty)
  {
    String oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetaTemplatingPackage.PH_SUB_PROPERTY__PROPERTY, oldProperty, property));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Property getMetaProperty()
  {
    return metaProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMetaProperty(Property newMetaProperty, NotificationChain msgs)
  {
    Property oldMetaProperty = metaProperty;
    metaProperty = newMetaProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaTemplatingPackage.PH_SUB_PROPERTY__META_PROPERTY, oldMetaProperty, newMetaProperty);
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
  public void setMetaProperty(Property newMetaProperty)
  {
    if (newMetaProperty != metaProperty)
    {
      NotificationChain msgs = null;
      if (metaProperty != null)
        msgs = ((InternalEObject)metaProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaTemplatingPackage.PH_SUB_PROPERTY__META_PROPERTY, null, msgs);
      if (newMetaProperty != null)
        msgs = ((InternalEObject)newMetaProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetaTemplatingPackage.PH_SUB_PROPERTY__META_PROPERTY, null, msgs);
      msgs = basicSetMetaProperty(newMetaProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetaTemplatingPackage.PH_SUB_PROPERTY__META_PROPERTY, newMetaProperty, newMetaProperty));
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
      case MetaTemplatingPackage.PH_SUB_PROPERTY__PARAMS:
        return basicSetParams(null, msgs);
      case MetaTemplatingPackage.PH_SUB_PROPERTY__META_PROPERTY:
        return basicSetMetaProperty(null, msgs);
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
      case MetaTemplatingPackage.PH_SUB_PROPERTY__METHOD:
        return getMethod();
      case MetaTemplatingPackage.PH_SUB_PROPERTY__PARAMS:
        return getParams();
      case MetaTemplatingPackage.PH_SUB_PROPERTY__PROPERTY:
        return getProperty();
      case MetaTemplatingPackage.PH_SUB_PROPERTY__META_PROPERTY:
        return getMetaProperty();
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
      case MetaTemplatingPackage.PH_SUB_PROPERTY__METHOD:
        setMethod((String)newValue);
        return;
      case MetaTemplatingPackage.PH_SUB_PROPERTY__PARAMS:
        setParams((Parameter)newValue);
        return;
      case MetaTemplatingPackage.PH_SUB_PROPERTY__PROPERTY:
        setProperty((String)newValue);
        return;
      case MetaTemplatingPackage.PH_SUB_PROPERTY__META_PROPERTY:
        setMetaProperty((Property)newValue);
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
      case MetaTemplatingPackage.PH_SUB_PROPERTY__METHOD:
        setMethod(METHOD_EDEFAULT);
        return;
      case MetaTemplatingPackage.PH_SUB_PROPERTY__PARAMS:
        setParams((Parameter)null);
        return;
      case MetaTemplatingPackage.PH_SUB_PROPERTY__PROPERTY:
        setProperty(PROPERTY_EDEFAULT);
        return;
      case MetaTemplatingPackage.PH_SUB_PROPERTY__META_PROPERTY:
        setMetaProperty((Property)null);
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
      case MetaTemplatingPackage.PH_SUB_PROPERTY__METHOD:
        return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
      case MetaTemplatingPackage.PH_SUB_PROPERTY__PARAMS:
        return params != null;
      case MetaTemplatingPackage.PH_SUB_PROPERTY__PROPERTY:
        return PROPERTY_EDEFAULT == null ? property != null : !PROPERTY_EDEFAULT.equals(property);
      case MetaTemplatingPackage.PH_SUB_PROPERTY__META_PROPERTY:
        return metaProperty != null;
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
    result.append(" (method: ");
    result.append(method);
    result.append(", property: ");
    result.append(property);
    result.append(')');
    return result.toString();
  }

} //PhSubPropertyImpl
