/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.metaTemplating;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.Filter#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.Filter#getTruebody <em>Truebody</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.Filter#getFalsebody <em>Falsebody</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Query)
   * @see org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage#getFilter_Condition()
   * @model containment="true"
   * @generated
   */
  Query getCondition();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.metaTemplating.Filter#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Query value);

  /**
   * Returns the value of the '<em><b>Truebody</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.metaTemplating.Instructions}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Truebody</em>' containment reference list.
   * @see org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage#getFilter_Truebody()
   * @model containment="true"
   * @generated
   */
  EList<Instructions> getTruebody();

  /**
   * Returns the value of the '<em><b>Falsebody</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.metaTemplating.Instructions}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Falsebody</em>' containment reference list.
   * @see org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage#getFilter_Falsebody()
   * @model containment="true"
   * @generated
   */
  EList<Instructions> getFalsebody();

} // Filter
