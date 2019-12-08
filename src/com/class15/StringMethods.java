package com.class15;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Java classes at Syntax are awesome";
		String g = str.replace("awesome", "great");
		System.out.println(g);
		str = str.replaceAll("a", "1234 ");
		System.out.println(str);

		// replaceAll --> specify regular expresiion
		// Lets remove all special characters

		str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		System.out.println("**************************************************");
		// split
		String myString = "Java classes at Syntax are awesome";
		String[] array = myString.split("a");
		System.out.println(array.length);

	}

}
