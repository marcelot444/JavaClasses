package com.class16;

public class IQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given = "Welcome to the java class";
		/*
		 * to reverse string step 1:split-->array of string Step2: use for loops and use
		 * decrement
		 * 
		 */
		String[] str = given.split("\\s");
		for (int j = str.length - 1; j >= 0; j--) {
			System.out.println(str[j]);

		}
		// Write a java program to reverse String?
		// toCharArray(); charAt();
		System.out.println();
		String given1 = "Today is java class";
		char[] charArray = given1.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
		System.out.println();
		System.out.println("*************************");
		// Using charAt
		String word3 = "I love java";
		for (int i = word3.length() - 1; i >= 0; i--) {
			System.out.print(word3.charAt(i));
		}
		System.out.println();
		System.out.println("*********************************");
	}

}
