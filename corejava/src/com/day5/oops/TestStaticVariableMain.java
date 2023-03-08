/**
 * 
 */
package com.day5.oops;

/**
 * @author hp
 *
 */

// Test class to show the values of objects
public class TestStaticVariableMain {
	public static void main(String args[]) {
		StaticVarible s1 = new StaticVarible(111, "Karan");
		StaticVarible s2 = new StaticVarible(222, "Aryan");
		s1.display();
		s2.display();
	}
}