/**
 * 
 */
package com.day10.String;

/**
 * @author hp
 *
 */
public class StringBuilderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer obj=new StringBuffer("Welcome to ");  
		obj.append("studytonight.com");  
		System.out.println(obj);  
		
		
		StringBuilder obj1=new StringBuilder("Welcome to ");  
		obj1.append("studytonight.com");  
		System.out.println(obj1);  
		
	}

}
