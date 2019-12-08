package com.class15;

public class StringMoreExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Syntax Technologies inc";
		
		char letter=str.charAt(5);
		System.out.println(letter);
		
	//	System.out.println(str.charAt(str.length()));//OutOfBounds
		System.out.println(str.charAt(str.length()-1));
		
		//get a substring from a string
		//Syntax
		String substring1=str.substring(0,6);
		System.out.println(substring1);
		//Technologies Inc
		System.out.println(str.substring(7));

	}

}
