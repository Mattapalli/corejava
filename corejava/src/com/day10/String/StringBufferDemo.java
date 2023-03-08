/**
 * 
 */
package com.day10.String;

/**
 * @author hp
 *
 */
public class StringBufferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("study");
		System.out.println(sb);   
		// modifying object
		
		sb.append("tonight");
		System.out.println(sb); 
		System.out.println("...................................................");
		
		String str = "study";
		str.concat("tonight");
		System.out.println(str); 

		StringBuffer strB = new StringBuffer("study");
		strB.append("tonight");
		System.out.println(strB); // Output: studytonight

	}

}
