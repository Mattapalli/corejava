/**
 * 
 */
package com.day7RuntimePolymorphism;

/**
 * @author hp
 * 
 *If there is any private, final or static method in a class, there is static binding.
 *
 */

public class StaticBinding {

	private void run() {
		System.out.println("static bindng at complitetime process .....");
	}

	public static void main(String args[]) {
		StaticBinding d1 = new StaticBinding();
		d1.run();
	}
}
