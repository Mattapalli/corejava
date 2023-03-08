package com.day10.String;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hell";    
		
		String s1 = "Hello";
		String s2 = "Hello";
		boolean b = s1.equals(s2);
		System.out.println(b);
		b = s.equals(s1); // false
		String str3 = new String("Hello");
		System.out.println(str3.equals(s1));
		System.out.println(str3==s1);  //  false 
		
		System.out.println(b);
		System.out.println(s.charAt(0)); //h
		System.out.println(s.charAt(1));
		//System.out.println(s.charAt(5));
		System.out.println(s.length());

	}

}
