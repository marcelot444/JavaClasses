package com.classs30;

public abstract class Vehicle {
	String vinNumber;
	static int totalVehicles;

	Vehicle(String vinNumber) {
		this.vinNumber = vinNumber;
		totalVehicles++;
	}

	public void drive() {
		System.out.println("Vehicle can drive");
	}

	public void stop() {
		System.out.println("Vehhicle can stop");
	}
	public static void displayTotal() {//static method
		System.out.println("Total cars we buidl= "+totalVehicles);
	}

	public abstract void start();

	public abstract void speed();

}

abstract class Car extends Vehicle {
	String carType;

	Car(String vinNumber) {
		super(vinNumber);
		this.carType = carType;
	}

	public void speed() {
		System.out.println("Max car speed up to 400");
	}

	public abstract void breaking();
}

class BMW extends Car {
	String make, model;

	BMW(String vinNumber, String carType, String make, String model) {
		super(vinNumber);
		this.make = make;
		this.model = model;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("BMW start remote");

	}

	@Override
	public void breaking() {
		// TODO Auto-generated method stub
		System.out.println("BMW can break");
	}
	public void display() {
		System.out.println("We build "+make+" "+model+" with vin# "+vinNumber);
	}

}
