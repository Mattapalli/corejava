/**
 * 
 */
package com.day6.inheritance;

/**
 * @author hp
 *
 */
public class ChildSuperMethod extends ParentSuperMethod {

	String name;

	public void details() {
		super.details(); // calling Parent class details() method
		name = "Child";
		System.out.println(name);
	}

	public static void main(String[] args) {
		ChildSuperMethod cobj = new ChildSuperMethod();
		cobj.details();
	}
}
