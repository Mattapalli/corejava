/**
 * 
 */
package com.day13.setInterface;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Rama Krishna M
 *
 */
public class TreeSetMethodsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.............Creating Treeset..................");
		// Creating and adding elements
		TreeSet<String> al = new TreeSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		
		// Traversing elements
		System.out.println("Ascending...");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());   //Ajiay,Ravi,Vijya
		}

		System.out.println("2................Descending order................");

		Iterator i = al.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());   // Vija,Ravi,Ajiay
		}
		System.out.println("3................Search an Element...............");

		boolean iscontain = al.contains("Ravi");
		System.out.println("Is contain Ravi: " + iscontain);  //true

		System.out.println("4............Remove the highest and lowest Value...");
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(24);
		set.add(66);
		set.add(12);
		set.add(15);
		System.out.println("Lowest Value: " + set.pollFirst());
		System.out.println("Highest Value: " + set.pollLast());
		System.out.println("Final Set value....: " + set);
		System.out.println("....................END...............................");

	}
}
