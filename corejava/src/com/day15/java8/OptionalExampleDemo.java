/**
 * 
 */
package com.day15.java8;

import java.util.Optional;

/**
 * @author Rama Krishna M
 *
 */
public class OptionalExampleDemo {
	static String otherVal() {
		return "Value not Present";
	}

	public static void main(String[] args) {
		Optional<String> name = Optional.of("Rohan");
		Optional<String> lName = Optional.empty();

		// orElseGet
		String other = name.orElseGet(() -> otherVal());
		System.out.println(other);

		// empty
		other = lName.orElseGet(() -> otherVal());            
		System.out.println(other);

		System.out.println("2......Filter Method.....................");
		// filter
		Optional<String> other1 = name.filter(n -> n.equals("Rohan"));
		System.out.println(other1);
		other1 = name.filter(n -> n.equals("rohan"));   
		System.out.println(other1);
	}
}