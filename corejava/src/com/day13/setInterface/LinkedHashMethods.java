package com.day13.setInterface;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1...............Creating Linked HashSet....................");
		// Creating LinkedHashSet
		LinkedHashSet hs = new LinkedHashSet<>();
		// Adding elements
		hs.add(100);
		hs.add(200);
		hs.add(null);
		hs.add(300);
		hs.add(100);
		
		// Displaying LinkedHashSet
		System.out.println(hs);

		System.out.println("2...............Remove Elements from Linked HashSet.........");
		hs.remove(300);
		System.out.println("After removing elements: \n" + hs);

		System.out.println("4......Remove Duplicate Elements from Linked HashSet.........");

		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		ls.add("Ravi");
		ls.add("Vijay");
		ls.add("Ravi");
		ls.add("Ajay");
		ls.add("Rk");
		Iterator<String> itr = ls.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());    
		}

		System.out.println("5......Remove Duplicate Elements from Linked HashSet.........");
		System.out.println(ls.remove("Rk"));
		
		

		// After removing the element
		System.out.println("After removing the element, the hash set is: " + ls);

		// since the element "For" is not present, therefore, the method remove()
		// returns false
		System.out.println(ls.remove("For"));
		
		System.out.println("6......Total Size of elements.........");
		System.out.println("Total size elements ..: "+ls.size());
		System.out.println(ls);
		
		System.out.println(".......................END.......................................");

		

	}

}
