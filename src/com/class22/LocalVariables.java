package com.class22;

public class LocalVariables {
	
	public static void main(String[] args) {
		LocalVariables obj=new LocalVariables();
		obj.sayName();
		System.out.println();
	}
	void sayName() {
		String myName="John";
		System.out.println(myName);
	}
	String createEmail(String name, String lastName, String email) {
		String userEmail=name+lastName+"@"+email+".com";
		return userEmail;
	}
	// instance variables inside of a class outside of a method

}
