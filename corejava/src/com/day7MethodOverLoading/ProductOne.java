/**
 * 
 */
package com.day7MethodOverLoading;

/**
 * @author hp
 *
 */
public class ProductOne {
	 // Multiplying three integer values
    public int Prod(int a, int b, int c)
    {
  
        int prod1 = a * b * c;
        return prod1;
    }
  
    // Multiplying three double values.
    public double Prod(double a, double b, double c)
    {
  
        double prod2 = a * b * c;
        return prod2;
    }
}