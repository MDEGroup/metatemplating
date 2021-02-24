/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.metaTemplating;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.Query#getItem <em>Item</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.Query#getRef <em>Ref</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.Query#getSubQuery <em>Sub Query</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends EObject
{
  /**
   * Returns the value of the '<em><b>Item</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item</em>' attribute.
   * @see #setItem(String)
   * @see org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage#getQuery_Item()
   * @model
   * @generated
   */
  String getItem();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.metaTemplating.Query#getItem <em>Item</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item</em>' attribute.
   * @see #getItem()
   * @generated
   */
  void setItem(String value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(MetaPh)
   * @see org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage#getQuery_Ref()
   * @model containment="true"
   * @generated
   */
  MetaPh getRef();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.metaTemplating.Query#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(MetaPh value);

  /**
   * Returns the value of the '<em><b>Sub Query</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.metaTemplating.SubQuery}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Query</em>' containment reference list.
   * @see org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage#getQuery_SubQuery()
   * @model containment="true"
   * @generated
   */
  EList<SubQuery> getSubQuery();

} // Query