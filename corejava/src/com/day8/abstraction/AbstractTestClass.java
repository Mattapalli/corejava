/**
 * 
 */
package com.day8.abstraction;

/**
 * @author hp
 *
 */
abstract class A {
	abstract void callme();
	}
 class AbstractTestClass extends A {
	void callme() {
		System.out.println("Calling...");
	}

	public static void main(String[] args) {
		AbstractTestClass b = new AbstractTestClass();
		b.callme();
		
	}
}
