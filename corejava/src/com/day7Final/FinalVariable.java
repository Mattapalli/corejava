package com.day7Final;

public class FinalVariable {
	
	final int speedlimit=90;//final variable  
	 void run(){  
	  speedlimit=400;  
	 }  
	
	public static void main(String[] args) {
		FinalVariable obj=new  FinalVariable();  
		 obj.run();  
	}

}
