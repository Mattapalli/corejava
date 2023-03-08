package com.day7MethodOverLoading;



public class ChngingNumberOfParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating object of above class inside main()
        // method
        Product ob = new Product();
  
        // Calling method to Multiply 2 numbers
        int prod1 = ob.multiply(1, 2);
  
        // Printing Product of 2 numbers
        System.out.println(
            "Product of the two integer value :" + prod1);
  
        // Calling method to multiply 3 numbers
        int prod2 = ob.multiply(1, 2, 3);
  
        // Printing product of 3 numbers
        System.out.println(
            "Product of the three integer value :" + prod2);

	}

}
