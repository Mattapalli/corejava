/**
 * 
 */
package com.day5.oops;

/**
 * @author hp
 *
 */
public class Student {
	int rollno;
	String name;
	static String college = "India-College";

	// static method to change the value of static variable
	static void change() {
		college = "USA-Colleage";
	}

	// constructor to initialize the variable
	Student(int r, String n) {
		rollno = r;
		name = n;
	}

	// method to display values
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

}
