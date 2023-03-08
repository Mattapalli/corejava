/**
 * 
 */
package com.day15.java8;

/**
 * @author Rama Krishna M
 *
 */
public class StaticMethodRefdemo {
	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Referring static method
		MessageInterface sayable = StaticMethodRefdemo::saySomething;
		// Calling interface method
		sayable.say();
	}

}
