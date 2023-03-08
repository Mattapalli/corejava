package com.day3.loops;

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=10;i++) {
			if(i==5) {
				continue;   //skip the value based on condtion
			}
			System.out.println(i);
		}

	}

}
