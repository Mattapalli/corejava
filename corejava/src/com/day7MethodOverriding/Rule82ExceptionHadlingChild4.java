/**
 * 
 */
package com.day7MethodOverriding;

/**
 * @author hp
 *
 */
public class Rule82ExceptionHadlingChild4  extends Rule82ExceptionHadlingParent{
	 @Override
	    // compile-time error
	    // issue while throwing parent exception
	    void m1() throws Exception 
	    {
	        System.out.println("From child4 m1()");
	    }

}
