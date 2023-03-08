/**
 * 
 */
package com.day8.abstraction;

/**
 * @author hp
 *
 */
public class BankMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		b=new SBI();  
		System.out.println("SBI Rate of Interest is: "+b.getBankInterestRate()+" %");    
		b=new HDFC();  
		System.out.println("HDFC Rate of Interest is: "+b.getBankInterestRate()+" %");    

	}

}
