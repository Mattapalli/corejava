package com.day14.mapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExampleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println("1......Key-Value pair.........................");
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(100, "Rama");
		map.put(101, "Harish");
		map.put(102, "Mannaf");
		// Fetching key
		System.out.println("Keys: " + map.keySet());
		// Fetching value
		System.out.println("Values: " + map.values());
		// Fetching key-value pair
		System.out.println("Key-Value pairs: " + map.entrySet());
         
		System.out.println("2........Remove the elements ....................");
		System.out.println("Before invoking remove() method: " + map);
		map.remove(102);
		System.out.println("After invoking remove() method: " + map);
	}

}
