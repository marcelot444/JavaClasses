package com.class25_1;

public class ConstructorOverloading {
	//different types of paramters
	ConstructorOverloading() {
		System.out.println("I am non-argument constructor");
	}

	ConstructorOverloading(String str) {
		System.out.println("I am non argument consturctor");
	}
	
//having different type of parameters
	ConstructorOverloading(int num) {
		System.out.println("I am constructor with 1 int param");
	}

}
