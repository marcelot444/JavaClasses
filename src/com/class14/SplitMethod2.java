package com.class14;

public class SplitMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//how to seperate comma delimated String.
		
		String str="If your come to class early, "
				+ "then you can study more, and also learn more,"
				+ "and you can leave early";
		
		String[] array=str.split("\\,");
		System.out.println(array.length);
		for (int i=0;i<array.length;i++){
			System.out.println(array[i].trim());
		}
				
		System.out.println("***************************************");
		
		String str1="Welcome To Syntax Technologies";
		String[] array2=str1.split(" ", 3);
		System.out.println(array2.length);
		
		for(int i=0;i<array2.length;i++){
			System.out.println(array2[i]);
		}
		System.out.println("*********************************************");
		String str2="Sunday is a work day";
		System.out.println(str2.replaceAll(" ", ""));
		System.out.println("*********************************************");
		String str4="!@#$He%&*ll$$o";
		System.out.println(str4.replaceAll("[^a-zA-Z]", ""));
		char[] b=str4.toCharArray();
		System.out.println(b.length);
		System.out.println("********************************************");
		String str5=("Is it Saturday? It is it raining? Do we have Java class today?");
		String[] array5=str5.split("\\?");
		System.out.println(array5.length);
		for (int a=0;a<array5.length;a++) {
			System.out.println(array5[a].trim());
		}
		
		
	}


}
