package com.class18;

import java.util.Scanner;

public class BuiltAndUserDefinedMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// built in
		String str = "Hello";
		str = str.replace("Hello", "Hi");
		System.out.println(str);

		Scanner scan = new Scanner(System.in);
		String scannerString=scan.nextLine();
		System.out.println(scannerString);

		BuiltAndUserDefinedMethods obj = new BuiltAndUserDefinedMethods();
		obj.myMethod();

	}

	void myMethod() {//method header
		System.out.println("This is user defined methods that i created");//method body
	}

}
