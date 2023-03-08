package com.day10.String;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "javatpoint";
		char ch = name.charAt(4);// returns the char value at the 4th index  //t
		System.out.println(ch);
		System.out.println("...................................");
		String s = "Sachin";
		System.out.println(s.toUpperCase());// SACHIN
		System.out.println(s.toLowerCase());// sachin
		System.out.println(s);// Sachin(no change in original)
		System.out.println("...................................");

		String s1 = "  Sachin  ";
		System.out.println(s1);// Sachin
		System.out.println(s1.trim());// Sachin
		System.out.println("...................................");
		System.out.println(s.startsWith("ZE"));// true
		System.out.println(s.endsWith("n"));// true
		System.out.println("...................................");
		System.out.println(s.charAt(0));// S
		System.out.println(s.charAt(3));// h
		System.out.println("...................................");
		System.out.println(s.length());// 6
		System.out.println("...................................");

		String s2 = "Java is a programming language. Java is a platform. Java is an Island.";
		String replaceString = s2.replace("Java", "Kava");// replaces all occurrences of "Java" to "Kava"
		System.out.println(replaceString);
		System.out.println("...................................");

	
	}

}
