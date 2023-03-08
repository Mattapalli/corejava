package com.day4.objectCreation;

public class NewInstanceObject {

	public String getName() {
		return " Creating Object using NewInstance";
	}

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		NewInstanceObject obj = (NewInstanceObject) Class.forName("NewInstanceObject").newInstance();

		 //  Method 1:
		//NewInstanceObject obj = NewInstanceObject.class.newInstance();
		
				
		System.out.println(obj.getName());

	}

}
