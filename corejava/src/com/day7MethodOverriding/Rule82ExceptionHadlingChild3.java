/**
 * 
 */
package com.day7MethodOverriding;

/**
 * @author hp
 *
 */
public class Rule82ExceptionHadlingChild3 extends Rule82ExceptionHadlingParent {
	 @Override
	    // no issue while not throwing any exception
	    void m1()
	    {
	        System.out.println("From child3 m1()");
	    }

}
