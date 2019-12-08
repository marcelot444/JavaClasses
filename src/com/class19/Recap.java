package com.class19;

public class Recap {
	void sum(int num1, int num2) {
		int c=num1+num2;
		System.out.println("The sum of 2 number is "+c);
	}
	
// Create a method that displays hello 5 times
	void sayHello(int times) {
		for (int i=0; i<times;i++) {
			System.out.println("Hello");
		}
	}
	void saySome(String word, int times) {
		for (int i=0;i<times;i++) {
			System.out.println(word);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recap obj=new Recap();
		obj.sum(10, 30);
		obj.sayHello(3);
		obj.saySome("Java", 4);
		

	}
	
}
