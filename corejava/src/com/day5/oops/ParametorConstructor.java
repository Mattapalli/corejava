/**
 * 
 */
package com.day5.oops;

/**
 * @author Rama
 *
 */
public class ParametorConstructor {
	int id;  //instance variable 
	String name;
	long value;

	
	// creating a parameterized constructor
	 ParametorConstructor(int i, String n) {
		id = i;
		name = n;
	}
	ParametorConstructor(int i, long r) {
		id = i;
		value = r;
	}

	ParametorConstructor(int i, long r,int n) {
		id = i;
		value = r;
	}
	// method to display the values
	void display() {
		System.out.println("ID:="+id+"\n"+"Name:="+name+"\n"+"Value:="+value);
	}

	public static void main(String args[]) {
		// creating objects and passing values
		ParametorConstructor s1 = new ParametorConstructor(111, "Karan");
		ParametorConstructor s2 = new ParametorConstructor(222, 112);
		// calling method to display the values of object
		s1.display();
		s2.display();
	}
}