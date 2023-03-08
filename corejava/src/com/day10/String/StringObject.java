/**
 * 
 */
package com.day10.String;

/**
 * @author hp
 *
 */
public class StringObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Hello";
		String str2 = new String("Hello");
		str1 = str1.concat("Java");

		System.out.println(str1); // Hello Java
		System.out.println(str2); // Hello

	}

}
