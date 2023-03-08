/**
 * 
 */
package com.day6.inheritance;

/**
 * @author hp
 *
 */
public class Programmer extends Employeer {
	int bonus = 10000;

	/**
	 * @param args
	 */
	/*
	 * As displayed in the above figure, Programmer is the subclass and Employee is
	 * the superclass. The relationship between the two classes is Programmer IS-A
	 * Employee. It means that Programmer is a type of Employee.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Programmer p = new Programmer();
		System.out.println("Programmer salary is:" + p.salary);
		System.out.println("Bonus of Programmer is:" + p.bonus);
	}

}
