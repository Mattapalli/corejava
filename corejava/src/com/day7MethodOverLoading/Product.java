package com.day7MethodOverLoading;
class Product {
	  
    // Method 1
    // Multiplying two integer values
    public int multiply(int a, int b)
    {
    	System.out.println("two parameters");
        int prod = a * b;
        return prod;
    }
  
    // Method 2
    // Multiplying three integer values
    public int multiply(int a, int b, int c)
    {
    	System.out.println("three parameters");
        int prod = a * b * c;
        return prod;
    }
}