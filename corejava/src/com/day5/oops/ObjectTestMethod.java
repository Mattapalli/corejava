package com.day5.oops;

/*package whatever //do not write package name here */
public class ObjectTestMethod {
	// sw=software
	static String sw_name;
	static float sw_price;

	static void set(String n, float p) {
		sw_name = n;
		sw_price = p;
	}

	static void get() {
		System.out.println("Software name is: " + sw_name);
		System.out.println("Software price is: " + sw_price);
	}

	public static void main(String args[]) {
		ObjectTestMethod.set("Visual studio", 0.0f);
		ObjectTestMethod.get();
	}
}
