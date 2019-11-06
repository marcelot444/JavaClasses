package com.class12;

public class HowToPrintRedColorToConsol {

	public static void main(String[] args) {

		/*
		 * .contains(); .containsIgnoreCase
		 */
		String sentence = "It was rainging today";
		String sen = "raining";
		System.err.println(sen.contains(sentence));
		System.out.println(sentence.contains("was"));

		System.out.println("*******************************************");
		//startsWith
		String str2="It is very hot in the class";
		System.out.println("Is this string starts with="+str2.startsWith("It"));
		//System.out.println("Is this string starts with="+str2.startsWith("in", ));

		/// endWith
		System.out.println("Is this string ends with="+str2.endsWith("class"));
		
		

		
		

	}

}
