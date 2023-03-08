/**
 * 
 */
package com.day14.mapInterface;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Rama Krishna M
 *
 */
public class TreeMapExampleDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.....Adding Elements from TreeMap...............");
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");

		//o(n)
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		} 
				
		System.out.println("2.....Remove Elements from TreeMap...............");
		map.remove(102);
		System.out.println("After invoking remove() method");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println("3.....NavigableMap  from TreeMap..................");
		NavigableMap<Integer, String> map1 = new TreeMap<Integer, String>();
		map1.put(100, "Amit");
		map1.put(102, "Ravi");
		map1.put(101, "Vijay");
		map1.put(103, "Rahul");
		

		// Maintains descending order
		System.out.println("descendingMap: " + map1.descendingMap()); 

		// Returns key-value pairs whose keys are less than or equal to the specified
		// key.                  
		System.out.println("headMap: " + map1.headMap(102, true));

		// Returns key-value pairs whose keys are greater than or equal to the specified
		// key.
		System.out.println("tailMap: " + map1.tailMap(102, true));

		// Returns key-value pairs exists in between the specified key.
		System.out.println("subMap: " + map1.subMap(100, false, 102, true));

		System.out.println("4...................Sorteted Map Elements ................");

		SortedMap<Integer, String> map2 = new TreeMap<Integer, String>();
		map2.put(100, "Amit");
		map2.put(102, "Ravi");
		map2.put(101, "Vijay");
		map2.put(103, "Rahul");
		
		// Returns key-value pairs whose keys are less than the specified key.
		System.out.println("headMap: " + map2.headMap(102));
		
		// Returns key-value pairs whose keys are greater than or equal to the specified
		// key.
		System.out.println("tailMap: " + map2.tailMap(102));
		
		// Returns key-value pairs exists in between the specified key.
		System.out.println("subMap: " + map2.subMap(100, 102));
		

	}

}
