package com.class13;

public class RegularExpression {

	public static void main(String[] args) {
		

		String str = "1423Hel45645lo465456";
		System.out.println(str.replaceAll("[0-9]", ""));
		System.out.println(str.replaceAll("[a-zA-Z]", ""));

		String str2 = "Hi#$%How#$%#$4356346";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(str2.replace("how", ""));
		
		System.out.println("******************************8");
		System.out.println(str2.replaceAll("\\w", ""));
		
		

	}

}
