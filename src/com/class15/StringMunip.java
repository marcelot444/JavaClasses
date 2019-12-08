package com.class15;

public class StringMunip {

	public static void main(String[] args) {

		//String comes in java lang package
		// 2 ways to create a string
		//First way using string literal
		String str="Hello";
		//second way using new Keyword
		String str1 = new String("hello");
		System.out.println(str);
		System.out.println(str1);
		//1 Find the numbers inside the string
		int length=str.length();
		System.out.println(length);
		// case conversion methods
		
		String g=str.toLowerCase();
		System.out.println(g);
		
		//verify if there is any characters in the string is Empty
		String myString="";
		boolean isEmpty=myString.isEmpty();
		System.out.println(isEmpty);
		
		String myString1=null;// no value at all it is equal to
		// String String1;
		//System.out.println(myString1.isEmpty());
		System.out.println("**************************");
		//How to verify existence of characters in the string
		String a="Good evening students";
		boolean exist=a.contains("students");
		System.out.println(exist);
		System.out.println(a.startsWith("Good"));
		System.out.println(a.endsWith("student"));

	}

}
