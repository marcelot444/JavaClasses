package com.class24;

public class ThisWithConstructor {
	ThisWithConstructor(){
		System.out.println("I am non argument constructor");
	}
	ThisWithConstructor(String str){
		this();//used to call current class constructor calls the one with no parameters
		System.out.println("I am a constructor with 1 parameter");
	}
	ThisWithConstructor(String str, String str2){
		this("aa");// calls constructor with one string
		System.out.println("I am a constructor with 2 paramters");
	}
	
	public static void main(String[] args) {
		ThisWithConstructor obj=new ThisWithConstructor("Hello");
		//can we execute 2 constructors at the same time
		//yes- it can  be achieved using this()
		System.out.println();
		ThisWithConstructor obj1=new ThisWithConstructor("Hello", "bye");
		
		
	}

}
