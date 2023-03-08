package com.day3.loops;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Rama";
		switch (str) {
		case "Raj": 
			System.out.println("Print Raja");
			//break;
			
		case "Rama":
			System.out.println("print Rama");
			//break;
		
		default:
			System.out.println("Non of the case is executed");
			throw new IllegalArgumentException("Unexpected value: " + str);
		}

	}

}
