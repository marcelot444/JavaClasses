package com.class22;

public class StaticVsNonStatic {
	//template for a students (School. name. grade)
	
	static String school="Syntax";
	String name;
	char grade;
	//Instance Method
	void getInfo() {
		System.out.println("My name is "+name+" and I am goig to "+school+""
				+ " and my grade is "+grade);
	}
	//static method
	static void getinfo1() {
		System.out.println("I am attending classses at "+school);
	}

}
