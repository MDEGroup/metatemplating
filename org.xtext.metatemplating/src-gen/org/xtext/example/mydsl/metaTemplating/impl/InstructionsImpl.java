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

import org.xtext.example.mydsl.metaTemplating.Filter;
import org.xtext.example.mydsl.metaTemplating.Instructions;
import org.xtext.example.mydsl.metaTemplating.Iterator;
import org.xtext.example.mydsl.metaTemplating.MetaFilter;
import org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage;
import org.xtext.example.mydsl.metaTemplating.Note;
import org.xtext.example.mydsl.metaTemplating.Rule;
import org.xtext.example.mydsl.metaTemplating.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instructions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.impl.InstructionsImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.impl.InstructionsImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.impl.InstructionsImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.impl.InstructionsImpl#getMetaFilter <em>Meta Filter</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.impl.InstructionsImpl#getIterator <em>Iterator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.impl.InstructionsImpl#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstructionsImpl extends MinimalEObjectImpl.Container implements Instructions
{
  /**
   * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNote()
   * @generated
   * @ordered
   */
  protected Note note;

  /**
   * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected Statement statement;

  /**
   * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected Filter filter;

  /**
   * The cached value of the '{@link #getMetaFilter() <em>Meta Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetaFilter()
   * @generated
   * @ordered
   */
  protected MetaFilter metaFilter;

  /**
   * The cached value of the '{@link #getIterator() <em>Iterator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIterator()
   * @generated
   * @ordered
   */
  protected Iterator iterator;

  /**
   * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected Rule rule;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstructionsImpl()
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
    return MetaTemplatingPackage.Literals.INSTRUCTIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Note getNote()
  {
    return note;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNote(Note newNote, NotificationChain msgs)
  {
    Note oldNote = note;
    note = newNote;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaTemplatingPackage.INSTRUCTIONS__NOTE, oldNote, newNote);
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
  public void setNote(Note newNote)
  {
    if (newNote != note)
    {
      NotificationChain msgs = null;
      if (note != null)
        msgs = ((InternalEObject)note).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaTemplatingPackage.INSTRUCTIONS__NOTE, null, msgs);
      if (newNote != null)
        msgs = ((InternalEObject)newNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetaTemplatingPackage.INSTRUCTIONS__NOTE, null, msgs);
      msgs = basicSetNote(newNote, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetaTemplatingPackage.INSTRUCTIONS__NOTE, newNote, newNote));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Statement getStatement()
  {
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatement(Statement newStatement, NotificationChain msgs)
  {
    Statement oldStatement = statement;
    statement = newStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaTemplatingPackage.INSTRUCTIONS__STATEMENT, oldStatement, newStatement);
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
  public void setStatement(Statement newStatement)
  {
    if (newStatement != statement)
    {
      NotificationChain msgs = null;
      if (statement != null)
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaTemplatingPackage.INSTRUCTIONS__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetaTemplatingPackage.INSTRUCTIONS__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetaTemplatingPackage.INSTRUCTIONS__STATEMENT, newStatement, newStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Filter getFilter()
  {
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilter(Filter newFilter, NotificationChain msgs)
  {
    Filter oldFilter = filter;
    filter = newFilter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaTemplatingPackage.INSTRUCTIONS__FILTER, oldFilter, newFilter);
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
  public void setFilter(Filter newFilter)
  {
    if (newFilter != filter)
    {
      NotificationChain msgs = null;
      if (filter != null)
        msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaTemplatingPackage.INSTRUCTIONS__FILTER, null, msgs);
      if (newFilter != null)
        msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetaTemplatingPackage.INSTRUCTIONS__FILTER, null, msgs);
      msgs = basicSetFilter(newFilter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetaTemplatingPackage.INSTRUCTIONS__FILTER, newFilter, newFilter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MetaFilter getMetaFilter()
  {
    return metaFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMetaFilter(MetaFilter newMetaFilter, NotificationChain msgs)
  {
    MetaFilter oldMetaFilter = metaFilter;
    metaFilter = newMetaFilter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaTemplatingPackage.INSTRUCTIONS__META_FILTER, oldMetaFilter, newMetaFilter);
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
  public void setMetaFilter(MetaFilter newMetaFilter)
  {
    if (newMetaFilter != metaFilter)
    {
      NotificationChain msgs = null;
      if (metaFilter != null)
        msgs = ((InternalEObject)metaFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaTemplatingPackage.INSTRUCTIONS__META_FILTER, null, msgs);
      if (newMetaFilter != null)
        msgs = ((InternalEObject)newMetaFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetaTemplatingPackage.INSTRUCTIONS__META_FILTER, null, msgs);
      msgs = basicSetMetaFilter(newMetaFilter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetaTemplatingPackage.INSTRUCTIONS__META_FILTER, newMetaFilter, newMetaFilter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Iterator getIterator()
  {
    return iterator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIterator(Iterator newIterator, NotificationChain msgs)
  {
    Iterator oldIterator = iterator;
    iterator = newIterator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaTemplatingPackage.INSTRUCTIONS__ITERATOR, oldIterator, newIterator);
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
  public void setIterator(Iterator newIterator)
  {
    if (newIterator != iterator)
    {
      NotificationChain msgs = null;
      if (iterator != null)
        msgs = ((InternalEObject)iterator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaTemplatingPackage.INSTRUCTIONS__ITERATOR, null, msgs);
      if (newIterator != null)
        msgs = ((InternalEObject)newIterator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetaTemplatingPackage.INSTRUCTIONS__ITERATOR, null, msgs);
      msgs = basicSetIterator(newIterator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetaTemplatingPackage.INSTRUCTIONS__ITERATOR, newIterator, newIterator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule getRule()
  {
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRule(Rule newRule, NotificationChain msgs)
  {
    Rule oldRule = rule;
    rule = newRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaTemplatingPackage.INSTRUCTIONS__RULE, oldRule, newRule);
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
  public void setRule(Rule newRule)
  {
    if (newRule != rule)
    {
      NotificationChain msgs = null;
      if (rule != null)
        msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaTemplatingPackage.INSTRUCTIONS__RULE, null, msgs);
      if (newRule != null)
        msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetaTemplatingPackage.INSTRUCTIONS__RULE, null, msgs);
      msgs = basicSetRule(newRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MetaTemplatingPackage.INSTRUCTIONS__RULE, newRule, newRule));
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
      case MetaTemplatingPackage.INSTRUCTIONS__NOTE:
        return basicSetNote(null, msgs);
      case MetaTemplatingPackage.INSTRUCTIONS__STATEMENT:
        return basicSetStatement(null, msgs);
      case MetaTemplatingPackage.INSTRUCTIONS__FILTER:
        return basicSetFilter(null, msgs);
      case MetaTemplatingPackage.INSTRUCTIONS__META_FILTER:
        return basicSetMetaFilter(null, msgs);
      case MetaTemplatingPackage.INSTRUCTIONS__ITERATOR:
        return basicSetIterator(null, msgs);
      case MetaTemplatingPackage.INSTRUCTIONS__RULE:
        return basicSetRule(null, msgs);
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
      case MetaTemplatingPackage.INSTRUCTIONS__NOTE:
        return getNote();
      case MetaTemplatingPackage.INSTRUCTIONS__STATEMENT:
        return getStatement();
      case MetaTemplatingPackage.INSTRUCTIONS__FILTER:
        return getFilter();
      case MetaTemplatingPackage.INSTRUCTIONS__META_FILTER:
        return getMetaFilter();
      case MetaTemplatingPackage.INSTRUCTIONS__ITERATOR:
        return getIterator();
      case MetaTemplatingPackage.INSTRUCTIONS__RULE:
        return getRule();
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
      case MetaTemplatingPackage.INSTRUCTIONS__NOTE:
        setNote((Note)newValue);
        return;
      case MetaTemplatingPackage.INSTRUCTIONS__STATEMENT:
        setStatement((Statement)newValue);
        return;
      case MetaTemplatingPackage.INSTRUCTIONS__FILTER:
        setFilter((Filter)newValue);
        return;
      case MetaTemplatingPackage.INSTRUCTIONS__META_FILTER:
        setMetaFilter((MetaFilter)newValue);
        return;
      case MetaTemplatingPackage.INSTRUCTIONS__ITERATOR:
        setIterator((Iterator)newValue);
        return;
      case MetaTemplatingPackage.INSTRUCTIONS__RULE:
        setRule((Rule)newValue);
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
      case MetaTemplatingPackage.INSTRUCTIONS__NOTE:
        setNote((Note)null);
        return;
      case MetaTemplatingPackage.INSTRUCTIONS__STATEMENT:
        setStatement((Statement)null);
        return;
      case MetaTemplatingPackage.INSTRUCTIONS__FILTER:
        setFilter((Filter)null);
        return;
      case MetaTemplatingPackage.INSTRUCTIONS__META_FILTER:
        setMetaFilter((MetaFilter)null);
        return;
      case MetaTemplatingPackage.INSTRUCTIONS__ITERATOR:
        setIterator((Iterator)null);
        return;
      case MetaTemplatingPackage.INSTRUCTIONS__RULE:
        setRule((Rule)null);
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
      case MetaTemplatingPackage.INSTRUCTIONS__NOTE:
        return note != null;
      case MetaTemplatingPackage.INSTRUCTIONS__STATEMENT:
        return statement != null;
      case MetaTemplatingPackage.INSTRUCTIONS__FILTER:
        return filter != null;
      case MetaTemplatingPackage.INSTRUCTIONS__META_FILTER:
        return metaFilter != null;
      case MetaTemplatingPackage.INSTRUCTIONS__ITERATOR:
        return iterator != null;
      case MetaTemplatingPackage.INSTRUCTIONS__RULE:
        return rule != null;
    }
    return super.eIsSet(featureID);
  }

} //InstructionsImpl
