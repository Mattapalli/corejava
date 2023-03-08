/**
 * 
 */
package com.day8.Interface;

/**
 * @author hp
 *
 */

public interface DefaultStaticPrivateInterface {
	String userName="Rama";
	String pass="pas123";
	
	// Default method   
    default void msg(){  
        System.out.println("This is default method");  
    }  
     
 // static method   
    public static String messageOne(String useNAme,String pase){ 
    
    	if(userName.equals(useNAme) && pass.equals(pase)) {
    		//going to verify ///
    		System.out.println("Passed");
    		//login apgeee.
    	}else {
    		//loginotu...........
    		System.out.println("Not Matched ....userName and password ....");
    	}
        System.out.println("This is static method");
		return "sucess";  
    }  
    
    // Private method  
    private void greet() {
    	System.out.println("This is private method"); 
    }
    // Abstract method  
    void greet(String msg);

}
