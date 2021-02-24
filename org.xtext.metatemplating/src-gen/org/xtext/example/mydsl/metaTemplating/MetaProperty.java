/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.metaTemplating;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.MetaProperty#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage#getMetaProperty()
 * @model
 * @generated
 */
public interface MetaProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference.
   * @see #setProperty(Property)
   * @see org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage#getMetaProperty_Property()
   * @model containment="true"
   * @generated
   */
  Property getProperty();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.metaTemplating.MetaProperty#getProperty <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' containment reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(Property value);

} // MetaProperty
