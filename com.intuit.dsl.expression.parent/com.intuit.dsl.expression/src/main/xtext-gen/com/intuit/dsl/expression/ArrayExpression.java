/**
 * generated by Xtext 2.25.0
 */
package com.intuit.dsl.expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.intuit.dsl.expression.ArrayExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see com.intuit.dsl.expression.ExpressionPackage#getArrayExpression()
 * @model
 * @generated
 */
public interface ArrayExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
   * The list contents are of type {@link com.intuit.dsl.expression.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference list.
   * @see com.intuit.dsl.expression.ExpressionPackage#getArrayExpression_Expression()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpression();

} // ArrayExpression