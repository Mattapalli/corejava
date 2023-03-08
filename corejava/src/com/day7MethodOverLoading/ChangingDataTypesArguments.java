package com.day7MethodOverLoading;

public class ChangingDataTypesArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 ProductOne obj = new ProductOne();
		  
	        int prod1 = obj.Prod(1, 2, 3);
	        System.out.println("Product of the three integer value :" + prod1);
	        double prod2 = obj.Prod(1.0, 2.0, 3.0);
	        System.out.println("Product of the three double value :" + prod2);
	    }

	}


