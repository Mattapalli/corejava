/**
 * 
 */
package com.day5.oops;

/**
 * @author hp
 *
 */
public class DefaultConstructor {

	int id;
	String name;

	// method to display the value of id and name
	void display() {
		System.out.println(id + " " + name);
	}

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		// creating objects
		DefaultConstructor s1 = new DefaultConstructor();
		DefaultConstructor s2 = new DefaultConstructor();
		// displaying values of the object
		s1.display();
		s2.display();

	}
}