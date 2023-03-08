/**
 * 
 */
package com.day7MethodOverriding;

/**
 * @author hp
 *
 */
public class Rule1AccessModifierParent {
	// private methods are not overridden
	protected void m1()
    {
        System.out.println("From parent m1()");
    }
  
    protected void m2()
    {
        System.out.println("From parent m2()");
    }

}
