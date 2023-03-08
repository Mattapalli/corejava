/**
 * 
 */
package com.day14.mapInterface;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Rama Krishna M
 *
 */
public class ComparatorExampelDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creating a list of students
		ArrayList<StudentOne> al = new ArrayList<StudentOne>();
		al.add(new StudentOne(101, "Vijay", 23));
		al.add(new StudentOne(106, "Ajay", 27));
		al.add(new StudentOne(105, "Jai", 21));

		System.out.println("............Sorting by Name.......................");
		// Using NameComparator to sort the elements
		Collections.sort(al, new NameComparator());
		// Traversing the elements of list
		for (StudentOne st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("............Sorting by Age........................");
		// Using AgeComparator to sort the elements
		Collections.sort(al, new AgeComparator());
		// Travering the list again
		for (StudentOne st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}
