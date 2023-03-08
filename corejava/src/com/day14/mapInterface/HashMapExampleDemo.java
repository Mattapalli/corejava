package com.day14.mapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapExampleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating HashMap
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		// Displaying HashMap
		System.out.println(hashMap);

		System.out.println("1......Adding Elements To HashMap.............");
		// Adding elements
		hashMap.put(1, "One");
		hashMap.put(2, "Two");
		hashMap.put(3, "Three");
		hashMap.put(4, "Four");
		// Displaying HashMap
		System.out.println(hashMap);

		System.out.println("2......Removing Elements To HashMap.............");
		// Remove element by key
		hashMap.remove(2);
		System.out.println("After Removing 2 :\n" + hashMap);
		// Remove by key and value
		hashMap.remove(3, "Three");
		System.out.println("After Removing 3 :\n" + hashMap);

		System.out.println("3......Traversing Elements To HashMap.............");
		hashMap.put(2, "Rama");
		hashMap.put(3, "Krishna");
		// Traversing HashMap
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println("4......Replacing Elements To HashMap...............");
		// Replacing Elements of HashMap
		hashMap.replace(1, "Lohith");
		System.out.println(hashMap);
		hashMap.replace(1, "Lohith", "Sankar");
		hashMap.replace(4, "Harish");
		System.out.println(hashMap);

		System.out.println("5......Processing Elements To HashMap...............");
		for (Map.Entry m : hashMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("6......No Duplicate Key on HashMap...............");
		hashMap.put(2,"Mannaf"); //trying duplicate key  
		hashMap.put(null, null);
		//hashMap.put(null, "rama");
		hashMap.put(5, null);
			
		System.out.println(hashMap);
		
		System.out.println("..............End .................................");
		
		
		
	       

	}

}
