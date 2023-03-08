/**
 * 
 */
package com.day13.setInterface;
import java.util.*;

/**
 * @author hp
 *
 */
public class HashSetMethodsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("1............Add Elements to HashSet............................");	
		// Creating HashSet
	    HashSet<String> hs = new HashSet<String>();
	    // Adding elements
	    hs.add("Mohan");
	    hs.add("Rohan");
	    hs.add("Sohan");
	    hs.add("Mohan");
	    System.out.println("Displaying Elements:="+hs);
	    
	    System.out.println("2...........Traversing Elements of HashSet..................");	
	    // Traversing ArrayList
	    for(String element : hs) {
	      System.out.println(element);    
	    }

	    System.out.println("3...........Get size of HashSet.............................");	
	    System.out.println("Total elements : "+hs.size());
	    
	    System.out.println("4...........Remove elements.................................");	
	    System.out.println("An initial list of elements: "+hs);  
        //Removing specific element from HashSet  
        hs.remove("Mohan"); 
        System.out.println("After remove Mohan from the list: "+hs);
        
        System.out.println("5...........Add All elements from the Set....................");	
        HashSet<String> set1=new HashSet<String>();  
        set1.add("Ajay");  
        set1.add("Gaurav"); 
        //adding all elements from the set
        hs.addAll(set1);  
        System.out.println("Updated List: "+hs);  
        System.out.println("Updated Total elements: "+hs.size());  
        
        System.out.println("6...........Remove all set1 Elements.........................");
      //Removing all the new elements from HashSet  
        hs.removeAll(set1);  
        System.out.println("After invoking removeAll() method: "+hs);
        
        System.out.println("7...........Remove elemets based on condation...............");
        //Removing elements on the basis of specified condition  
        hs.removeIf(str->str.contains("Sohan"));    
        System.out.println("After invoking removeIf() method: "+hs); 
        
        System.out.println("8...........Remove elemets available in the set...............");
        hs.clear();  
        System.out.println("After invoking clear() method: "+hs);  
        
        System.out.println("...........................END ...............................");
        
        
        
	}

}
