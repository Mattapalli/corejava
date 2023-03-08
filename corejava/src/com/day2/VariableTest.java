package com.day2;

public class VariableTest {

	VariableTest() {
		System.out.println("constructor ");
	}

	{
		System.out.println("IIB");
	}

	static {
		System.out.println("static bloack 1");
	}

	public static void m1() {
		System.out.println("static method ");

	}

	/*
	 * static { a=10; System.out.println("static block"); }
	 */

	public static void main(String[] args) {

		VariableTest ob = new VariableTest(); //here eexute IIB and object 
		m1();
	}

	static {
		System.out.println("statock bloack 2");
	}
	{
		System.out.println("IIB 2");
	}

}
