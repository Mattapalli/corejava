/**
 * 
 */
package com.day7MethodOverLoading;

/**
 * @author hp
 *
 */
public class ChangingOrderOfParameter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating object of above class
		Student obj = new Student();

		// Passing name and id
		// Note: Reversing order
		obj.StudentId("Rama", 1);
		obj.StudentId(2, "Sankar");
	}
}