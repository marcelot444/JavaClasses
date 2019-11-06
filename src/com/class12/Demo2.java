package com.class12;

public class Demo2 {

	public static void main(String[] args) {

		/*
		 * This method checks wether a string is empty or not. This methos returns true
		 * if the given string is empty, else it returns false
		 */

		String str = "";
		System.out.println("Is this string empty= " + str.isEmpty());
		String str2 = "Hello";
		System.out.println("Is this string empty= " + str2.isEmpty());
		// \n is to start a new line
		String sentence = "Each day has a promise to brigtheen teh day,\nbut first you must allow";
		System.out.println(sentence);

		// String Method concat

		String str3 = "Hello";
		String str4 = "World";
		String str5 = "People";

		System.out.println(str3 + " " + str4 + " " + str5);
		System.out.println(str3.concat(" " + str4.concat(str5)));

		// String trim()

		System.out.println("****************************************************");

		String str6 = " How are you? ";
		System.out.println(str6.trim());
		// to trim spaces

		// to find the number where the character is
		String str7 = "We might be done early today";
		System.out.println(str7.charAt(3));

		System.out.println("*******************************");
		/*
		 * This method returns the index within this string of the first occurance of
		 * the specifed cahracter or -1 if the character does not occur
		 */
		String str8 = "We might mnot be done early today";
		System.out.println(str8.indexOf('m'));
		System.out.println(str8.indexOf('e', 12));

	}

}
