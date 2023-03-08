package com.day6.inheritance;

public class ChildSuper extends ParentSuper {

	    String name;
	    public void details()
	    {
	        super.name = "Parent";  //refers to parent class member
	        name = "Child";
	        System.out.println(super.name+" and "+name);
	    }
	    public static void main(String[] args)
	    {
	    	ChildSuper cobj = new ChildSuper();
	        cobj.details();
	    }
	}