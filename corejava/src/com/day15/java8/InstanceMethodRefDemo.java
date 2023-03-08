/**
 * 
 */
package com.day15.java8;

/**
 * @author Rama Krishna M
 *
 */
public class InstanceMethodRefDemo {
	public void saySomething() {
		System.out.println("Hello, this is method.");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceMethodRefDemo obj = new InstanceMethodRefDemo();
		// Referring non-static method using reference
		MessageInterface s1 = obj::saySomething;
		// Calling interface method
		s1.say();
		
		  // Referring non-static method using anonymous object  
		MessageInterface sayable2 = new InstanceMethodRefDemo()::saySomething; // You can use anonymous object also  
        // Calling interface method  
        sayable2.say(); 

	}

}
