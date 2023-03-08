/**
 * 
 */
package com.day7MethodOverLoading;

/**
 * @author hp
 *
 */
public class PrototyDoesNotMatch {
	public void show(int x) {
		System.out.println("In int" + x);
	}

	public void show(String s) {
		System.out.println("In String" + s);
	}

	public void show(byte b) {
		System.out.println("In byte" + b);
	}
}