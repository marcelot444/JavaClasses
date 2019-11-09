package com.class16;

public class IQ6 {

	public static void main(String[] args) {

		/*
		 * Step1: reverse the string step 2: compare 2 strings: if strings are
		 * eqal-->palindrome else -->not palindrome
		 */

		String original = "kayak";
		String reversed = "";

		for (int i = original.length() - 1; i >= 0; i--) {
			reversed = reversed + original.charAt(i);// "+k=k
		}
		System.out.println(reversed);
		
		if(original.equals(reversed)){
			System.out.println("String is palindrom");
		}else {
			System.out.println("String is not a palindrom");
		}

	}

}
