/**
 * 
 */
package com.day7MethodOverriding;

/**
 * @author hp
 *
 */
public class Rule82ExceptionHadlingChild2 extends Rule82ExceptionHadlingParent {
	 @Override
	    // no issue while throwing subclass exception
	    void m1() throws ArithmeticException
	    {
	        System.out.println("From child2 m1()");
	    }

}
