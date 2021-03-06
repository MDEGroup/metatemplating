/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.metaTemplating;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.Property#getProperty <em>Property</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.Property#getSubProperties <em>Sub Properties</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' attribute.
   * @see #setProperty(String)
   * @see org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage#getProperty_Property()
   * @model
   * @generated
   */
  String getProperty();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.metaTemplating.Property#getProperty <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' attribute.
   * @see #getProperty()
   * @generated
   */
  void setProperty(String value);

  /**
   * Returns the value of the '<em><b>Sub Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.metaTemplating.SubProperty}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Properties</em>' containment reference list.
   * @see org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage#getProperty_SubProperties()
   * @model containment="true"
   * @generated
   */
  EList<SubProperty> getSubProperties();

} // Property
