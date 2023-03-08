/**
 * 
 */
package com.day10.String;

/**
 * @author hp
 *
 */
public class StringBuilderMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("study");
		System.out.println(sb);
		// appending object
		sb.append("tonight.com");
		System.out.println(sb);

		System.out.println("................................");

		StringBuilder sb1 = new StringBuilder("Java is a programming language");
		System.out.println(sb);
		// replacing object
		sb1.replace(10, 21, "computer");
		System.out.println(sb1);

		System.out.println("................................");

		StringBuilder sb2 = new StringBuilder("Java stringbuilder");
		System.out.println(sb2);
		// reverse object
		sb2.reverse();
		System.out.println(sb2);

	}

}
