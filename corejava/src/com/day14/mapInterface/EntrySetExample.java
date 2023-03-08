/**
 * 
 */
package com.day14.mapInterface;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Rama Krishna M
 *
 */
public class EntrySetExample {

	public static void main(String args[]) {
		// Creating HashMap
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		// Adding elements
		hashMap.put(1, "One");
		hashMap.put(2, "Two");
		hashMap.put(3, "Three");
		hashMap.put(4, "Four");
		// Traversing HashMap
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("........Another Method Processing Elements");
		// or
		Set<Entry<Integer, String>> entry = hashMap.entrySet();

		for (Entry<Integer, String> entry2 : entry) {
			System.out.println(entry2.getKey() + " : " + entry2.getValue());
		}
		

		System.out.println("2. Replacing elements ............................");
		// Replacing Elements of HashMap
		hashMap.replace(1, "One-1");
		System.out.println(hashMap); //1-one-1
		hashMap.replace(1, "One-1", "First"); // 1key ---First
		System.out.println(hashMap);     
		
		System.out.println("3.....comparingByKey");
		Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(105,"Vijay");    
	      map.put(102,"Rahul");   
	      //Returns a Set view of the mappings contained in this map        
	      map.entrySet()  
	      //Returns a sequential Stream with this collection as its source  
	      .stream()  
	      //Sorted according to the provided Comparator  
	      .sorted(Map.Entry.comparingByKey())  
	      //Performs an action for each element of this stream  
	      .forEach(System.out::println);   //
	      
	      System.out.println("4.....comparingByKey() in Descending Order");
	      //Returns a Set view of the mappings contained in this map    
	      map.entrySet()  
	      //Returns a sequential Stream with this collection as its source  
	      .stream()  
	      //Sorted according to the provided Comparator  
	      .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))  
	      //Performs an action for each element of this stream  
	      .forEach(System.out::println);     //

	}
}
