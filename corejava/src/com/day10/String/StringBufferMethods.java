/**
 * 
 */
package com.day10.String;

/**
 * @author hp
 *
 */
public class StringBufferMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer str = new StringBuffer("test");
		str.append(123);
		System.out.println(str); 
		
		System.out.println("......................................");
		StringBuffer str1 = new StringBuffer("test");
		str1.insert(2, 123);
		System.out.println(str1);
		
		System.out.println("......................................");
		
		StringBuffer str2 = new StringBuffer("Hello");
		str2.reverse();
		System.out.println(str2);
		System.out.println("......................................");
		
		StringBuffer str3 = new StringBuffer("Hello World");
		str3.replace( 6, 11, "java");
		System.out.println(str3);
		System.out.println("......................................");
		
		StringBuffer str4 = new StringBuffer();
		System.out.println( str4.capacity() );
		

	}

}
