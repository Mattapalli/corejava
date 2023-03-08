/**
 * 
 */
package com.day7MethodOverriding;

/**
 * @author hp
 *
 */
public class Rule8ExceptionHandingChild  extends Rule8ExceptionHandingParent{
	@Override
    // no issue while throwing unchecked exception
    void m1() throws ArithmeticException
    {
        System.out.println("From child m1()");
    }
  
    @Override
    // compile-time error
    // issue while throwing checked exception
    void m2() throws Exception
    {
        System.out.println("From child m2");
    }

}
