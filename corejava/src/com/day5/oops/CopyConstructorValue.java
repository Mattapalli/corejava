/**
 * 
 */
package com.day5.oops;

/**
 * @author hp
 *
 */
/**
 * @author hp
 *
 */
public class CopyConstructorValue {
	int id;
	String name;

	
	/**
	 * @param i
	 * @param n
	 */
	public CopyConstructorValue(int i, String n) {

		// TODO Auto-generated constructor stub
		id = i;
		name = n;
	}

	/**
	 * @param copyValue
	 */
	public CopyConstructorValue(CopyConstructorValue copyValue) {

		// TODO Auto-generated constructor stub
		id = copyValue.id;
		name = copyValue.name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyConstructorValue s1 = new CopyConstructorValue(111, "Karan");
		CopyConstructorValue s2 = new CopyConstructorValue(s1);
		s1.display();
		s2.display();

	}

}
