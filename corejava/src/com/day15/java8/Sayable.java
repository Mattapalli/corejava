/**
 * 
 */
package com.day15.java8;

/**
 * @author Rama Krishna M
 *
 */
@FunctionalInterface
public interface Sayable {
	void say(String msg); // abstract method
	// It can contain any number of Object class methods.

	int hashCode();

	String toString();

	boolean equals(Object obj);

	default void doIt() {
		System.out.println("Do it now");
	}

}
