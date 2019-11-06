package com.class13;

public class StringMuniplation {

	public static void main(String[] args) {

		String str = "Java is getting interesting";

		System.out.println(str.substring(15));
		System.out.println(str.substring(8, 15));

		System.out.println("*********************************");

		String str2 = "Sunday";

		for (int i = 5; i >= 0; i--) {
			System.out.print(str2.charAt(i));
		}
		System.out.println();
		System.out.println("**************************");

		String str3 = "hello";

		int middle = str3.length() / 2;

		if (!str3.isEmpty()) {
			if (str3.length() % 2 != 0 && str3.length() >= 3) {
				System.out.println(str3.charAt(middle));
			}
		}
		int a = 5 % 2;
		System.out.println("================");
		System.out.println(" ");

	}

}
