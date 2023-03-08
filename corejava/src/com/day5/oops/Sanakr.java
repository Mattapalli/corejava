package com.day5.oops;

public class Sanakr {
	int a=10;
	
	 Sanakr(){
		System.out.println("constructor ");
	}
	
	public void sanakr(){
		System.out.println("method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sanakr obj=new Sanakr();
		System.out.println(obj.display());
		System.out.println(obj.a);
		obj.sanakr();

	}
	
	String display() {
		return "Sankar";
	}

}
