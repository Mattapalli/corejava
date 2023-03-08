/**
 * 
 */
package com.day9.encapsulation;

/**
 * @author hp
 *
 */
public class Account {
	//private data members  
	private long acc_no;  
	private String name,email;  
	private float amount;
	/**
	 * @return the acc_no
	 */
	public long getAcc_no() {
		return acc_no;
	}
	/**
	 * @param acc_no the acc_no to set
	 */
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the amount
	 */
	public float getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(float amount) {
		this.amount = amount;
	}  
	
	

}
