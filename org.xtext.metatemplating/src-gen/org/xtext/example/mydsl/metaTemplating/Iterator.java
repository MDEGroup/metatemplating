/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.metaTemplating;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.Iterator#getElement <em>Element</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.Iterator#getQuery <em>Query</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.Iterator#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage#getIterator()
 * @model
 * @generated
 */
public interface Iterator extends EObject
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' attribute.
   * @see #setElement(String)
   * @see org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage#getIterator_Element()
   * @model
   * @generated
   */
  String getElement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.metaTemplating.Iterator#getElement <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' attribute.
   * @see #getElement()
   * @generated
   */
  void setElement(String value);

  /**
   * Returns the value of the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' containment reference.
   * @see #setQuery(Query)
   * @see org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage#getIterator_Query()
   * @model containment="true"
   * @generated
   */
  Query getQuery();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.metaTemplating.Iterator#getQuery <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' containment reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(Query value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.metaTemplating.Instructions}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference list.
   * @see org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage#getIterator_Body()
   * @model containment="true"
   * @generated
   */
  EList<Instructions> getBody();

} // Iterator
