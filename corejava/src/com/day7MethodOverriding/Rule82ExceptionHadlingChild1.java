/**
 * 
 */
package com.day7MethodOverriding;

/**
 * @author hp
 *
 */
public class Rule82ExceptionHadlingChild1 extends Rule82ExceptionHadlingParent {
	@Override
    // no issue while throwing same exception
    void m1() throws RuntimeException
    {
        System.out.println("From child1 m1()");
    }

}
