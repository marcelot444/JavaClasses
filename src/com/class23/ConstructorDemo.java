package com.class23;

public class ConstructorDemo {

	ConstructorDemo() {
		System.out.println("I am am your constructor");
	}

	ConstructorDemo(String str) {// Parameter constructor
		System.out.println("I am constructor with 1 paramter " + str);
	}

	ConstructorDemo(int num, int num1) {// Parameter constructor
		System.out.println("I am constructor with 2 paramter " + num + " " + num1);
	}

	public static void main(String[] args) {

		ConstructorDemo obj = new ConstructorDemo();// <-- Constructor with no parameters
		System.out.println("Code after creating an Object");
		obj.hello();
		System.out.println();
		ConstructorDemo obj2 = new ConstructorDemo("My parameter");//
		ConstructorDemo obj3 = new ConstructorDemo(100, 123);// 

	}

	public void hello() {
		System.out.println("Hello class");
		System.out.println("Hello Instructors");
	}

	public void hello(String str) {
		System.out.println("Hello class1");
		System.out.println("Hello Instructors1");
	}

}
