package com.day6.inheritance;

public class ClassBHierarachal  extends ClassAHierarchal{
	int b = 10;
	
    void showB() {
    	super.a=10;
        System.out.println("b class = "+b);
    }

}
