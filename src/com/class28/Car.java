package com.class28;

public class Car {
	String model, make;

	Car() {
		System.out.println("I am non argument constructor");
	}

	Car(String make, String model) {
		this.make = make;
		this.model = model;
	}

}

class Tesla extends Car {
	boolean autopilot;

	Tesla() {
		super();
		System.out.println("I am child non argument constructor");
	}

	Tesla(String make, String model, boolean autopilot) {
		super(make, model);// constructor call
		this.autopilot = autopilot;
	}

	public void displayInfo() {
		System.out.println("Car " + make + " " + model + " has an autopilot " + autopilot);
	}
}