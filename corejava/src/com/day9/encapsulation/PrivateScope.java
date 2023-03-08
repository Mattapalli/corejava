package com.day9.encapsulation;

public  class PrivateScope {
	
	private String show() {
		return "i won't avaliable .....";
	}
	
	public static void main(String[] args) {
		PrivateScope s=new PrivateScope();
		s.show();
	}

}
