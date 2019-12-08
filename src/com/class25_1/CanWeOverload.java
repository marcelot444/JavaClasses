package com.class25_1;

public class CanWeOverload {
	private void methodOne() {
		System.out.println("I am method one");
	}
	private void methodOne(String str) {
		System.out.println("I am method one "+str);
	}
	
	//can we overload a main method?
	//YES
	public static void main(String[] args) {
		System.out.println("I am a main method string array");
		CanWeOverload.main("String");
		String[] array= {"A","B"};
		main("Hello",array);
		
	}

	public static void main(String str) {
		System.out.println("I am  maint method with String arguments");
	}
	public static void main(String str, String[] arg) {
		System.out.println("I am main method with 2 paramters");
	}
	
}
