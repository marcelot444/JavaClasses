package com.class17;

public class Car {

	// TODO Auto-generated method stub
 // define attributes and features -->Variable
	String make, model, color;
	int year, wheels, windows, speed;

 //   adding behavior/action---> methods();
	void drive() {
		System.out.println("I amdrive method");
		System.out.println("Car " + make + " can drive");
	}

	void star() {
		System.out.println("I am start method");
		System.out.println("Car " + make + " can start");
	}

	void accelerate() {
		System.out.println("i am accelerate method");
		System.out.println("Car " + make + " can accelerate");
	}

}
