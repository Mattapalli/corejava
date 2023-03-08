/**
 * 
 */
package com.day7MethodOverriding;

/**
 * @author hp
 *
 */
public class Rule1AccessModifierChild  extends Rule1AccessModifierParent{
	 // new m1() method
    // unique to Child class
    public void m1()
    {
    	
        System.out.println("From child m1()");
    }
  
    // overriding method
    // with more accessibility
    @Override
    public void m2()
    {
        System.out.println("From child m2()");
    }
    
    
    

}
