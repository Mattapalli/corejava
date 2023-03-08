package com.day13.setInterface;

import java.util.*;

public class HashSetFromOtherCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<String> list=new ArrayList<String>();  
         list.add("Ravi");  
         list.add("Vijay");  
         list.add("Ajay");
         list.add("Ravi");
         
           
         HashSet<String> set=new HashSet(list);  
         set.add("Gaurav");  
         Iterator<String> i=set.iterator();  
         while(i.hasNext())  
         {  
         System.out.println(i.next());  
         }  

	}

}
