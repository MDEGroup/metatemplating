/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.metaTemplating;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.Inject#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage#getInject()
 * @model
 * @generated
 */
public interface Inject extends EObject
{
  /**
   * Returns the value of the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' attribute.
   * @see #setCode(String)
   * @see org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage#getInject_Code()
   * @model
   * @generated
   */
  String getCode();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.metaTemplating.Inject#getCode <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' attribute.
   * @see #getCode()
   * @generated
   */
  void setCode(String value);

} // Inject