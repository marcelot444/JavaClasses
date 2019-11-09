package com.class16;

public class IQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Today is very cold outside";
		String subString=str.substring(0,5);
		System.out.println(subString);
		/*step1: split based on the space-->array of string
		 * Step2: Find the length of an araay
		 * 
		 */
		System.out.println(str);
		String[] words=str.split(" ");
		System.out.println(words.length);
	}

}
