/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.metaTemplating;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.metaTemplating.Import#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see org.xtext.example.mydsl.metaTemplating.MetaTemplatingPackage#getImport_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.metaTemplating.Import#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

} // Import
