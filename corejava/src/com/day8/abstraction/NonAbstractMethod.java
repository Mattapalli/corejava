/**
 * 
 */
package com.day8.abstraction;

/**
 * @author hp
 *
 */
abstract class Example {
	abstract void callme();

	void show() {
		System.out.println("this is non-abstract method");
	}
}

public class NonAbstractMethod extends Example {

	@Override
	void callme() {
		// TODO Auto-generated method stub
		System.out.println("Calling...");

	}

	public static void main(String[] args) {

		NonAbstractMethod b = new NonAbstractMethod();
		b.callme();
		b.show();

	}

}
