package com.day14.mapInterface;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashTableExampleDemo {
	public static void main(String[] args) {
		System.out.println("1.....adding Elements from HashTable...........");
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

		hm.put(100, "Amit");
		hm.put(102, "Ravi");
		hm.put(101, "Vijay");
		hm.put(103, "Rahul");
		System.out.println(hm);

		System.out.println("2......Processing Elements from HashTable.......");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println("3......Remove Elements from HashTable............");
		hm.remove(102);
		System.out.println("After remove: " + hm);

		System.out.println("4......getOrDefault Elements from HashTable.......");
		// Here, we specify the if and else statement as arguments of the method
		System.out.println(hm.getOrDefault(101, "Not Found"));
		System.out.println(hm.getOrDefault(105, "Not Found"));

		System.out.println("5......putIfAbsent Elements from HashTable.......");
		// Inserts, as the specified pair is unique
		hm.putIfAbsent(104, "Gaurav");
		System.out.println("Updated Map: " + hm);
		// Returns the current value, as the specified pair already exist
		hm.putIfAbsent(101, "Vijay");
		System.out.println("Updated Map: " + hm);

		System.out.println("6........Assending Order........................");
		// create a TreeMap
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(hm);

		System.out.println(tm);

	}

}
