package com.class13;

public class Recap2 {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "Hello";

		System.out.println(a.contentEquals(b));
		System.out.println(a == b);

		String x = new String("Bye");
		String y = new String("Bye");

		System.out.println(x.contentEquals(y));
		System.out.println(x == y);

		/*
		 * .equals : compares the values (are both of them have the same sequence of
		 * char? ) == : compares the objects (are these same objects? )
		 *
		 */
		
		System.out.println("****************************************************");
		String str5="Today is Saturday";
		System.out.println(str5.startsWith("Today"));
		System.out.println(str5.endsWith("day"));
		
		
		System.out.println("***********************************");
		System.out.println("========indexOf and charAt============");
		String str7="Tomorrow we will be done with String Muniplation";
		
		System.out.println(str7.indexOf('e'));
		System.out.println(str7.indexOf('e',11));
		System.out.println(str7.indexOf("we"));
		
		System.out.println(str7.charAt(10));
		
		
		
		

	}

}
