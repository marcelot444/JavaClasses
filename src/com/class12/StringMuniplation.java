package com.class12;

public class StringMuniplation {

	public static void main(String[] args) {
// UPPERCASE LOWERCASE CHECK TO SEE IF THIER EQUALS
		String name1 = new String("John1");
		System.out.println(name1);

		int name1Len = name1.length();
		System.out.println("The length of nameLen is = " + name1Len);

		System.out.println("=========================================");

		String str1 = "Hello world";
		System.out.println("Before:: " + str1);
		str1 = str1.toLowerCase();
		System.out.println("After:: " + str1);

		// .equals()
		String str2 = "Hello world";

		boolean isEqual = str1.equals(str2);
		System.out.println(isEqual);
		// .equaldIgnoreCase();
		System.out.println(str1.equalsIgnoreCase(str2));

		String str3 = "Mohhamed";
		System.out.println("Before:: "+str3);
		str3 = str3.toUpperCase();
		System.out.println("After:: "+str3);

	}

}
