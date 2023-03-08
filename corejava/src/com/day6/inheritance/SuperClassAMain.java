package com.day6.inheritance;

public class SuperClassAMain  extends SuperClassA{
	
	void m1(){
		super.name="Name -Sanker";
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperClassAMain ob=new SuperClassAMain();
		ob.m1();

	}

}
