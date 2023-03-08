package com.day10.String;

public class DoubleEqualsOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java";  //string littrial 
    	String s2 = "Java";
    	String s3 = new String ("Java");   //New object
    	boolean b = (s1 == s2);    
    	System.out.println(b);
    	b =	(s1 == s3);             // 
    	System.out.println(b);  

	}

}
