package com.class25_1;

public class Addition {
	// method overloading :
	// 1 way by passing different amount of parameters
	//

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public void add(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}

	// 2nd way by having different types of parameters
	// two types of polymorphism
	// compile time polymorphism/Static Binding/early binding-method overloading
	// method overloading is having the same name while in the same class
	// runtime Polymorphism
	public void add(double num1, double num2) {
		System.out.println(num1 + num2);
	}

	public double add(int num1, double num2) {

		return num1+num2;	
}

	public static void main(String[] args) {

		Addition obj = new Addition();
		obj.add(12, 13);
		obj.add(12, 13, 14);
		obj.add(12.09, 12.10);

		System.out.println();

		String str = "Hello";
		System.out.println(str.substring(3));
		System.out.println(str.substring(1, 3));

	}
	//in method overloading Method signature must be different
	//overloading is not possible by changing return type of them since compiler

}
